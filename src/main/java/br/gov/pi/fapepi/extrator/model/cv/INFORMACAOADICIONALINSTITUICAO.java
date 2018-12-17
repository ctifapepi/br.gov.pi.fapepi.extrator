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
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SIGLA-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SIGLA-UF-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SIGLA-PAIS-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-PAIS-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-AGENCIA-FOMENTO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="FLAG-INSTITUICAO-DE-ENSINO">
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
@XmlRootElement(name = "INFORMACAO-ADICIONAL-INSTITUICAO")
public class INFORMACAOADICIONALINSTITUICAO {

    @XmlAttribute(name = "CODIGO-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicao;
    @XmlAttribute(name = "SIGLA-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String siglainstituicao;
    @XmlAttribute(name = "SIGLA-UF-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String siglaufinstituicao;
    @XmlAttribute(name = "SIGLA-PAIS-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String siglapaisinstituicao;
    @XmlAttribute(name = "NOME-PAIS-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomepaisinstituicao;
    @XmlAttribute(name = "FLAG-AGENCIA-FOMENTO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagagenciafomento;
    @XmlAttribute(name = "FLAG-INSTITUICAO-DE-ENSINO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flaginstituicaodeensino;

    /**
     * Obt�m o valor da propriedade codigoinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAO() {
        return codigoinstituicao;
    }

    /**
     * Define o valor da propriedade codigoinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAO(String value) {
        this.codigoinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade siglainstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGLAINSTITUICAO() {
        return siglainstituicao;
    }

    /**
     * Define o valor da propriedade siglainstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGLAINSTITUICAO(String value) {
        this.siglainstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade siglaufinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGLAUFINSTITUICAO() {
        return siglaufinstituicao;
    }

    /**
     * Define o valor da propriedade siglaufinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGLAUFINSTITUICAO(String value) {
        this.siglaufinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade siglapaisinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIGLAPAISINSTITUICAO() {
        return siglapaisinstituicao;
    }

    /**
     * Define o valor da propriedade siglapaisinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIGLAPAISINSTITUICAO(String value) {
        this.siglapaisinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade nomepaisinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEPAISINSTITUICAO() {
        return nomepaisinstituicao;
    }

    /**
     * Define o valor da propriedade nomepaisinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEPAISINSTITUICAO(String value) {
        this.nomepaisinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade flagagenciafomento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGAGENCIAFOMENTO() {
        return flagagenciafomento;
    }

    /**
     * Define o valor da propriedade flagagenciafomento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGAGENCIAFOMENTO(String value) {
        this.flagagenciafomento = value;
    }

    /**
     * Obt�m o valor da propriedade flaginstituicaodeensino.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGINSTITUICAODEENSINO() {
        return flaginstituicaodeensino;
    }

    /**
     * Define o valor da propriedade flaginstituicaodeensino.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGINSTITUICAODEENSINO(String value) {
        this.flaginstituicaodeensino = value;
    }

}
