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
 *       &lt;attribute name="NOME-DA-OBRA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AUTOR-DA-OBRA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DA-OBRA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ACERVO" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="PUBLICO"/>
 *             &lt;enumeration value="PRIVADO"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="LOCAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DE-MANUTENCAO-DE-OBRA-ARTISTICA")
public class DETALHAMENTODEMANUTENCAODEOBRAARTISTICA {

    @XmlAttribute(name = "NOME-DA-OBRA")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedaobra;
    @XmlAttribute(name = "AUTOR-DA-OBRA")
    @XmlSchemaType(name = "anySimpleType")
    protected String autordaobra;
    @XmlAttribute(name = "ANO-DA-OBRA")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodaobra;
    @XmlAttribute(name = "ACERVO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String acervo;
    @XmlAttribute(name = "LOCAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String local;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;

    /**
     * Obtém o valor da propriedade nomedaobra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDAOBRA() {
        return nomedaobra;
    }

    /**
     * Define o valor da propriedade nomedaobra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDAOBRA(String value) {
        this.nomedaobra = value;
    }

    /**
     * Obtém o valor da propriedade autordaobra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTORDAOBRA() {
        return autordaobra;
    }

    /**
     * Define o valor da propriedade autordaobra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTORDAOBRA(String value) {
        this.autordaobra = value;
    }

    /**
     * Obtém o valor da propriedade anodaobra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODAOBRA() {
        return anodaobra;
    }

    /**
     * Define o valor da propriedade anodaobra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODAOBRA(String value) {
        this.anodaobra = value;
    }

    /**
     * Obtém o valor da propriedade acervo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACERVO() {
        if (acervo == null) {
            return "NAO_INFORMADO";
        } else {
            return acervo;
        }
    }

    /**
     * Define o valor da propriedade acervo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACERVO(String value) {
        this.acervo = value;
    }

    /**
     * Obtém o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCAL() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCAL(String value) {
        this.local = value;
    }

    /**
     * Obtém o valor da propriedade cidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIDADE() {
        return cidade;
    }

    /**
     * Define o valor da propriedade cidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIDADE(String value) {
        this.cidade = value;
    }

}
