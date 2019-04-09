//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2019.04.09 às 04:25:45 PM BRT 
//


package com.brq.atena.wsdl.habilitacao.pos;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de CancelType.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="CancelType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="port_request"/&gt;
 *     &lt;enumeration value="disconnect_request"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CancelType", namespace = "br/com/vivo/spn/integration/schema/SPNTypes")
@XmlEnum
public enum CancelType {

    @XmlEnumValue("port_request")
    PORT_REQUEST("port_request"),
    @XmlEnumValue("disconnect_request")
    DISCONNECT_REQUEST("disconnect_request");
    private final String value;

    CancelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CancelType fromValue(String v) {
        for (CancelType c: CancelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
