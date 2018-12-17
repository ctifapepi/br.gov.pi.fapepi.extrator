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
import javax.xml.bind.annotation.XmlValue;
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
 *       &lt;attribute name="NOME-COMPLETO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-PARA-CITACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ORDEM-DE-INTEGRACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-RESPONSAVEL">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NRO-ID-CNPQ" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "content"
})
@XmlRootElement(name = "INTEGRANTES-DO-PROJETO")
public class INTEGRANTESDOPROJETO {

    @XmlValue
    protected String content;
    @XmlAttribute(name = "NOME-COMPLETO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecompleto;
    @XmlAttribute(name = "NOME-PARA-CITACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeparacitacao;
    @XmlAttribute(name = "ORDEM-DE-INTEGRACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String ordemdeintegracao;
    @XmlAttribute(name = "FLAG-RESPONSAVEL")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagresponsavel;
    @XmlAttribute(name = "NRO-ID-CNPQ")
    @XmlSchemaType(name = "anySimpleType")
    protected String nroidcnpq;

    /**
     * Obt�m o valor da propriedade content.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Define o valor da propriedade content.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Obt�m o valor da propriedade nomecompleto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOMPLETO() {
        return nomecompleto;
    }

    /**
     * Define o valor da propriedade nomecompleto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOMPLETO(String value) {
        this.nomecompleto = value;
    }

    /**
     * Obt�m o valor da propriedade nomeparacitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEPARACITACAO() {
        return nomeparacitacao;
    }

    /**
     * Define o valor da propriedade nomeparacitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEPARACITACAO(String value) {
        this.nomeparacitacao = value;
    }

    /**
     * Obt�m o valor da propriedade ordemdeintegracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDEMDEINTEGRACAO() {
        return ordemdeintegracao;
    }

    /**
     * Define o valor da propriedade ordemdeintegracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDEMDEINTEGRACAO(String value) {
        this.ordemdeintegracao = value;
    }

    /**
     * Obt�m o valor da propriedade flagresponsavel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGRESPONSAVEL() {
        return flagresponsavel;
    }

    /**
     * Define o valor da propriedade flagresponsavel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGRESPONSAVEL(String value) {
        this.flagresponsavel = value;
    }

    /**
     * Obt�m o valor da propriedade nroidcnpq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNROIDCNPQ() {
        return nroidcnpq;
    }

    /**
     * Define o valor da propriedade nroidcnpq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNROIDCNPQ(String value) {
        this.nroidcnpq = value;
    }

}
