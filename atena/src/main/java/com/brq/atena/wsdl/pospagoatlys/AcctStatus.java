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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;AcctStatus&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;acctStatus type represents status information of an account&lt;/Description&gt;
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
 * <p>Classe Java de AcctStatus complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="AcctStatus"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="acctStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="acctStatusDesc" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="acctStatusEfDt" use="required" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctStatus")
public class AcctStatus {

    @XmlAttribute(name = "acctStatus", required = true)
    protected String acctStatus;
    @XmlAttribute(name = "acctStatusDesc", required = true)
    protected String acctStatusDesc;
    @XmlAttribute(name = "acctStatusEfDt", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar acctStatusEfDt;

    /**
     * Obtém o valor da propriedade acctStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatus() {
        return acctStatus;
    }

    /**
     * Define o valor da propriedade acctStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatus(String value) {
        this.acctStatus = value;
    }

    /**
     * Obtém o valor da propriedade acctStatusDesc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctStatusDesc() {
        return acctStatusDesc;
    }

    /**
     * Define o valor da propriedade acctStatusDesc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctStatusDesc(String value) {
        this.acctStatusDesc = value;
    }

    /**
     * Obtém o valor da propriedade acctStatusEfDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcctStatusEfDt() {
        return acctStatusEfDt;
    }

    /**
     * Define o valor da propriedade acctStatusEfDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcctStatusEfDt(XMLGregorianCalendar value) {
        this.acctStatusEfDt = value;
    }

}
