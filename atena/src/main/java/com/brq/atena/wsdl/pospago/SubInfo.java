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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;SubInfo&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de SubInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SubInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="svcAsgmInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}SvcAsgmInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acsNbrInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}AcsNbrInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="sbscrpId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="chnlTypInd" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubInfo", propOrder = {
    "svcAsgmInfo",
    "acsNbrInfo"
})
public class SubInfo {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<SvcAsgmInfo> svcAsgmInfo;
    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<AcsNbrInfo> acsNbrInfo;
    @XmlAttribute(name = "sbscrpId", required = true)
    protected String sbscrpId;
    @XmlAttribute(name = "chnlTypInd", required = true)
    protected String chnlTypInd;

    /**
     * Gets the value of the svcAsgmInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the svcAsgmInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSvcAsgmInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcAsgmInfo }
     * 
     * 
     */
    public List<SvcAsgmInfo> getSvcAsgmInfo() {
        if (svcAsgmInfo == null) {
            svcAsgmInfo = new ArrayList<SvcAsgmInfo>();
        }
        return this.svcAsgmInfo;
    }

    /**
     * Gets the value of the acsNbrInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acsNbrInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcsNbrInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcsNbrInfo }
     * 
     * 
     */
    public List<AcsNbrInfo> getAcsNbrInfo() {
        if (acsNbrInfo == null) {
            acsNbrInfo = new ArrayList<AcsNbrInfo>();
        }
        return this.acsNbrInfo;
    }

    /**
     * Obtém o valor da propriedade sbscrpId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSbscrpId() {
        return sbscrpId;
    }

    /**
     * Define o valor da propriedade sbscrpId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSbscrpId(String value) {
        this.sbscrpId = value;
    }

    /**
     * Obtém o valor da propriedade chnlTypInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlTypInd() {
        return chnlTypInd;
    }

    /**
     * Define o valor da propriedade chnlTypInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlTypInd(String value) {
        this.chnlTypInd = value;
    }

}
