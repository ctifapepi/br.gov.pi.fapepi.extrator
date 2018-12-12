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
 *       &lt;attribute name="SEQUENCIA-ORIENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-ORIENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TIPO-ORIENTACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-ORIENTACAO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "ORIENTACAO")
public class ORIENTACAO {

    @XmlAttribute(name = "SEQUENCIA-ORIENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaorientacao;
    @XmlAttribute(name = "TITULO-ORIENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String tituloorientacao;
    @XmlAttribute(name = "TIPO-ORIENTACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String tipoorientacao;
    @XmlAttribute(name = "TITULO-ORIENTACAO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String tituloorientacaoingles;

    /**
     * Obtém o valor da propriedade sequenciaorientacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAORIENTACAO() {
        return sequenciaorientacao;
    }

    /**
     * Define o valor da propriedade sequenciaorientacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAORIENTACAO(String value) {
        this.sequenciaorientacao = value;
    }

    /**
     * Obtém o valor da propriedade tituloorientacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULOORIENTACAO() {
        return tituloorientacao;
    }

    /**
     * Define o valor da propriedade tituloorientacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULOORIENTACAO(String value) {
        this.tituloorientacao = value;
    }

    /**
     * Obtém o valor da propriedade tipoorientacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOORIENTACAO() {
        return tipoorientacao;
    }

    /**
     * Define o valor da propriedade tipoorientacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOORIENTACAO(String value) {
        this.tipoorientacao = value;
    }

    /**
     * Obtém o valor da propriedade tituloorientacaoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULOORIENTACAOINGLES() {
        return tituloorientacaoingles;
    }

    /**
     * Define o valor da propriedade tituloorientacaoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULOORIENTACAOINGLES(String value) {
        this.tituloorientacaoingles = value;
    }

}
