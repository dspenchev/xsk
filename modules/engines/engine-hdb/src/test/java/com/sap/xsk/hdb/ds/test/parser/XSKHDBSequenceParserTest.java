/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.test.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import com.sap.xsk.hdb.ds.api.XSKDataStructuresException;
import com.sap.xsk.hdb.ds.model.XSKHanaVersion;
import com.sap.xsk.hdb.ds.model.hdbsequence.XSKDataStructureHDBSequenceModel;
import com.sap.xsk.hdb.ds.parser.hdbsequence.XSKHDBSequenceParser;
import com.sap.xsk.parser.hdbsequence.exceptions.XSKHDBSequenceDuplicatePropertyException;
import com.sap.xsk.parser.hdbsequence.exceptions.XSKHDBSequenceMissingPropertyException;
import java.nio.charset.StandardCharsets;
import org.junit.Test;

public class XSKHDBSequenceParserTest {

  @Test
  public void parseHanav1Content() throws Exception {
    String content = org.apache.commons.io.IOUtils
        .toString(XSKViewParserTest.class.getResourceAsStream("/test/xsk/com/sap/SampleSequence_hanav1.hdbsequence"),
            StandardCharsets.UTF_8);
    XSKDataStructureHDBSequenceModel model = (XSKDataStructureHDBSequenceModel) new XSKHDBSequenceParser()
        .parse("/test/xsk/com/sap/SampleSequence_hanav1.hdbsequence", content);

    assertEquals("MYSCHEMA", model.getSchema());
    assertEquals(Integer.valueOf(10), model.getStart_with());
    assertEquals(Integer.valueOf(30), model.getMaxvalue());
    assertEquals(false, model.getNomaxvalue());
    assertEquals(true, model.getNominvalue());
    assertEquals(false, model.getCycles());
    assertEquals(XSKHanaVersion.VERSION_1, model.getHanaVersion());
  }

  @Test
  public void parseHanav2Content() throws Exception {
    String content = org.apache.commons.io.IOUtils
        .toString(XSKViewParserTest.class.getResourceAsStream("/test/xsk/com/sap/CustomerId_hanav2.hdbsequence"), StandardCharsets.UTF_8);
    XSKDataStructureHDBSequenceModel model = (XSKDataStructureHDBSequenceModel) new XSKHDBSequenceParser()
        .parse("/test/xsk/com/sap/CustomerId_hanav2.hdbsequence", content);
    assertEquals(XSKHanaVersion.VERSION_2, model.getHanaVersion());
    assertEquals(content, model.getRawContent());
  }

  @Test
  public void parseGrammarUnreadableContent() throws Exception {
    String content = org.apache.commons.io.IOUtils
        .toString(XSKViewParserTest.class.getResourceAsStream("/test/xsk/com/sap/InvalidContent.hdbsequence"), StandardCharsets.UTF_8);

    assertThrows(XSKDataStructuresException.class, () -> {
      new XSKHDBSequenceParser().parse("/test/xsk/com/sap/InvalidContent.hdbsequence", content);
    });
  }

  @Test
  public void parseMissingMandatoryProperty() throws Exception {
    String content = org.apache.commons.io.IOUtils
        .toString(XSKViewParserTest.class.getResourceAsStream("/test/xsk/com/sap/MissingPropSequence.hdbsequence"), StandardCharsets.UTF_8);

    assertThrows(XSKHDBSequenceMissingPropertyException.class, () -> {
      new XSKHDBSequenceParser().parse("/test/xsk/com/sap/MissingPropSequence.hdbsequence", content);
    });
  }

  @Test
  public void parseRepetitiveProperties() throws Exception {
    String content = org.apache.commons.io.IOUtils
        .toString(XSKViewParserTest.class.getResourceAsStream("/test/xsk/com/sap/RepetitivePropsSequence.hdbsequence"),
            StandardCharsets.UTF_8);

    assertThrows(XSKHDBSequenceDuplicatePropertyException.class, () -> {
      new XSKHDBSequenceParser().parse("/test/xsk/com/sap/RepetitivePropsSequence.hdbsequence", content);
    });
  }

  @Test
  public void parseRandomlyOrderedContent() throws Exception {
    String content = org.apache.commons.io.IOUtils
        .toString(XSKViewParserTest.class.getResourceAsStream("/test/xsk/com/sap/RandomlyOrderedSequence.hdbsequence"),
            StandardCharsets.UTF_8);
    XSKDataStructureHDBSequenceModel model = (XSKDataStructureHDBSequenceModel) new XSKHDBSequenceParser()
        .parse("/test/xsk/com/sap/RandomlyOrderedSequence.hdbsequence", content);

    assertEquals("USR_9TCD6SXS67DP7AFLFE420B8EB", model.getSchema());
    assertEquals(Integer.valueOf(10), model.getStart_with());
    assertEquals(Integer.valueOf(30), model.getMaxvalue());
    assertEquals(false, model.getNomaxvalue());
    assertEquals(true, model.getNominvalue());
    assertEquals(false, model.getCycles());
    assertEquals(false, model.getPublicc());
    assertEquals(Integer.valueOf(-2), model.getIncrement_by());
    assertEquals(XSKHanaVersion.VERSION_1, model.getHanaVersion());
  }

}
