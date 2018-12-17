//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}TRABALHOS-EM-EVENTOS" minOccurs="0"/>
 *         &lt;element ref="{}ARTIGOS-PUBLICADOS" minOccurs="0"/>
 *         &lt;element ref="{}LIVROS-E-CAPITULOS" minOccurs="0"/>
 *         &lt;element ref="{}TEXTOS-EM-JORNAIS-OU-REVISTAS" minOccurs="0"/>
 *         &lt;element ref="{}DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA" minOccurs="0"/>
 *         &lt;element ref="{}ARTIGOS-ACEITOS-PARA-PUBLICACAO" minOccurs="0"/>
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
    "trabalhosemeventos",
    "artigospublicados",
    "livrosecapitulos",
    "textosemjornaisourevistas",
    "demaistiposdeproducaobibliografica",
    "artigosaceitosparapublicacao"
})
@XmlRootElement(name = "PRODUCAO-BIBLIOGRAFICA")
public class PRODUCAOBIBLIOGRAFICA {

    @XmlElement(name = "TRABALHOS-EM-EVENTOS")
    protected TRABALHOSEMEVENTOS trabalhosemeventos;
    @XmlElement(name = "ARTIGOS-PUBLICADOS")
    protected ARTIGOSPUBLICADOS artigospublicados;
    @XmlElement(name = "LIVROS-E-CAPITULOS")
    protected LIVROSECAPITULOS livrosecapitulos;
    @XmlElement(name = "TEXTOS-EM-JORNAIS-OU-REVISTAS")
    protected TEXTOSEMJORNAISOUREVISTAS textosemjornaisourevistas;
    @XmlElement(name = "DEMAIS-TIPOS-DE-PRODUCAO-BIBLIOGRAFICA")
    protected DEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA demaistiposdeproducaobibliografica;
    @XmlElement(name = "ARTIGOS-ACEITOS-PARA-PUBLICACAO")
    protected ARTIGOSACEITOSPARAPUBLICACAO artigosaceitosparapublicacao;

    /**
     * Obt�m o valor da propriedade trabalhosemeventos.
     * 
     * @return
     *     possible object is
     *     {@link TRABALHOSEMEVENTOS }
     *     
     */
    public TRABALHOSEMEVENTOS getTRABALHOSEMEVENTOS() {
        return trabalhosemeventos;
    }

    /**
     * Define o valor da propriedade trabalhosemeventos.
     * 
     * @param value
     *     allowed object is
     *     {@link TRABALHOSEMEVENTOS }
     *     
     */
    public void setTRABALHOSEMEVENTOS(TRABALHOSEMEVENTOS value) {
        this.trabalhosemeventos = value;
    }

    /**
     * Obt�m o valor da propriedade artigospublicados.
     * 
     * @return
     *     possible object is
     *     {@link ARTIGOSPUBLICADOS }
     *     
     */
    public ARTIGOSPUBLICADOS getARTIGOSPUBLICADOS() {
        return artigospublicados;
    }

    /**
     * Define o valor da propriedade artigospublicados.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTIGOSPUBLICADOS }
     *     
     */
    public void setARTIGOSPUBLICADOS(ARTIGOSPUBLICADOS value) {
        this.artigospublicados = value;
    }

    /**
     * Obt�m o valor da propriedade livrosecapitulos.
     * 
     * @return
     *     possible object is
     *     {@link LIVROSECAPITULOS }
     *     
     */
    public LIVROSECAPITULOS getLIVROSECAPITULOS() {
        return livrosecapitulos;
    }

    /**
     * Define o valor da propriedade livrosecapitulos.
     * 
     * @param value
     *     allowed object is
     *     {@link LIVROSECAPITULOS }
     *     
     */
    public void setLIVROSECAPITULOS(LIVROSECAPITULOS value) {
        this.livrosecapitulos = value;
    }

    /**
     * Obt�m o valor da propriedade textosemjornaisourevistas.
     * 
     * @return
     *     possible object is
     *     {@link TEXTOSEMJORNAISOUREVISTAS }
     *     
     */
    public TEXTOSEMJORNAISOUREVISTAS getTEXTOSEMJORNAISOUREVISTAS() {
        return textosemjornaisourevistas;
    }

    /**
     * Define o valor da propriedade textosemjornaisourevistas.
     * 
     * @param value
     *     allowed object is
     *     {@link TEXTOSEMJORNAISOUREVISTAS }
     *     
     */
    public void setTEXTOSEMJORNAISOUREVISTAS(TEXTOSEMJORNAISOUREVISTAS value) {
        this.textosemjornaisourevistas = value;
    }

    /**
     * Obt�m o valor da propriedade demaistiposdeproducaobibliografica.
     * 
     * @return
     *     possible object is
     *     {@link DEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA }
     *     
     */
    public DEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA getDEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA() {
        return demaistiposdeproducaobibliografica;
    }

    /**
     * Define o valor da propriedade demaistiposdeproducaobibliografica.
     * 
     * @param value
     *     allowed object is
     *     {@link DEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA }
     *     
     */
    public void setDEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA(DEMAISTIPOSDEPRODUCAOBIBLIOGRAFICA value) {
        this.demaistiposdeproducaobibliografica = value;
    }

    /**
     * Obt�m o valor da propriedade artigosaceitosparapublicacao.
     * 
     * @return
     *     possible object is
     *     {@link ARTIGOSACEITOSPARAPUBLICACAO }
     *     
     */
    public ARTIGOSACEITOSPARAPUBLICACAO getARTIGOSACEITOSPARAPUBLICACAO() {
        return artigosaceitosparapublicacao;
    }

    /**
     * Define o valor da propriedade artigosaceitosparapublicacao.
     * 
     * @param value
     *     allowed object is
     *     {@link ARTIGOSACEITOSPARAPUBLICACAO }
     *     
     */
    public void setARTIGOSACEITOSPARAPUBLICACAO(ARTIGOSACEITOSPARAPUBLICACAO value) {
        this.artigosaceitosparapublicacao = value;
    }

}
