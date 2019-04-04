//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.13 às 04:53:53 PM BRT 
//


package com.brq.atena.wsdl.conector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de messageHistoryOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="messageHistoryOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cdMessageHistory" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="dcMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtMessage" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="invokeId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="noMessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="solicitacaoPortabilidade" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "messageHistoryOut", propOrder = {
    "cdMessageHistory",
    "dcMessage",
    "dtMessage",
    "invokeId",
    "noMessage",
    "noMessageType",
    "solicitacaoPortabilidade",
    "subscriptionVersionId",
    "telephoneNumber"
})
public class MessageHistoryOut {

    protected Long cdMessageHistory;
    protected String dcMessage;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtMessage;
    protected String invokeId;
    protected String noMessage;
    protected String noMessageType;
    protected Long solicitacaoPortabilidade;
    protected String subscriptionVersionId;
    protected String telephoneNumber;

    /**
     * Obtém o valor da propriedade cdMessageHistory.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdMessageHistory() {
        return cdMessageHistory;
    }

    /**
     * Define o valor da propriedade cdMessageHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdMessageHistory(Long value) {
        this.cdMessageHistory = value;
    }

    /**
     * Obtém o valor da propriedade dcMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcMessage() {
        return dcMessage;
    }

    /**
     * Define o valor da propriedade dcMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcMessage(String value) {
        this.dcMessage = value;
    }

    /**
     * Obtém o valor da propriedade dtMessage.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtMessage() {
        return dtMessage;
    }

    /**
     * Define o valor da propriedade dtMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtMessage(XMLGregorianCalendar value) {
        this.dtMessage = value;
    }

    /**
     * Obtém o valor da propriedade invokeId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvokeId() {
        return invokeId;
    }

    /**
     * Define o valor da propriedade invokeId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvokeId(String value) {
        this.invokeId = value;
    }

    /**
     * Obtém o valor da propriedade noMessage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMessage() {
        return noMessage;
    }

    /**
     * Define o valor da propriedade noMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMessage(String value) {
        this.noMessage = value;
    }

    /**
     * Obtém o valor da propriedade noMessageType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMessageType() {
        return noMessageType;
    }

    /**
     * Define o valor da propriedade noMessageType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMessageType(String value) {
        this.noMessageType = value;
    }

    /**
     * Obtém o valor da propriedade solicitacaoPortabilidade.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSolicitacaoPortabilidade() {
        return solicitacaoPortabilidade;
    }

    /**
     * Define o valor da propriedade solicitacaoPortabilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSolicitacaoPortabilidade(Long value) {
        this.solicitacaoPortabilidade = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionVersionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionVersionId() {
        return subscriptionVersionId;
    }

    /**
     * Define o valor da propriedade subscriptionVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionVersionId(String value) {
        this.subscriptionVersionId = value;
    }

    /**
     * Obtém o valor da propriedade telephoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    /**
     * Define o valor da propriedade telephoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneNumber(String value) {
        this.telephoneNumber = value;
    }

}
