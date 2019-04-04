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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;EstBalance&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;Estimate balance structure&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInformation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Name       : $BLS/XML/account.xs
 *          Last Updated    : 06/15/2001
 *          Last Updated By : snarayan
 *          Comments        : added schema documentation&lt;/CVGInternalInformation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de EstBalance complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="EstBalance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estBal" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}MultiCurrency" minOccurs="0"/&gt;
 *         &lt;element name="curUsgChg" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="pndUsgChg" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="othUsgChg" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="adjAmount" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="payAmount" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="recrChg" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="othChg" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *         &lt;element name="resLmtAmt" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}Currency" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="balAlrt" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hotlined" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="prepdExpDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="prepdCanclDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="prepdDsblDtInd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstBalance", propOrder = {
    "estBal",
    "curUsgChg",
    "pndUsgChg",
    "othUsgChg",
    "adjAmount",
    "payAmount",
    "recrChg",
    "othChg",
    "resLmtAmt"
})
public class EstBalance {

    protected MultiCurrency estBal;
    protected Currency curUsgChg;
    protected Currency pndUsgChg;
    protected Currency othUsgChg;
    protected Currency adjAmount;
    protected Currency payAmount;
    protected Currency recrChg;
    protected Currency othChg;
    protected Currency resLmtAmt;
    @XmlAttribute(name = "balAlrt", required = true)
    protected boolean balAlrt;
    @XmlAttribute(name = "hotlined", required = true)
    protected boolean hotlined;
    @XmlAttribute(name = "prepdExpDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prepdExpDt;
    @XmlAttribute(name = "prepdCanclDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prepdCanclDt;
    @XmlAttribute(name = "prepdDsblDtInd", required = true)
    protected String prepdDsblDtInd;

    /**
     * Obtém o valor da propriedade estBal.
     * 
     * @return
     *     possible object is
     *     {@link MultiCurrency }
     *     
     */
    public MultiCurrency getEstBal() {
        return estBal;
    }

    /**
     * Define o valor da propriedade estBal.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiCurrency }
     *     
     */
    public void setEstBal(MultiCurrency value) {
        this.estBal = value;
    }

    /**
     * Obtém o valor da propriedade curUsgChg.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurUsgChg() {
        return curUsgChg;
    }

    /**
     * Define o valor da propriedade curUsgChg.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurUsgChg(Currency value) {
        this.curUsgChg = value;
    }

    /**
     * Obtém o valor da propriedade pndUsgChg.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPndUsgChg() {
        return pndUsgChg;
    }

    /**
     * Define o valor da propriedade pndUsgChg.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPndUsgChg(Currency value) {
        this.pndUsgChg = value;
    }

    /**
     * Obtém o valor da propriedade othUsgChg.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getOthUsgChg() {
        return othUsgChg;
    }

    /**
     * Define o valor da propriedade othUsgChg.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setOthUsgChg(Currency value) {
        this.othUsgChg = value;
    }

    /**
     * Obtém o valor da propriedade adjAmount.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getAdjAmount() {
        return adjAmount;
    }

    /**
     * Define o valor da propriedade adjAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setAdjAmount(Currency value) {
        this.adjAmount = value;
    }

    /**
     * Obtém o valor da propriedade payAmount.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getPayAmount() {
        return payAmount;
    }

    /**
     * Define o valor da propriedade payAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setPayAmount(Currency value) {
        this.payAmount = value;
    }

    /**
     * Obtém o valor da propriedade recrChg.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getRecrChg() {
        return recrChg;
    }

    /**
     * Define o valor da propriedade recrChg.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setRecrChg(Currency value) {
        this.recrChg = value;
    }

    /**
     * Obtém o valor da propriedade othChg.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getOthChg() {
        return othChg;
    }

    /**
     * Define o valor da propriedade othChg.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setOthChg(Currency value) {
        this.othChg = value;
    }

    /**
     * Obtém o valor da propriedade resLmtAmt.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getResLmtAmt() {
        return resLmtAmt;
    }

    /**
     * Define o valor da propriedade resLmtAmt.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setResLmtAmt(Currency value) {
        this.resLmtAmt = value;
    }

    /**
     * Obtém o valor da propriedade balAlrt.
     * 
     */
    public boolean isBalAlrt() {
        return balAlrt;
    }

    /**
     * Define o valor da propriedade balAlrt.
     * 
     */
    public void setBalAlrt(boolean value) {
        this.balAlrt = value;
    }

    /**
     * Obtém o valor da propriedade hotlined.
     * 
     */
    public boolean isHotlined() {
        return hotlined;
    }

    /**
     * Define o valor da propriedade hotlined.
     * 
     */
    public void setHotlined(boolean value) {
        this.hotlined = value;
    }

    /**
     * Obtém o valor da propriedade prepdExpDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrepdExpDt() {
        return prepdExpDt;
    }

    /**
     * Define o valor da propriedade prepdExpDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrepdExpDt(XMLGregorianCalendar value) {
        this.prepdExpDt = value;
    }

    /**
     * Obtém o valor da propriedade prepdCanclDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrepdCanclDt() {
        return prepdCanclDt;
    }

    /**
     * Define o valor da propriedade prepdCanclDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrepdCanclDt(XMLGregorianCalendar value) {
        this.prepdCanclDt = value;
    }

    /**
     * Obtém o valor da propriedade prepdDsblDtInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrepdDsblDtInd() {
        return prepdDsblDtInd;
    }

    /**
     * Define o valor da propriedade prepdDsblDtInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrepdDsblDtInd(String value) {
        this.prepdDsblDtInd = value;
    }

}
