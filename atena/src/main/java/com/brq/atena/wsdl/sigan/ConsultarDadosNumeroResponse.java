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
 *         &lt;element name="respostaWS" type="{http://to.webservice.portabilidade.sigan.indrasistemas.com.br}RespostaNumeroVivoWSTO"/&gt;
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
    "respostaWS"
})
@XmlRootElement(name = "consultarDadosNumeroResponse")
public class ConsultarDadosNumeroResponse {

    @XmlElement(required = true, nillable = true)
    protected RespostaNumeroVivoWSTO respostaWS;

    /**
     * Obtém o valor da propriedade respostaWS.
     * 
     * @return
     *     possible object is
     *     {@link RespostaNumeroVivoWSTO }
     *     
     */
    public RespostaNumeroVivoWSTO getRespostaWS() {
        return respostaWS;
    }

    /**
     * Define o valor da propriedade respostaWS.
     * 
     * @param value
     *     allowed object is
     *     {@link RespostaNumeroVivoWSTO }
     *     
     */
    public void setRespostaWS(RespostaNumeroVivoWSTO value) {
        this.respostaWS = value;
    }

}
