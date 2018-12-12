//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FINALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DO-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
public class DETALHAMENTODOMATERIALDIDATICOOUINSTRUCIONAL {

    @XmlAttribute(name = "FINALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidade;
    @XmlAttribute(name = "FINALIDADE-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidadeingles;

    /**
     * Obtém o valor da propriedade finalidade.
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
     * Obtém o valor da propriedade finalidadeingles.
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
