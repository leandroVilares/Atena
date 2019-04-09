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
 * <p>Classe Java de Subscriber complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Subscriber"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="acctNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="sbscrpId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="accessNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="athctnFlag" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="actvtnDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="csa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="custId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcEffDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="svcExprDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="sbscrpTypCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="taxAddrSeqNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="chnlTypeInd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="leaderFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Subscriber", namespace = "http://www.vivo.com.br/atlys/")
public class Subscriber {

    @XmlAttribute(name = "acctNbr")
    protected String acctNbr;
    @XmlAttribute(name = "sbscrpId")
    protected String sbscrpId;
    @XmlAttribute(name = "accessNbr")
    protected String accessNbr;
    @XmlAttribute(name = "athctnFlag")
    protected String athctnFlag;
    @XmlAttribute(name = "actvtnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar actvtnDt;
    @XmlAttribute(name = "csa")
    protected String csa;
    @XmlAttribute(name = "custId")
    protected String custId;
    @XmlAttribute(name = "svcEffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar svcEffDt;
    @XmlAttribute(name = "svcExprDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar svcExprDt;
    @XmlAttribute(name = "sbscrpTypCd")
    protected String sbscrpTypCd;
    @XmlAttribute(name = "taxAddrSeqNbr")
    protected String taxAddrSeqNbr;
    @XmlAttribute(name = "chnlTypeInd")
    protected String chnlTypeInd;
    @XmlAttribute(name = "leaderFlag")
    protected Boolean leaderFlag;

    /**
     * Obtém o valor da propriedade acctNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNbr() {
        return acctNbr;
    }

    /**
     * Define o valor da propriedade acctNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNbr(String value) {
        this.acctNbr = value;
    }

    /**
     * Obtém o valor da propriedade sbscrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbscrpId() {
        return sbscrpId;
    }

    /**
     * Define o valor da propriedade sbscrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbscrpId(String value) {
        this.sbscrpId = value;
    }

    /**
     * Obtém o valor da propriedade accessNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessNbr() {
        return accessNbr;
    }

    /**
     * Define o valor da propriedade accessNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessNbr(String value) {
        this.accessNbr = value;
    }

    /**
     * Obtém o valor da propriedade athctnFlag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAthctnFlag() {
        return athctnFlag;
    }

    /**
     * Define o valor da propriedade athctnFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAthctnFlag(String value) {
        this.athctnFlag = value;
    }

    /**
     * Obtém o valor da propriedade actvtnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActvtnDt() {
        return actvtnDt;
    }

    /**
     * Define o valor da propriedade actvtnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActvtnDt(XMLGregorianCalendar value) {
        this.actvtnDt = value;
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
     * Obtém o valor da propriedade custId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Define o valor da propriedade custId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Obtém o valor da propriedade svcEffDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSvcEffDt() {
        return svcEffDt;
    }

    /**
     * Define o valor da propriedade svcEffDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSvcEffDt(XMLGregorianCalendar value) {
        this.svcEffDt = value;
    }

    /**
     * Obtém o valor da propriedade svcExprDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSvcExprDt() {
        return svcExprDt;
    }

    /**
     * Define o valor da propriedade svcExprDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSvcExprDt(XMLGregorianCalendar value) {
        this.svcExprDt = value;
    }

    /**
     * Obtém o valor da propriedade sbscrpTypCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbscrpTypCd() {
        return sbscrpTypCd;
    }

    /**
     * Define o valor da propriedade sbscrpTypCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbscrpTypCd(String value) {
        this.sbscrpTypCd = value;
    }

    /**
     * Obtém o valor da propriedade taxAddrSeqNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxAddrSeqNbr() {
        return taxAddrSeqNbr;
    }

    /**
     * Define o valor da propriedade taxAddrSeqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxAddrSeqNbr(String value) {
        this.taxAddrSeqNbr = value;
    }

    /**
     * Obtém o valor da propriedade chnlTypeInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlTypeInd() {
        return chnlTypeInd;
    }

    /**
     * Define o valor da propriedade chnlTypeInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlTypeInd(String value) {
        this.chnlTypeInd = value;
    }

    /**
     * Obtém o valor da propriedade leaderFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeaderFlag() {
        return leaderFlag;
    }

    /**
     * Define o valor da propriedade leaderFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeaderFlag(Boolean value) {
        this.leaderFlag = value;
    }

}
