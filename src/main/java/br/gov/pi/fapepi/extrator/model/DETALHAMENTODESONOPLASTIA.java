//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
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
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FINALIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlRootElement(name = "DETALHAMENTO-DE-SONOPLASTIA")
public class DETALHAMENTODESONOPLASTIA {

    @XmlAttribute(name = "FINALIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String finalidade;
    @XmlAttribute(name = "PREMIACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String premiacao;

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
