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
 * <p>Classe Java de portabilityTicketOut complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="portabilityTicketOut"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subscriptionVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="genericId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recipientFraudErrorJustif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recipientFraudErrorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionRecipientEot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionDonorSp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subDocumReceiptConfirmation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionGenerateGroupId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionGroupId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="lnType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionLineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="telephoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionNewCnl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionOldCnl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceProvType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subCustomExtendedPortDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionFixedSpecial" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subPortingToOriginalSp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="durationDays" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fraudErrorVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sistemaorigem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMsgCreation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusSpg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionRecipientSp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageReceiverDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="mensagem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subDonorSpAuthorization" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subDonorSpAuthorDueDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subDonorFraudErrorType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subDonorFraudErrorJustif" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="subStatusChangeCauseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="cancelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="authorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="initialQuarentenaDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subCancellationCauseCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="subscriptionDonorActionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="endDateServiceOrder" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="bdoNetEndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="customerDisconnectDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="effectiveReleaseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="disconnectedVersionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roleProvider" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cdSolicitacao" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="tnStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tnStop" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtSolicitacao" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="cdErroEa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dcErroEa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "portabilityTicketOut", propOrder = {
    "subscriptionVersionId",
    "customerName",
    "customerType",
    "customerId",
    "genericId",
    "recipientFraudErrorJustif",
    "recipientFraudErrorType",
    "subscriptionRecipientEot",
    "subscriptionDonorSp",
    "subDocumReceiptConfirmation",
    "subscriptionGenerateGroupId",
    "subscriptionGroupId",
    "lnType",
    "subscriptionLineType",
    "telephoneNumber",
    "subscriptionNewCnl",
    "subscriptionOldCnl",
    "serviceProvType",
    "subCustomExtendedPortDate",
    "subscriptionFixedSpecial",
    "subPortingToOriginalSp",
    "subscriptionDueDate",
    "durationDays",
    "fraudErrorVersionId",
    "sistemaorigem",
    "idMsgCreation",
    "statusSpg",
    "subscriptionRecipientSp",
    "messageReceiverDate",
    "mensagem",
    "subDonorSpAuthorization",
    "subDonorSpAuthorDueDate",
    "subDonorFraudErrorType",
    "subDonorFraudErrorJustif",
    "subStatusChangeCauseCode",
    "cancelType",
    "authorizationDate",
    "initialQuarentenaDate",
    "subCancellationCauseCode",
    "subscriptionDonorActionId",
    "endDateServiceOrder",
    "bdoNetEndDate",
    "customerDisconnectDate",
    "effectiveReleaseDate",
    "disconnectedVersionId",
    "roleProvider",
    "cdSolicitacao",
    "tnStart",
    "tnStop",
    "dtSolicitacao",
    "cdErroEa",
    "dcErroEa"
})
public class PortabilityTicketOut {

    protected String subscriptionVersionId;
    protected String customerName;
    protected String customerType;
    protected String customerId;
    protected String genericId;
    protected String recipientFraudErrorJustif;
    protected String recipientFraudErrorType;
    protected String subscriptionRecipientEot;
    protected String subscriptionDonorSp;
    protected String subDocumReceiptConfirmation;
    protected String subscriptionGenerateGroupId;
    protected Integer subscriptionGroupId;
    protected String lnType;
    protected String subscriptionLineType;
    protected String telephoneNumber;
    protected String subscriptionNewCnl;
    protected String subscriptionOldCnl;
    protected String serviceProvType;
    protected String subCustomExtendedPortDate;
    protected String subscriptionFixedSpecial;
    protected String subPortingToOriginalSp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subscriptionDueDate;
    protected Integer durationDays;
    protected String fraudErrorVersionId;
    protected String sistemaorigem;
    protected String idMsgCreation;
    protected String statusSpg;
    protected String subscriptionRecipientSp;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar messageReceiverDate;
    protected String mensagem;
    protected String subDonorSpAuthorization;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar subDonorSpAuthorDueDate;
    protected String subDonorFraudErrorType;
    protected String subDonorFraudErrorJustif;
    protected Integer subStatusChangeCauseCode;
    protected String cancelType;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar initialQuarentenaDate;
    protected Integer subCancellationCauseCode;
    protected Integer subscriptionDonorActionId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDateServiceOrder;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bdoNetEndDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerDisconnectDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveReleaseDate;
    protected String disconnectedVersionId;
    protected String roleProvider;
    protected Long cdSolicitacao;
    protected String tnStart;
    protected String tnStop;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtSolicitacao;
    protected String cdErroEa;
    protected String dcErroEa;

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
     * Obtém o valor da propriedade customerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Define o valor da propriedade customerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Obtém o valor da propriedade customerType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Define o valor da propriedade customerType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Obtém o valor da propriedade customerId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Define o valor da propriedade customerId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Obtém o valor da propriedade genericId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericId() {
        return genericId;
    }

    /**
     * Define o valor da propriedade genericId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericId(String value) {
        this.genericId = value;
    }

    /**
     * Obtém o valor da propriedade recipientFraudErrorJustif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientFraudErrorJustif() {
        return recipientFraudErrorJustif;
    }

    /**
     * Define o valor da propriedade recipientFraudErrorJustif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientFraudErrorJustif(String value) {
        this.recipientFraudErrorJustif = value;
    }

    /**
     * Obtém o valor da propriedade recipientFraudErrorType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientFraudErrorType() {
        return recipientFraudErrorType;
    }

    /**
     * Define o valor da propriedade recipientFraudErrorType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientFraudErrorType(String value) {
        this.recipientFraudErrorType = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionRecipientEot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionRecipientEot() {
        return subscriptionRecipientEot;
    }

    /**
     * Define o valor da propriedade subscriptionRecipientEot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionRecipientEot(String value) {
        this.subscriptionRecipientEot = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionDonorSp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionDonorSp() {
        return subscriptionDonorSp;
    }

    /**
     * Define o valor da propriedade subscriptionDonorSp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionDonorSp(String value) {
        this.subscriptionDonorSp = value;
    }

    /**
     * Obtém o valor da propriedade subDocumReceiptConfirmation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDocumReceiptConfirmation() {
        return subDocumReceiptConfirmation;
    }

    /**
     * Define o valor da propriedade subDocumReceiptConfirmation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDocumReceiptConfirmation(String value) {
        this.subDocumReceiptConfirmation = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionGenerateGroupId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionGenerateGroupId() {
        return subscriptionGenerateGroupId;
    }

    /**
     * Define o valor da propriedade subscriptionGenerateGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionGenerateGroupId(String value) {
        this.subscriptionGenerateGroupId = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionGroupId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionGroupId() {
        return subscriptionGroupId;
    }

    /**
     * Define o valor da propriedade subscriptionGroupId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionGroupId(Integer value) {
        this.subscriptionGroupId = value;
    }

    /**
     * Obtém o valor da propriedade lnType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnType() {
        return lnType;
    }

    /**
     * Define o valor da propriedade lnType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnType(String value) {
        this.lnType = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionLineType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionLineType() {
        return subscriptionLineType;
    }

    /**
     * Define o valor da propriedade subscriptionLineType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionLineType(String value) {
        this.subscriptionLineType = value;
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

    /**
     * Obtém o valor da propriedade subscriptionNewCnl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionNewCnl() {
        return subscriptionNewCnl;
    }

    /**
     * Define o valor da propriedade subscriptionNewCnl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionNewCnl(String value) {
        this.subscriptionNewCnl = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionOldCnl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionOldCnl() {
        return subscriptionOldCnl;
    }

    /**
     * Define o valor da propriedade subscriptionOldCnl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionOldCnl(String value) {
        this.subscriptionOldCnl = value;
    }

    /**
     * Obtém o valor da propriedade serviceProvType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceProvType() {
        return serviceProvType;
    }

    /**
     * Define o valor da propriedade serviceProvType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceProvType(String value) {
        this.serviceProvType = value;
    }

    /**
     * Obtém o valor da propriedade subCustomExtendedPortDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCustomExtendedPortDate() {
        return subCustomExtendedPortDate;
    }

    /**
     * Define o valor da propriedade subCustomExtendedPortDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCustomExtendedPortDate(String value) {
        this.subCustomExtendedPortDate = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionFixedSpecial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionFixedSpecial() {
        return subscriptionFixedSpecial;
    }

    /**
     * Define o valor da propriedade subscriptionFixedSpecial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionFixedSpecial(String value) {
        this.subscriptionFixedSpecial = value;
    }

    /**
     * Obtém o valor da propriedade subPortingToOriginalSp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubPortingToOriginalSp() {
        return subPortingToOriginalSp;
    }

    /**
     * Define o valor da propriedade subPortingToOriginalSp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubPortingToOriginalSp(String value) {
        this.subPortingToOriginalSp = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubscriptionDueDate() {
        return subscriptionDueDate;
    }

    /**
     * Define o valor da propriedade subscriptionDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubscriptionDueDate(XMLGregorianCalendar value) {
        this.subscriptionDueDate = value;
    }

    /**
     * Obtém o valor da propriedade durationDays.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDurationDays() {
        return durationDays;
    }

    /**
     * Define o valor da propriedade durationDays.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDurationDays(Integer value) {
        this.durationDays = value;
    }

    /**
     * Obtém o valor da propriedade fraudErrorVersionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFraudErrorVersionId() {
        return fraudErrorVersionId;
    }

    /**
     * Define o valor da propriedade fraudErrorVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFraudErrorVersionId(String value) {
        this.fraudErrorVersionId = value;
    }

    /**
     * Obtém o valor da propriedade sistemaorigem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistemaorigem() {
        return sistemaorigem;
    }

    /**
     * Define o valor da propriedade sistemaorigem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistemaorigem(String value) {
        this.sistemaorigem = value;
    }

    /**
     * Obtém o valor da propriedade idMsgCreation.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdMsgCreation() {
        return idMsgCreation;
    }

    /**
     * Define o valor da propriedade idMsgCreation.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMsgCreation(String value) {
        this.idMsgCreation = value;
    }

    /**
     * Obtém o valor da propriedade statusSpg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSpg() {
        return statusSpg;
    }

    /**
     * Define o valor da propriedade statusSpg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSpg(String value) {
        this.statusSpg = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionRecipientSp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionRecipientSp() {
        return subscriptionRecipientSp;
    }

    /**
     * Define o valor da propriedade subscriptionRecipientSp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionRecipientSp(String value) {
        this.subscriptionRecipientSp = value;
    }

    /**
     * Obtém o valor da propriedade messageReceiverDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMessageReceiverDate() {
        return messageReceiverDate;
    }

    /**
     * Define o valor da propriedade messageReceiverDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMessageReceiverDate(XMLGregorianCalendar value) {
        this.messageReceiverDate = value;
    }

    /**
     * Obtém o valor da propriedade mensagem.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMensagem() {
        return mensagem;
    }

    /**
     * Define o valor da propriedade mensagem.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMensagem(String value) {
        this.mensagem = value;
    }

    /**
     * Obtém o valor da propriedade subDonorSpAuthorization.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDonorSpAuthorization() {
        return subDonorSpAuthorization;
    }

    /**
     * Define o valor da propriedade subDonorSpAuthorization.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDonorSpAuthorization(String value) {
        this.subDonorSpAuthorization = value;
    }

    /**
     * Obtém o valor da propriedade subDonorSpAuthorDueDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubDonorSpAuthorDueDate() {
        return subDonorSpAuthorDueDate;
    }

    /**
     * Define o valor da propriedade subDonorSpAuthorDueDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubDonorSpAuthorDueDate(XMLGregorianCalendar value) {
        this.subDonorSpAuthorDueDate = value;
    }

    /**
     * Obtém o valor da propriedade subDonorFraudErrorType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDonorFraudErrorType() {
        return subDonorFraudErrorType;
    }

    /**
     * Define o valor da propriedade subDonorFraudErrorType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDonorFraudErrorType(String value) {
        this.subDonorFraudErrorType = value;
    }

    /**
     * Obtém o valor da propriedade subDonorFraudErrorJustif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubDonorFraudErrorJustif() {
        return subDonorFraudErrorJustif;
    }

    /**
     * Define o valor da propriedade subDonorFraudErrorJustif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubDonorFraudErrorJustif(String value) {
        this.subDonorFraudErrorJustif = value;
    }

    /**
     * Obtém o valor da propriedade subStatusChangeCauseCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubStatusChangeCauseCode() {
        return subStatusChangeCauseCode;
    }

    /**
     * Define o valor da propriedade subStatusChangeCauseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubStatusChangeCauseCode(Integer value) {
        this.subStatusChangeCauseCode = value;
    }

    /**
     * Obtém o valor da propriedade cancelType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelType() {
        return cancelType;
    }

    /**
     * Define o valor da propriedade cancelType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelType(String value) {
        this.cancelType = value;
    }

    /**
     * Obtém o valor da propriedade authorizationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Define o valor da propriedade authorizationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Obtém o valor da propriedade initialQuarentenaDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInitialQuarentenaDate() {
        return initialQuarentenaDate;
    }

    /**
     * Define o valor da propriedade initialQuarentenaDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInitialQuarentenaDate(XMLGregorianCalendar value) {
        this.initialQuarentenaDate = value;
    }

    /**
     * Obtém o valor da propriedade subCancellationCauseCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubCancellationCauseCode() {
        return subCancellationCauseCode;
    }

    /**
     * Define o valor da propriedade subCancellationCauseCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubCancellationCauseCode(Integer value) {
        this.subCancellationCauseCode = value;
    }

    /**
     * Obtém o valor da propriedade subscriptionDonorActionId.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSubscriptionDonorActionId() {
        return subscriptionDonorActionId;
    }

    /**
     * Define o valor da propriedade subscriptionDonorActionId.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSubscriptionDonorActionId(Integer value) {
        this.subscriptionDonorActionId = value;
    }

    /**
     * Obtém o valor da propriedade endDateServiceOrder.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDateServiceOrder() {
        return endDateServiceOrder;
    }

    /**
     * Define o valor da propriedade endDateServiceOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDateServiceOrder(XMLGregorianCalendar value) {
        this.endDateServiceOrder = value;
    }

    /**
     * Obtém o valor da propriedade bdoNetEndDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBdoNetEndDate() {
        return bdoNetEndDate;
    }

    /**
     * Define o valor da propriedade bdoNetEndDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBdoNetEndDate(XMLGregorianCalendar value) {
        this.bdoNetEndDate = value;
    }

    /**
     * Obtém o valor da propriedade customerDisconnectDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCustomerDisconnectDate() {
        return customerDisconnectDate;
    }

    /**
     * Define o valor da propriedade customerDisconnectDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCustomerDisconnectDate(XMLGregorianCalendar value) {
        this.customerDisconnectDate = value;
    }

    /**
     * Obtém o valor da propriedade effectiveReleaseDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveReleaseDate() {
        return effectiveReleaseDate;
    }

    /**
     * Define o valor da propriedade effectiveReleaseDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveReleaseDate(XMLGregorianCalendar value) {
        this.effectiveReleaseDate = value;
    }

    /**
     * Obtém o valor da propriedade disconnectedVersionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisconnectedVersionId() {
        return disconnectedVersionId;
    }

    /**
     * Define o valor da propriedade disconnectedVersionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisconnectedVersionId(String value) {
        this.disconnectedVersionId = value;
    }

    /**
     * Obtém o valor da propriedade roleProvider.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleProvider() {
        return roleProvider;
    }

    /**
     * Define o valor da propriedade roleProvider.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleProvider(String value) {
        this.roleProvider = value;
    }

    /**
     * Obtém o valor da propriedade cdSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getCdSolicitacao() {
        return cdSolicitacao;
    }

    /**
     * Define o valor da propriedade cdSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setCdSolicitacao(Long value) {
        this.cdSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade tnStart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnStart() {
        return tnStart;
    }

    /**
     * Define o valor da propriedade tnStart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnStart(String value) {
        this.tnStart = value;
    }

    /**
     * Obtém o valor da propriedade tnStop.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTnStop() {
        return tnStop;
    }

    /**
     * Define o valor da propriedade tnStop.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTnStop(String value) {
        this.tnStop = value;
    }

    /**
     * Obtém o valor da propriedade dtSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtSolicitacao() {
        return dtSolicitacao;
    }

    /**
     * Define o valor da propriedade dtSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtSolicitacao(XMLGregorianCalendar value) {
        this.dtSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade cdErroEa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCdErroEa() {
        return cdErroEa;
    }

    /**
     * Define o valor da propriedade cdErroEa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCdErroEa(String value) {
        this.cdErroEa = value;
    }

    /**
     * Obtém o valor da propriedade dcErroEa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDcErroEa() {
        return dcErroEa;
    }

    /**
     * Define o valor da propriedade dcErroEa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDcErroEa(String value) {
        this.dcErroEa = value;
    }

}
