//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:10:11 PM BRT 
//


package com.brq.atena.wsdl.pospago;

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
 *         &lt;element ref="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest}solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest"/&gt;
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
    "solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest"
})
@XmlRootElement(name = "solicitarPesquisaClienteContaAssinaturaAtributoPosPago", namespace = "http://www.openuri.org/")
public class SolicitarPesquisaClienteContaAssinaturaAtributoPosPago {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest", required = true)
    protected SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest;

    /**
     * Obtém o valor da propriedade solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest.
     * 
     * @return
     *     possible object is
     *     {@link SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType }
     *     
     */
    public SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType getSolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest() {
        return solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest;
    }

    /**
     * Define o valor da propriedade solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType }
     *     
     */
    public void setSolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest(SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType value) {
        this.solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest = value;
    }

}
