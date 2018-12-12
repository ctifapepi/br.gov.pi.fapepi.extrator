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
 *       &lt;attribute name="TITULO-DO-PERIODICO-OU-REVISTA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FASCICULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SERIE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAGINA-INICIAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAGINA-FINAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DE-PUBLICACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-ARTIGO")
public class DETALHAMENTODOARTIGO {

    @XmlAttribute(name = "TITULO-DO-PERIODICO-OU-REVISTA")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodoperiodicoourevista;
    @XmlAttribute(name = "ISSN")
    @XmlSchemaType(name = "anySimpleType")
    protected String issn;
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
    @XmlAttribute(name = "LOCAL-DE-PUBLICACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdepublicacao;

    /**
     * Obtém o valor da propriedade titulodoperiodicoourevista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOPERIODICOOUREVISTA() {
        return titulodoperiodicoourevista;
    }

    /**
     * Define o valor da propriedade titulodoperiodicoourevista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOPERIODICOOUREVISTA(String value) {
        this.titulodoperiodicoourevista = value;
    }

    /**
     * Obtém o valor da propriedade issn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSN() {
        return issn;
    }

    /**
     * Define o valor da propriedade issn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSN(String value) {
        this.issn = value;
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
     * Obtém o valor da propriedade localdepublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDEPUBLICACAO() {
        return localdepublicacao;
    }

    /**
     * Define o valor da propriedade localdepublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDEPUBLICACAO(String value) {
        this.localdepublicacao = value;
    }

}
