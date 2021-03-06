/*
 *  Copyright 2010, Plutext Pty Ltd.
 *   
 *  This file is part of docx4j.

    docx4j is licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 

    You may obtain a copy of the License at 

        http://www.apache.org/licenses/LICENSE-2.0 

    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

 */


package org.pptx4j.pml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CT_CommonSlideViewProperties complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CT_CommonSlideViewProperties">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cViewPr" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_CommonViewProperties"/>
 *         &lt;element name="guideLst" type="{http://schemas.openxmlformats.org/presentationml/2006/main}CT_GuideList" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="snapToGrid" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="snapToObjects" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="showGuides" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CT_CommonSlideViewProperties", propOrder = {
    "cViewPr",
    "guideLst"
})
public class CTCommonSlideViewProperties {

    @XmlElement(required = true)
    protected CTCommonViewProperties cViewPr;
    protected CTGuideList guideLst;
    @XmlAttribute
    protected Boolean snapToGrid;
    @XmlAttribute
    protected Boolean snapToObjects;
    @XmlAttribute
    protected Boolean showGuides;

    /**
     * Gets the value of the cViewPr property.
     * 
     * @return
     *     possible object is
     *     {@link CTCommonViewProperties }
     *     
     */
    public CTCommonViewProperties getCViewPr() {
        return cViewPr;
    }

    /**
     * Sets the value of the cViewPr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTCommonViewProperties }
     *     
     */
    public void setCViewPr(CTCommonViewProperties value) {
        this.cViewPr = value;
    }

    /**
     * Gets the value of the guideLst property.
     * 
     * @return
     *     possible object is
     *     {@link CTGuideList }
     *     
     */
    public CTGuideList getGuideLst() {
        return guideLst;
    }

    /**
     * Sets the value of the guideLst property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTGuideList }
     *     
     */
    public void setGuideLst(CTGuideList value) {
        this.guideLst = value;
    }

    /**
     * Gets the value of the snapToGrid property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSnapToGrid() {
        if (snapToGrid == null) {
            return true;
        } else {
            return snapToGrid;
        }
    }

    /**
     * Sets the value of the snapToGrid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapToGrid(Boolean value) {
        this.snapToGrid = value;
    }

    /**
     * Gets the value of the snapToObjects property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSnapToObjects() {
        if (snapToObjects == null) {
            return false;
        } else {
            return snapToObjects;
        }
    }

    /**
     * Sets the value of the snapToObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSnapToObjects(Boolean value) {
        this.snapToObjects = value;
    }

    /**
     * Gets the value of the showGuides property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isShowGuides() {
        if (showGuides == null) {
            return false;
        } else {
            return showGuides;
        }
    }

    /**
     * Sets the value of the showGuides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShowGuides(Boolean value) {
        this.showGuides = value;
    }

}
