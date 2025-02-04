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
package com.sap.xsk.hdb.ds.test.processors;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.sap.xsk.hdb.ds.model.hdbsequence.XSKDataStructureHDBSequenceModel;
import com.sap.xsk.hdb.ds.processors.hdbsequence.XSKHDBSequenceCreateProcessor;
import com.sap.xsk.hdb.ds.processors.hdbsequence.XSKHDBSequenceDropProcessor;
import com.sap.xsk.hdb.ds.processors.hdbsequence.XSKHDBSequenceUpdateProcessor;
import java.sql.Connection;
import java.sql.SQLException;
import org.eclipse.dirigible.commons.config.Configuration;
import org.eclipse.dirigible.core.test.AbstractGuiceTest;
import org.eclipse.dirigible.database.ds.model.IDataStructureModel;
import org.eclipse.dirigible.database.sql.DatabaseArtifactTypes;
import org.eclipse.dirigible.database.sql.SqlFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Answers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({SqlFactory.class, Configuration.class})
public class HDBSequenceProcessorsTest extends AbstractGuiceTest {

  @Mock(answer = Answers.RETURNS_DEEP_STUBS)
  private Connection mockConnection;

  @Mock(answer = Answers.RETURNS_DEEP_STUBS)
  private SqlFactory mockSqlFactory;

  @Before
  public void openMocks() {
    MockitoAnnotations.initMocks(this);
  }

  @Test
  public void executeCreate() throws Exception {
    XSKHDBSequenceCreateProcessor spyProccessor = spy(XSKHDBSequenceCreateProcessor.class);

    XSKDataStructureHDBSequenceModel mockModel = mock(XSKDataStructureHDBSequenceModel.class);
    spyProccessor.execute(mockConnection, mockModel);

    verify(spyProccessor, times(1)).executeSql(anyString(), any());
  }

  @Test
  public void executeUpdate() throws SQLException {
    XSKHDBSequenceUpdateProcessor spyProccessor = spy(XSKHDBSequenceUpdateProcessor.class);
    XSKDataStructureHDBSequenceModel mockModel = mock(XSKDataStructureHDBSequenceModel.class);
    spyProccessor.execute(mockConnection, mockModel);

    verify(spyProccessor, times(1)).executeSql(anyString(), any());
  }

  @Test
  public void executeDrop() throws SQLException {
    XSKHDBSequenceDropProcessor spyProccessor = spy(XSKHDBSequenceDropProcessor.class);
    PowerMockito.mockStatic(SqlFactory.class, Configuration.class);
    XSKDataStructureHDBSequenceModel mockModel = mock(XSKDataStructureHDBSequenceModel.class);

    when(Configuration.get(IDataStructureModel.DIRIGIBLE_DATABASE_NAMES_CASE_SENSITIVE, "false")).thenReturn("false");
    when(SqlFactory.getNative(mockConnection)).thenReturn(mockSqlFactory);

    when(SqlFactory.getNative(mockConnection).exists(mockConnection, mockModel.getName(), DatabaseArtifactTypes.SEQUENCE)).thenReturn(true);

    spyProccessor.execute(mockConnection, mockModel);

    verify(spyProccessor, times(1)).executeSql(anyString(), any());
  }

}
