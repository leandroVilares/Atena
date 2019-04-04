//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Customer&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;customer type represents a customer in the system.&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInformation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Name       : $BLS/XML/customer.xs
 *          Last Updated    : 05/10/2001
 *          Last Updated By : snarayan
 *          Comments        : added schema documentation
 *          File Name       : $ARESRC/libs/common/xml/customer.xs
 *          Last Updated    : 10/24/2001
 *          Last Updated By : svogety
 *          Comments        : added valSegId attribute.&lt;/CVGInternalInformation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de Customer complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="Customer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="custId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="liabCust" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="personInd" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="birthDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="multAccts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="busNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="prefixNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="firstNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="midNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="suffixNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="titleTxt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="busCntctNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="busCntctTtl" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="csa" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdtClss" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdtScore" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="crdtRefNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="custTypCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="emailAddr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="langCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="valSegId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="vatRgstrtId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="taxLbltyTypeCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="salesChnlId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Customer")
public class Customer {

    @XmlAttribute(name = "custId")
    protected String custId;
    @XmlAttribute(name = "liabCust")
    protected Boolean liabCust;
    @XmlAttribute(name = "personInd")
    protected Boolean personInd;
    @XmlAttribute(name = "birthDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDt;
    @XmlAttribute(name = "multAccts")
    protected Boolean multAccts;
    @XmlAttribute(name = "busNm")
    protected String busNm;
    @XmlAttribute(name = "prefixNm")
    protected String prefixNm;
    @XmlAttribute(name = "firstNm")
    protected String firstNm;
    @XmlAttribute(name = "midNm")
    protected String midNm;
    @XmlAttribute(name = "lastNm")
    protected String lastNm;
    @XmlAttribute(name = "suffixNm")
    protected String suffixNm;
    @XmlAttribute(name = "titleTxt")
    protected String titleTxt;
    @XmlAttribute(name = "busCntctNm")
    protected String busCntctNm;
    @XmlAttribute(name = "busCntctTtl")
    protected String busCntctTtl;
    @XmlAttribute(name = "csa")
    protected String csa;
    @XmlAttribute(name = "crdtClss")
    protected String crdtClss;
    @XmlAttribute(name = "crdtScore")
    protected String crdtScore;
    @XmlAttribute(name = "crdtRefNbr")
    protected String crdtRefNbr;
    @XmlAttribute(name = "custTypCd")
    protected String custTypCd;
    @XmlAttribute(name = "emailAddr")
    protected String emailAddr;
    @XmlAttribute(name = "langCd")
    protected String langCd;
    @XmlAttribute(name = "valSegId")
    protected String valSegId;
    @XmlAttribute(name = "vatRgstrtId")
    protected String vatRgstrtId;
    @XmlAttribute(name = "taxLbltyTypeCd")
    protected String taxLbltyTypeCd;
    @XmlAttribute(name = "salesChnlId")
    protected String salesChnlId;

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
     * Obtém o valor da propriedade liabCust.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLiabCust() {
        return liabCust;
    }

    /**
     * Define o valor da propriedade liabCust.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLiabCust(Boolean value) {
        this.liabCust = value;
    }

    /**
     * Obtém o valor da propriedade personInd.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPersonInd() {
        return personInd;
    }

    /**
     * Define o valor da propriedade personInd.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPersonInd(Boolean value) {
        this.personInd = value;
    }

    /**
     * Obtém o valor da propriedade birthDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Define o valor da propriedade birthDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Obtém o valor da propriedade multAccts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultAccts() {
        return multAccts;
    }

    /**
     * Define o valor da propriedade multAccts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultAccts(Boolean value) {
        this.multAccts = value;
    }

    /**
     * Obtém o valor da propriedade busNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusNm() {
        return busNm;
    }

    /**
     * Define o valor da propriedade busNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusNm(String value) {
        this.busNm = value;
    }

    /**
     * Obtém o valor da propriedade prefixNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefixNm() {
        return prefixNm;
    }

    /**
     * Define o valor da propriedade prefixNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefixNm(String value) {
        this.prefixNm = value;
    }

    /**
     * Obtém o valor da propriedade firstNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNm() {
        return firstNm;
    }

    /**
     * Define o valor da propriedade firstNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNm(String value) {
        this.firstNm = value;
    }

    /**
     * Obtém o valor da propriedade midNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidNm() {
        return midNm;
    }

    /**
     * Define o valor da propriedade midNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidNm(String value) {
        this.midNm = value;
    }

    /**
     * Obtém o valor da propriedade lastNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Define o valor da propriedade lastNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNm(String value) {
        this.lastNm = value;
    }

    /**
     * Obtém o valor da propriedade suffixNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixNm() {
        return suffixNm;
    }

    /**
     * Define o valor da propriedade suffixNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixNm(String value) {
        this.suffixNm = value;
    }

    /**
     * Obtém o valor da propriedade titleTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleTxt() {
        return titleTxt;
    }

    /**
     * Define o valor da propriedade titleTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleTxt(String value) {
        this.titleTxt = value;
    }

    /**
     * Obtém o valor da propriedade busCntctNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusCntctNm() {
        return busCntctNm;
    }

    /**
     * Define o valor da propriedade busCntctNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusCntctNm(String value) {
        this.busCntctNm = value;
    }

    /**
     * Obtém o valor da propriedade busCntctTtl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusCntctTtl() {
        return busCntctTtl;
    }

    /**
     * Define o valor da propriedade busCntctTtl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusCntctTtl(String value) {
        this.busCntctTtl = value;
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
     * Obtém o valor da propriedade crdtClss.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtClss() {
        return crdtClss;
    }

    /**
     * Define o valor da propriedade crdtClss.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtClss(String value) {
        this.crdtClss = value;
    }

    /**
     * Obtém o valor da propriedade crdtScore.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtScore() {
        return crdtScore;
    }

    /**
     * Define o valor da propriedade crdtScore.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtScore(String value) {
        this.crdtScore = value;
    }

    /**
     * Obtém o valor da propriedade crdtRefNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrdtRefNbr() {
        return crdtRefNbr;
    }

    /**
     * Define o valor da propriedade crdtRefNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrdtRefNbr(String value) {
        this.crdtRefNbr = value;
    }

    /**
     * Obtém o valor da propriedade custTypCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustTypCd() {
        return custTypCd;
    }

    /**
     * Define o valor da propriedade custTypCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustTypCd(String value) {
        this.custTypCd = value;
    }

    /**
     * Obtém o valor da propriedade emailAddr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailAddr() {
        return emailAddr;
    }

    /**
     * Define o valor da propriedade emailAddr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailAddr(String value) {
        this.emailAddr = value;
    }

    /**
     * Obtém o valor da propriedade langCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLangCd() {
        return langCd;
    }

    /**
     * Define o valor da propriedade langCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLangCd(String value) {
        this.langCd = value;
    }

    /**
     * Obtém o valor da propriedade valSegId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValSegId() {
        return valSegId;
    }

    /**
     * Define o valor da propriedade valSegId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValSegId(String value) {
        this.valSegId = value;
    }

    /**
     * Obtém o valor da propriedade vatRgstrtId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatRgstrtId() {
        return vatRgstrtId;
    }

    /**
     * Define o valor da propriedade vatRgstrtId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatRgstrtId(String value) {
        this.vatRgstrtId = value;
    }

    /**
     * Obtém o valor da propriedade taxLbltyTypeCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxLbltyTypeCd() {
        return taxLbltyTypeCd;
    }

    /**
     * Define o valor da propriedade taxLbltyTypeCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxLbltyTypeCd(String value) {
        this.taxLbltyTypeCd = value;
    }

    /**
     * Obtém o valor da propriedade salesChnlId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChnlId() {
        return salesChnlId;
    }

    /**
     * Define o valor da propriedade salesChnlId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChnlId(String value) {
        this.salesChnlId = value;
    }

}
