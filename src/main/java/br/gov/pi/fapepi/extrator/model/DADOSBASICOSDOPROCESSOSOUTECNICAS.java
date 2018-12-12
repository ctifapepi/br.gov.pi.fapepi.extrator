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
 *             &lt;enumeration value="ANALITICA"/>
 *             &lt;enumeration value="INSTRUMENTAL"/>
 *             &lt;enumeration value="PEDAGOGICA"/>
 *             &lt;enumeration value="PROCESSUAL"/>
 *             &lt;enumeration value="TERAPEUTICA"/>
 *             &lt;enumeration value="OUTRA"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="TITULO-DO-PROCESSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *       &lt;attribute name="TITULO-DO-PROCESSO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DADOS-BASICOS-DO-PROCESSOS-OU-TECNICAS")
public class DADOSBASICOSDOPROCESSOSOUTECNICAS {

    @XmlAttribute(name = "NATUREZA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String natureza;
    @XmlAttribute(name = "TITULO-DO-PROCESSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodoprocesso;
    @XmlAttribute(name = "ANO")
    @XmlSchemaType(name = "anySimpleType")
    protected String ano;
    @XmlAttribute(name = "PAIS")
    @XmlSchemaType(name = "anySimpleType")
    protected String pais;
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
    @XmlAttribute(name = "TITULO-DO-PROCESSO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodoprocessoingles;
    @XmlAttribute(name = "FLAG-POTENCIAL-INOVACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagpotencialinovacao;

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
     * Obtém o valor da propriedade titulodoprocesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOPROCESSO() {
        return titulodoprocesso;
    }

    /**
     * Define o valor da propriedade titulodoprocesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOPROCESSO(String value) {
        this.titulodoprocesso = value;
    }

    /**
     * Obtém o valor da propriedade ano.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANO() {
        return ano;
    }

    /**
     * Define o valor da propriedade ano.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANO(String value) {
        this.ano = value;
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
     * Obtém o valor da propriedade titulodoprocessoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOPROCESSOINGLES() {
        return titulodoprocessoingles;
    }

    /**
     * Define o valor da propriedade titulodoprocessoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOPROCESSOINGLES(String value) {
        this.titulodoprocessoingles = value;
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
