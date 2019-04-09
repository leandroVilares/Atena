//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:25:45 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DocumentType2.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DocumentType2"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="RG"/&gt;
 *     &lt;enumeration value="CPF"/&gt;
 *     &lt;enumeration value="CNPJ"/&gt;
 *     &lt;enumeration value="PASSAPORTE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentType2", namespace = "br/com/vivo/spn/integration/schema/SPNTypes")
@XmlEnum
public enum DocumentType2 {


    /**
     * RG
     * 
     */
    RG,

    /**
     * CPF
     * 
     */
    CPF,

    /**
     * CNPJ
     * 
     */
    CNPJ,

    /**
     * Passaporte
     * 
     */
    PASSAPORTE;

    public String value() {
        return name();
    }

    public static DocumentType2 fromValue(String v) {
        return valueOf(v);
    }

}
