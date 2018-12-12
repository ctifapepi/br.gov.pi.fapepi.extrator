//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DADOS-GERAIS"/>
 *         &lt;element ref="{}PRODUCAO-BIBLIOGRAFICA" minOccurs="0"/>
 *         &lt;element ref="{}PRODUCAO-TECNICA" minOccurs="0"/>
 *         &lt;element ref="{}OUTRA-PRODUCAO" minOccurs="0"/>
 *         &lt;element ref="{}DADOS-COMPLEMENTARES" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SISTEMA-ORIGEM-XML" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-IDENTIFICADOR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-ATUALIZACAO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-ATUALIZACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-HORA-ATUALIZACAO" default="HHMMSS">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="HHMMSS"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HORA-ATUALIZACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dadosgerais",
    "producaobibliografica",
    "producaotecnica",
    "outraproducao",
    "dadoscomplementares"
})

//@XmlRootElement(name = "CURRICULO-VITAE")
public class CURRICULOVITAE {

    //@XmlElement(name = "DADOS-GERAIS", required = true)
    protected DADOSGERAIS dadosgerais;
    //@XmlElement(name = "PRODUCAO-BIBLIOGRAFICA")
    protected PRODUCAOBIBLIOGRAFICA producaobibliografica;
    @XmlElement(name = "PRODUCAO-TECNICA")
    protected PRODUCAOTECNICA producaotecnica;
    @XmlElement(name = "OUTRA-PRODUCAO")
    protected OUTRAPRODUCAO outraproducao;
    @XmlElement(name = "DADOS-COMPLEMENTARES")
    protected DADOSCOMPLEMENTARES dadoscomplementares;
    @XmlAttribute(name = "SISTEMA-ORIGEM-XML", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String sistemaorigemxml;
    @XmlAttribute(name = "NUMERO-IDENTIFICADOR")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroidentificador;
    @XmlAttribute(name = "FORMATO-DATA-ATUALIZACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodataatualizacao;
    @XmlAttribute(name = "DATA-ATUALIZACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String dataatualizacao;
    @XmlAttribute(name = "FORMATO-HORA-ATUALIZACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatohoraatualizacao;
    @XmlAttribute(name = "HORA-ATUALIZACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String horaatualizacao;

    /**
     * Obt�m o valor da propriedade dadosgerais.
     * 
     * @return
     *     possible object is
     *     {@link DADOSGERAIS }
     *     
     */
    public DADOSGERAIS getDADOSGERAIS() {
        return dadosgerais;
    }

    /**
     * Define o valor da propriedade dadosgerais.
     * 
     * @param value
     *     allowed object is
     *     {@link DADOSGERAIS }
     *     
     */
    public void setDADOSGERAIS(DADOSGERAIS value) {
        this.dadosgerais = value;
    }

    /**
     * Obt�m o valor da propriedade producaobibliografica.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCAOBIBLIOGRAFICA }
     *     
     */
    public PRODUCAOBIBLIOGRAFICA getPRODUCAOBIBLIOGRAFICA() {
        return producaobibliografica;
    }

    /**
     * Define o valor da propriedade producaobibliografica.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCAOBIBLIOGRAFICA }
     *     
     */
    public void setPRODUCAOBIBLIOGRAFICA(PRODUCAOBIBLIOGRAFICA value) {
        this.producaobibliografica = value;
    }

    /**
     * Obt�m o valor da propriedade producaotecnica.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCAOTECNICA }
     *     
     */
    public PRODUCAOTECNICA getPRODUCAOTECNICA() {
        return producaotecnica;
    }

    /**
     * Define o valor da propriedade producaotecnica.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCAOTECNICA }
     *     
     */
    public void setPRODUCAOTECNICA(PRODUCAOTECNICA value) {
        this.producaotecnica = value;
    }

    /**
     * Obt�m o valor da propriedade outraproducao.
     * 
     * @return
     *     possible object is
     *     {@link OUTRAPRODUCAO }
     *     
     */
    public OUTRAPRODUCAO getOUTRAPRODUCAO() {
        return outraproducao;
    }

    /**
     * Define o valor da propriedade outraproducao.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTRAPRODUCAO }
     *     
     */
    public void setOUTRAPRODUCAO(OUTRAPRODUCAO value) {
        this.outraproducao = value;
    }

    /**
     * Obt�m o valor da propriedade dadoscomplementares.
     * 
     * @return
     *     possible object is
     *     {@link DADOSCOMPLEMENTARES }
     *     
     */
    public DADOSCOMPLEMENTARES getDADOSCOMPLEMENTARES() {
        return dadoscomplementares;
    }

    /**
     * Define o valor da propriedade dadoscomplementares.
     * 
     * @param value
     *     allowed object is
     *     {@link DADOSCOMPLEMENTARES }
     *     
     */
    public void setDADOSCOMPLEMENTARES(DADOSCOMPLEMENTARES value) {
        this.dadoscomplementares = value;
    }

    /**
     * Obt�m o valor da propriedade sistemaorigemxml.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISTEMAORIGEMXML() {
        return sistemaorigemxml;
    }

    /**
     * Define o valor da propriedade sistemaorigemxml.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISTEMAORIGEMXML(String value) {
        this.sistemaorigemxml = value;
    }

    /**
     * Obt�m o valor da propriedade numeroidentificador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROIDENTIFICADOR() {
        return numeroidentificador;
    }

    /**
     * Define o valor da propriedade numeroidentificador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROIDENTIFICADOR(String value) {
        this.numeroidentificador = value;
    }

    /**
     * Obt�m o valor da propriedade formatodataatualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATAATUALIZACAO() {
        if (formatodataatualizacao == null) {
            return "DDMMAAAA";
        } else {
            return formatodataatualizacao;
        }
    }

    /**
     * Define o valor da propriedade formatodataatualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATAATUALIZACAO(String value) {
        this.formatodataatualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade dataatualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAATUALIZACAO() {
        return dataatualizacao;
    }

    /**
     * Define o valor da propriedade dataatualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAATUALIZACAO(String value) {
        this.dataatualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade formatohoraatualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATOHORAATUALIZACAO() {
        if (formatohoraatualizacao == null) {
            return "HHMMSS";
        } else {
            return formatohoraatualizacao;
        }
    }

    /**
     * Define o valor da propriedade formatohoraatualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATOHORAATUALIZACAO(String value) {
        this.formatohoraatualizacao = value;
    }

    /**
     * Obt�m o valor da propriedade horaatualizacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHORAATUALIZACAO() {
        return horaatualizacao;
    }

    /**
     * Define o valor da propriedade horaatualizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHORAATUALIZACAO(String value) {
        this.horaatualizacao = value;
    }

}
