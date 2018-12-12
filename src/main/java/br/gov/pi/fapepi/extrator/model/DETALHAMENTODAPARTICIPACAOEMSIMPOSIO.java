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
 *       &lt;attribute name="NOME-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE-DO-EVENTO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DA-PARTICIPACAO-EM-SIMPOSIO")
public class DETALHAMENTODAPARTICIPACAOEMSIMPOSIO {

    @XmlAttribute(name = "NOME-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoevento;
    @XmlAttribute(name = "CODIGO-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicao;
    @XmlAttribute(name = "NOME-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicao;
    @XmlAttribute(name = "LOCAL-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdoevento;
    @XmlAttribute(name = "CIDADE-DO-EVENTO")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidadedoevento;
    @XmlAttribute(name = "NOME-DO-EVENTO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoeventoingles;

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
     * Obtém o valor da propriedade codigoinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAO() {
        return codigoinstituicao;
    }

    /**
     * Define o valor da propriedade codigoinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAO(String value) {
        this.codigoinstituicao = value;
    }

    /**
     * Obtém o valor da propriedade nomeinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAO() {
        return nomeinstituicao;
    }

    /**
     * Define o valor da propriedade nomeinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAO(String value) {
        this.nomeinstituicao = value;
    }

    /**
     * Obtém o valor da propriedade localdoevento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDOEVENTO() {
        return localdoevento;
    }

    /**
     * Define o valor da propriedade localdoevento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDOEVENTO(String value) {
        this.localdoevento = value;
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
