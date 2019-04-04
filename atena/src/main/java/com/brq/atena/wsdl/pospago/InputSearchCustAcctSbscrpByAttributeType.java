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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;InputSearchCustAcctSbscrpByAttribute&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;The InputSearchSubscriptionByAttribute is used to keep the input record.&lt;/Description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de InputSearchCustAcctSbscrpByAttributeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InputSearchCustAcctSbscrpByAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="attrName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="attrValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="retrieveActiveAccts" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="startCust" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="startAcct" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="startSub" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputSearchCustAcctSbscrpByAttributeType", namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest")
public class InputSearchCustAcctSbscrpByAttributeType {

    @XmlAttribute(name = "attrName", required = true)
    protected String attrName;
    @XmlAttribute(name = "attrValue", required = true)
    protected String attrValue;
    @XmlAttribute(name = "retrieveActiveAccts")
    protected Boolean retrieveActiveAccts;
    @XmlAttribute(name = "startCust")
    protected String startCust;
    @XmlAttribute(name = "startAcct")
    protected String startAcct;
    @XmlAttribute(name = "startSub")
    protected String startSub;

    /**
     * Obtém o valor da propriedade attrName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrName() {
        return attrName;
    }

    /**
     * Define o valor da propriedade attrName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrName(String value) {
        this.attrName = value;
    }

    /**
     * Obtém o valor da propriedade attrValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttrValue() {
        return attrValue;
    }

    /**
     * Define o valor da propriedade attrValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttrValue(String value) {
        this.attrValue = value;
    }

    /**
     * Obtém o valor da propriedade retrieveActiveAccts.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetrieveActiveAccts() {
        return retrieveActiveAccts;
    }

    /**
     * Define o valor da propriedade retrieveActiveAccts.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetrieveActiveAccts(Boolean value) {
        this.retrieveActiveAccts = value;
    }

    /**
     * Obtém o valor da propriedade startCust.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartCust() {
        return startCust;
    }

    /**
     * Define o valor da propriedade startCust.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartCust(String value) {
        this.startCust = value;
    }

    /**
     * Obtém o valor da propriedade startAcct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartAcct() {
        return startAcct;
    }

    /**
     * Define o valor da propriedade startAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartAcct(String value) {
        this.startAcct = value;
    }

    /**
     * Obtém o valor da propriedade startSub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartSub() {
        return startSub;
    }

    /**
     * Define o valor da propriedade startSub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartSub(String value) {
        this.startSub = value;
    }

}
