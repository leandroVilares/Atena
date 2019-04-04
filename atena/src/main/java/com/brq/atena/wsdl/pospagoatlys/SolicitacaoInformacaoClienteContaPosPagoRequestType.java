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
 * <p>Classe Java de SolicitacaoInformacaoClienteContaPosPagoRequestType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SolicitacaoInformacaoClienteContaPosPagoRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="spnHeader" type="{br/com/vivo/spn/integration/schema/SPNHeader}SPNHeader"/&gt;
 *         &lt;element name="inputGetCustomerAccountInfoV3" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoRequest}InputGetCustomerAccountInfoV3Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SolicitacaoInformacaoClienteContaPosPagoRequestType", namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoRequest", propOrder = {
    "spnHeader",
    "inputGetCustomerAccountInfoV3"
})
@XmlRootElement(name = "solicitacaoInformacaoClienteContaPosPagoRequestType", namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoRequest")
public class SolicitacaoInformacaoClienteContaPosPagoRequestType {

    @XmlElement(required = true)
    protected SPNHeader spnHeader;
    @XmlElement(required = true)
    protected InputGetCustomerAccountInfoV3Type inputGetCustomerAccountInfoV3;

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
     * Obtém o valor da propriedade inputGetCustomerAccountInfoV3.
     * 
     * @return
     *     possible object is
     *     {@link InputGetCustomerAccountInfoV3Type }
     *     
     */
    public InputGetCustomerAccountInfoV3Type getInputGetCustomerAccountInfoV3() {
        return inputGetCustomerAccountInfoV3;
    }

    /**
     * Define o valor da propriedade inputGetCustomerAccountInfoV3.
     * 
     * @param value
     *     allowed object is
     *     {@link InputGetCustomerAccountInfoV3Type }
     *     
     */
    public void setInputGetCustomerAccountInfoV3(InputGetCustomerAccountInfoV3Type value) {
        this.inputGetCustomerAccountInfoV3 = value;
    }

}
