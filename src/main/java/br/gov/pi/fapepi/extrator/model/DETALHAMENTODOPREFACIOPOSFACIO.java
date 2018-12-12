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
 *       &lt;attribute name="NOME-DO-AUTOR-DA-PUBLICACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-PUBLICACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSN-ISBN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DA-EDICAO-REVISAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SERIE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FASCICULO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="EDITORA-DO-PREFACIO-POSFACIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-PREFACIO-POSFACIO")
public class DETALHAMENTODOPREFACIOPOSFACIO {

    @XmlAttribute(name = "NOME-DO-AUTOR-DA-PUBLICACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoautordapublicacao;
    @XmlAttribute(name = "TITULO-DA-PUBLICACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodapublicacao;
    @XmlAttribute(name = "ISSN-ISBN")
    @XmlSchemaType(name = "anySimpleType")
    protected String issnisbn;
    @XmlAttribute(name = "NUMERO-DA-EDICAO-REVISAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodaedicaorevisao;
    @XmlAttribute(name = "VOLUME")
    @XmlSchemaType(name = "anySimpleType")
    protected String volume;
    @XmlAttribute(name = "SERIE")
    @XmlSchemaType(name = "anySimpleType")
    protected String serie;
    @XmlAttribute(name = "FASCICULO")
    @XmlSchemaType(name = "anySimpleType")
    protected String fasciculo;
    @XmlAttribute(name = "EDITORA-DO-PREFACIO-POSFACIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String editoradoprefacioposfacio;
    @XmlAttribute(name = "CIDADE-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaeditora;

    /**
     * Obtém o valor da propriedade nomedoautordapublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOAUTORDAPUBLICACAO() {
        return nomedoautordapublicacao;
    }

    /**
     * Define o valor da propriedade nomedoautordapublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOAUTORDAPUBLICACAO(String value) {
        this.nomedoautordapublicacao = value;
    }

    /**
     * Obtém o valor da propriedade titulodapublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODAPUBLICACAO() {
        return titulodapublicacao;
    }

    /**
     * Define o valor da propriedade titulodapublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODAPUBLICACAO(String value) {
        this.titulodapublicacao = value;
    }

    /**
     * Obtém o valor da propriedade issnisbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSNISBN() {
        return issnisbn;
    }

    /**
     * Define o valor da propriedade issnisbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSNISBN(String value) {
        this.issnisbn = value;
    }

    /**
     * Obtém o valor da propriedade numerodaedicaorevisao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODAEDICAOREVISAO() {
        return numerodaedicaorevisao;
    }

    /**
     * Define o valor da propriedade numerodaedicaorevisao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODAEDICAOREVISAO(String value) {
        this.numerodaedicaorevisao = value;
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
     * Obtém o valor da propriedade editoradoprefacioposfacio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDITORADOPREFACIOPOSFACIO() {
        return editoradoprefacioposfacio;
    }

    /**
     * Define o valor da propriedade editoradoprefacioposfacio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDITORADOPREFACIOPOSFACIO(String value) {
        this.editoradoprefacioposfacio = value;
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

}
