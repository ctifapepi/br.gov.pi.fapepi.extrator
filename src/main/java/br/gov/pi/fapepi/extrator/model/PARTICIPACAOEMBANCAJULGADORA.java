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
 *         &lt;element ref="{}BANCA-JULGADORA-PARA-PROFESSOR-TITULAR" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BANCA-JULGADORA-PARA-CONCURSO-PUBLICO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BANCA-JULGADORA-PARA-LIVRE-DOCENCIA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}BANCA-JULGADORA-PARA-AVALIACAO-CURSOS" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-BANCAS-JULGADORAS" maxOccurs="unbounded" minOccurs="0"/>
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
    "bancajulgadoraparaprofessortitular",
    "bancajulgadoraparaconcursopublico",
    "bancajulgadoraparalivredocencia",
    "bancajulgadoraparaavaliacaocursos",
    "outrasbancasjulgadoras"
})
@XmlRootElement(name = "PARTICIPACAO-EM-BANCA-JULGADORA")
public class PARTICIPACAOEMBANCAJULGADORA {

    @XmlElement(name = "BANCA-JULGADORA-PARA-PROFESSOR-TITULAR")
    protected List<BANCAJULGADORAPARAPROFESSORTITULAR> bancajulgadoraparaprofessortitular;
    @XmlElement(name = "BANCA-JULGADORA-PARA-CONCURSO-PUBLICO")
    protected List<BANCAJULGADORAPARACONCURSOPUBLICO> bancajulgadoraparaconcursopublico;
    @XmlElement(name = "BANCA-JULGADORA-PARA-LIVRE-DOCENCIA")
    protected List<BANCAJULGADORAPARALIVREDOCENCIA> bancajulgadoraparalivredocencia;
    @XmlElement(name = "BANCA-JULGADORA-PARA-AVALIACAO-CURSOS")
    protected List<BANCAJULGADORAPARAAVALIACAOCURSOS> bancajulgadoraparaavaliacaocursos;
    @XmlElement(name = "OUTRAS-BANCAS-JULGADORAS")
    protected List<OUTRASBANCASJULGADORAS> outrasbancasjulgadoras;

    /**
     * Gets the value of the bancajulgadoraparaprofessortitular property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancajulgadoraparaprofessortitular property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANCAJULGADORAPARAPROFESSORTITULAR().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BANCAJULGADORAPARAPROFESSORTITULAR }
     * 
     * 
     */
    public List<BANCAJULGADORAPARAPROFESSORTITULAR> getBANCAJULGADORAPARAPROFESSORTITULAR() {
        if (bancajulgadoraparaprofessortitular == null) {
            bancajulgadoraparaprofessortitular = new ArrayList<BANCAJULGADORAPARAPROFESSORTITULAR>();
        }
        return this.bancajulgadoraparaprofessortitular;
    }

    /**
     * Gets the value of the bancajulgadoraparaconcursopublico property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancajulgadoraparaconcursopublico property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANCAJULGADORAPARACONCURSOPUBLICO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BANCAJULGADORAPARACONCURSOPUBLICO }
     * 
     * 
     */
    public List<BANCAJULGADORAPARACONCURSOPUBLICO> getBANCAJULGADORAPARACONCURSOPUBLICO() {
        if (bancajulgadoraparaconcursopublico == null) {
            bancajulgadoraparaconcursopublico = new ArrayList<BANCAJULGADORAPARACONCURSOPUBLICO>();
        }
        return this.bancajulgadoraparaconcursopublico;
    }

    /**
     * Gets the value of the bancajulgadoraparalivredocencia property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancajulgadoraparalivredocencia property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANCAJULGADORAPARALIVREDOCENCIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BANCAJULGADORAPARALIVREDOCENCIA }
     * 
     * 
     */
    public List<BANCAJULGADORAPARALIVREDOCENCIA> getBANCAJULGADORAPARALIVREDOCENCIA() {
        if (bancajulgadoraparalivredocencia == null) {
            bancajulgadoraparalivredocencia = new ArrayList<BANCAJULGADORAPARALIVREDOCENCIA>();
        }
        return this.bancajulgadoraparalivredocencia;
    }

    /**
     * Gets the value of the bancajulgadoraparaavaliacaocursos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bancajulgadoraparaavaliacaocursos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBANCAJULGADORAPARAAVALIACAOCURSOS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BANCAJULGADORAPARAAVALIACAOCURSOS }
     * 
     * 
     */
    public List<BANCAJULGADORAPARAAVALIACAOCURSOS> getBANCAJULGADORAPARAAVALIACAOCURSOS() {
        if (bancajulgadoraparaavaliacaocursos == null) {
            bancajulgadoraparaavaliacaocursos = new ArrayList<BANCAJULGADORAPARAAVALIACAOCURSOS>();
        }
        return this.bancajulgadoraparaavaliacaocursos;
    }

    /**
     * Gets the value of the outrasbancasjulgadoras property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrasbancasjulgadoras property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRASBANCASJULGADORAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRASBANCASJULGADORAS }
     * 
     * 
     */
    public List<OUTRASBANCASJULGADORAS> getOUTRASBANCASJULGADORAS() {
        if (outrasbancasjulgadoras == null) {
            outrasbancasjulgadoras = new ArrayList<OUTRASBANCASJULGADORAS>();
        }
        return this.outrasbancasjulgadoras;
    }

}
