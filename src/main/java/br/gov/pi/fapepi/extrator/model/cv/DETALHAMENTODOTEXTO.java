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
 *       &lt;attribute name="TITULO-DO-JORNAL-OU-REVISTA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ISSN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-DE-PUBLICACAO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-DE-PUBLICACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="VOLUME" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DO-TEXTO")
public class DETALHAMENTODOTEXTO {

    @XmlAttribute(name = "TITULO-DO-JORNAL-OU-REVISTA")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulodojornalourevista;
    @XmlAttribute(name = "ISSN")
    @XmlSchemaType(name = "anySimpleType")
    protected String issn;
    @XmlAttribute(name = "FORMATO-DATA-DE-PUBLICACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatadepublicacao;
    @XmlAttribute(name = "DATA-DE-PUBLICACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadepublicacao;
    @XmlAttribute(name = "VOLUME")
    @XmlSchemaType(name = "anySimpleType")
    protected String volume;
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
     * Obt�m o valor da propriedade titulodojornalourevista.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULODOJORNALOUREVISTA() {
        return titulodojornalourevista;
    }

    /**
     * Define o valor da propriedade titulodojornalourevista.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULODOJORNALOUREVISTA(String value) {
        this.titulodojornalourevista = value;
    }

    /**
     * Obt�m o valor da propriedade issn.
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
     * Obt�m o valor da propriedade formatodatadepublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATADEPUBLICACAO() {
        if (formatodatadepublicacao == null) {
            return "DDMMAAAA";
        } else {
            return formatodatadepublicacao;
        }
    }

    /**
     * Define o valor da propriedade formatodatadepublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATADEPUBLICACAO(String value) {
        this.formatodatadepublicacao = value;
    }

    /**
     * Obt�m o valor da propriedade datadepublicacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADEPUBLICACAO() {
        return datadepublicacao;
    }

    /**
     * Define o valor da propriedade datadepublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADEPUBLICACAO(String value) {
        this.datadepublicacao = value;
    }

    /**
     * Obt�m o valor da propriedade volume.
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
     * Obt�m o valor da propriedade localdepublicacao.
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
