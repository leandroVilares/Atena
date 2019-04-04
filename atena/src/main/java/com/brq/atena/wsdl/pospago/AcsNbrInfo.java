//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:10:11 PM BRT 
//


package com.brq.atena.wsdl.pospago;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AcsNbrInfo&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de AcsNbrInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AcsNbrInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="accessNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="acsNbrEffDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="acsNbrExprDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="acsNbrStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="iccid" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="imei" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcsNbrInfo")
public class AcsNbrInfo {

    @XmlAttribute(name = "accessNbr", required = true)
    protected String accessNbr;
    @XmlAttribute(name = "acsNbrEffDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acsNbrEffDt;
    @XmlAttribute(name = "acsNbrExprDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acsNbrExprDt;
    @XmlAttribute(name = "acsNbrStatus", required = true)
    protected String acsNbrStatus;
    @XmlAttribute(name = "iccid")
    protected String iccid;
    @XmlAttribute(name = "imei")
    protected String imei;

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
     * Obtém o valor da propriedade acsNbrEffDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcsNbrEffDt() {
        return acsNbrEffDt;
    }

    /**
     * Define o valor da propriedade acsNbrEffDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcsNbrEffDt(XMLGregorianCalendar value) {
        this.acsNbrEffDt = value;
    }

    /**
     * Obtém o valor da propriedade acsNbrExprDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcsNbrExprDt() {
        return acsNbrExprDt;
    }

    /**
     * Define o valor da propriedade acsNbrExprDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcsNbrExprDt(XMLGregorianCalendar value) {
        this.acsNbrExprDt = value;
    }

    /**
     * Obtém o valor da propriedade acsNbrStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcsNbrStatus() {
        return acsNbrStatus;
    }

    /**
     * Define o valor da propriedade acsNbrStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcsNbrStatus(String value) {
        this.acsNbrStatus = value;
    }

    /**
     * Obtém o valor da propriedade iccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Define o valor da propriedade iccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Obtém o valor da propriedade imei.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImei() {
        return imei;
    }

    /**
     * Define o valor da propriedade imei.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(String value) {
        this.imei = value;
    }

}
