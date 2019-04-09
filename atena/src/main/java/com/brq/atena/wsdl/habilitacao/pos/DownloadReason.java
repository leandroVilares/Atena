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
 * <p>Classe Java de DownloadReason.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * <p>
 * <pre>
 * &lt;simpleType name="DownloadReason"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="new"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="modified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DownloadReason", namespace = "br/com/vivo/spn/integration/schema/SPNTypes")
@XmlEnum
public enum DownloadReason {

    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("modified")
    MODIFIED("modified");
    private final String value;

    DownloadReason(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DownloadReason fromValue(String v) {
        for (DownloadReason c: DownloadReason.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
