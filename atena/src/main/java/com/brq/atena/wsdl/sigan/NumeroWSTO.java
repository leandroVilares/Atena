//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:14:10 PM BRT 
//


package com.brq.atena.wsdl.sigan;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de NumeroWSTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="NumeroWSTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificadorNumero" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="identificadorPortabilidade" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="irm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="min" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="msisdn" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="protocolo" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="statusNumero" type="{http://www.w3.org/2001/XMLSchema}short"/&gt;
 *         &lt;element name="tipoNumero" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/&gt;
 *         &lt;element name="tipoRede" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumeroWSTO", namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", propOrder = {
    "identificadorNumero",
    "identificadorPortabilidade",
    "irm",
    "min",
    "msisdn",
    "protocolo",
    "statusNumero",
    "tipoNumero",
    "tipoRede"
})
public class NumeroWSTO {

    protected short identificadorNumero;
    protected short identificadorPortabilidade;
    protected String irm;
    protected String min;
    protected long msisdn;
    protected Long protocolo;
    protected short statusNumero;
    protected Short tipoNumero;
    @XmlElement(required = true)
    protected String tipoRede;

    /**
     * Obtém o valor da propriedade identificadorNumero.
     * 
     */
    public short getIdentificadorNumero() {
        return identificadorNumero;
    }

    /**
     * Define o valor da propriedade identificadorNumero.
     * 
     */
    public void setIdentificadorNumero(short value) {
        this.identificadorNumero = value;
    }

    /**
     * Obtém o valor da propriedade identificadorPortabilidade.
     * 
     */
    public short getIdentificadorPortabilidade() {
        return identificadorPortabilidade;
    }

    /**
     * Define o valor da propriedade identificadorPortabilidade.
     * 
     */
    public void setIdentificadorPortabilidade(short value) {
        this.identificadorPortabilidade = value;
    }

    /**
     * Obtém o valor da propriedade irm.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIrm() {
        return irm;
    }

    /**
     * Define o valor da propriedade irm.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIrm(String value) {
        this.irm = value;
    }

    /**
     * Obtém o valor da propriedade min.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Define o valor da propriedade min.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Obtém o valor da propriedade msisdn.
     * 
     */
    public long getMsisdn() {
        return msisdn;
    }

    /**
     * Define o valor da propriedade msisdn.
     * 
     */
    public void setMsisdn(long value) {
        this.msisdn = value;
    }

    /**
     * Obtém o valor da propriedade protocolo.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getProtocolo() {
        return protocolo;
    }

    /**
     * Define o valor da propriedade protocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setProtocolo(Long value) {
        this.protocolo = value;
    }

    /**
     * Obtém o valor da propriedade statusNumero.
     * 
     */
    public short getStatusNumero() {
        return statusNumero;
    }

    /**
     * Define o valor da propriedade statusNumero.
     * 
     */
    public void setStatusNumero(short value) {
        this.statusNumero = value;
    }

    /**
     * Obtém o valor da propriedade tipoNumero.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTipoNumero() {
        return tipoNumero;
    }

    /**
     * Define o valor da propriedade tipoNumero.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTipoNumero(Short value) {
        this.tipoNumero = value;
    }

    /**
     * Obtém o valor da propriedade tipoRede.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRede() {
        return tipoRede;
    }

    /**
     * Define o valor da propriedade tipoRede.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRede(String value) {
        this.tipoRede = value;
    }

}
