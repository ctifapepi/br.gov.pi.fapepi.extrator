//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

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
 *         &lt;element ref="{}TREINAMENTO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SEQUENCIA-FUNCAO-ATIVIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-PERIODO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="ANTERIOR"/>
 *             &lt;enumeration value="ATUAL"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="MES-INICIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-INICIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MES-FIM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-FIM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-ORGAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CODIGO-UNIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-UNIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "treinamento"
})
@XmlRootElement(name = "TREINAMENTO-MINISTRADO")
public class TREINAMENTOMINISTRADO {

    @XmlElement(name = "TREINAMENTO")
    protected List<TREINAMENTO> treinamento;
    @XmlAttribute(name = "SEQUENCIA-FUNCAO-ATIVIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciafuncaoatividade;
    @XmlAttribute(name = "FLAG-PERIODO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagperiodo;
    @XmlAttribute(name = "MES-INICIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String mesinicio;
    @XmlAttribute(name = "ANO-INICIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anoinicio;
    @XmlAttribute(name = "MES-FIM")
    @XmlSchemaType(name = "anySimpleType")
    protected String mesfim;
    @XmlAttribute(name = "ANO-FIM")
    @XmlSchemaType(name = "anySimpleType")
    protected String anofim;
    @XmlAttribute(name = "CODIGO-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoorgao;
    @XmlAttribute(name = "NOME-ORGAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeorgao;
    @XmlAttribute(name = "CODIGO-UNIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigounidade;
    @XmlAttribute(name = "NOME-UNIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeunidade;

    /**
     * Gets the value of the treinamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treinamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTREINAMENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TREINAMENTO }
     * 
     * 
     */
    public List<TREINAMENTO> getTREINAMENTO() {
        if (treinamento == null) {
            treinamento = new ArrayList<TREINAMENTO>();
        }
        return this.treinamento;
    }

    /**
     * Obt�m o valor da propriedade sequenciafuncaoatividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAFUNCAOATIVIDADE() {
        return sequenciafuncaoatividade;
    }

    /**
     * Define o valor da propriedade sequenciafuncaoatividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAFUNCAOATIVIDADE(String value) {
        this.sequenciafuncaoatividade = value;
    }

    /**
     * Obt�m o valor da propriedade flagperiodo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGPERIODO() {
        return flagperiodo;
    }

    /**
     * Define o valor da propriedade flagperiodo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGPERIODO(String value) {
        this.flagperiodo = value;
    }

    /**
     * Obt�m o valor da propriedade mesinicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESINICIO() {
        return mesinicio;
    }

    /**
     * Define o valor da propriedade mesinicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESINICIO(String value) {
        this.mesinicio = value;
    }

    /**
     * Obt�m o valor da propriedade anoinicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOINICIO() {
        return anoinicio;
    }

    /**
     * Define o valor da propriedade anoinicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOINICIO(String value) {
        this.anoinicio = value;
    }

    /**
     * Obt�m o valor da propriedade mesfim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMESFIM() {
        return mesfim;
    }

    /**
     * Define o valor da propriedade mesfim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMESFIM(String value) {
        this.mesfim = value;
    }

    /**
     * Obt�m o valor da propriedade anofim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOFIM() {
        return anofim;
    }

    /**
     * Define o valor da propriedade anofim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOFIM(String value) {
        this.anofim = value;
    }

    /**
     * Obt�m o valor da propriedade codigoorgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOORGAO() {
        return codigoorgao;
    }

    /**
     * Define o valor da propriedade codigoorgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOORGAO(String value) {
        this.codigoorgao = value;
    }

    /**
     * Obt�m o valor da propriedade nomeorgao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEORGAO() {
        return nomeorgao;
    }

    /**
     * Define o valor da propriedade nomeorgao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEORGAO(String value) {
        this.nomeorgao = value;
    }

    /**
     * Obt�m o valor da propriedade codigounidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOUNIDADE() {
        return codigounidade;
    }

    /**
     * Define o valor da propriedade codigounidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOUNIDADE(String value) {
        this.codigounidade = value;
    }

    /**
     * Obt�m o valor da propriedade nomeunidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEUNIDADE() {
        return nomeunidade;
    }

    /**
     * Define o valor da propriedade nomeunidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEUNIDADE(String value) {
        this.nomeunidade = value;
    }

}
