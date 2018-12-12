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
 *       &lt;attribute name="DESCRICAO-SITUACAO-PATENTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-SITUACAO-PATENTE" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-SITUACAO-PATENTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="STATUS-SITUACAO-PATENTE" use="required">
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
@XmlRootElement(name = "HISTORICO-SITUACOES-PATENTE")
public class HISTORICOSITUACOESPATENTE {

    @XmlAttribute(name = "DESCRICAO-SITUACAO-PATENTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String descricaosituacaopatente;
    @XmlAttribute(name = "FORMATO-DATA-SITUACAO-PATENTE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatasituacaopatente;
    @XmlAttribute(name = "DATA-SITUACAO-PATENTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String datasituacaopatente;
    @XmlAttribute(name = "STATUS-SITUACAO-PATENTE", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String statussituacaopatente;

    /**
     * Obtém o valor da propriedade descricaosituacaopatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAOSITUACAOPATENTE() {
        return descricaosituacaopatente;
    }

    /**
     * Define o valor da propriedade descricaosituacaopatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAOSITUACAOPATENTE(String value) {
        this.descricaosituacaopatente = value;
    }

    /**
     * Obtém o valor da propriedade formatodatasituacaopatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATASITUACAOPATENTE() {
        if (formatodatasituacaopatente == null) {
            return "DDMMAAAA";
        } else {
            return formatodatasituacaopatente;
        }
    }

    /**
     * Define o valor da propriedade formatodatasituacaopatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATASITUACAOPATENTE(String value) {
        this.formatodatasituacaopatente = value;
    }

    /**
     * Obtém o valor da propriedade datasituacaopatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATASITUACAOPATENTE() {
        return datasituacaopatente;
    }

    /**
     * Define o valor da propriedade datasituacaopatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATASITUACAOPATENTE(String value) {
        this.datasituacaopatente = value;
    }

    /**
     * Obtém o valor da propriedade statussituacaopatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSTATUSSITUACAOPATENTE() {
        return statussituacaopatente;
    }

    /**
     * Define o valor da propriedade statussituacaopatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSTATUSSITUACAOPATENTE(String value) {
        this.statussituacaopatente = value;
    }

}
