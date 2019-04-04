//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de InputGetCustomerAccountInfoV3Type complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="InputGetCustomerAccountInfoV3Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="acctNbr" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InputGetCustomerAccountInfoV3Type", namespace = "br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoRequest")
public class InputGetCustomerAccountInfoV3Type {

    @XmlAttribute(name = "acctNbr", required = true)
    protected String acctNbr;

    /**
     * Obtém o valor da propriedade acctNbr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctNbr() {
        return acctNbr;
    }

    /**
     * Define o valor da propriedade acctNbr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcctNbr(String value) {
        this.acctNbr = value;
    }

}
