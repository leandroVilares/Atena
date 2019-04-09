//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de AttrValue complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AttrValue"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="attrNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="attrSeqNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="attrValue" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="effDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="exprDtTm" type="{http://www.w3.org/2001/XMLSchema}dateTime" /&gt;
 *       &lt;attribute name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttrValue", namespace = "http://www.vivo.com.br/atlys/")
public class AttrValue {

    @XmlAttribute(name = "attrNm")
    protected String attrNm;
    @XmlAttribute(name = "attrSeqNbr")
    protected String attrSeqNbr;
    @XmlAttribute(name = "attrValue")
    protected String attrValue;
    @XmlAttribute(name = "effDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effDtTm;
    @XmlAttribute(name = "exprDtTm")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar exprDtTm;
    @XmlAttribute(name = "reasonCode")
    protected String reasonCode;

    /**
     * Obtém o valor da propriedade attrNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrNm() {
        return attrNm;
    }

    /**
     * Define o valor da propriedade attrNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrNm(String value) {
        this.attrNm = value;
    }

    /**
     * Obtém o valor da propriedade attrSeqNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrSeqNbr() {
        return attrSeqNbr;
    }

    /**
     * Define o valor da propriedade attrSeqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrSeqNbr(String value) {
        this.attrSeqNbr = value;
    }

    /**
     * Obtém o valor da propriedade attrValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * Define o valor da propriedade attrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrValue(String value) {
        this.attrValue = value;
    }

    /**
     * Obtém o valor da propriedade effDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDtTm() {
        return effDtTm;
    }

    /**
     * Define o valor da propriedade effDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDtTm(XMLGregorianCalendar value) {
        this.effDtTm = value;
    }

    /**
     * Obtém o valor da propriedade exprDtTm.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExprDtTm() {
        return exprDtTm;
    }

    /**
     * Define o valor da propriedade exprDtTm.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExprDtTm(XMLGregorianCalendar value) {
        this.exprDtTm = value;
    }

    /**
     * Obtém o valor da propriedade reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define o valor da propriedade reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
