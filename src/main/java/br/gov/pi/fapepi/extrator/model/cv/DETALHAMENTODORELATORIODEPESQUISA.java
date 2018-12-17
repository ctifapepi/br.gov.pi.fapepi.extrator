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
 *       &lt;attribute name="NOME-DO-PROJETO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DE-PAGINAS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DISPONIBILIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-FINANCIADORA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DETALHAMENTO-DO-RELATORIO-DE-PESQUISA")
public class DETALHAMENTODORELATORIODEPESQUISA {

    @XmlAttribute(name = "NOME-DO-PROJETO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoprojeto;
    @XmlAttribute(name = "NUMERO-DE-PAGINAS")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepaginas;
    @XmlAttribute(name = "DISPONIBILIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String disponibilidade;
    @XmlAttribute(name = "INSTITUICAO-FINANCIADORA")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaofinanciadora;

    /**
     * Obt�m o valor da propriedade nomedoprojeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOPROJETO() {
        return nomedoprojeto;
    }

    /**
     * Define o valor da propriedade nomedoprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOPROJETO(String value) {
        this.nomedoprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade numerodepaginas.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEPAGINAS() {
        return numerodepaginas;
    }

    /**
     * Define o valor da propriedade numerodepaginas.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEPAGINAS(String value) {
        this.numerodepaginas = value;
    }

    /**
     * Obt�m o valor da propriedade disponibilidade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPONIBILIDADE() {
        return disponibilidade;
    }

    /**
     * Define o valor da propriedade disponibilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPONIBILIDADE(String value) {
        this.disponibilidade = value;
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

}
