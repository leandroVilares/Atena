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
 *         &lt;element name="parametroConcluirPortOut" type="{http://www.vivo.com.br/spn/PosPago/}ConcluirPortOutType"/&gt;
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
    "parametroConcluirPortOut"
})
@XmlRootElement(name = "concluirPortOut")
public class ConcluirPortOut {

    @XmlElement(required = true)
    protected ConcluirPortOutType parametroConcluirPortOut;

    /**
     * Obtém o valor da propriedade parametroConcluirPortOut.
     * 
     * @return
     *     possible object is
     *     {@link ConcluirPortOutType }
     *     
     */
    public ConcluirPortOutType getParametroConcluirPortOut() {
        return parametroConcluirPortOut;
    }

    /**
     * Define o valor da propriedade parametroConcluirPortOut.
     * 
     * @param value
     *     allowed object is
     *     {@link ConcluirPortOutType }
     *     
     */
    public void setParametroConcluirPortOut(ConcluirPortOutType value) {
        this.parametroConcluirPortOut = value;
    }

}
