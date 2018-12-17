//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;attribute name="TITULO-DO-LIVRO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DE-VOLUMES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAGINA-INICIAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAGINA-FINAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISBN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORGANIZADORES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DA-EDICAO-REVISAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DA-SERIE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DA-EDITORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-CAPITULO")
public class DETALHAMENTODOCAPITULO {

    @XmlAttribute(name = "TITULO-DO-LIVRO")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodolivro;
    @XmlAttribute(name = "NUMERO-DE-VOLUMES")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodevolumes;
    @XmlAttribute(name = "PAGINA-INICIAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String paginainicial;
    @XmlAttribute(name = "PAGINA-FINAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String paginafinal;
    @XmlAttribute(name = "ISBN")
    @XmlSchemaType(name = "anySimpleType")
    protected String isbn;
    @XmlAttribute(name = "ORGANIZADORES")
    @XmlSchemaType(name = "anySimpleType")
    protected String organizadores;
    @XmlAttribute(name = "NUMERO-DA-EDICAO-REVISAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodaedicaorevisao;
    @XmlAttribute(name = "NUMERO-DA-SERIE")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodaserie;
    @XmlAttribute(name = "CIDADE-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedaeditora;
    @XmlAttribute(name = "NOME-DA-EDITORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaeditora;

    /**
     * Obt�m o valor da propriedade titulodolivro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOLIVRO() {
        return titulodolivro;
    }

    /**
     * Define o valor da propriedade titulodolivro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOLIVRO(String value) {
        this.titulodolivro = value;
    }

    /**
     * Obt�m o valor da propriedade numerodevolumes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEVOLUMES() {
        return numerodevolumes;
    }

    /**
     * Define o valor da propriedade numerodevolumes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEVOLUMES(String value) {
        this.numerodevolumes = value;
    }

    /**
     * Obt�m o valor da propriedade paginainicial.
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
     * Obt�m o valor da propriedade paginafinal.
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
     * Obt�m o valor da propriedade isbn.
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
     * Obt�m o valor da propriedade organizadores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORGANIZADORES() {
        return organizadores;
    }

    /**
     * Define o valor da propriedade organizadores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORGANIZADORES(String value) {
        this.organizadores = value;
    }

    /**
     * Obt�m o valor da propriedade numerodaedicaorevisao.
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
     * Obt�m o valor da propriedade numerodaserie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODASERIE() {
        return numerodaserie;
    }

    /**
     * Define o valor da propriedade numerodaserie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODASERIE(String value) {
        this.numerodaserie = value;
    }

    /**
     * Obt�m o valor da propriedade cidadedaeditora.
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
     * Obt�m o valor da propriedade nomedaeditora.
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

}
