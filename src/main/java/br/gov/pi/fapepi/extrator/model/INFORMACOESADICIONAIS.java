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
 *       &lt;attribute name="DESCRICAO-INFORMACOES-ADICIONAIS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DESCRICAO-INFORMACOES-ADICIONAIS-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "INFORMACOES-ADICIONAIS")
public class INFORMACOESADICIONAIS {

    @XmlAttribute(name = "DESCRICAO-INFORMACOES-ADICIONAIS")
    @XmlSchemaType(name = "anySimpleType")
    protected String descricaoinformacoesadicionais;
    @XmlAttribute(name = "DESCRICAO-INFORMACOES-ADICIONAIS-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String descricaoinformacoesadicionaisingles;

    /**
     * Obtém o valor da propriedade descricaoinformacoesadicionais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAOINFORMACOESADICIONAIS() {
        return descricaoinformacoesadicionais;
    }

    /**
     * Define o valor da propriedade descricaoinformacoesadicionais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAOINFORMACOESADICIONAIS(String value) {
        this.descricaoinformacoesadicionais = value;
    }

    /**
     * Obtém o valor da propriedade descricaoinformacoesadicionaisingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAOINFORMACOESADICIONAISINGLES() {
        return descricaoinformacoesadicionaisingles;
    }

    /**
     * Define o valor da propriedade descricaoinformacoesadicionaisingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAOINFORMACOESADICIONAISINGLES(String value) {
        this.descricaoinformacoesadicionaisingles = value;
    }

}
