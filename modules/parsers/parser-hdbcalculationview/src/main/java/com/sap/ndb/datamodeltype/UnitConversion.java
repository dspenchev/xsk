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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.datamodeltype;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A unit conversion comprises all model information that is required as input for the engine
 * for the unit conversion variant of the server conversion function
 *
 *
 * <p>Java class for UnitConversion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UnitConversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelType.ecore}BaseUserDefinedFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceUnit" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter"/&gt;
 *         &lt;element name="targetUnit" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitConversion", propOrder = {
    "sourceUnit",
    "targetUnit"
})
public class UnitConversion
    extends BaseUserDefinedFunction {

  @XmlElement(required = true)
  protected UDFParameter sourceUnit;
  @XmlElement(required = true)
  protected UDFParameter targetUnit;

  /**
   * Gets the value of the sourceUnit property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getSourceUnit() {
    return sourceUnit;
  }

  /**
   * Sets the value of the sourceUnit property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setSourceUnit(UDFParameter value) {
    this.sourceUnit = value;
  }

  /**
   * Gets the value of the targetUnit property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getTargetUnit() {
    return targetUnit;
  }

  /**
   * Sets the value of the targetUnit property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setTargetUnit(UDFParameter value) {
    this.targetUnit = value;
  }

}
