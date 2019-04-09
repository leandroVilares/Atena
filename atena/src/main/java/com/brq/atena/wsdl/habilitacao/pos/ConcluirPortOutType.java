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
 * <p>Classe Java de ConcluirPortOutType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ConcluirPortOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numeroLinha" type="{br/com/vivo/spn/integration/schema/SPNTypes}PhoneNumber"/&gt;
 *         &lt;element name="codigoOperadoraReceptora" type="{br/com/vivo/spn/integration/schema/SPNTypes}ServiceProvId"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcluirPortOutType", propOrder = {
    "numeroLinha",
    "codigoOperadoraReceptora"
})
public class ConcluirPortOutType {

    @XmlElement(required = true)
    protected String numeroLinha;
    @XmlElement(required = true)
    protected String codigoOperadoraReceptora;

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
     * Obtém o valor da propriedade codigoOperadoraReceptora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoOperadoraReceptora() {
        return codigoOperadoraReceptora;
    }

    /**
     * Define o valor da propriedade codigoOperadoraReceptora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoOperadoraReceptora(String value) {
        this.codigoOperadoraReceptora = value;
    }

}
