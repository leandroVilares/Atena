//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.26 às 04:03:40 PM BRT 
//


package com.brq.atena.wsdl.prepago;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de SPNHeader complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SPNHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minorServiceVersion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientToken" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="deliveryProtocol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originClientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="originClientIP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="originClientLogin" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="targetClientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="logLevel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPNHeader", namespace = "br/com/vivo/spn/integration/schema/SPNHeader", propOrder = {
    "minorServiceVersion",
    "requestId",
    "clientToken",
    "deliveryProtocol",
    "originClientId",
    "originClientIP",
    "originClientLogin",
    "targetClientId",
    "eventDate",
    "logLevel"
})
public class SPNHeader {

    @XmlElement(namespace = "")
    protected int minorServiceVersion;
    @XmlElement(namespace = "")
    protected String requestId;
    @XmlElement(namespace = "", required = true)
    protected String clientToken;
    @XmlElement(namespace = "")
    protected String deliveryProtocol;
    @XmlElement(namespace = "")
    protected int originClientId;
    @XmlElement(namespace = "")
    protected String originClientIP;
    @XmlElement(namespace = "", required = true)
    protected String originClientLogin;
    @XmlElement(namespace = "")
    protected int targetClientId;
    @XmlElement(namespace = "", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(namespace = "")
    protected BigInteger logLevel;

    /**
     * Obtém o valor da propriedade minorServiceVersion.
     * 
     */
    public int getMinorServiceVersion() {
        return minorServiceVersion;
    }

    /**
     * Define o valor da propriedade minorServiceVersion.
     * 
     */
    public void setMinorServiceVersion(int value) {
        this.minorServiceVersion = value;
    }

    /**
     * Obtém o valor da propriedade requestId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Define o valor da propriedade requestId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
    }

    /**
     * Obtém o valor da propriedade clientToken.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientToken() {
        return clientToken;
    }

    /**
     * Define o valor da propriedade clientToken.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientToken(String value) {
        this.clientToken = value;
    }

    /**
     * Obtém o valor da propriedade deliveryProtocol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryProtocol() {
        return deliveryProtocol;
    }

    /**
     * Define o valor da propriedade deliveryProtocol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryProtocol(String value) {
        this.deliveryProtocol = value;
    }

    /**
     * Obtém o valor da propriedade originClientId.
     * 
     */
    public int getOriginClientId() {
        return originClientId;
    }

    /**
     * Define o valor da propriedade originClientId.
     * 
     */
    public void setOriginClientId(int value) {
        this.originClientId = value;
    }

    /**
     * Obtém o valor da propriedade originClientIP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginClientIP() {
        return originClientIP;
    }

    /**
     * Define o valor da propriedade originClientIP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginClientIP(String value) {
        this.originClientIP = value;
    }

    /**
     * Obtém o valor da propriedade originClientLogin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginClientLogin() {
        return originClientLogin;
    }

    /**
     * Define o valor da propriedade originClientLogin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginClientLogin(String value) {
        this.originClientLogin = value;
    }

    /**
     * Obtém o valor da propriedade targetClientId.
     * 
     */
    public int getTargetClientId() {
        return targetClientId;
    }

    /**
     * Define o valor da propriedade targetClientId.
     * 
     */
    public void setTargetClientId(int value) {
        this.targetClientId = value;
    }

    /**
     * Obtém o valor da propriedade eventDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Define o valor da propriedade eventDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Obtém o valor da propriedade logLevel.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLogLevel() {
        return logLevel;
    }

    /**
     * Define o valor da propriedade logLevel.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLogLevel(BigInteger value) {
        this.logLevel = value;
    }

}
