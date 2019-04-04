//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.13 às 04:53:53 PM BRT 
//


package com.brq.atena.wsdl.conector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de portabilityTicketIn complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="portabilityTicketIn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="customerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "portabilityTicketIn", propOrder = {
    "customerId",
    "solicitacaoPortabilidade",
    "subscriptionVersionId",
    "telephoneNumber"
})
public class PortabilityTicketIn {

    protected String customerId;
    protected Long solicitacaoPortabilidade;
    protected String subscriptionVersionId;
    protected String telephoneNumber;

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
