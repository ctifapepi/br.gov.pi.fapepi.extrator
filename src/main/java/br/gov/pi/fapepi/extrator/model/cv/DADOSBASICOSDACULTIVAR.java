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
 *       &lt;attribute name="DENOMINACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-SOLICITACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PAIS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-RELEVANCIA" default="NAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DENOMINACAO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-POTENCIAL-INOVACAO" default="NAO">
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
@XmlRootElement(name = "DADOS-BASICOS-DA-CULTIVAR")
public class DADOSBASICOSDACULTIVAR {

    @XmlAttribute(name = "DENOMINACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String denominacao;
    @XmlAttribute(name = "ANO-SOLICITACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anosolicitacao;
    @XmlAttribute(name = "PAIS")
    @XmlSchemaType(name = "anySimpleType")
    protected String pais;
    @XmlAttribute(name = "FLAG-RELEVANCIA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagrelevancia;
    @XmlAttribute(name = "DENOMINACAO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String denominacaoingles;
    @XmlAttribute(name = "FLAG-POTENCIAL-INOVACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagpotencialinovacao;

    /**
     * Obt�m o valor da propriedade denominacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMINACAO() {
        return denominacao;
    }

    /**
     * Define o valor da propriedade denominacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMINACAO(String value) {
        this.denominacao = value;
    }

    /**
     * Obt�m o valor da propriedade anosolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOSOLICITACAO() {
        return anosolicitacao;
    }

    /**
     * Define o valor da propriedade anosolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOSOLICITACAO(String value) {
        this.anosolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade pais.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAIS() {
        return pais;
    }

    /**
     * Define o valor da propriedade pais.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAIS(String value) {
        this.pais = value;
    }

    /**
     * Obt�m o valor da propriedade flagrelevancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGRELEVANCIA() {
        if (flagrelevancia == null) {
            return "NAO";
        } else {
            return flagrelevancia;
        }
    }

    /**
     * Define o valor da propriedade flagrelevancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGRELEVANCIA(String value) {
        this.flagrelevancia = value;
    }

    /**
     * Obt�m o valor da propriedade denominacaoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDENOMINACAOINGLES() {
        return denominacaoingles;
    }

    /**
     * Define o valor da propriedade denominacaoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDENOMINACAOINGLES(String value) {
        this.denominacaoingles = value;
    }

    /**
     * Obt�m o valor da propriedade flagpotencialinovacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGPOTENCIALINOVACAO() {
        if (flagpotencialinovacao == null) {
            return "NAO";
        } else {
            return flagpotencialinovacao;
        }
    }

    /**
     * Define o valor da propriedade flagpotencialinovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGPOTENCIALINOVACAO(String value) {
        this.flagpotencialinovacao = value;
    }

}
