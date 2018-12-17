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
 *         &lt;element ref="{}ORIENTACOES-CONCLUIDAS-PARA-MESTRADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{}OUTRAS-ORIENTACOES-CONCLUIDAS" maxOccurs="unbounded" minOccurs="0"/>
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
    "orientacoesconcluidasparamestrado",
    "orientacoesconcluidasparadoutorado",
    "orientacoesconcluidasparaposdoutorado",
    "outrasorientacoesconcluidas"
})
@XmlRootElement(name = "ORIENTACOES-CONCLUIDAS")
public class ORIENTACOESCONCLUIDAS {

    @XmlElement(name = "ORIENTACOES-CONCLUIDAS-PARA-MESTRADO")
    protected List<ORIENTACOESCONCLUIDASPARAMESTRADO> orientacoesconcluidasparamestrado;
    @XmlElement(name = "ORIENTACOES-CONCLUIDAS-PARA-DOUTORADO")
    protected List<ORIENTACOESCONCLUIDASPARADOUTORADO> orientacoesconcluidasparadoutorado;
    @XmlElement(name = "ORIENTACOES-CONCLUIDAS-PARA-POS-DOUTORADO")
    protected List<ORIENTACOESCONCLUIDASPARAPOSDOUTORADO> orientacoesconcluidasparaposdoutorado;
    @XmlElement(name = "OUTRAS-ORIENTACOES-CONCLUIDAS")
    protected List<OUTRASORIENTACOESCONCLUIDAS> outrasorientacoesconcluidas;

    /**
     * Gets the value of the orientacoesconcluidasparamestrado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacoesconcluidasparamestrado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACOESCONCLUIDASPARAMESTRADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACOESCONCLUIDASPARAMESTRADO }
     * 
     * 
     */
    public List<ORIENTACOESCONCLUIDASPARAMESTRADO> getORIENTACOESCONCLUIDASPARAMESTRADO() {
        if (orientacoesconcluidasparamestrado == null) {
            orientacoesconcluidasparamestrado = new ArrayList<ORIENTACOESCONCLUIDASPARAMESTRADO>();
        }
        return this.orientacoesconcluidasparamestrado;
    }

    /**
     * Gets the value of the orientacoesconcluidasparadoutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacoesconcluidasparadoutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACOESCONCLUIDASPARADOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACOESCONCLUIDASPARADOUTORADO }
     * 
     * 
     */
    public List<ORIENTACOESCONCLUIDASPARADOUTORADO> getORIENTACOESCONCLUIDASPARADOUTORADO() {
        if (orientacoesconcluidasparadoutorado == null) {
            orientacoesconcluidasparadoutorado = new ArrayList<ORIENTACOESCONCLUIDASPARADOUTORADO>();
        }
        return this.orientacoesconcluidasparadoutorado;
    }

    /**
     * Gets the value of the orientacoesconcluidasparaposdoutorado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientacoesconcluidasparaposdoutorado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getORIENTACOESCONCLUIDASPARAPOSDOUTORADO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ORIENTACOESCONCLUIDASPARAPOSDOUTORADO }
     * 
     * 
     */
    public List<ORIENTACOESCONCLUIDASPARAPOSDOUTORADO> getORIENTACOESCONCLUIDASPARAPOSDOUTORADO() {
        if (orientacoesconcluidasparaposdoutorado == null) {
            orientacoesconcluidasparaposdoutorado = new ArrayList<ORIENTACOESCONCLUIDASPARAPOSDOUTORADO>();
        }
        return this.orientacoesconcluidasparaposdoutorado;
    }

    /**
     * Gets the value of the outrasorientacoesconcluidas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the outrasorientacoesconcluidas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOUTRASORIENTACOESCONCLUIDAS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OUTRASORIENTACOESCONCLUIDAS }
     * 
     * 
     */
    public List<OUTRASORIENTACOESCONCLUIDAS> getOUTRASORIENTACOESCONCLUIDAS() {
        if (outrasorientacoesconcluidas == null) {
            outrasorientacoesconcluidas = new ArrayList<OUTRASORIENTACOESCONCLUIDAS>();
        }
        return this.outrasorientacoesconcluidas;
    }

}
