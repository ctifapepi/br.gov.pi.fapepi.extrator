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
 *       &lt;attribute name="CLASSIFICACAO-DO-EVENTO" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="INTERNACIONAL"/>
 *             &lt;enumeration value="NACIONAL"/>
 *             &lt;enumeration value="REGIONAL"/>
 *             &lt;enumeration value="LOCAL"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NOME-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DE-REALIZACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DOS-ANAIS-OU-PROCEEDINGS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FASCICULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SERIE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAGINA-INICIAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAGINA-FINAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISBN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-EVENTO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-TRABALHO")
public class DETALHAMENTODOTRABALHO {

    @XmlAttribute(name = "CLASSIFICACAO-DO-EVENTO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String classificacaodoevento;
    @XmlAttribute(name = "NOME-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoevento;
    @XmlAttribute(name = "CIDADE-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedoevento;
    @XmlAttribute(name = "ANO-DE-REALIZACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anoderealizacao;
    @XmlAttribute(name = "TITULO-DOS-ANAIS-OU-PROCEEDINGS")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodosanaisouproceedings;
    @XmlAttribute(name = "VOLUME")
    @XmlSchemaType(name = "anySimpleType")
    protected String volume;
    @XmlAttribute(name = "FASCICULO")
    @XmlSchemaType(name = "anySimpleType")
    protected String fasciculo;
    @XmlAttribute(name = "SERIE")
    @XmlSchemaType(name = "anySimpleType")
    protected String serie;
    @XmlAttribute(name = "PAGINA-INICIAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String paginainicial;
    @XmlAttribute(name = "PAGINA-FINAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String paginafinal;
    @XmlAttribute(name = "ISBN")
    @XmlSchemaType(name = "anySimpleType")
    protected String isbn;
    @XmlAttribute(name = "NOME-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaeditora;
    @XmlAttribute(name = "CIDADE-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaeditora;
    @XmlAttribute(name = "NOME-DO-EVENTO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoeventoingles;

    /**
     * Obtém o valor da propriedade classificacaodoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICACAODOEVENTO() {
        if (classificacaodoevento == null) {
            return "NAO_INFORMADO";
        } else {
            return classificacaodoevento;
        }
    }

    /**
     * Define o valor da propriedade classificacaodoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICACAODOEVENTO(String value) {
        this.classificacaodoevento = value;
    }

    /**
     * Obtém o valor da propriedade nomedoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOEVENTO() {
        return nomedoevento;
    }

    /**
     * Define o valor da propriedade nomedoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOEVENTO(String value) {
        this.nomedoevento = value;
    }

    /**
     * Obtém o valor da propriedade cidadedoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADEDOEVENTO() {
        return cidadedoevento;
    }

    /**
     * Define o valor da propriedade cidadedoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADEDOEVENTO(String value) {
        this.cidadedoevento = value;
    }

    /**
     * Obtém o valor da propriedade anoderealizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODEREALIZACAO() {
        return anoderealizacao;
    }

    /**
     * Define o valor da propriedade anoderealizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODEREALIZACAO(String value) {
        this.anoderealizacao = value;
    }

    /**
     * Obtém o valor da propriedade titulodosanaisouproceedings.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOSANAISOUPROCEEDINGS() {
        return titulodosanaisouproceedings;
    }

    /**
     * Define o valor da propriedade titulodosanaisouproceedings.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOSANAISOUPROCEEDINGS(String value) {
        this.titulodosanaisouproceedings = value;
    }

    /**
     * Obtém o valor da propriedade volume.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVOLUME() {
        return volume;
    }

    /**
     * Define o valor da propriedade volume.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVOLUME(String value) {
        this.volume = value;
    }

    /**
     * Obtém o valor da propriedade fasciculo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFASCICULO() {
        return fasciculo;
    }

    /**
     * Define o valor da propriedade fasciculo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFASCICULO(String value) {
        this.fasciculo = value;
    }

    /**
     * Obtém o valor da propriedade serie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERIE() {
        return serie;
    }

    /**
     * Define o valor da propriedade serie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERIE(String value) {
        this.serie = value;
    }

    /**
     * Obtém o valor da propriedade paginainicial.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGINAINICIAL() {
        return paginainicial;
    }

    /**
     * Define o valor da propriedade paginainicial.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGINAINICIAL(String value) {
        this.paginainicial = value;
    }

    /**
     * Obtém o valor da propriedade paginafinal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAGINAFINAL() {
        return paginafinal;
    }

    /**
     * Define o valor da propriedade paginafinal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAGINAFINAL(String value) {
        this.paginafinal = value;
    }

    /**
     * Obtém o valor da propriedade isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISBN() {
        return isbn;
    }

    /**
     * Define o valor da propriedade isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISBN(String value) {
        this.isbn = value;
    }

    /**
     * Obtém o valor da propriedade nomedaeditora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAEDITORA() {
        return nomedaeditora;
    }

    /**
     * Define o valor da propriedade nomedaeditora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAEDITORA(String value) {
        this.nomedaeditora = value;
    }

    /**
     * Obtém o valor da propriedade cidadedaeditora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADEDAEDITORA() {
        return cidadedaeditora;
    }

    /**
     * Define o valor da propriedade cidadedaeditora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADEDAEDITORA(String value) {
        this.cidadedaeditora = value;
    }

    /**
     * Obtém o valor da propriedade nomedoeventoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOEVENTOINGLES() {
        return nomedoeventoingles;
    }

    /**
     * Define o valor da propriedade nomedoeventoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOEVENTOINGLES(String value) {
        this.nomedoeventoingles = value;
    }

}
