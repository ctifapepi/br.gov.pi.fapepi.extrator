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
 *       &lt;attribute name="IDIOMA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DESCRICAO-DO-IDIOMA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PROFICIENCIA-DE-LEITURA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="POUCO"/>
 *             &lt;enumeration value="RAZOAVELMENTE"/>
 *             &lt;enumeration value="BEM"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PROFICIENCIA-DE-FALA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="POUCO"/>
 *             &lt;enumeration value="RAZOAVELMENTE"/>
 *             &lt;enumeration value="BEM"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PROFICIENCIA-DE-ESCRITA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="POUCO"/>
 *             &lt;enumeration value="RAZOAVELMENTE"/>
 *             &lt;enumeration value="BEM"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PROFICIENCIA-DE-COMPREENSAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="POUCO"/>
 *             &lt;enumeration value="RAZOAVELMENTE"/>
 *             &lt;enumeration value="BEM"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
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
@XmlRootElement(name = "IDIOMA")
public class IDIOMA {

    @XmlAttribute(name = "IDIOMA")
    @XmlSchemaType(name = "anySimpleType")
    protected String idioma;
    @XmlAttribute(name = "DESCRICAO-DO-IDIOMA")
    @XmlSchemaType(name = "anySimpleType")
    protected String descricaodoidioma;
    @XmlAttribute(name = "PROFICIENCIA-DE-LEITURA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String proficienciadeleitura;
    @XmlAttribute(name = "PROFICIENCIA-DE-FALA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String proficienciadefala;
    @XmlAttribute(name = "PROFICIENCIA-DE-ESCRITA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String proficienciadeescrita;
    @XmlAttribute(name = "PROFICIENCIA-DE-COMPREENSAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String proficienciadecompreensao;

    /**
     * Obt�m o valor da propriedade idioma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDIOMA() {
        return idioma;
    }

    /**
     * Define o valor da propriedade idioma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDIOMA(String value) {
        this.idioma = value;
    }

    /**
     * Obt�m o valor da propriedade descricaodoidioma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAODOIDIOMA() {
        return descricaodoidioma;
    }

    /**
     * Define o valor da propriedade descricaodoidioma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAODOIDIOMA(String value) {
        this.descricaodoidioma = value;
    }

    /**
     * Obt�m o valor da propriedade proficienciadeleitura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFICIENCIADELEITURA() {
        return proficienciadeleitura;
    }

    /**
     * Define o valor da propriedade proficienciadeleitura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFICIENCIADELEITURA(String value) {
        this.proficienciadeleitura = value;
    }

    /**
     * Obt�m o valor da propriedade proficienciadefala.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFICIENCIADEFALA() {
        return proficienciadefala;
    }

    /**
     * Define o valor da propriedade proficienciadefala.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFICIENCIADEFALA(String value) {
        this.proficienciadefala = value;
    }

    /**
     * Obt�m o valor da propriedade proficienciadeescrita.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFICIENCIADEESCRITA() {
        return proficienciadeescrita;
    }

    /**
     * Define o valor da propriedade proficienciadeescrita.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFICIENCIADEESCRITA(String value) {
        this.proficienciadeescrita = value;
    }

    /**
     * Obt�m o valor da propriedade proficienciadecompreensao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROFICIENCIADECOMPREENSAO() {
        return proficienciadecompreensao;
    }

    /**
     * Define o valor da propriedade proficienciadecompreensao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROFICIENCIADECOMPREENSAO(String value) {
        this.proficienciadecompreensao = value;
    }

}
