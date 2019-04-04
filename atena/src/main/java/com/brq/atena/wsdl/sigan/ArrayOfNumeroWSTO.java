//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.02.21 às 05:14:10 PM BRT 
//


package com.brq.atena.wsdl.sigan;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ArrayOfNumeroWSTO complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNumeroWSTO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NumeroWSTO" type="{http://to.webservice.portabilidade.sigan.indrasistemas.com.br}NumeroWSTO" maxOccurs="100" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNumeroWSTO", namespace = "http://to.webservice.portabilidade.sigan.indrasistemas.com.br", propOrder = {
    "numeroWSTO"
})
public class ArrayOfNumeroWSTO {

    @XmlElement(name = "NumeroWSTO", nillable = true)
    protected List<NumeroWSTO> numeroWSTO;

    /**
     * Gets the value of the numeroWSTO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numeroWSTO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumeroWSTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumeroWSTO }
     * 
     * 
     */
    public List<NumeroWSTO> getNumeroWSTO() {
        if (numeroWSTO == null) {
            numeroWSTO = new ArrayList<NumeroWSTO>();
        }
        return this.numeroWSTO;
    }

}
