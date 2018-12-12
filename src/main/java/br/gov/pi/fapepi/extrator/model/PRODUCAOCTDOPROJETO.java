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
 *       &lt;attribute name="SEQUENCIA-PRODUCAO-CT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-PRODUCAO-CT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TIPO-PRODUCAO-CT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-DA-PRODUCAO-CT-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "PRODUCAO-CT-DO-PROJETO")
public class PRODUCAOCTDOPROJETO {

    @XmlAttribute(name = "SEQUENCIA-PRODUCAO-CT")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaproducaoct;
    @XmlAttribute(name = "TITULO-DA-PRODUCAO-CT")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodaproducaoct;
    @XmlAttribute(name = "TIPO-PRODUCAO-CT")
    @XmlSchemaType(name = "anySimpleType")
    protected String tipoproducaoct;
    @XmlAttribute(name = "TITULO-DA-PRODUCAO-CT-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodaproducaoctingles;

    /**
     * Obtém o valor da propriedade sequenciaproducaoct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAPRODUCAOCT() {
        return sequenciaproducaoct;
    }

    /**
     * Define o valor da propriedade sequenciaproducaoct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAPRODUCAOCT(String value) {
        this.sequenciaproducaoct = value;
    }

    /**
     * Obtém o valor da propriedade titulodaproducaoct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODAPRODUCAOCT() {
        return titulodaproducaoct;
    }

    /**
     * Define o valor da propriedade titulodaproducaoct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODAPRODUCAOCT(String value) {
        this.titulodaproducaoct = value;
    }

    /**
     * Obtém o valor da propriedade tipoproducaoct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPRODUCAOCT() {
        return tipoproducaoct;
    }

    /**
     * Define o valor da propriedade tipoproducaoct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPRODUCAOCT(String value) {
        this.tipoproducaoct = value;
    }

    /**
     * Obtém o valor da propriedade titulodaproducaoctingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODAPRODUCAOCTINGLES() {
        return titulodaproducaoctingles;
    }

    /**
     * Define o valor da propriedade titulodaproducaoctingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODAPRODUCAOCTINGLES(String value) {
        this.titulodaproducaoctingles = value;
    }

}
