//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}LIVROS-PUBLICADOS-OU-ORGANIZADOS" minOccurs="0"/>
 *         &lt;element ref="{}CAPITULOS-DE-LIVROS-PUBLICADOS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "livrospublicadosouorganizados",
    "capitulosdelivrospublicados"
})
@XmlRootElement(name = "LIVROS-E-CAPITULOS")
public class LIVROSECAPITULOS {

    @XmlElement(name = "LIVROS-PUBLICADOS-OU-ORGANIZADOS")
    protected LIVROSPUBLICADOSOUORGANIZADOS livrospublicadosouorganizados;
    @XmlElement(name = "CAPITULOS-DE-LIVROS-PUBLICADOS")
    protected CAPITULOSDELIVROSPUBLICADOS capitulosdelivrospublicados;

    /**
     * Obtém o valor da propriedade livrospublicadosouorganizados.
     * 
     * @return
     *     possible object is
     *     {@link LIVROSPUBLICADOSOUORGANIZADOS }
     *     
     */
    public LIVROSPUBLICADOSOUORGANIZADOS getLIVROSPUBLICADOSOUORGANIZADOS() {
        return livrospublicadosouorganizados;
    }

    /**
     * Define o valor da propriedade livrospublicadosouorganizados.
     * 
     * @param value
     *     allowed object is
     *     {@link LIVROSPUBLICADOSOUORGANIZADOS }
     *     
     */
    public void setLIVROSPUBLICADOSOUORGANIZADOS(LIVROSPUBLICADOSOUORGANIZADOS value) {
        this.livrospublicadosouorganizados = value;
    }

    /**
     * Obtém o valor da propriedade capitulosdelivrospublicados.
     * 
     * @return
     *     possible object is
     *     {@link CAPITULOSDELIVROSPUBLICADOS }
     *     
     */
    public CAPITULOSDELIVROSPUBLICADOS getCAPITULOSDELIVROSPUBLICADOS() {
        return capitulosdelivrospublicados;
    }

    /**
     * Define o valor da propriedade capitulosdelivrospublicados.
     * 
     * @param value
     *     allowed object is
     *     {@link CAPITULOSDELIVROSPUBLICADOS }
     *     
     */
    public void setCAPITULOSDELIVROSPUBLICADOS(CAPITULOSDELIVROSPUBLICADOS value) {
        this.capitulosdelivrospublicados = value;
    }

}
