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
 *       &lt;attribute name="TEMA-DA-CARTA-MAPA-OU-SIMILAR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TECNICA-UTILIZADA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FINALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AREA-REPRESENTADA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DE-CARTA-MAPA-OU-SIMILAR")
public class DETALHAMENTODECARTAMAPAOUSIMILAR {

    @XmlAttribute(name = "TEMA-DA-CARTA-MAPA-OU-SIMILAR")
    @XmlSchemaType(name = "anySimpleType")
    protected String temadacartamapaousimilar;
    @XmlAttribute(name = "TECNICA-UTILIZADA")
    @XmlSchemaType(name = "anySimpleType")
    protected String tecnicautilizada;
    @XmlAttribute(name = "FINALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidade;
    @XmlAttribute(name = "AREA-REPRESENTADA")
    @XmlSchemaType(name = "anySimpleType")
    protected String arearepresentada;
    @XmlAttribute(name = "INSTITUICAO-FINANCIADORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaofinanciadora;
    @XmlAttribute(name = "FINALIDADE-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidadeingles;

    /**
     * Obt�m o valor da propriedade temadacartamapaousimilar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTEMADACARTAMAPAOUSIMILAR() {
        return temadacartamapaousimilar;
    }

    /**
     * Define o valor da propriedade temadacartamapaousimilar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTEMADACARTAMAPAOUSIMILAR(String value) {
        this.temadacartamapaousimilar = value;
    }

    /**
     * Obt�m o valor da propriedade tecnicautilizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTECNICAUTILIZADA() {
        return tecnicautilizada;
    }

    /**
     * Define o valor da propriedade tecnicautilizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTECNICAUTILIZADA(String value) {
        this.tecnicautilizada = value;
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
     * Obt�m o valor da propriedade arearepresentada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAREAREPRESENTADA() {
        return arearepresentada;
    }

    /**
     * Define o valor da propriedade arearepresentada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAREAREPRESENTADA(String value) {
        this.arearepresentada = value;
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
