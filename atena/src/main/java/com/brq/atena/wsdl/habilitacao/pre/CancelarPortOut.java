//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:27:25 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pre;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="parametroCancelarPortOut" type="{http://www.vivo.com.br/spn/PosPago/}CancelarPortOutType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "parametroCancelarPortOut"
})
@XmlRootElement(name = "cancelarPortOut")
public class CancelarPortOut {

    @XmlElement(required = true)
    protected CancelarPortOutType parametroCancelarPortOut;

    /**
     * Obtém o valor da propriedade parametroCancelarPortOut.
     * 
     * @return
     *     possible object is
     *     {@link CancelarPortOutType }
     *     
     */
    public CancelarPortOutType getParametroCancelarPortOut() {
        return parametroCancelarPortOut;
    }

    /**
     * Define o valor da propriedade parametroCancelarPortOut.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelarPortOutType }
     *     
     */
    public void setParametroCancelarPortOut(CancelarPortOutType value) {
        this.parametroCancelarPortOut = value;
    }

}
