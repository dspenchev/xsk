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


package com.sap.ndb.sqlcoremodeltables;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ObjectType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ObjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="UNKNOWN"/&gt;
 *     &lt;enumeration value="TABLE"/&gt;
 *     &lt;enumeration value="VIEW"/&gt;
 *     &lt;enumeration value="PROCEDURE"/&gt;
 *     &lt;enumeration value="FUNCTION"/&gt;
 *     &lt;enumeration value="SCHEMA"/&gt;
 *     &lt;enumeration value="SEQUENCE"/&gt;
 *     &lt;enumeration value="TABLE_SYNONYM"/&gt;
 *     &lt;enumeration value="VIEW_SYNONYM"/&gt;
 *     &lt;enumeration value="INDEX_SYNONYM"/&gt;
 *     &lt;enumeration value="SEQUENCE_SYNONYM"/&gt;
 *     &lt;enumeration value="PROCEDURE_SYNONYM"/&gt;
 *     &lt;enumeration value="JOIN_VIEW"/&gt;
 *     &lt;enumeration value="OLAP_VIEW"/&gt;
 *     &lt;enumeration value="HIERARCHY_VIEW"/&gt;
 *     &lt;enumeration value="CALCULATED_VIEW"/&gt;
 *     &lt;enumeration value="ACTIVATED_TABLE"/&gt;
 *     &lt;enumeration value="TRIGGER"/&gt;
 *     &lt;enumeration value="SYNONYM"/&gt;
 *     &lt;enumeration value="MONITORVIEW"/&gt;
 *     &lt;enumeration value="STRUCTUREDPRIVILEGE"/&gt;
 *     &lt;enumeration value="AUDIT_POLICY"/&gt;
 *     &lt;enumeration value="COLUMN_TABLE"/&gt;
 *     &lt;enumeration value="ROW_TABLE"/&gt;
 *     &lt;enumeration value="REMOTE_SOURCE"/&gt;
 *     &lt;enumeration value="VIRTUAL TABLE"/&gt;
 *     &lt;enumeration value="EXTENDED TABLE"/&gt;
 *     &lt;enumeration value="EPMMODEL"/&gt;
 *     &lt;enumeration value="EPMQUERYSOURCE"/&gt;
 *     &lt;enumeration value="REMOTE SUBSCRIPTION"/&gt;
 *     &lt;enumeration value="PSE"/&gt;
 *     &lt;enumeration value="TABLE_TYPE"/&gt;
 *     &lt;enumeration value="AGENT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "ObjectType", namespace = "http://www.sap.com/ndb/SQLCoreModelTables.ecore")
@XmlEnum
public enum ObjectType {

  UNKNOWN("UNKNOWN"),
  TABLE("TABLE"),
  VIEW("VIEW"),
  PROCEDURE("PROCEDURE"),
  FUNCTION("FUNCTION"),
  SCHEMA("SCHEMA"),
  SEQUENCE("SEQUENCE"),
  TABLE_SYNONYM("TABLE_SYNONYM"),
  VIEW_SYNONYM("VIEW_SYNONYM"),
  INDEX_SYNONYM("INDEX_SYNONYM"),
  SEQUENCE_SYNONYM("SEQUENCE_SYNONYM"),
  PROCEDURE_SYNONYM("PROCEDURE_SYNONYM"),
  JOIN_VIEW("JOIN_VIEW"),
  OLAP_VIEW("OLAP_VIEW"),
  HIERARCHY_VIEW("HIERARCHY_VIEW"),
  CALCULATED_VIEW("CALCULATED_VIEW"),
  ACTIVATED_TABLE("ACTIVATED_TABLE"),
  TRIGGER("TRIGGER"),
  SYNONYM("SYNONYM"),
  MONITORVIEW("MONITORVIEW"),
  STRUCTUREDPRIVILEGE("STRUCTUREDPRIVILEGE"),
  AUDIT_POLICY("AUDIT_POLICY"),
  COLUMN_TABLE("COLUMN_TABLE"),
  ROW_TABLE("ROW_TABLE"),
  REMOTE_SOURCE("REMOTE_SOURCE"),
  @XmlEnumValue("VIRTUAL TABLE")
  VIRTUAL_TABLE("VIRTUAL TABLE"),
  @XmlEnumValue("EXTENDED TABLE")
  EXTENDED_TABLE("EXTENDED TABLE"),
  EPMMODEL("EPMMODEL"),
  EPMQUERYSOURCE("EPMQUERYSOURCE"),
  @XmlEnumValue("REMOTE SUBSCRIPTION")
  REMOTE_SUBSCRIPTION("REMOTE SUBSCRIPTION"),
  PSE("PSE"),
  TABLE_TYPE("TABLE_TYPE"),
  AGENT("AGENT");
  private final String value;

  ObjectType(String v) {
    value = v;
  }

  public static ObjectType fromValue(String v) {
    for (ObjectType c : ObjectType.values()) {
      if (c.value.equals(v)) {
        return c;
      }
    }
    throw new IllegalArgumentException(v);
  }

  public String value() {
    return value;
  }

}
