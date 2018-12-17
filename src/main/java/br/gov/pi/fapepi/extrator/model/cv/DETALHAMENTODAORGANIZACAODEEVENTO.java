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
 *       &lt;attribute name="INSTITUICAO-PROMOTORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DURACAO-EM-SEMANAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-EVENTO-ITINERANTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-CATALOGO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="LOCAL" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DA-ORGANIZACAO-DE-EVENTO")
public class DETALHAMENTODAORGANIZACAODEEVENTO {

    @XmlAttribute(name = "INSTITUICAO-PROMOTORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaopromotora;
    @XmlAttribute(name = "DURACAO-EM-SEMANAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String duracaoemsemanas;
    @XmlAttribute(name = "FLAG-EVENTO-ITINERANTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String flageventoitinerante;
    @XmlAttribute(name = "FLAG-CATALOGO")
    @XmlSchemaType(name = "anySimpleType")
    protected String flagcatalogo;
    @XmlAttribute(name = "LOCAL")
    @XmlSchemaType(name = "anySimpleType")
    protected String local;
    @XmlAttribute(name = "CIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String cidade;

    /**
     * Obt�m o valor da propriedade instituicaopromotora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAOPROMOTORA() {
        return instituicaopromotora;
    }

    /**
     * Define o valor da propriedade instituicaopromotora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAOPROMOTORA(String value) {
        this.instituicaopromotora = value;
    }

    /**
     * Obt�m o valor da propriedade duracaoemsemanas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDURACAOEMSEMANAS() {
        return duracaoemsemanas;
    }

    /**
     * Define o valor da propriedade duracaoemsemanas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDURACAOEMSEMANAS(String value) {
        this.duracaoemsemanas = value;
    }

    /**
     * Obt�m o valor da propriedade flageventoitinerante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGEVENTOITINERANTE() {
        return flageventoitinerante;
    }

    /**
     * Define o valor da propriedade flageventoitinerante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGEVENTOITINERANTE(String value) {
        this.flageventoitinerante = value;
    }

    /**
     * Obt�m o valor da propriedade flagcatalogo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGCATALOGO() {
        return flagcatalogo;
    }

    /**
     * Define o valor da propriedade flagcatalogo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGCATALOGO(String value) {
        this.flagcatalogo = value;
    }

    /**
     * Obt�m o valor da propriedade local.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLOCAL() {
        return local;
    }

    /**
     * Define o valor da propriedade local.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLOCAL(String value) {
        this.local = value;
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

}
