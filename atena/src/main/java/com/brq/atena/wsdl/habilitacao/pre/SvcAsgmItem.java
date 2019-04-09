//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SvcAsgmItem complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SvcAsgmItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="salesChnl" type="{http://www.vivo.com.br/atlys/}SalesChnl" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subTotal" type="{http://www.vivo.com.br/atlys/}Currency" minOccurs="0"/&gt;
 *         &lt;element name="primarySvc" type="{http://www.vivo.com.br/atlys/}SvcItem" minOccurs="0"/&gt;
 *         &lt;element name="memberSvcs" type="{http://www.vivo.com.br/atlys/}SvcItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="swapSvcId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="swapSvcNm" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="chgOneDaySvc" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="chgStatusInd" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="svcEffDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="svcExprDt" type="{http://www.w3.org/2001/XMLSchema}date" /&gt;
 *       &lt;attribute name="realtimeSharedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="leaderId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SvcAsgmItem", namespace = "http://www.vivo.com.br/atlys/", propOrder = {
    "salesChnl",
    "subTotal",
    "primarySvc",
    "memberSvcs"
})
public class SvcAsgmItem {

    protected List<SalesChnl> salesChnl;
    protected Currency subTotal;
    protected SvcItem primarySvc;
    protected List<SvcItem> memberSvcs;
    @XmlAttribute(name = "swapSvcId")
    protected String swapSvcId;
    @XmlAttribute(name = "swapSvcNm")
    protected String swapSvcNm;
    @XmlAttribute(name = "chgOneDaySvc")
    protected Boolean chgOneDaySvc;
    @XmlAttribute(name = "chgStatusInd")
    protected String chgStatusInd;
    @XmlAttribute(name = "svcEffDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar svcEffDt;
    @XmlAttribute(name = "svcExprDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar svcExprDt;
    @XmlAttribute(name = "realtimeSharedFlag")
    protected Boolean realtimeSharedFlag;
    @XmlAttribute(name = "leaderId")
    protected String leaderId;
    @XmlAttribute(name = "reasonCode")
    protected String reasonCode;

    /**
     * Gets the value of the salesChnl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesChnl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesChnl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesChnl }
     * 
     * 
     */
    public List<SalesChnl> getSalesChnl() {
        if (salesChnl == null) {
            salesChnl = new ArrayList<SalesChnl>();
        }
        return this.salesChnl;
    }

    /**
     * Obtém o valor da propriedade subTotal.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getSubTotal() {
        return subTotal;
    }

    /**
     * Define o valor da propriedade subTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setSubTotal(Currency value) {
        this.subTotal = value;
    }

    /**
     * Obtém o valor da propriedade primarySvc.
     * 
     * @return
     *     possible object is
     *     {@link SvcItem }
     *     
     */
    public SvcItem getPrimarySvc() {
        return primarySvc;
    }

    /**
     * Define o valor da propriedade primarySvc.
     * 
     * @param value
     *     allowed object is
     *     {@link SvcItem }
     *     
     */
    public void setPrimarySvc(SvcItem value) {
        this.primarySvc = value;
    }

    /**
     * Gets the value of the memberSvcs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memberSvcs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemberSvcs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SvcItem }
     * 
     * 
     */
    public List<SvcItem> getMemberSvcs() {
        if (memberSvcs == null) {
            memberSvcs = new ArrayList<SvcItem>();
        }
        return this.memberSvcs;
    }

    /**
     * Obtém o valor da propriedade swapSvcId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapSvcId() {
        return swapSvcId;
    }

    /**
     * Define o valor da propriedade swapSvcId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapSvcId(String value) {
        this.swapSvcId = value;
    }

    /**
     * Obtém o valor da propriedade swapSvcNm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSwapSvcNm() {
        return swapSvcNm;
    }

    /**
     * Define o valor da propriedade swapSvcNm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSwapSvcNm(String value) {
        this.swapSvcNm = value;
    }

    /**
     * Obtém o valor da propriedade chgOneDaySvc.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChgOneDaySvc() {
        return chgOneDaySvc;
    }

    /**
     * Define o valor da propriedade chgOneDaySvc.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChgOneDaySvc(Boolean value) {
        this.chgOneDaySvc = value;
    }

    /**
     * Obtém o valor da propriedade chgStatusInd.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChgStatusInd() {
        return chgStatusInd;
    }

    /**
     * Define o valor da propriedade chgStatusInd.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChgStatusInd(String value) {
        this.chgStatusInd = value;
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
     * Obtém o valor da propriedade svcExprDt.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSvcExprDt() {
        return svcExprDt;
    }

    /**
     * Define o valor da propriedade svcExprDt.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSvcExprDt(XMLGregorianCalendar value) {
        this.svcExprDt = value;
    }

    /**
     * Obtém o valor da propriedade realtimeSharedFlag.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRealtimeSharedFlag() {
        return realtimeSharedFlag;
    }

    /**
     * Define o valor da propriedade realtimeSharedFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRealtimeSharedFlag(Boolean value) {
        this.realtimeSharedFlag = value;
    }

    /**
     * Obtém o valor da propriedade leaderId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaderId() {
        return leaderId;
    }

    /**
     * Define o valor da propriedade leaderId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaderId(String value) {
        this.leaderId = value;
    }

    /**
     * Obtém o valor da propriedade reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonCode() {
        return reasonCode;
    }

    /**
     * Define o valor da propriedade reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonCode(String value) {
        this.reasonCode = value;
    }

}
