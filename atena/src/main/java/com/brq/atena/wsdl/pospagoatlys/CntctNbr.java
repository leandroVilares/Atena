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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CntctNbr&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;cntctNbr type represents contact information for a customer&lt;/Description&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;CVGInternalInformation xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;File Name       : $BLS/XML/customer.xs
 *          Last Updated    : 05/10/2001
 *          Last Updated By : snarayan
 *          Comments        : added schema documentation&lt;/CVGInternalInformation&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de CntctNbr complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CntctNbr"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="xtensnTxt" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="typCd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="seqNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="pagerPin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="nbr" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="cntctPhnDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CntctNbr")
public class CntctNbr {

    @XmlAttribute(name = "xtensnTxt")
    protected String xtensnTxt;
    @XmlAttribute(name = "typCd", required = true)
    protected String typCd;
    @XmlAttribute(name = "seqNbr", required = true)
    protected String seqNbr;
    @XmlAttribute(name = "pagerPin")
    protected String pagerPin;
    @XmlAttribute(name = "nbr")
    protected String nbr;
    @XmlAttribute(name = "cntctPhnDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cntctPhnDt;

    /**
     * Obtém o valor da propriedade xtensnTxt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtensnTxt() {
        return xtensnTxt;
    }

    /**
     * Define o valor da propriedade xtensnTxt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXtensnTxt(String value) {
        this.xtensnTxt = value;
    }

    /**
     * Obtém o valor da propriedade typCd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypCd() {
        return typCd;
    }

    /**
     * Define o valor da propriedade typCd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypCd(String value) {
        this.typCd = value;
    }

    /**
     * Obtém o valor da propriedade seqNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNbr() {
        return seqNbr;
    }

    /**
     * Define o valor da propriedade seqNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNbr(String value) {
        this.seqNbr = value;
    }

    /**
     * Obtém o valor da propriedade pagerPin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerPin() {
        return pagerPin;
    }

    /**
     * Define o valor da propriedade pagerPin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerPin(String value) {
        this.pagerPin = value;
    }

    /**
     * Obtém o valor da propriedade nbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbr() {
        return nbr;
    }

    /**
     * Define o valor da propriedade nbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbr(String value) {
        this.nbr = value;
    }

    /**
     * Obtém o valor da propriedade cntctPhnDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCntctPhnDt() {
        return cntctPhnDt;
    }

    /**
     * Define o valor da propriedade cntctPhnDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCntctPhnDt(XMLGregorianCalendar value) {
        this.cntctPhnDt = value;
    }

}
