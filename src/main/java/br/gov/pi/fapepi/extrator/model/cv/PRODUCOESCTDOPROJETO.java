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
 *         &lt;element ref="{}PRODUCAO-CT-DO-PROJETO" maxOccurs="unbounded"/>
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
    "producaoctdoprojeto"
})
@XmlRootElement(name = "PRODUCOES-CT-DO-PROJETO")
public class PRODUCOESCTDOPROJETO {

    @XmlElement(name = "PRODUCAO-CT-DO-PROJETO", required = true)
    protected List<PRODUCAOCTDOPROJETO> producaoctdoprojeto;

    /**
     * Gets the value of the producaoctdoprojeto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producaoctdoprojeto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRODUCAOCTDOPROJETO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRODUCAOCTDOPROJETO }
     * 
     * 
     */
    public List<PRODUCAOCTDOPROJETO> getPRODUCAOCTDOPROJETO() {
        if (producaoctdoprojeto == null) {
            producaoctdoprojeto = new ArrayList<PRODUCAOCTDOPROJETO>();
        }
        return this.producaoctdoprojeto;
    }

}
