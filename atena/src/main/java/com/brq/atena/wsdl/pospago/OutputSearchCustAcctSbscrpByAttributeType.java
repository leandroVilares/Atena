//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:10:11 PM BRT 
//


package com.brq.atena.wsdl.pospago;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;OutputSearchCustAcctSbscrpByAttribute&lt;/StructureName&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Description xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;The OutputSearchCustAcctSbscrpByAttribute represent the output of this API.This  
 *             contains sequence of attribute of type CustAcctSbscrpInfo.
 *             If there are more Customer, Account or Subscription to be returned, the next element
 *             will be returned respectively in attributes areMoreCust, areMoreAcct and areMoreSub.&lt;/Description&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de OutputSearchCustAcctSbscrpByAttributeType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="OutputSearchCustAcctSbscrpByAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="custAcctSbscrpInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}CustAcctSbscrpInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="areMoreCust" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="areMoreAcct" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="areMoreSub" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutputSearchCustAcctSbscrpByAttributeType", propOrder = {
    "custAcctSbscrpInfo"
})
public class OutputSearchCustAcctSbscrpByAttributeType {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<CustAcctSbscrpInfo> custAcctSbscrpInfo;
    @XmlAttribute(name = "areMoreCust")
    protected String areMoreCust;
    @XmlAttribute(name = "areMoreAcct")
    protected String areMoreAcct;
    @XmlAttribute(name = "areMoreSub")
    protected String areMoreSub;

    /**
     * Gets the value of the custAcctSbscrpInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custAcctSbscrpInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustAcctSbscrpInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustAcctSbscrpInfo }
     * 
     * 
     */
    public List<CustAcctSbscrpInfo> getCustAcctSbscrpInfo() {
        if (custAcctSbscrpInfo == null) {
            custAcctSbscrpInfo = new ArrayList<CustAcctSbscrpInfo>();
        }
        return this.custAcctSbscrpInfo;
    }

    /**
     * Obtém o valor da propriedade areMoreCust.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreMoreCust() {
        return areMoreCust;
    }

    /**
     * Define o valor da propriedade areMoreCust.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreMoreCust(String value) {
        this.areMoreCust = value;
    }

    /**
     * Obtém o valor da propriedade areMoreAcct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreMoreAcct() {
        return areMoreAcct;
    }

    /**
     * Define o valor da propriedade areMoreAcct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreMoreAcct(String value) {
        this.areMoreAcct = value;
    }

    /**
     * Obtém o valor da propriedade areMoreSub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreMoreSub() {
        return areMoreSub;
    }

    /**
     * Define o valor da propriedade areMoreSub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreMoreSub(String value) {
        this.areMoreSub = value;
    }

}
