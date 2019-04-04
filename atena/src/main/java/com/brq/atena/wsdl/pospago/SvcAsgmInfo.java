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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SvcAsgmInfo&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de SvcAsgmInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SvcAsgmInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="svcName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcEffDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="svcTrmntnDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcAsgmInfo")
public class SvcAsgmInfo {

    @XmlAttribute(name = "svcName", required = true)
    protected String svcName;
    @XmlAttribute(name = "svcEffDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar svcEffDt;
    @XmlAttribute(name = "svcTrmntnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar svcTrmntnDt;

    /**
     * Obtém o valor da propriedade svcName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcName() {
        return svcName;
    }

    /**
     * Define o valor da propriedade svcName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcName(String value) {
        this.svcName = value;
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
     * Obtém o valor da propriedade svcTrmntnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSvcTrmntnDt() {
        return svcTrmntnDt;
    }

    /**
     * Define o valor da propriedade svcTrmntnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSvcTrmntnDt(XMLGregorianCalendar value) {
        this.svcTrmntnDt = value;
    }

}
