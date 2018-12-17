//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AREA-DO-CONHECIMENTO-1" minOccurs="0"/>
 *         &lt;element ref="{}AREA-DO-CONHECIMENTO-2" minOccurs="0"/>
 *         &lt;element ref="{}AREA-DO-CONHECIMENTO-3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areadoconhecimento1",
    "areadoconhecimento2",
    "areadoconhecimento3"
})
@XmlRootElement(name = "AREAS-DO-CONHECIMENTO")
public class AREASDOCONHECIMENTO {

    @XmlElement(name = "AREA-DO-CONHECIMENTO-1")
    protected AREADOCONHECIMENTO1 areadoconhecimento1;
    @XmlElement(name = "AREA-DO-CONHECIMENTO-2")
    protected AREADOCONHECIMENTO2 areadoconhecimento2;
    @XmlElement(name = "AREA-DO-CONHECIMENTO-3")
    protected AREADOCONHECIMENTO3 areadoconhecimento3;

    /**
     * Obt�m o valor da propriedade areadoconhecimento1.
     * 
     * @return
     *     possible object is
     *     {@link AREADOCONHECIMENTO1 }
     *     
     */
    public AREADOCONHECIMENTO1 getAREADOCONHECIMENTO1() {
        return areadoconhecimento1;
    }

    /**
     * Define o valor da propriedade areadoconhecimento1.
     * 
     * @param value
     *     allowed object is
     *     {@link AREADOCONHECIMENTO1 }
     *     
     */
    public void setAREADOCONHECIMENTO1(AREADOCONHECIMENTO1 value) {
        this.areadoconhecimento1 = value;
    }

    /**
     * Obt�m o valor da propriedade areadoconhecimento2.
     * 
     * @return
     *     possible object is
     *     {@link AREADOCONHECIMENTO2 }
     *     
     */
    public AREADOCONHECIMENTO2 getAREADOCONHECIMENTO2() {
        return areadoconhecimento2;
    }

    /**
     * Define o valor da propriedade areadoconhecimento2.
     * 
     * @param value
     *     allowed object is
     *     {@link AREADOCONHECIMENTO2 }
     *     
     */
    public void setAREADOCONHECIMENTO2(AREADOCONHECIMENTO2 value) {
        this.areadoconhecimento2 = value;
    }

    /**
     * Obt�m o valor da propriedade areadoconhecimento3.
     * 
     * @return
     *     possible object is
     *     {@link AREADOCONHECIMENTO3 }
     *     
     */
    public AREADOCONHECIMENTO3 getAREADOCONHECIMENTO3() {
        return areadoconhecimento3;
    }

    /**
     * Define o valor da propriedade areadoconhecimento3.
     * 
     * @param value
     *     allowed object is
     *     {@link AREADOCONHECIMENTO3 }
     *     
     */
    public void setAREADOCONHECIMENTO3(AREADOCONHECIMENTO3 value) {
        this.areadoconhecimento3 = value;
    }

}
