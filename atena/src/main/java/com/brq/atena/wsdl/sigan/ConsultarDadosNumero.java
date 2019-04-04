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
 *         &lt;element name="requestInfo" type="{http://to.webservice.sigan.indrasistemas.com.br}RequestInfoWSTO"/&gt;
 *         &lt;element name="listaMSISDN" type="{http://webservice.portabilidade.sigan.indrasistemas.com.br}ArrayOfLong"/&gt;
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
    "requestInfo",
    "listaMSISDN"
})
@XmlRootElement(name = "consultarDadosNumero")
public class ConsultarDadosNumero {

    @XmlElement(required = true, nillable = true)
    protected RequestInfoWSTO requestInfo;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfLong listaMSISDN;

    /**
     * Obtém o valor da propriedade requestInfo.
     * 
     * @return
     *     possible object is
     *     {@link RequestInfoWSTO }
     *     
     */
    public RequestInfoWSTO getRequestInfo() {
        return requestInfo;
    }

    /**
     * Define o valor da propriedade requestInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInfoWSTO }
     *     
     */
    public void setRequestInfo(RequestInfoWSTO value) {
        this.requestInfo = value;
    }

    /**
     * Obtém o valor da propriedade listaMSISDN.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfLong }
     *     
     */
    public ArrayOfLong getListaMSISDN() {
        return listaMSISDN;
    }

    /**
     * Define o valor da propriedade listaMSISDN.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfLong }
     *     
     */
    public void setListaMSISDN(ArrayOfLong value) {
        this.listaMSISDN = value;
    }

}
