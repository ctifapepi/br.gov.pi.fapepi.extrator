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
 *       &lt;attribute name="TITULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DESENVOLVIMENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="HOME-PAGE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MEIO-DE-DIVULGACAO" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="IMPRESSO"/>
 *             &lt;enumeration value="WEB"/>
 *             &lt;enumeration value="MEIO_MAGNETICO"/>
 *             &lt;enumeration value="MEIO_DIGITAL"/>
 *             &lt;enumeration value="FILME"/>
 *             &lt;enumeration value="HIPERTEXTO"/>
 *             &lt;enumeration value="OUTRO"/>
 *             &lt;enumeration value="VARIOS"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FLAG-RELEVANCIA" default="NAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TITULO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-POTENCIAL-INOVACAO" default="NAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
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
@XmlType(name = "")
@XmlRootElement(name = "DADOS-BASICOS-DA-PATENTE")
public class DADOSBASICOSDAPATENTE {

    @XmlAttribute(name = "TITULO")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulo;
    @XmlAttribute(name = "ANO-DESENVOLVIMENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodesenvolvimento;
    @XmlAttribute(name = "PAIS")
    @XmlSchemaType(name = "anySimpleType")
    protected String pais;
    @XmlAttribute(name = "HOME-PAGE")
    @XmlSchemaType(name = "anySimpleType")
    protected String homepage;
    @XmlAttribute(name = "MEIO-DE-DIVULGACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String meiodedivulgacao;
    @XmlAttribute(name = "FLAG-RELEVANCIA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagrelevancia;
    @XmlAttribute(name = "TITULO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String tituloingles;
    @XmlAttribute(name = "FLAG-POTENCIAL-INOVACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagpotencialinovacao;

    /**
     * Obtém o valor da propriedade titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULO() {
        return titulo;
    }

    /**
     * Define o valor da propriedade titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULO(String value) {
        this.titulo = value;
    }

    /**
     * Obtém o valor da propriedade anodesenvolvimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODESENVOLVIMENTO() {
        return anodesenvolvimento;
    }

    /**
     * Define o valor da propriedade anodesenvolvimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODESENVOLVIMENTO(String value) {
        this.anodesenvolvimento = value;
    }

    /**
     * Obtém o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Obtém o valor da propriedade homepage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOMEPAGE() {
        return homepage;
    }

    /**
     * Define o valor da propriedade homepage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOMEPAGE(String value) {
        this.homepage = value;
    }

    /**
     * Obtém o valor da propriedade meiodedivulgacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMEIODEDIVULGACAO() {
        if (meiodedivulgacao == null) {
            return "NAO_INFORMADO";
        } else {
            return meiodedivulgacao;
        }
    }

    /**
     * Define o valor da propriedade meiodedivulgacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMEIODEDIVULGACAO(String value) {
        this.meiodedivulgacao = value;
    }

    /**
     * Obtém o valor da propriedade flagrelevancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGRELEVANCIA() {
        if (flagrelevancia == null) {
            return "NAO";
        } else {
            return flagrelevancia;
        }
    }

    /**
     * Define o valor da propriedade flagrelevancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGRELEVANCIA(String value) {
        this.flagrelevancia = value;
    }

    /**
     * Obtém o valor da propriedade tituloingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULOINGLES() {
        return tituloingles;
    }

    /**
     * Define o valor da propriedade tituloingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULOINGLES(String value) {
        this.tituloingles = value;
    }

    /**
     * Obtém o valor da propriedade flagpotencialinovacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGPOTENCIALINOVACAO() {
        if (flagpotencialinovacao == null) {
            return "NAO";
        } else {
            return flagpotencialinovacao;
        }
    }

    /**
     * Define o valor da propriedade flagpotencialinovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGPOTENCIALINOVACAO(String value) {
        this.flagpotencialinovacao = value;
    }

}
