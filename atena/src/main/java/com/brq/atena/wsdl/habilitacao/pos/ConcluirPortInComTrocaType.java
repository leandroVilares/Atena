//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:25:45 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ConcluirPortInComTrocaType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConcluirPortInComTrocaType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroLinha" type="{br/com/vivo/spn/integration/schema/SPNTypes}PhoneNumber"/&gt;
 *         &lt;element name="numeroLinhaAtual" type="{br/com/vivo/spn/integration/schema/SPNTypes}PhoneNumber"/&gt;
 *         &lt;element name="codigoOperadoraDoadora" type="{br/com/vivo/spn/integration/schema/SPNTypes}ServiceProvId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcluirPortInComTrocaType", propOrder = {
    "numeroLinha",
    "numeroLinhaAtual",
    "codigoOperadoraDoadora"
})
public class ConcluirPortInComTrocaType {

    @XmlElement(required = true)
    protected String numeroLinha;
    @XmlElement(required = true)
    protected String numeroLinhaAtual;
    @XmlElement(required = true)
    protected String codigoOperadoraDoadora;

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
     * Obtém o valor da propriedade numeroLinhaAtual.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLinhaAtual() {
        return numeroLinhaAtual;
    }

    /**
     * Define o valor da propriedade numeroLinhaAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLinhaAtual(String value) {
        this.numeroLinhaAtual = value;
    }

    /**
     * Obtém o valor da propriedade codigoOperadoraDoadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOperadoraDoadora() {
        return codigoOperadoraDoadora;
    }

    /**
     * Define o valor da propriedade codigoOperadoraDoadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOperadoraDoadora(String value) {
        this.codigoOperadoraDoadora = value;
    }

}
