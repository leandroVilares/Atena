//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.28 às 12:31:47 PM BRT 
//


package com.brq.atena.wsdl.pospagoatlys;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;StructureName xmlns:conv="http://www.openuri.org/2002/04/soap/conversation/" xmlns:cw="http://www.openuri.org/2002/04/wsdl/conversation/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:jms="http://www.openuri.org/2002/04/wsdl/jms/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:ns0="br/com/vivo/spn/integration/schema/SPNHeader" xmlns:ns1="br/com/vivo/spn/integration/schema/SPNReturnMessage" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:s0="http://www.openuri.org/" xmlns:s1="http://www.openuri.org/" xmlns:s2="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:tns="br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;PaymentAttributeValueList&lt;/StructureName&gt;
 * </pre>
 * 
 * 
 * <p>Classe Java de PaymentAttributeValueList complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="PaymentAttributeValueList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="attrValues" type="{br/com/vivo/spn/integration/schema/consulta/SolicitacaoInformacaoClienteContaPosPagoResponse}PaymentAttributeValue" maxOccurs="40" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentAttributeValueList", propOrder = {
    "attrValues"
})
public class PaymentAttributeValueList {

    protected List<PaymentAttributeValue> attrValues;

    /**
     * Gets the value of the attrValues property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attrValues property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttrValues().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentAttributeValue }
     * 
     * 
     */
    public List<PaymentAttributeValue> getAttrValues() {
        if (attrValues == null) {
            attrValues = new ArrayList<PaymentAttributeValue>();
        }
        return this.attrValues;
    }

}
