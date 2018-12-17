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
 *         &lt;element ref="{}FORMACAO-COMPLEMENTAR-DE-EXTENSAO-UNIVERSITARIA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}MBA" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}FORMACAO-COMPLEMENTAR-CURSO-DE-CURTA-DURACAO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTROS" maxOccurs="unbounded" minOccurs="0"/>
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
    "formacaocomplementardeextensaouniversitaria",
    "mba",
    "formacaocomplementarcursodecurtaduracao",
    "outros"
})
@XmlRootElement(name = "FORMACAO-COMPLEMENTAR")
public class FORMACAOCOMPLEMENTAR {

    @XmlElement(name = "FORMACAO-COMPLEMENTAR-DE-EXTENSAO-UNIVERSITARIA")
    protected List<FORMACAOCOMPLEMENTARDEEXTENSAOUNIVERSITARIA> formacaocomplementardeextensaouniversitaria;
    @XmlElement(name = "MBA")
    protected List<MBA> mba;
    @XmlElement(name = "FORMACAO-COMPLEMENTAR-CURSO-DE-CURTA-DURACAO")
    protected List<FORMACAOCOMPLEMENTARCURSODECURTADURACAO> formacaocomplementarcursodecurtaduracao;
    @XmlElement(name = "OUTROS")
    protected List<OUTROS> outros;

    /**
     * Gets the value of the formacaocomplementardeextensaouniversitaria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formacaocomplementardeextensaouniversitaria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFORMACAOCOMPLEMENTARDEEXTENSAOUNIVERSITARIA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FORMACAOCOMPLEMENTARDEEXTENSAOUNIVERSITARIA }
     * 
     * 
     */
    public List<FORMACAOCOMPLEMENTARDEEXTENSAOUNIVERSITARIA> getFORMACAOCOMPLEMENTARDEEXTENSAOUNIVERSITARIA() {
        if (formacaocomplementardeextensaouniversitaria == null) {
            formacaocomplementardeextensaouniversitaria = new ArrayList<FORMACAOCOMPLEMENTARDEEXTENSAOUNIVERSITARIA>();
        }
        return this.formacaocomplementardeextensaouniversitaria;
    }

    /**
     * Gets the value of the mba property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mba property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMBA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MBA }
     * 
     * 
     */
    public List<MBA> getMBA() {
        if (mba == null) {
            mba = new ArrayList<MBA>();
        }
        return this.mba;
    }

    /**
     * Gets the value of the formacaocomplementarcursodecurtaduracao property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formacaocomplementarcursodecurtaduracao property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFORMACAOCOMPLEMENTARCURSODECURTADURACAO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FORMACAOCOMPLEMENTARCURSODECURTADURACAO }
     * 
     * 
     */
    public List<FORMACAOCOMPLEMENTARCURSODECURTADURACAO> getFORMACAOCOMPLEMENTARCURSODECURTADURACAO() {
        if (formacaocomplementarcursodecurtaduracao == null) {
            formacaocomplementarcursodecurtaduracao = new ArrayList<FORMACAOCOMPLEMENTARCURSODECURTADURACAO>();
        }
        return this.formacaocomplementarcursodecurtaduracao;
    }

    /**
     * Gets the value of the outros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTROS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTROS }
     * 
     * 
     */
    public List<OUTROS> getOUTROS() {
        if (outros == null) {
            outros = new ArrayList<OUTROS>();
        }
        return this.outros;
    }

}
