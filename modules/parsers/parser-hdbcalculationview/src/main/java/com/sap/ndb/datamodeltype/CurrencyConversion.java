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

import com.sap.ndb.basemodelbase.CurrencyConversionLookup;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A currency conversion comprises all model information that is required as input for the
 * engine currency conversion function. It defines how model artifacts like variables, elements, constants
 * are mapped to the input parameters of the currency conversion
 * The source currency is mandatory and then the conversion is either defined as only doing the
 * ERP decimal shift or a real currency conversion to a different target UNIT
 *
 *
 * <p>Java class for CurrencyConversion complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CurrencyConversion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/DataModelType.ecore}BaseUserDefinedFunction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="sourceCurrency" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter"/&gt;
 *         &lt;element name="targetCurrency" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter"/&gt;
 *         &lt;element name="referenceDate" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter"/&gt;
 *         &lt;element name="exchangeRateType" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter" minOccurs="0"/&gt;
 *         &lt;element name="exchangeRateElement" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="erpDecimalShift" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="round" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="erpDecimalShiftBack" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="convert" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="lookup" type="{http://www.sap.com/ndb/BaseModelBase.ecore}CurrencyConversionLookup" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CurrencyConversion", propOrder = {
    "sourceCurrency",
    "targetCurrency",
    "referenceDate",
    "exchangeRateType",
    "exchangeRateElement",
    "erpDecimalShift",
    "round",
    "erpDecimalShiftBack"
})
public class CurrencyConversion
    extends BaseUserDefinedFunction {

  @XmlElement(required = true)
  protected UDFParameter sourceCurrency;
  @XmlElement(required = true)
  protected UDFParameter targetCurrency;
  @XmlElement(required = true)
  protected UDFParameter referenceDate;
  protected UDFParameter exchangeRateType;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String exchangeRateElement;
  @XmlElement(defaultValue = "true")
  protected boolean erpDecimalShift;
  protected Boolean round;
  @XmlElement(defaultValue = "true")
  protected boolean erpDecimalShiftBack;
  @XmlAttribute(name = "convert")
  protected Boolean convert;
  @XmlAttribute(name = "lookup")
  protected CurrencyConversionLookup lookup;

  /**
   * Gets the value of the sourceCurrency property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getSourceCurrency() {
    return sourceCurrency;
  }

  /**
   * Sets the value of the sourceCurrency property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setSourceCurrency(UDFParameter value) {
    this.sourceCurrency = value;
  }

  /**
   * Gets the value of the targetCurrency property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getTargetCurrency() {
    return targetCurrency;
  }

  /**
   * Sets the value of the targetCurrency property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setTargetCurrency(UDFParameter value) {
    this.targetCurrency = value;
  }

  /**
   * Gets the value of the referenceDate property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getReferenceDate() {
    return referenceDate;
  }

  /**
   * Sets the value of the referenceDate property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setReferenceDate(UDFParameter value) {
    this.referenceDate = value;
  }

  /**
   * Gets the value of the exchangeRateType property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getExchangeRateType() {
    return exchangeRateType;
  }

  /**
   * Sets the value of the exchangeRateType property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setExchangeRateType(UDFParameter value) {
    this.exchangeRateType = value;
  }

  /**
   * Gets the value of the exchangeRateElement property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getExchangeRateElement() {
    return exchangeRateElement;
  }

  /**
   * Sets the value of the exchangeRateElement property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setExchangeRateElement(String value) {
    this.exchangeRateElement = value;
  }

  /**
   * Gets the value of the erpDecimalShift property.
   */
  public boolean isErpDecimalShift() {
    return erpDecimalShift;
  }

  /**
   * Sets the value of the erpDecimalShift property.
   */
  public void setErpDecimalShift(boolean value) {
    this.erpDecimalShift = value;
  }

  /**
   * Gets the value of the round property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isRound() {
    return round;
  }

  /**
   * Sets the value of the round property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setRound(Boolean value) {
    this.round = value;
  }

  /**
   * Gets the value of the erpDecimalShiftBack property.
   */
  public boolean isErpDecimalShiftBack() {
    return erpDecimalShiftBack;
  }

  /**
   * Sets the value of the erpDecimalShiftBack property.
   */
  public void setErpDecimalShiftBack(boolean value) {
    this.erpDecimalShiftBack = value;
  }

  /**
   * Gets the value of the convert property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isConvert() {
    return convert;
  }

  /**
   * Sets the value of the convert property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setConvert(Boolean value) {
    this.convert = value;
  }

  /**
   * Gets the value of the lookup property.
   *
   * @return possible object is
   * {@link CurrencyConversionLookup }
   */
  public CurrencyConversionLookup getLookup() {
    return lookup;
  }

  /**
   * Sets the value of the lookup property.
   *
   * @param value allowed object is
   *              {@link CurrencyConversionLookup }
   */
  public void setLookup(CurrencyConversionLookup value) {
    this.lookup = value;
  }

}
