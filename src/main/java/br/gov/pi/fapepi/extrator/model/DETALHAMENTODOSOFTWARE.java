//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}REGISTRO-OU-PATENTE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="FINALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PLATAFORMA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AMBIENTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DISPONIBILIDADE" default="NAO_INFORMADO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="RESTRITA"/>
 *             &lt;enumeration value="IRRESTRITA"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="INSTITUICAO-FINANCIADORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FINALIDADE-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registrooupatente"
})
@XmlRootElement(name = "DETALHAMENTO-DO-SOFTWARE")
public class DETALHAMENTODOSOFTWARE {

    @XmlElement(name = "REGISTRO-OU-PATENTE")
    protected List<REGISTROOUPATENTE> registrooupatente;
    @XmlAttribute(name = "FINALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidade;
    @XmlAttribute(name = "PLATAFORMA")
    @XmlSchemaType(name = "anySimpleType")
    protected String plataforma;
    @XmlAttribute(name = "AMBIENTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String ambiente;
    @XmlAttribute(name = "DISPONIBILIDADE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String disponibilidade;
    @XmlAttribute(name = "INSTITUICAO-FINANCIADORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaofinanciadora;
    @XmlAttribute(name = "FINALIDADE-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidadeingles;

    /**
     * Gets the value of the registrooupatente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registrooupatente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREGISTROOUPATENTE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link REGISTROOUPATENTE }
     * 
     * 
     */
    public List<REGISTROOUPATENTE> getREGISTROOUPATENTE() {
        if (registrooupatente == null) {
            registrooupatente = new ArrayList<REGISTROOUPATENTE>();
        }
        return this.registrooupatente;
    }

    /**
     * Obt�m o valor da propriedade finalidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINALIDADE() {
        return finalidade;
    }

    /**
     * Define o valor da propriedade finalidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINALIDADE(String value) {
        this.finalidade = value;
    }

    /**
     * Obt�m o valor da propriedade plataforma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPLATAFORMA() {
        return plataforma;
    }

    /**
     * Define o valor da propriedade plataforma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPLATAFORMA(String value) {
        this.plataforma = value;
    }

    /**
     * Obt�m o valor da propriedade ambiente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMBIENTE() {
        return ambiente;
    }

    /**
     * Define o valor da propriedade ambiente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMBIENTE(String value) {
        this.ambiente = value;
    }

    /**
     * Obt�m o valor da propriedade disponibilidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPONIBILIDADE() {
        if (disponibilidade == null) {
            return "NAO_INFORMADO";
        } else {
            return disponibilidade;
        }
    }

    /**
     * Define o valor da propriedade disponibilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPONIBILIDADE(String value) {
        this.disponibilidade = value;
    }

    /**
     * Obt�m o valor da propriedade instituicaofinanciadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOFINANCIADORA() {
        return instituicaofinanciadora;
    }

    /**
     * Define o valor da propriedade instituicaofinanciadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOFINANCIADORA(String value) {
        this.instituicaofinanciadora = value;
    }

    /**
     * Obt�m o valor da propriedade finalidadeingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINALIDADEINGLES() {
        return finalidadeingles;
    }

    /**
     * Define o valor da propriedade finalidadeingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFINALIDADEINGLES(String value) {
        this.finalidadeingles = value;
    }

}