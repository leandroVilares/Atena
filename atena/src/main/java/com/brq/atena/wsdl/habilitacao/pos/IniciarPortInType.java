//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:25:45 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de IniciarPortInType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="IniciarPortInType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroLinha" type="{br/com/vivo/spn/integration/schema/SPNTypes}PhoneNumber"/&gt;
 *         &lt;element name="iccid" type="{br/com/vivo/spn/integration/schema/SPNTypes}ICCID"/&gt;
 *         &lt;element name="imei" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="plano"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="15"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="modeloAparelho"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="revendendor"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="promocao" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="20"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="indicadorNumeroVivo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *               &lt;enumeration value="Y"/&gt;
 *               &lt;enumeration value="N"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IniciarPortInType", propOrder = {
    "numeroLinha",
    "iccid",
    "imei",
    "plano",
    "modeloAparelho",
    "revendendor",
    "promocao",
    "indicadorNumeroVivo"
})
public class IniciarPortInType {

    @XmlElement(required = true)
    protected String numeroLinha;
    @XmlElement(required = true)
    protected String iccid;
    @XmlElementRef(name = "imei", namespace = "http://www.vivo.com.br/spn/PrePago/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> imei;
    @XmlElement(required = true)
    protected String plano;
    @XmlElement(required = true)
    protected String modeloAparelho;
    @XmlElement(required = true)
    protected String revendendor;
    @XmlElementRef(name = "promocao", namespace = "http://www.vivo.com.br/spn/PrePago/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promocao;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String indicadorNumeroVivo;

    /**
     * Obtém o valor da propriedade numeroLinha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLinha() {
        return numeroLinha;
    }

    /**
     * Define o valor da propriedade numeroLinha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLinha(String value) {
        this.numeroLinha = value;
    }

    /**
     * Obtém o valor da propriedade iccid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIccid() {
        return iccid;
    }

    /**
     * Define o valor da propriedade iccid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIccid(String value) {
        this.iccid = value;
    }

    /**
     * Obtém o valor da propriedade imei.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImei() {
        return imei;
    }

    /**
     * Define o valor da propriedade imei.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImei(JAXBElement<String> value) {
        this.imei = value;
    }

    /**
     * Obtém o valor da propriedade plano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlano() {
        return plano;
    }

    /**
     * Define o valor da propriedade plano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlano(String value) {
        this.plano = value;
    }

    /**
     * Obtém o valor da propriedade modeloAparelho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeloAparelho() {
        return modeloAparelho;
    }

    /**
     * Define o valor da propriedade modeloAparelho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeloAparelho(String value) {
        this.modeloAparelho = value;
    }

    /**
     * Obtém o valor da propriedade revendendor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevendendor() {
        return revendendor;
    }

    /**
     * Define o valor da propriedade revendendor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevendendor(String value) {
        this.revendendor = value;
    }

    /**
     * Obtém o valor da propriedade promocao.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromocao() {
        return promocao;
    }

    /**
     * Define o valor da propriedade promocao.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromocao(JAXBElement<String> value) {
        this.promocao = value;
    }

    /**
     * Obtém o valor da propriedade indicadorNumeroVivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicadorNumeroVivo() {
        return indicadorNumeroVivo;
    }

    /**
     * Define o valor da propriedade indicadorNumeroVivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicadorNumeroVivo(String value) {
        this.indicadorNumeroVivo = value;
    }

}
