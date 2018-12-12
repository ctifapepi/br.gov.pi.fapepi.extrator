//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}FORMACAO-COMPLEMENTAR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-BANCA-JULGADORA" minOccurs="0"/>
 *         &lt;element ref="{}PARTICIPACAO-EM-EVENTOS-CONGRESSOS" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACOES-EM-ANDAMENTO" minOccurs="0"/>
 *         &lt;element ref="{}INFORMACOES-ADICIONAIS-INSTITUICOES" minOccurs="0"/>
 *         &lt;element ref="{}INFORMACOES-ADICIONAIS-CURSOS" minOccurs="0"/>
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
    "formacaocomplementar",
    "participacaoembancatrabalhosconclusao",
    "participacaoembancajulgadora",
    "participacaoemeventoscongressos",
    "orientacoesemandamento",
    "informacoesadicionaisinstituicoes",
    "informacoesadicionaiscursos"
})
@XmlRootElement(name = "DADOS-COMPLEMENTARES")
public class DADOSCOMPLEMENTARES {

    @XmlElement(name = "FORMACAO-COMPLEMENTAR")
    protected List<FORMACAOCOMPLEMENTAR> formacaocomplementar;
    @XmlElement(name = "PARTICIPACAO-EM-BANCA-TRABALHOS-CONCLUSAO")
    protected PARTICIPACAOEMBANCATRABALHOSCONCLUSAO participacaoembancatrabalhosconclusao;
    @XmlElement(name = "PARTICIPACAO-EM-BANCA-JULGADORA")
    protected PARTICIPACAOEMBANCAJULGADORA participacaoembancajulgadora;
    @XmlElement(name = "PARTICIPACAO-EM-EVENTOS-CONGRESSOS")
    protected PARTICIPACAOEMEVENTOSCONGRESSOS participacaoemeventoscongressos;
    @XmlElement(name = "ORIENTACOES-EM-ANDAMENTO")
    protected ORIENTACOESEMANDAMENTO orientacoesemandamento;
    @XmlElement(name = "INFORMACOES-ADICIONAIS-INSTITUICOES")
    protected INFORMACOESADICIONAISINSTITUICOES informacoesadicionaisinstituicoes;
    @XmlElement(name = "INFORMACOES-ADICIONAIS-CURSOS")
    protected INFORMACOESADICIONAISCURSOS informacoesadicionaiscursos;

    /**
     * Gets the value of the formacaocomplementar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formacaocomplementar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFORMACAOCOMPLEMENTAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FORMACAOCOMPLEMENTAR }
     * 
     * 
     */
    public List<FORMACAOCOMPLEMENTAR> getFORMACAOCOMPLEMENTAR() {
        if (formacaocomplementar == null) {
            formacaocomplementar = new ArrayList<FORMACAOCOMPLEMENTAR>();
        }
        return this.formacaocomplementar;
    }

    /**
     * Obtém o valor da propriedade participacaoembancatrabalhosconclusao.
     * 
     * @return
     *     possible object is
     *     {@link PARTICIPACAOEMBANCATRABALHOSCONCLUSAO }
     *     
     */
    public PARTICIPACAOEMBANCATRABALHOSCONCLUSAO getPARTICIPACAOEMBANCATRABALHOSCONCLUSAO() {
        return participacaoembancatrabalhosconclusao;
    }

    /**
     * Define o valor da propriedade participacaoembancatrabalhosconclusao.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTICIPACAOEMBANCATRABALHOSCONCLUSAO }
     *     
     */
    public void setPARTICIPACAOEMBANCATRABALHOSCONCLUSAO(PARTICIPACAOEMBANCATRABALHOSCONCLUSAO value) {
        this.participacaoembancatrabalhosconclusao = value;
    }

    /**
     * Obtém o valor da propriedade participacaoembancajulgadora.
     * 
     * @return
     *     possible object is
     *     {@link PARTICIPACAOEMBANCAJULGADORA }
     *     
     */
    public PARTICIPACAOEMBANCAJULGADORA getPARTICIPACAOEMBANCAJULGADORA() {
        return participacaoembancajulgadora;
    }

    /**
     * Define o valor da propriedade participacaoembancajulgadora.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTICIPACAOEMBANCAJULGADORA }
     *     
     */
    public void setPARTICIPACAOEMBANCAJULGADORA(PARTICIPACAOEMBANCAJULGADORA value) {
        this.participacaoembancajulgadora = value;
    }

    /**
     * Obtém o valor da propriedade participacaoemeventoscongressos.
     * 
     * @return
     *     possible object is
     *     {@link PARTICIPACAOEMEVENTOSCONGRESSOS }
     *     
     */
    public PARTICIPACAOEMEVENTOSCONGRESSOS getPARTICIPACAOEMEVENTOSCONGRESSOS() {
        return participacaoemeventoscongressos;
    }

    /**
     * Define o valor da propriedade participacaoemeventoscongressos.
     * 
     * @param value
     *     allowed object is
     *     {@link PARTICIPACAOEMEVENTOSCONGRESSOS }
     *     
     */
    public void setPARTICIPACAOEMEVENTOSCONGRESSOS(PARTICIPACAOEMEVENTOSCONGRESSOS value) {
        this.participacaoemeventoscongressos = value;
    }

    /**
     * Obtém o valor da propriedade orientacoesemandamento.
     * 
     * @return
     *     possible object is
     *     {@link ORIENTACOESEMANDAMENTO }
     *     
     */
    public ORIENTACOESEMANDAMENTO getORIENTACOESEMANDAMENTO() {
        return orientacoesemandamento;
    }

    /**
     * Define o valor da propriedade orientacoesemandamento.
     * 
     * @param value
     *     allowed object is
     *     {@link ORIENTACOESEMANDAMENTO }
     *     
     */
    public void setORIENTACOESEMANDAMENTO(ORIENTACOESEMANDAMENTO value) {
        this.orientacoesemandamento = value;
    }

    /**
     * Obtém o valor da propriedade informacoesadicionaisinstituicoes.
     * 
     * @return
     *     possible object is
     *     {@link INFORMACOESADICIONAISINSTITUICOES }
     *     
     */
    public INFORMACOESADICIONAISINSTITUICOES getINFORMACOESADICIONAISINSTITUICOES() {
        return informacoesadicionaisinstituicoes;
    }

    /**
     * Define o valor da propriedade informacoesadicionaisinstituicoes.
     * 
     * @param value
     *     allowed object is
     *     {@link INFORMACOESADICIONAISINSTITUICOES }
     *     
     */
    public void setINFORMACOESADICIONAISINSTITUICOES(INFORMACOESADICIONAISINSTITUICOES value) {
        this.informacoesadicionaisinstituicoes = value;
    }

    /**
     * Obtém o valor da propriedade informacoesadicionaiscursos.
     * 
     * @return
     *     possible object is
     *     {@link INFORMACOESADICIONAISCURSOS }
     *     
     */
    public INFORMACOESADICIONAISCURSOS getINFORMACOESADICIONAISCURSOS() {
        return informacoesadicionaiscursos;
    }

    /**
     * Define o valor da propriedade informacoesadicionaiscursos.
     * 
     * @param value
     *     allowed object is
     *     {@link INFORMACOESADICIONAISCURSOS }
     *     
     */
    public void setINFORMACOESADICIONAISCURSOS(INFORMACOESADICIONAISCURSOS value) {
        this.informacoesadicionaiscursos = value;
    }

}
