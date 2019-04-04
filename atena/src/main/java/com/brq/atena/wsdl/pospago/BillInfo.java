//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:10:11 PM BRT 
//


package com.brq.atena.wsdl.pospago;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;BillInfo&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de BillInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="BillInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="billMMYY" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="dueDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="billAmntDue" use="required" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}decimal2" /&gt;
 *       &lt;attribute name="invRmngAmt" use="required" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}decimal2" /&gt;
 *       &lt;attribute name="paymentDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="paymentFlag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillInfo")
public class BillInfo {

    @XmlAttribute(name = "billMMYY", required = true)
    protected String billMMYY;
    @XmlAttribute(name = "dueDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dueDt;
    @XmlAttribute(name = "billAmntDue", required = true)
    protected BigDecimal billAmntDue;
    @XmlAttribute(name = "invRmngAmt", required = true)
    protected BigDecimal invRmngAmt;
    @XmlAttribute(name = "paymentDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar paymentDt;
    @XmlAttribute(name = "paymentFlag", required = true)
    protected boolean paymentFlag;

    /**
     * Obtém o valor da propriedade billMMYY.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillMMYY() {
        return billMMYY;
    }

    /**
     * Define o valor da propriedade billMMYY.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillMMYY(String value) {
        this.billMMYY = value;
    }

    /**
     * Obtém o valor da propriedade dueDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDueDt() {
        return dueDt;
    }

    /**
     * Define o valor da propriedade dueDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDueDt(XMLGregorianCalendar value) {
        this.dueDt = value;
    }

    /**
     * Obtém o valor da propriedade billAmntDue.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getBillAmntDue() {
        return billAmntDue;
    }

    /**
     * Define o valor da propriedade billAmntDue.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setBillAmntDue(BigDecimal value) {
        this.billAmntDue = value;
    }

    /**
     * Obtém o valor da propriedade invRmngAmt.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInvRmngAmt() {
        return invRmngAmt;
    }

    /**
     * Define o valor da propriedade invRmngAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInvRmngAmt(BigDecimal value) {
        this.invRmngAmt = value;
    }

    /**
     * Obtém o valor da propriedade paymentDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaymentDt() {
        return paymentDt;
    }

    /**
     * Define o valor da propriedade paymentDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaymentDt(XMLGregorianCalendar value) {
        this.paymentDt = value;
    }

    /**
     * Obtém o valor da propriedade paymentFlag.
     * 
     */
    public boolean isPaymentFlag() {
        return paymentFlag;
    }

    /**
     * Define o valor da propriedade paymentFlag.
     * 
     */
    public void setPaymentFlag(boolean value) {
        this.paymentFlag = value;
    }

}
