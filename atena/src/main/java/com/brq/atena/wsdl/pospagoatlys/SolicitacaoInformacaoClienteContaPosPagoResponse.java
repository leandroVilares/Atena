//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

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
 *         &lt;element ref="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}solicitacaoInformacaoClienteContaPosPagoResponse"/&gt;
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
    "solicitacaoInformacaoClienteContaPosPagoResponse"
})
@XmlRootElement(name = "solicitarInformacaoClienteContaPosPagoResponse", namespace = "http://www.openuri.org")
public class SolicitacaoInformacaoClienteContaPosPagoResponse {

    @XmlElement(required = true)
    protected SolicitacaoInformacaoClienteContaPosPagoResponseType solicitacaoInformacaoClienteContaPosPagoResponse;

    /**
     * Obtém o valor da propriedade solicitacaoInformacaoClienteContaPosPagoResponse.
     * 
     * @return
     *     possible object is
     *     {@link SolicitacaoInformacaoClienteContaPosPagoResponseType }
     *     
     */
    public SolicitacaoInformacaoClienteContaPosPagoResponseType getSolicitacaoInformacaoClienteContaPosPagoResponse() {
        return solicitacaoInformacaoClienteContaPosPagoResponse;
    }

    /**
     * Define o valor da propriedade solicitacaoInformacaoClienteContaPosPagoResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitacaoInformacaoClienteContaPosPagoResponseType }
     *     
     */
    public void setSolicitacaoInformacaoClienteContaPosPagoResponse(SolicitacaoInformacaoClienteContaPosPagoResponseType value) {
        this.solicitacaoInformacaoClienteContaPosPagoResponse = value;
    }

}
