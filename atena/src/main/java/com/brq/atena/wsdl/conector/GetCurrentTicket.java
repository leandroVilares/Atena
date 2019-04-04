//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.03.13 às 04:53:53 PM BRT 
//


package com.brq.atena.wsdl.conector;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de getCurrentTicket complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="getCurrentTicket"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="portabilityTicketIn" type="{http://ws.soa.cleartech.com.br/}portabilityTicketIn" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCurrentTicket", propOrder = {
    "portabilityTicketIn"
})
public class GetCurrentTicket {

    protected PortabilityTicketIn portabilityTicketIn;

    /**
     * Obtém o valor da propriedade portabilityTicketIn.
     * 
     * @return
     *     possible object is
     *     {@link PortabilityTicketIn }
     *     
     */
    public PortabilityTicketIn getPortabilityTicketIn() {
        return portabilityTicketIn;
    }

    /**
     * Define o valor da propriedade portabilityTicketIn.
     * 
     * @param value
     *     allowed object is
     *     {@link PortabilityTicketIn }
     *     
     */
    public void setPortabilityTicketIn(PortabilityTicketIn value) {
        this.portabilityTicketIn = value;
    }

}
