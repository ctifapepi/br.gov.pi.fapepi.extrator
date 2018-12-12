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
 *         &lt;element ref="{}APRESENTACAO-DE-TRABALHO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CARTA-MAPA-OU-SIMILAR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}CURSO-DE-CURTA-DURACAO-MINISTRADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}EDITORACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MANUTENCAO-DE-OBRA-ARTISTICA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MAQUETE" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORGANIZACAO-DE-EVENTO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}PROGRAMA-DE-RADIO-OU-TV" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}RELATORIO-DE-PESQUISA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MIDIA-SOCIAL-WEBSITE-BLOG" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRA-PRODUCAO-TECNICA" maxOccurs="unbounded" minOccurs="0"/>
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
    "apresentacaodetrabalho",
    "cartamapaousimilar",
    "cursodecurtaduracaoministrado",
    "desenvolvimentodematerialdidaticoouinstrucional",
    "editoracao",
    "manutencaodeobraartistica",
    "maquete",
    "organizacaodeevento",
    "programaderadiooutv",
    "relatoriodepesquisa",
    "midiasocialwebsiteblog",
    "outraproducaotecnica"
})
@XmlRootElement(name = "DEMAIS-TIPOS-DE-PRODUCAO-TECNICA")
public class DEMAISTIPOSDEPRODUCAOTECNICA {

    @XmlElement(name = "APRESENTACAO-DE-TRABALHO")
    protected List<APRESENTACAODETRABALHO> apresentacaodetrabalho;
    @XmlElement(name = "CARTA-MAPA-OU-SIMILAR")
    protected List<CARTAMAPAOUSIMILAR> cartamapaousimilar;
    @XmlElement(name = "CURSO-DE-CURTA-DURACAO-MINISTRADO")
    protected List<CURSODECURTADURACAOMINISTRADO> cursodecurtaduracaoministrado;
    @XmlElement(name = "DESENVOLVIMENTO-DE-MATERIAL-DIDATICO-OU-INSTRUCIONAL")
    protected List<DESENVOLVIMENTODEMATERIALDIDATICOOUINSTRUCIONAL> desenvolvimentodematerialdidaticoouinstrucional;
    @XmlElement(name = "EDITORACAO")
    protected List<EDITORACAO> editoracao;
    @XmlElement(name = "MANUTENCAO-DE-OBRA-ARTISTICA")
    protected List<MANUTENCAODEOBRAARTISTICA> manutencaodeobraartistica;
    @XmlElement(name = "MAQUETE")
    protected List<MAQUETE> maquete;
    @XmlElement(name = "ORGANIZACAO-DE-EVENTO")
    protected List<ORGANIZACAODEEVENTO> organizacaodeevento;
    @XmlElement(name = "PROGRAMA-DE-RADIO-OU-TV")
    protected List<PROGRAMADERADIOOUTV> programaderadiooutv;
    @XmlElement(name = "RELATORIO-DE-PESQUISA")
    protected List<RELATORIODEPESQUISA> relatoriodepesquisa;
    @XmlElement(name = "MIDIA-SOCIAL-WEBSITE-BLOG")
    protected List<MIDIASOCIALWEBSITEBLOG> midiasocialwebsiteblog;
    @XmlElement(name = "OUTRA-PRODUCAO-TECNICA")
    protected List<OUTRAPRODUCAOTECNICA> outraproducaotecnica;

    /**
     * Gets the value of the apresentacaodetrabalho property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apresentacaodetrabalho property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAPRESENTACAODETRABALHO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link APRESENTACAODETRABALHO }
     * 
     * 
     */
    public List<APRESENTACAODETRABALHO> getAPRESENTACAODETRABALHO() {
        if (apresentacaodetrabalho == null) {
            apresentacaodetrabalho = new ArrayList<APRESENTACAODETRABALHO>();
        }
        return this.apresentacaodetrabalho;
    }

    /**
     * Gets the value of the cartamapaousimilar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cartamapaousimilar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCARTAMAPAOUSIMILAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CARTAMAPAOUSIMILAR }
     * 
     * 
     */
    public List<CARTAMAPAOUSIMILAR> getCARTAMAPAOUSIMILAR() {
        if (cartamapaousimilar == null) {
            cartamapaousimilar = new ArrayList<CARTAMAPAOUSIMILAR>();
        }
        return this.cartamapaousimilar;
    }

    /**
     * Gets the value of the cursodecurtaduracaoministrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cursodecurtaduracaoministrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCURSODECURTADURACAOMINISTRADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CURSODECURTADURACAOMINISTRADO }
     * 
     * 
     */
    public List<CURSODECURTADURACAOMINISTRADO> getCURSODECURTADURACAOMINISTRADO() {
        if (cursodecurtaduracaoministrado == null) {
            cursodecurtaduracaoministrado = new ArrayList<CURSODECURTADURACAOMINISTRADO>();
        }
        return this.cursodecurtaduracaoministrado;
    }

    /**
     * Gets the value of the desenvolvimentodematerialdidaticoouinstrucional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the desenvolvimentodematerialdidaticoouinstrucional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDESENVOLVIMENTODEMATERIALDIDATICOOUINSTRUCIONAL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DESENVOLVIMENTODEMATERIALDIDATICOOUINSTRUCIONAL }
     * 
     * 
     */
    public List<DESENVOLVIMENTODEMATERIALDIDATICOOUINSTRUCIONAL> getDESENVOLVIMENTODEMATERIALDIDATICOOUINSTRUCIONAL() {
        if (desenvolvimentodematerialdidaticoouinstrucional == null) {
            desenvolvimentodematerialdidaticoouinstrucional = new ArrayList<DESENVOLVIMENTODEMATERIALDIDATICOOUINSTRUCIONAL>();
        }
        return this.desenvolvimentodematerialdidaticoouinstrucional;
    }

    /**
     * Gets the value of the editoracao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the editoracao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDITORACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EDITORACAO }
     * 
     * 
     */
    public List<EDITORACAO> getEDITORACAO() {
        if (editoracao == null) {
            editoracao = new ArrayList<EDITORACAO>();
        }
        return this.editoracao;
    }

    /**
     * Gets the value of the manutencaodeobraartistica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manutencaodeobraartistica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMANUTENCAODEOBRAARTISTICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MANUTENCAODEOBRAARTISTICA }
     * 
     * 
     */
    public List<MANUTENCAODEOBRAARTISTICA> getMANUTENCAODEOBRAARTISTICA() {
        if (manutencaodeobraartistica == null) {
            manutencaodeobraartistica = new ArrayList<MANUTENCAODEOBRAARTISTICA>();
        }
        return this.manutencaodeobraartistica;
    }

    /**
     * Gets the value of the maquete property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maquete property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMAQUETE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MAQUETE }
     * 
     * 
     */
    public List<MAQUETE> getMAQUETE() {
        if (maquete == null) {
            maquete = new ArrayList<MAQUETE>();
        }
        return this.maquete;
    }

    /**
     * Gets the value of the organizacaodeevento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the organizacaodeevento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORGANIZACAODEEVENTO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORGANIZACAODEEVENTO }
     * 
     * 
     */
    public List<ORGANIZACAODEEVENTO> getORGANIZACAODEEVENTO() {
        if (organizacaodeevento == null) {
            organizacaodeevento = new ArrayList<ORGANIZACAODEEVENTO>();
        }
        return this.organizacaodeevento;
    }

    /**
     * Gets the value of the programaderadiooutv property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the programaderadiooutv property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPROGRAMADERADIOOUTV().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PROGRAMADERADIOOUTV }
     * 
     * 
     */
    public List<PROGRAMADERADIOOUTV> getPROGRAMADERADIOOUTV() {
        if (programaderadiooutv == null) {
            programaderadiooutv = new ArrayList<PROGRAMADERADIOOUTV>();
        }
        return this.programaderadiooutv;
    }

    /**
     * Gets the value of the relatoriodepesquisa property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatoriodepesquisa property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRELATORIODEPESQUISA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RELATORIODEPESQUISA }
     * 
     * 
     */
    public List<RELATORIODEPESQUISA> getRELATORIODEPESQUISA() {
        if (relatoriodepesquisa == null) {
            relatoriodepesquisa = new ArrayList<RELATORIODEPESQUISA>();
        }
        return this.relatoriodepesquisa;
    }

    /**
     * Gets the value of the midiasocialwebsiteblog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the midiasocialwebsiteblog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMIDIASOCIALWEBSITEBLOG().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MIDIASOCIALWEBSITEBLOG }
     * 
     * 
     */
    public List<MIDIASOCIALWEBSITEBLOG> getMIDIASOCIALWEBSITEBLOG() {
        if (midiasocialwebsiteblog == null) {
            midiasocialwebsiteblog = new ArrayList<MIDIASOCIALWEBSITEBLOG>();
        }
        return this.midiasocialwebsiteblog;
    }

    /**
     * Gets the value of the outraproducaotecnica property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outraproducaotecnica property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRAPRODUCAOTECNICA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRAPRODUCAOTECNICA }
     * 
     * 
     */
    public List<OUTRAPRODUCAOTECNICA> getOUTRAPRODUCAOTECNICA() {
        if (outraproducaotecnica == null) {
            outraproducaotecnica = new ArrayList<OUTRAPRODUCAOTECNICA>();
        }
        return this.outraproducaotecnica;
    }

}
