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
 * <p>Classe Java de ChargeInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ChargeInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="chgAmt" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.vivo.com.br/atlys/}Currency"&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="chgTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="recurChgPeriodCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="chgStDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="chgEndDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="recurringChargePeriodCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prorated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChargeInfo", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "chgAmt"
})
public class ChargeInfo {

    protected ChargeInfo.ChgAmt chgAmt;
    @XmlAttribute(name = "chgTypeCd")
    protected String chgTypeCd;
    @XmlAttribute(name = "recurChgPeriodCd")
    protected String recurChgPeriodCd;
    @XmlAttribute(name = "chgStDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chgStDt;
    @XmlAttribute(name = "chgEndDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar chgEndDt;
    @XmlAttribute(name = "recurringChargePeriodCd")
    protected String recurringChargePeriodCd;
    @XmlAttribute(name = "prorated")
    protected Boolean prorated;

    /**
     * Obtém o valor da propriedade chgAmt.
     * 
     * @return
     *     possible object is
     *     {@link ChargeInfo.ChgAmt }
     *     
     */
    public ChargeInfo.ChgAmt getChgAmt() {
        return chgAmt;
    }

    /**
     * Define o valor da propriedade chgAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeInfo.ChgAmt }
     *     
     */
    public void setChgAmt(ChargeInfo.ChgAmt value) {
        this.chgAmt = value;
    }

    /**
     * Obtém o valor da propriedade chgTypeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgTypeCd() {
        return chgTypeCd;
    }

    /**
     * Define o valor da propriedade chgTypeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgTypeCd(String value) {
        this.chgTypeCd = value;
    }

    /**
     * Obtém o valor da propriedade recurChgPeriodCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurChgPeriodCd() {
        return recurChgPeriodCd;
    }

    /**
     * Define o valor da propriedade recurChgPeriodCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurChgPeriodCd(String value) {
        this.recurChgPeriodCd = value;
    }

    /**
     * Obtém o valor da propriedade chgStDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChgStDt() {
        return chgStDt;
    }

    /**
     * Define o valor da propriedade chgStDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChgStDt(XMLGregorianCalendar value) {
        this.chgStDt = value;
    }

    /**
     * Obtém o valor da propriedade chgEndDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChgEndDt() {
        return chgEndDt;
    }

    /**
     * Define o valor da propriedade chgEndDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChgEndDt(XMLGregorianCalendar value) {
        this.chgEndDt = value;
    }

    /**
     * Obtém o valor da propriedade recurringChargePeriodCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecurringChargePeriodCd() {
        return recurringChargePeriodCd;
    }

    /**
     * Define o valor da propriedade recurringChargePeriodCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecurringChargePeriodCd(String value) {
        this.recurringChargePeriodCd = value;
    }

    /**
     * Obtém o valor da propriedade prorated.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProrated() {
        return prorated;
    }

    /**
     * Define o valor da propriedade prorated.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProrated(Boolean value) {
        this.prorated = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.vivo.com.br/atlys/}Currency"&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ChgAmt
        extends Currency
    {


    }

}
