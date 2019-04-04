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
 * <p>Classe Java de RequestInfoWSTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RequestInfoWSTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ip" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="systemModule" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestInfoWSTO", namespace = "http://to.webservice.sigan.indrasistemas.com.br", propOrder = {
    "ip",
    "serviceName",
    "systemModule",
    "userName"
})
public class RequestInfoWSTO {

    @XmlElement(required = true)
    protected String ip;
    @XmlElementRef(name = "serviceName", namespace = "http://to.webservice.sigan.indrasistemas.com.br", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceName;
    @XmlElement(required = true)
    protected String systemModule;
    @XmlElement(required = true)
    protected String userName;

    /**
     * Obtém o valor da propriedade ip.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIp() {
        return ip;
    }

    /**
     * Define o valor da propriedade ip.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIp(String value) {
        this.ip = value;
    }

    /**
     * Obtém o valor da propriedade serviceName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceName() {
        return serviceName;
    }

    /**
     * Define o valor da propriedade serviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceName(JAXBElement<String> value) {
        this.serviceName = value;
    }

    /**
     * Obtém o valor da propriedade systemModule.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemModule() {
        return systemModule;
    }

    /**
     * Define o valor da propriedade systemModule.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemModule(String value) {
        this.systemModule = value;
    }

    /**
     * Obtém o valor da propriedade userName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Define o valor da propriedade userName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

}
