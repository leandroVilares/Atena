//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:14:10 PM BRT 
//


package com.brq.atena.wsdl.sigan;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de RespostaNumeroVivoWSTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RespostaNumeroVivoWSTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="msisdnsNaoEncontrados" type="{http://webservice.portabilidade.sigan.indrasistemas.com.br}ArrayOfLong" minOccurs="0"/&gt;
 *         &lt;element name="msisdnsEncontrados" type="{http://to.webservice.portabilidade.sigan.indrasistemas.com.br}ArrayOfNumeroWSTO" minOccurs="0"/&gt;
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespostaNumeroVivoWSTO", namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", propOrder = {
    "msisdnsNaoEncontrados",
    "msisdnsEncontrados",
    "reason",
    "reasonCode",
    "status"
})
public class RespostaNumeroVivoWSTO {

    protected ArrayOfLong msisdnsNaoEncontrados;
    protected ArrayOfNumeroWSTO msisdnsEncontrados;
    @XmlElementRef(name = "reason", namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reason;
    @XmlElementRef(name = "reasonCode", namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> reasonCode;
    @XmlElement(required = true)
    protected String status;

    /**
     * Obtém o valor da propriedade msisdnsNaoEncontrados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getMsisdnsNaoEncontrados() {
        return msisdnsNaoEncontrados;
    }

    /**
     * Define o valor da propriedade msisdnsNaoEncontrados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setMsisdnsNaoEncontrados(ArrayOfLong value) {
        this.msisdnsNaoEncontrados = value;
    }

    /**
     * Obtém o valor da propriedade msisdnsEncontrados.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNumeroWSTO }
     *     
     */
    public ArrayOfNumeroWSTO getMsisdnsEncontrados() {
        return msisdnsEncontrados;
    }

    /**
     * Define o valor da propriedade msisdnsEncontrados.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNumeroWSTO }
     *     
     */
    public void setMsisdnsEncontrados(ArrayOfNumeroWSTO value) {
        this.msisdnsEncontrados = value;
    }

    /**
     * Obtém o valor da propriedade reason.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReason() {
        return reason;
    }

    /**
     * Define o valor da propriedade reason.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReason(JAXBElement<String> value) {
        this.reason = value;
    }

    /**
     * Obtém o valor da propriedade reasonCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getReasonCode() {
        return reasonCode;
    }

    /**
     * Define o valor da propriedade reasonCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setReasonCode(JAXBElement<Integer> value) {
        this.reasonCode = value;
    }

    /**
     * Obtém o valor da propriedade status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define o valor da propriedade status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

}
