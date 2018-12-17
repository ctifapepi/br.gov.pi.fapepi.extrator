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
 *       &lt;attribute name="PARTICIPACAO-DOS-AUTORES">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="DOCENTE"/>
 *             &lt;enumeration value="ORGANIZADOR"/>
 *             &lt;enumeration value="OUTRA"/>
 *             &lt;enumeration value="NAO_INFORMADO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="INSTITUICAO-PROMOTORA-DO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL-DO-CURSO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DURACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UNIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="UNIDADE-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DE-CURSOS-CURTA-DURACAO-MINISTRADO")
public class DETALHAMENTODECURSOSCURTADURACAOMINISTRADO {

    @XmlAttribute(name = "PARTICIPACAO-DOS-AUTORES")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String participacaodosautores;
    @XmlAttribute(name = "INSTITUICAO-PROMOTORA-DO-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotoradocurso;
    @XmlAttribute(name = "LOCAL-DO-CURSO")
    @XmlSchemaType(name = "anySimpleType")
    protected String localdocurso;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;
    @XmlAttribute(name = "DURACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracao;
    @XmlAttribute(name = "UNIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String unidade;
    @XmlAttribute(name = "UNIDADE-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String unidadeingles;

    /**
     * Obt�m o valor da propriedade participacaodosautores.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPARTICIPACAODOSAUTORES() {
        return participacaodosautores;
    }

    /**
     * Define o valor da propriedade participacaodosautores.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPARTICIPACAODOSAUTORES(String value) {
        this.participacaodosautores = value;
    }

    /**
     * Obt�m o valor da propriedade instituicaopromotoradocurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOPROMOTORADOCURSO() {
        return instituicaopromotoradocurso;
    }

    /**
     * Define o valor da propriedade instituicaopromotoradocurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOPROMOTORADOCURSO(String value) {
        this.instituicaopromotoradocurso = value;
    }

    /**
     * Obt�m o valor da propriedade localdocurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCALDOCURSO() {
        return localdocurso;
    }

    /**
     * Define o valor da propriedade localdocurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCALDOCURSO(String value) {
        this.localdocurso = value;
    }

    /**
     * Obt�m o valor da propriedade cidade.
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

    /**
     * Obt�m o valor da propriedade duracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURACAO() {
        return duracao;
    }

    /**
     * Define o valor da propriedade duracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURACAO(String value) {
        this.duracao = value;
    }

    /**
     * Obt�m o valor da propriedade unidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDADE() {
        return unidade;
    }

    /**
     * Define o valor da propriedade unidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDADE(String value) {
        this.unidade = value;
    }

    /**
     * Obt�m o valor da propriedade unidadeingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNIDADEINGLES() {
        return unidadeingles;
    }

    /**
     * Define o valor da propriedade unidadeingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNIDADEINGLES(String value) {
        this.unidadeingles = value;
    }

}
