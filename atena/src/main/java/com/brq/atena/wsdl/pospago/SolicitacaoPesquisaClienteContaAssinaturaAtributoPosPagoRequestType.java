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
 * <p>Classe Java de SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spnHeader" type="{br/com/vivo/spn/integration/schema/SPNHeader}SPNHeader"/&gt;
 *         &lt;element name="inputSearchCustAcctSbscrpByAttribute" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest}InputSearchCustAcctSbscrpByAttributeType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType", namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest", propOrder = {
    "spnHeader",
    "inputSearchCustAcctSbscrpByAttribute"
})
@XmlRootElement(name = "solicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType", namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest")
public class SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequestType {

    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest", required = true)
    protected SPNHeader spnHeader;
    @XmlElement(namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoPesquisaClienteContaAssinaturaAtributoPosPagoRequest", required = true)
    protected InputSearchCustAcctSbscrpByAttributeType inputSearchCustAcctSbscrpByAttribute;

    /**
     * Obtém o valor da propriedade spnHeader.
     * 
     * @return
     *     possible object is
     *     {@link SPNHeader }
     *     
     */
    public SPNHeader getSpnHeader() {
        return spnHeader;
    }

    /**
     * Define o valor da propriedade spnHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link SPNHeader }
     *     
     */
    public void setSpnHeader(SPNHeader value) {
        this.spnHeader = value;
    }

    /**
     * Obtém o valor da propriedade inputSearchCustAcctSbscrpByAttribute.
     * 
     * @return
     *     possible object is
     *     {@link InputSearchCustAcctSbscrpByAttributeType }
     *     
     */
    public InputSearchCustAcctSbscrpByAttributeType getInputSearchCustAcctSbscrpByAttribute() {
        return inputSearchCustAcctSbscrpByAttribute;
    }

    /**
     * Define o valor da propriedade inputSearchCustAcctSbscrpByAttribute.
     * 
     * @param value
     *     allowed object is
     *     {@link InputSearchCustAcctSbscrpByAttributeType }
     *     
     */
    public void setInputSearchCustAcctSbscrpByAttribute(InputSearchCustAcctSbscrpByAttributeType value) {
        this.inputSearchCustAcctSbscrpByAttribute = value;
    }

}
