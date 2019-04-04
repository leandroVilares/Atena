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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;CustAcctSbscrpInfo&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de CustAcctSbscrpInfo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CustAcctSbscrpInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cntctNbr" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}CntctNbr" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="acctInfo" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse}AcctInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="custId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="personFlag" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="busNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="busContact" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="firstNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="midNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="qtyAcsNbrs" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="qtyLiableAccts" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="qtyNonLiableAccts" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustAcctSbscrpInfo", propOrder = {
    "cntctNbr",
    "acctInfo"
})
public class CustAcctSbscrpInfo {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<CntctNbr> cntctNbr;
    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoResponse")
    protected List<AcctInfo> acctInfo;
    @XmlAttribute(name = "custId", required = true)
    protected String custId;
    @XmlAttribute(name = "personFlag", required = true)
    protected boolean personFlag;
    @XmlAttribute(name = "busNm")
    protected String busNm;
    @XmlAttribute(name = "busContact")
    protected String busContact;
    @XmlAttribute(name = "firstNm")
    protected String firstNm;
    @XmlAttribute(name = "midNm")
    protected String midNm;
    @XmlAttribute(name = "lastNm")
    protected String lastNm;
    @XmlAttribute(name = "qtyAcsNbrs", required = true)
    protected int qtyAcsNbrs;
    @XmlAttribute(name = "qtyLiableAccts", required = true)
    protected int qtyLiableAccts;
    @XmlAttribute(name = "qtyNonLiableAccts", required = true)
    protected int qtyNonLiableAccts;

    /**
     * Gets the value of the cntctNbr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cntctNbr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCntctNbr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CntctNbr }
     * 
     * 
     */
    public List<CntctNbr> getCntctNbr() {
        if (cntctNbr == null) {
            cntctNbr = new ArrayList<CntctNbr>();
        }
        return this.cntctNbr;
    }

    /**
     * Gets the value of the acctInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acctInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcctInfo }
     * 
     * 
     */
    public List<AcctInfo> getAcctInfo() {
        if (acctInfo == null) {
            acctInfo = new ArrayList<AcctInfo>();
        }
        return this.acctInfo;
    }

    /**
     * Obtém o valor da propriedade custId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * Define o valor da propriedade custId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * Obtém o valor da propriedade personFlag.
     * 
     */
    public boolean isPersonFlag() {
        return personFlag;
    }

    /**
     * Define o valor da propriedade personFlag.
     * 
     */
    public void setPersonFlag(boolean value) {
        this.personFlag = value;
    }

    /**
     * Obtém o valor da propriedade busNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusNm() {
        return busNm;
    }

    /**
     * Define o valor da propriedade busNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusNm(String value) {
        this.busNm = value;
    }

    /**
     * Obtém o valor da propriedade busContact.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusContact() {
        return busContact;
    }

    /**
     * Define o valor da propriedade busContact.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusContact(String value) {
        this.busContact = value;
    }

    /**
     * Obtém o valor da propriedade firstNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstNm() {
        return firstNm;
    }

    /**
     * Define o valor da propriedade firstNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstNm(String value) {
        this.firstNm = value;
    }

    /**
     * Obtém o valor da propriedade midNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMidNm() {
        return midNm;
    }

    /**
     * Define o valor da propriedade midNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMidNm(String value) {
        this.midNm = value;
    }

    /**
     * Obtém o valor da propriedade lastNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastNm() {
        return lastNm;
    }

    /**
     * Define o valor da propriedade lastNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastNm(String value) {
        this.lastNm = value;
    }

    /**
     * Obtém o valor da propriedade qtyAcsNbrs.
     * 
     */
    public int getQtyAcsNbrs() {
        return qtyAcsNbrs;
    }

    /**
     * Define o valor da propriedade qtyAcsNbrs.
     * 
     */
    public void setQtyAcsNbrs(int value) {
        this.qtyAcsNbrs = value;
    }

    /**
     * Obtém o valor da propriedade qtyLiableAccts.
     * 
     */
    public int getQtyLiableAccts() {
        return qtyLiableAccts;
    }

    /**
     * Define o valor da propriedade qtyLiableAccts.
     * 
     */
    public void setQtyLiableAccts(int value) {
        this.qtyLiableAccts = value;
    }

    /**
     * Obtém o valor da propriedade qtyNonLiableAccts.
     * 
     */
    public int getQtyNonLiableAccts() {
        return qtyNonLiableAccts;
    }

    /**
     * Define o valor da propriedade qtyNonLiableAccts.
     * 
     */
    public void setQtyNonLiableAccts(int value) {
        this.qtyNonLiableAccts = value;
    }

}
