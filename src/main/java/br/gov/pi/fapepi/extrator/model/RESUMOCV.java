//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TEXTO-RESUMO-CV-RH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TEXTO-RESUMO-CV-RH-EN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RESUMO-CV")
public class RESUMOCV {

    @XmlAttribute(name = "TEXTO-RESUMO-CV-RH")
    @XmlSchemaType(name = "anySimpleType")
    protected String textoresumocvrh;
    @XmlAttribute(name = "TEXTO-RESUMO-CV-RH-EN")
    @XmlSchemaType(name = "anySimpleType")
    protected String textoresumocvrhen;

    /**
     * Obtém o valor da propriedade textoresumocvrh.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTORESUMOCVRH() {
        return textoresumocvrh;
    }

    /**
     * Define o valor da propriedade textoresumocvrh.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTORESUMOCVRH(String value) {
        this.textoresumocvrh = value;
    }

    /**
     * Obtém o valor da propriedade textoresumocvrhen.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEXTORESUMOCVRHEN() {
        return textoresumocvrhen;
    }

    /**
     * Define o valor da propriedade textoresumocvrhen.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEXTORESUMOCVRHEN(String value) {
        this.textoresumocvrhen = value;
    }

}
