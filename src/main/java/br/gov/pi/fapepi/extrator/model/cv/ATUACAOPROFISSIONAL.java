//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *       &lt;sequence>
 *         &lt;element ref="{}VINCULOS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-DIRECAO-E-ADMINISTRACAO" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-ENSINO" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-ESTAGIO" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-SERVICO-TECNICO-ESPECIALIZADO" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-EXTENSAO-UNIVERSITARIA" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-TREINAMENTO-MINISTRADO" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-ATIVIDADES-TECNICO-CIENTIFICA" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-CONSELHO-COMISSAO-E-CONSULTORIA" minOccurs="0"/>
 *         &lt;element ref="{}ATIVIDADES-DE-PARTICIPACAO-EM-PROJETO" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="CODIGO-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-INSTITUICAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEQUENCIA-ATIVIDADE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SEQUENCIA-IMPORTANCIA" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "vinculos",
    "atividadesdedirecaoeadministracao",
    "atividadesdepesquisaedesenvolvimento",
    "atividadesdeensino",
    "atividadesdeestagio",
    "atividadesdeservicotecnicoespecializado",
    "atividadesdeextensaouniversitaria",
    "atividadesdetreinamentoministrado",
    "outrasatividadestecnicocientifica",
    "atividadesdeconselhocomissaoeconsultoria",
    "atividadesdeparticipacaoemprojeto"
})
@XmlRootElement(name = "ATUACAO-PROFISSIONAL")
public class ATUACAOPROFISSIONAL {

    @XmlElement(name = "VINCULOS")
    protected List<VINCULOS> vinculos;
    @XmlElement(name = "ATIVIDADES-DE-DIRECAO-E-ADMINISTRACAO")
    protected ATIVIDADESDEDIRECAOEADMINISTRACAO atividadesdedirecaoeadministracao;
    @XmlElement(name = "ATIVIDADES-DE-PESQUISA-E-DESENVOLVIMENTO")
    protected ATIVIDADESDEPESQUISAEDESENVOLVIMENTO atividadesdepesquisaedesenvolvimento;
    @XmlElement(name = "ATIVIDADES-DE-ENSINO")
    protected ATIVIDADESDEENSINO atividadesdeensino;
    @XmlElement(name = "ATIVIDADES-DE-ESTAGIO")
    protected ATIVIDADESDEESTAGIO atividadesdeestagio;
    @XmlElement(name = "ATIVIDADES-DE-SERVICO-TECNICO-ESPECIALIZADO")
    protected ATIVIDADESDESERVICOTECNICOESPECIALIZADO atividadesdeservicotecnicoespecializado;
    @XmlElement(name = "ATIVIDADES-DE-EXTENSAO-UNIVERSITARIA")
    protected ATIVIDADESDEEXTENSAOUNIVERSITARIA atividadesdeextensaouniversitaria;
    @XmlElement(name = "ATIVIDADES-DE-TREINAMENTO-MINISTRADO")
    protected ATIVIDADESDETREINAMENTOMINISTRADO atividadesdetreinamentoministrado;
    @XmlElement(name = "OUTRAS-ATIVIDADES-TECNICO-CIENTIFICA")
    protected OUTRASATIVIDADESTECNICOCIENTIFICA outrasatividadestecnicocientifica;
    @XmlElement(name = "ATIVIDADES-DE-CONSELHO-COMISSAO-E-CONSULTORIA")
    protected ATIVIDADESDECONSELHOCOMISSAOECONSULTORIA atividadesdeconselhocomissaoeconsultoria;
    @XmlElement(name = "ATIVIDADES-DE-PARTICIPACAO-EM-PROJETO")
    protected ATIVIDADESDEPARTICIPACAOEMPROJETO atividadesdeparticipacaoemprojeto;
    @XmlAttribute(name = "CODIGO-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigoinstituicao;
    @XmlAttribute(name = "NOME-INSTITUICAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomeinstituicao;
    @XmlAttribute(name = "SEQUENCIA-ATIVIDADE")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaatividade;
    @XmlAttribute(name = "SEQUENCIA-IMPORTANCIA")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaimportancia;

    /**
     * Gets the value of the vinculos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vinculos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVINCULOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VINCULOS }
     * 
     * 
     */
    public List<VINCULOS> getVINCULOS() {
        if (vinculos == null) {
            vinculos = new ArrayList<VINCULOS>();
        }
        return this.vinculos;
    }

    /**
     * Obt�m o valor da propriedade atividadesdedirecaoeadministracao.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDEDIRECAOEADMINISTRACAO }
     *     
     */
    public ATIVIDADESDEDIRECAOEADMINISTRACAO getATIVIDADESDEDIRECAOEADMINISTRACAO() {
        return atividadesdedirecaoeadministracao;
    }

    /**
     * Define o valor da propriedade atividadesdedirecaoeadministracao.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDEDIRECAOEADMINISTRACAO }
     *     
     */
    public void setATIVIDADESDEDIRECAOEADMINISTRACAO(ATIVIDADESDEDIRECAOEADMINISTRACAO value) {
        this.atividadesdedirecaoeadministracao = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdepesquisaedesenvolvimento.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDEPESQUISAEDESENVOLVIMENTO }
     *     
     */
    public ATIVIDADESDEPESQUISAEDESENVOLVIMENTO getATIVIDADESDEPESQUISAEDESENVOLVIMENTO() {
        return atividadesdepesquisaedesenvolvimento;
    }

    /**
     * Define o valor da propriedade atividadesdepesquisaedesenvolvimento.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDEPESQUISAEDESENVOLVIMENTO }
     *     
     */
    public void setATIVIDADESDEPESQUISAEDESENVOLVIMENTO(ATIVIDADESDEPESQUISAEDESENVOLVIMENTO value) {
        this.atividadesdepesquisaedesenvolvimento = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdeensino.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDEENSINO }
     *     
     */
    public ATIVIDADESDEENSINO getATIVIDADESDEENSINO() {
        return atividadesdeensino;
    }

    /**
     * Define o valor da propriedade atividadesdeensino.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDEENSINO }
     *     
     */
    public void setATIVIDADESDEENSINO(ATIVIDADESDEENSINO value) {
        this.atividadesdeensino = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdeestagio.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDEESTAGIO }
     *     
     */
    public ATIVIDADESDEESTAGIO getATIVIDADESDEESTAGIO() {
        return atividadesdeestagio;
    }

    /**
     * Define o valor da propriedade atividadesdeestagio.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDEESTAGIO }
     *     
     */
    public void setATIVIDADESDEESTAGIO(ATIVIDADESDEESTAGIO value) {
        this.atividadesdeestagio = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdeservicotecnicoespecializado.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDESERVICOTECNICOESPECIALIZADO }
     *     
     */
    public ATIVIDADESDESERVICOTECNICOESPECIALIZADO getATIVIDADESDESERVICOTECNICOESPECIALIZADO() {
        return atividadesdeservicotecnicoespecializado;
    }

    /**
     * Define o valor da propriedade atividadesdeservicotecnicoespecializado.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDESERVICOTECNICOESPECIALIZADO }
     *     
     */
    public void setATIVIDADESDESERVICOTECNICOESPECIALIZADO(ATIVIDADESDESERVICOTECNICOESPECIALIZADO value) {
        this.atividadesdeservicotecnicoespecializado = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdeextensaouniversitaria.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDEEXTENSAOUNIVERSITARIA }
     *     
     */
    public ATIVIDADESDEEXTENSAOUNIVERSITARIA getATIVIDADESDEEXTENSAOUNIVERSITARIA() {
        return atividadesdeextensaouniversitaria;
    }

    /**
     * Define o valor da propriedade atividadesdeextensaouniversitaria.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDEEXTENSAOUNIVERSITARIA }
     *     
     */
    public void setATIVIDADESDEEXTENSAOUNIVERSITARIA(ATIVIDADESDEEXTENSAOUNIVERSITARIA value) {
        this.atividadesdeextensaouniversitaria = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdetreinamentoministrado.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDETREINAMENTOMINISTRADO }
     *     
     */
    public ATIVIDADESDETREINAMENTOMINISTRADO getATIVIDADESDETREINAMENTOMINISTRADO() {
        return atividadesdetreinamentoministrado;
    }

    /**
     * Define o valor da propriedade atividadesdetreinamentoministrado.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDETREINAMENTOMINISTRADO }
     *     
     */
    public void setATIVIDADESDETREINAMENTOMINISTRADO(ATIVIDADESDETREINAMENTOMINISTRADO value) {
        this.atividadesdetreinamentoministrado = value;
    }

    /**
     * Obt�m o valor da propriedade outrasatividadestecnicocientifica.
     * 
     * @return
     *     possible object is
     *     {@link OUTRASATIVIDADESTECNICOCIENTIFICA }
     *     
     */
    public OUTRASATIVIDADESTECNICOCIENTIFICA getOUTRASATIVIDADESTECNICOCIENTIFICA() {
        return outrasatividadestecnicocientifica;
    }

    /**
     * Define o valor da propriedade outrasatividadestecnicocientifica.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTRASATIVIDADESTECNICOCIENTIFICA }
     *     
     */
    public void setOUTRASATIVIDADESTECNICOCIENTIFICA(OUTRASATIVIDADESTECNICOCIENTIFICA value) {
        this.outrasatividadestecnicocientifica = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdeconselhocomissaoeconsultoria.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDECONSELHOCOMISSAOECONSULTORIA }
     *     
     */
    public ATIVIDADESDECONSELHOCOMISSAOECONSULTORIA getATIVIDADESDECONSELHOCOMISSAOECONSULTORIA() {
        return atividadesdeconselhocomissaoeconsultoria;
    }

    /**
     * Define o valor da propriedade atividadesdeconselhocomissaoeconsultoria.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDECONSELHOCOMISSAOECONSULTORIA }
     *     
     */
    public void setATIVIDADESDECONSELHOCOMISSAOECONSULTORIA(ATIVIDADESDECONSELHOCOMISSAOECONSULTORIA value) {
        this.atividadesdeconselhocomissaoeconsultoria = value;
    }

    /**
     * Obt�m o valor da propriedade atividadesdeparticipacaoemprojeto.
     * 
     * @return
     *     possible object is
     *     {@link ATIVIDADESDEPARTICIPACAOEMPROJETO }
     *     
     */
    public ATIVIDADESDEPARTICIPACAOEMPROJETO getATIVIDADESDEPARTICIPACAOEMPROJETO() {
        return atividadesdeparticipacaoemprojeto;
    }

    /**
     * Define o valor da propriedade atividadesdeparticipacaoemprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link ATIVIDADESDEPARTICIPACAOEMPROJETO }
     *     
     */
    public void setATIVIDADESDEPARTICIPACAOEMPROJETO(ATIVIDADESDEPARTICIPACAOEMPROJETO value) {
        this.atividadesdeparticipacaoemprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade codigoinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGOINSTITUICAO() {
        return codigoinstituicao;
    }

    /**
     * Define o valor da propriedade codigoinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGOINSTITUICAO(String value) {
        this.codigoinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade nomeinstituicao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEINSTITUICAO() {
        return nomeinstituicao;
    }

    /**
     * Define o valor da propriedade nomeinstituicao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEINSTITUICAO(String value) {
        this.nomeinstituicao = value;
    }

    /**
     * Obt�m o valor da propriedade sequenciaatividade.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAATIVIDADE() {
        return sequenciaatividade;
    }

    /**
     * Define o valor da propriedade sequenciaatividade.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAATIVIDADE(String value) {
        this.sequenciaatividade = value;
    }

    /**
     * Obt�m o valor da propriedade sequenciaimportancia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAIMPORTANCIA() {
        return sequenciaimportancia;
    }

    /**
     * Define o valor da propriedade sequenciaimportancia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAIMPORTANCIA(String value) {
        this.sequenciaimportancia = value;
    }

}
