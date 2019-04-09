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
 * <p>Classe Java de NegotPrice complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NegotPrice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="svcPriceSeqNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="csa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="negotType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="negotPct" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="basePrice" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="negotAmt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reasonCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="effDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="expDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="autoRecalcFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NegotPrice", namespace = "http://www.vivo.com.br/atlys/")
public class NegotPrice {

    @XmlAttribute(name = "svcPriceSeqNbr")
    protected String svcPriceSeqNbr;
    @XmlAttribute(name = "csa")
    protected String csa;
    @XmlAttribute(name = "negotType")
    protected String negotType;
    @XmlAttribute(name = "negotPct")
    protected String negotPct;
    @XmlAttribute(name = "basePrice")
    protected String basePrice;
    @XmlAttribute(name = "negotAmt")
    protected String negotAmt;
    @XmlAttribute(name = "reasonCd")
    protected String reasonCd;
    @XmlAttribute(name = "effDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDt;
    @XmlAttribute(name = "expDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expDt;
    @XmlAttribute(name = "autoRecalcFlag")
    protected Boolean autoRecalcFlag;

    /**
     * Obtém o valor da propriedade svcPriceSeqNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcPriceSeqNbr() {
        return svcPriceSeqNbr;
    }

    /**
     * Define o valor da propriedade svcPriceSeqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcPriceSeqNbr(String value) {
        this.svcPriceSeqNbr = value;
    }

    /**
     * Obtém o valor da propriedade csa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsa() {
        return csa;
    }

    /**
     * Define o valor da propriedade csa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsa(String value) {
        this.csa = value;
    }

    /**
     * Obtém o valor da propriedade negotType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotType() {
        return negotType;
    }

    /**
     * Define o valor da propriedade negotType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotType(String value) {
        this.negotType = value;
    }

    /**
     * Obtém o valor da propriedade negotPct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotPct() {
        return negotPct;
    }

    /**
     * Define o valor da propriedade negotPct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotPct(String value) {
        this.negotPct = value;
    }

    /**
     * Obtém o valor da propriedade basePrice.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBasePrice() {
        return basePrice;
    }

    /**
     * Define o valor da propriedade basePrice.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBasePrice(String value) {
        this.basePrice = value;
    }

    /**
     * Obtém o valor da propriedade negotAmt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegotAmt() {
        return negotAmt;
    }

    /**
     * Define o valor da propriedade negotAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegotAmt(String value) {
        this.negotAmt = value;
    }

    /**
     * Obtém o valor da propriedade reasonCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCd() {
        return reasonCd;
    }

    /**
     * Define o valor da propriedade reasonCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCd(String value) {
        this.reasonCd = value;
    }

    /**
     * Obtém o valor da propriedade effDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffDt() {
        return effDt;
    }

    /**
     * Define o valor da propriedade effDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffDt(XMLGregorianCalendar value) {
        this.effDt = value;
    }

    /**
     * Obtém o valor da propriedade expDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpDt() {
        return expDt;
    }

    /**
     * Define o valor da propriedade expDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpDt(XMLGregorianCalendar value) {
        this.expDt = value;
    }

    /**
     * Obtém o valor da propriedade autoRecalcFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutoRecalcFlag() {
        return autoRecalcFlag;
    }

    /**
     * Define o valor da propriedade autoRecalcFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutoRecalcFlag(Boolean value) {
        this.autoRecalcFlag = value;
    }

}
