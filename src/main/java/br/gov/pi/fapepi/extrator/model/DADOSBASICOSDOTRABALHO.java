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
 *       &lt;attribute name="NATUREZA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="COMPLETO"/>
 *             &lt;enumeration value="RESUMO"/>
 *             &lt;enumeration value="RESUMO_EXPANDIDO"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TITULO-DO-TRABALHO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DO-TRABALHO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IDIOMA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="HOME-PAGE-DO-TRABALHO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-RELEVANCIA" default="NAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DOI" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DO-TRABALHO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-DIVULGACAO-CIENTIFICA" default="NAO">
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
@XmlRootElement(name = "DADOS-BASICOS-DO-TRABALHO")
public class DADOSBASICOSDOTRABALHO {

    @XmlAttribute(name = "NATUREZA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String natureza;
    @XmlAttribute(name = "TITULO-DO-TRABALHO")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodotrabalho;
    @XmlAttribute(name = "ANO-DO-TRABALHO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodotrabalho;
    @XmlAttribute(name = "PAIS-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String paisdoevento;
    @XmlAttribute(name = "IDIOMA")
    @XmlSchemaType(name = "anySimpleType")
    protected String idioma;
    @XmlAttribute(name = "MEIO-DE-DIVULGACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String meiodedivulgacao;
    @XmlAttribute(name = "HOME-PAGE-DO-TRABALHO")
    @XmlSchemaType(name = "anySimpleType")
    protected String homepagedotrabalho;
    @XmlAttribute(name = "FLAG-RELEVANCIA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagrelevancia;
    @XmlAttribute(name = "DOI")
    @XmlSchemaType(name = "anySimpleType")
    protected String doi;
    @XmlAttribute(name = "TITULO-DO-TRABALHO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodotrabalhoingles;
    @XmlAttribute(name = "FLAG-DIVULGACAO-CIENTIFICA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagdivulgacaocientifica;

    /**
     * Obtém o valor da propriedade natureza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATUREZA() {
        return natureza;
    }

    /**
     * Define o valor da propriedade natureza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATUREZA(String value) {
        this.natureza = value;
    }

    /**
     * Obtém o valor da propriedade titulodotrabalho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOTRABALHO() {
        return titulodotrabalho;
    }

    /**
     * Define o valor da propriedade titulodotrabalho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOTRABALHO(String value) {
        this.titulodotrabalho = value;
    }

    /**
     * Obtém o valor da propriedade anodotrabalho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODOTRABALHO() {
        return anodotrabalho;
    }

    /**
     * Define o valor da propriedade anodotrabalho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODOTRABALHO(String value) {
        this.anodotrabalho = value;
    }

    /**
     * Obtém o valor da propriedade paisdoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAISDOEVENTO() {
        return paisdoevento;
    }

    /**
     * Define o valor da propriedade paisdoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAISDOEVENTO(String value) {
        this.paisdoevento = value;
    }

    /**
     * Obtém o valor da propriedade idioma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIOMA() {
        return idioma;
    }

    /**
     * Define o valor da propriedade idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIOMA(String value) {
        this.idioma = value;
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
     * Obtém o valor da propriedade homepagedotrabalho.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHOMEPAGEDOTRABALHO() {
        return homepagedotrabalho;
    }

    /**
     * Define o valor da propriedade homepagedotrabalho.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHOMEPAGEDOTRABALHO(String value) {
        this.homepagedotrabalho = value;
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
     * Obtém o valor da propriedade doi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOI() {
        return doi;
    }

    /**
     * Define o valor da propriedade doi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOI(String value) {
        this.doi = value;
    }

    /**
     * Obtém o valor da propriedade titulodotrabalhoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOTRABALHOINGLES() {
        return titulodotrabalhoingles;
    }

    /**
     * Define o valor da propriedade titulodotrabalhoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOTRABALHOINGLES(String value) {
        this.titulodotrabalhoingles = value;
    }

    /**
     * Obtém o valor da propriedade flagdivulgacaocientifica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGDIVULGACAOCIENTIFICA() {
        if (flagdivulgacaocientifica == null) {
            return "NAO";
        } else {
            return flagdivulgacaocientifica;
        }
    }

    /**
     * Define o valor da propriedade flagdivulgacaocientifica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGDIVULGACAOCIENTIFICA(String value) {
        this.flagdivulgacaocientifica = value;
    }

}
