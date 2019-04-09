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
 * <p>Classe Java de ActionType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ATV"/&gt;
 *     &lt;enumeration value="ALT"/&gt;
 *     &lt;enumeration value="ALM"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="DLV"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ActionType", namespace = "br/com/vivo/spn/integration/schema/SPNTypes")
@XmlEnum
public enum ActionType {


    /**
     * Ativacao
     * 
     */
    ATV,

    /**
     * Troca de Numero
     * 
     */
    ALT,

    /**
     * Troca de Numero com Aviso
     * 
     */
    ALM,

    /**
     * Cancelamento
     * 
     */
    CAN,

    /**
     * Portabilidade
     * 
     */
    POR,

    /**
     * Delivery
     * 
     */
    DLV;

    public String value() {
        return name();
    }

    public static ActionType fromValue(String v) {
        return valueOf(v);
    }

}
