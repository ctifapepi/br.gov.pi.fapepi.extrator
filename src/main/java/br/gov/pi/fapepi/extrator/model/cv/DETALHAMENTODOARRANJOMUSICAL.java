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


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AUTOR-DA-OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-DA-OBRA-DE-REFERENCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMACAO-INSTRUMENTAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="REGISTRO-DE-DIREITO-AUTORAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PREMIACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-ARRANJO-MUSICAL")
public class DETALHAMENTODOARRANJOMUSICAL {

    @XmlAttribute(name = "AUTOR-DA-OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String autordaobradereferencia;
    @XmlAttribute(name = "ANO-DA-OBRA-DE-REFERENCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String anodaobradereferencia;
    @XmlAttribute(name = "FORMACAO-INSTRUMENTAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String formacaoinstrumental;
    @XmlAttribute(name = "REGISTRO-DE-DIREITO-AUTORAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String registrodedireitoautoral;
    @XmlAttribute(name = "PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiacao;

    /**
     * Obt�m o valor da propriedade autordaobradereferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAUTORDAOBRADEREFERENCIA() {
        return autordaobradereferencia;
    }

    /**
     * Define o valor da propriedade autordaobradereferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAUTORDAOBRADEREFERENCIA(String value) {
        this.autordaobradereferencia = value;
    }

    /**
     * Obt�m o valor da propriedade anodaobradereferencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANODAOBRADEREFERENCIA() {
        return anodaobradereferencia;
    }

    /**
     * Define o valor da propriedade anodaobradereferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANODAOBRADEREFERENCIA(String value) {
        this.anodaobradereferencia = value;
    }

    /**
     * Obt�m o valor da propriedade formacaoinstrumental.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMACAOINSTRUMENTAL() {
        return formacaoinstrumental;
    }

    /**
     * Define o valor da propriedade formacaoinstrumental.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMACAOINSTRUMENTAL(String value) {
        this.formacaoinstrumental = value;
    }

    /**
     * Obt�m o valor da propriedade registrodedireitoautoral.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREGISTRODEDIREITOAUTORAL() {
        return registrodedireitoautoral;
    }

    /**
     * Define o valor da propriedade registrodedireitoautoral.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREGISTRODEDIREITOAUTORAL(String value) {
        this.registrodedireitoautoral = value;
    }

    /**
     * Obt�m o valor da propriedade premiacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPREMIACAO() {
        return premiacao;
    }

    /**
     * Define o valor da propriedade premiacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPREMIACAO(String value) {
        this.premiacao = value;
    }

}
