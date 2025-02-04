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
package com.sap.xsk.xsjob.ds.synchronizer;

import com.sap.xsk.xsjob.ds.api.IXSKJobModel;
import java.io.IOException;
import java.text.ParseException;
import org.eclipse.dirigible.commons.api.content.AbstractClasspathContentHandler;
import org.eclipse.dirigible.commons.api.module.StaticInjector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XSKJobClasspathContentHandler extends AbstractClasspathContentHandler {

  private static final Logger logger = LoggerFactory.getLogger(XSKJobClasspathContentHandler.class);

  private XSKJobSynchronizer jobSynchronizer = StaticInjector.getInjector().getInstance(XSKJobSynchronizer.class);

  /*
   * (non-Javadoc)
   * @see org.eclipse.dirigible.commons.api.content.AbstractClasspathContentHandler#isValid(java.lang.String)
   */
  @Override
  protected boolean isValid(String path) {
    boolean isValid = false;

    try {
      if (path.endsWith(IXSKJobModel.XSK_JOB_FILE_EXTENSION)) {
        isValid = true;
        jobSynchronizer.registerPredeliveredJob(path);
      }
    } catch (IOException | ParseException e) {
      logger.error("Predelivered Job is not valid", e);
    }

    return isValid;
  }

  /*
   * (non-Javadoc)
   * @see org.eclipse.dirigible.commons.api.content.AbstractClasspathContentHandler#getLogger()
   */
  @Override
  protected Logger getLogger() {
    return logger;
  }

}
