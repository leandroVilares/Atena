//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentMethod&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;This structure defines a common type for capturing common payment method information.&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInfomation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Name: PaymentMethod.xs
 *            Last Updated: 
 *            Last Updated By:
 *            Comments: Adding comments&lt;/CVGInternalInfomation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de PaymentMethod complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pymtTypeInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}PaymentAttributeValueList" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="acctNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="effDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="exprDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="pymtTypeCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pymtCategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="authCd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="authDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="rjctnDt" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="preNotifyInd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="currencyNbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="statusDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="requestDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="rvrsRequestDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="statusInd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentMethod", propOrder = {
    "pymtTypeInfo"
})
public class PaymentMethod {

    @XmlElement(required = true)
    protected List<PaymentAttributeValueList> pymtTypeInfo;
    @XmlAttribute(name = "acctNbr", required = true)
    protected String acctNbr;
    @XmlAttribute(name = "effDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effDt;
    @XmlAttribute(name = "exprDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exprDt;
    @XmlAttribute(name = "pymtTypeCode", required = true)
    protected String pymtTypeCode;
    @XmlAttribute(name = "pymtCategoryCode")
    protected String pymtCategoryCode;
    @XmlAttribute(name = "authCd")
    protected String authCd;
    @XmlAttribute(name = "authDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar authDt;
    @XmlAttribute(name = "rjctnDt", required = true)
    protected String rjctnDt;
    @XmlAttribute(name = "preNotifyInd", required = true)
    protected String preNotifyInd;
    @XmlAttribute(name = "currencyNbr")
    protected String currencyNbr;
    @XmlAttribute(name = "statusDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar statusDt;
    @XmlAttribute(name = "requestDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDt;
    @XmlAttribute(name = "rvrsRequestDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar rvrsRequestDt;
    @XmlAttribute(name = "statusInd")
    protected String statusInd;

    /**
     * Gets the value of the pymtTypeInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pymtTypeInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPymtTypeInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAttributeValueList }
     * 
     * 
     */
    public List<PaymentAttributeValueList> getPymtTypeInfo() {
        if (pymtTypeInfo == null) {
            pymtTypeInfo = new ArrayList<PaymentAttributeValueList>();
        }
        return this.pymtTypeInfo;
    }

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
     * Obtém o valor da propriedade exprDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExprDt() {
        return exprDt;
    }

    /**
     * Define o valor da propriedade exprDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExprDt(XMLGregorianCalendar value) {
        this.exprDt = value;
    }

    /**
     * Obtém o valor da propriedade pymtTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtTypeCode() {
        return pymtTypeCode;
    }

    /**
     * Define o valor da propriedade pymtTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtTypeCode(String value) {
        this.pymtTypeCode = value;
    }

    /**
     * Obtém o valor da propriedade pymtCategoryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPymtCategoryCode() {
        return pymtCategoryCode;
    }

    /**
     * Define o valor da propriedade pymtCategoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPymtCategoryCode(String value) {
        this.pymtCategoryCode = value;
    }

    /**
     * Obtém o valor da propriedade authCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCd() {
        return authCd;
    }

    /**
     * Define o valor da propriedade authCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCd(String value) {
        this.authCd = value;
    }

    /**
     * Obtém o valor da propriedade authDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthDt() {
        return authDt;
    }

    /**
     * Define o valor da propriedade authDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthDt(XMLGregorianCalendar value) {
        this.authDt = value;
    }

    /**
     * Obtém o valor da propriedade rjctnDt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRjctnDt() {
        return rjctnDt;
    }

    /**
     * Define o valor da propriedade rjctnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRjctnDt(String value) {
        this.rjctnDt = value;
    }

    /**
     * Obtém o valor da propriedade preNotifyInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreNotifyInd() {
        return preNotifyInd;
    }

    /**
     * Define o valor da propriedade preNotifyInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreNotifyInd(String value) {
        this.preNotifyInd = value;
    }

    /**
     * Obtém o valor da propriedade currencyNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyNbr() {
        return currencyNbr;
    }

    /**
     * Define o valor da propriedade currencyNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyNbr(String value) {
        this.currencyNbr = value;
    }

    /**
     * Obtém o valor da propriedade statusDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStatusDt() {
        return statusDt;
    }

    /**
     * Define o valor da propriedade statusDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStatusDt(XMLGregorianCalendar value) {
        this.statusDt = value;
    }

    /**
     * Obtém o valor da propriedade requestDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDt() {
        return requestDt;
    }

    /**
     * Define o valor da propriedade requestDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDt(XMLGregorianCalendar value) {
        this.requestDt = value;
    }

    /**
     * Obtém o valor da propriedade rvrsRequestDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRvrsRequestDt() {
        return rvrsRequestDt;
    }

    /**
     * Define o valor da propriedade rvrsRequestDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRvrsRequestDt(XMLGregorianCalendar value) {
        this.rvrsRequestDt = value;
    }

    /**
     * Obtém o valor da propriedade statusInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusInd() {
        return statusInd;
    }

    /**
     * Define o valor da propriedade statusInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusInd(String value) {
        this.statusInd = value;
    }

}
