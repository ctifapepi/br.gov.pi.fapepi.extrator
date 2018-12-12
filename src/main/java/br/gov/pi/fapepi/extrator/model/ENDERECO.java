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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ENDERECO-PROFISSIONAL" minOccurs="0"/>
 *         &lt;element ref="{}ENDERECO-RESIDENCIAL" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FLAG-DE-PREFERENCIA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ENDERECO_INSTITUCIONAL"/>
 *             &lt;enumeration value="ENDERECO_RESIDENCIAL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enderecoprofissional",
    "enderecoresidencial"
})
@XmlRootElement(name = "ENDERECO")
public class ENDERECO {

    @XmlElement(name = "ENDERECO-PROFISSIONAL")
    protected ENDERECOPROFISSIONAL enderecoprofissional;
    @XmlElement(name = "ENDERECO-RESIDENCIAL")
    protected ENDERECORESIDENCIAL enderecoresidencial;
    @XmlAttribute(name = "FLAG-DE-PREFERENCIA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagdepreferencia;

    /**
     * Obtém o valor da propriedade enderecoprofissional.
     * 
     * @return
     *     possible object is
     *     {@link ENDERECOPROFISSIONAL }
     *     
     */
    public ENDERECOPROFISSIONAL getENDERECOPROFISSIONAL() {
        return enderecoprofissional;
    }

    /**
     * Define o valor da propriedade enderecoprofissional.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDERECOPROFISSIONAL }
     *     
     */
    public void setENDERECOPROFISSIONAL(ENDERECOPROFISSIONAL value) {
        this.enderecoprofissional = value;
    }

    /**
     * Obtém o valor da propriedade enderecoresidencial.
     * 
     * @return
     *     possible object is
     *     {@link ENDERECORESIDENCIAL }
     *     
     */
    public ENDERECORESIDENCIAL getENDERECORESIDENCIAL() {
        return enderecoresidencial;
    }

    /**
     * Define o valor da propriedade enderecoresidencial.
     * 
     * @param value
     *     allowed object is
     *     {@link ENDERECORESIDENCIAL }
     *     
     */
    public void setENDERECORESIDENCIAL(ENDERECORESIDENCIAL value) {
        this.enderecoresidencial = value;
    }

    /**
     * Obtém o valor da propriedade flagdepreferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGDEPREFERENCIA() {
        return flagdepreferencia;
    }

    /**
     * Define o valor da propriedade flagdepreferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGDEPREFERENCIA(String value) {
        this.flagdepreferencia = value;
    }

}
