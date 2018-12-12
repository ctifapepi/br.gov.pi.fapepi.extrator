//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.11.30 às 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TIPO-PATENTE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="PRIVILEGIO_DE_INOVACAO_PI"/>
 *             &lt;enumeration value="MODELO_DE_UTILIDADE_MU"/>
 *             &lt;enumeration value="DESENHO_INDUSTRIAL_DI"/>
 *             &lt;enumeration value="MODELO_INDUSTRIAL_MI"/>
 *             &lt;enumeration value="PATENTE_NO_EXTERIOR_PE"/>
 *             &lt;enumeration value="PROGRAMA_DE_COMPUTADOR_PC"/>
 *             &lt;enumeration value="OUTRO_OU"/>
 *             &lt;enumeration value="OUTRO_Ou"/>
 *             &lt;enumeration value="CERTIFICADO_DE_ADICAO_CA"/>
 *             &lt;enumeration value="CULTIVAR_PROTEGIDA_CTV"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_DE_PRODUTO_MPD"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_DE_SERVICO_MSV"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_COLETIVA_MCL"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_DE_CERTIFICACAO_MCT"/>
 *             &lt;enumeration value="TOPOGRAFIA_DE_CIRCUITO_INTEGRADO_REGISTRADA_TCI"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_FIGURATIVA_MRF"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_NOMINATIVA_MRN"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_MISTA_MRM"/>
 *             &lt;enumeration value="MARCA_REGISTRADA_TRIDIMENSIONAL_MRT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="CODIGO-DO-REGISTRO-OU-PATENTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="TITULO-PATENTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-PEDIDO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-PEDIDO-DE-DEPOSITO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DATA-DE-PEDIDO-DE-EXAME" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DATA-DE-CONCESSAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="INSTITUICAO-DEPOSITO-REGISTRO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DEPOSITO-PCT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-DEPOSITO-PCT" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-DEPOSITO-PCT" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-TITULAR" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-DEPOSITANTE" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "REGISTRO-OU-PATENTE")
public class REGISTROOUPATENTE {

    @XmlAttribute(name = "TIPO-PATENTE")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String tipopatente;
    @XmlAttribute(name = "CODIGO-DO-REGISTRO-OU-PATENTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String codigodoregistrooupatente;
    @XmlAttribute(name = "TITULO-PATENTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String titulopatente;
    @XmlAttribute(name = "FORMATO-DATA-PEDIDO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatapedido;
    @XmlAttribute(name = "DATA-PEDIDO-DE-DEPOSITO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datapedidodedeposito;
    @XmlAttribute(name = "DATA-DE-PEDIDO-DE-EXAME")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadepedidodeexame;
    @XmlAttribute(name = "DATA-DE-CONCESSAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadeconcessao;
    @XmlAttribute(name = "INSTITUICAO-DEPOSITO-REGISTRO")
    @XmlSchemaType(name = "anySimpleType")
    protected String instituicaodepositoregistro;
    @XmlAttribute(name = "NUMERO-DEPOSITO-PCT")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodepositopct;
    @XmlAttribute(name = "FORMATO-DATA-DEPOSITO-PCT")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatadepositopct;
    @XmlAttribute(name = "DATA-DEPOSITO-PCT")
    @XmlSchemaType(name = "anySimpleType")
    protected String datadepositopct;
    @XmlAttribute(name = "NOME-DO-TITULAR")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedotitular;
    @XmlAttribute(name = "NOME-DO-DEPOSITANTE")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedodepositante;

    /**
     * Obtém o valor da propriedade tipopatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTIPOPATENTE() {
        return tipopatente;
    }

    /**
     * Define o valor da propriedade tipopatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTIPOPATENTE(String value) {
        this.tipopatente = value;
    }

    /**
     * Obtém o valor da propriedade codigodoregistrooupatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODIGODOREGISTROOUPATENTE() {
        return codigodoregistrooupatente;
    }

    /**
     * Define o valor da propriedade codigodoregistrooupatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODIGODOREGISTROOUPATENTE(String value) {
        this.codigodoregistrooupatente = value;
    }

    /**
     * Obtém o valor da propriedade titulopatente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTITULOPATENTE() {
        return titulopatente;
    }

    /**
     * Define o valor da propriedade titulopatente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTITULOPATENTE(String value) {
        this.titulopatente = value;
    }

    /**
     * Obtém o valor da propriedade formatodatapedido.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATAPEDIDO() {
        if (formatodatapedido == null) {
            return "DDMMAAAA";
        } else {
            return formatodatapedido;
        }
    }

    /**
     * Define o valor da propriedade formatodatapedido.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATAPEDIDO(String value) {
        this.formatodatapedido = value;
    }

    /**
     * Obtém o valor da propriedade datapedidodedeposito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATAPEDIDODEDEPOSITO() {
        return datapedidodedeposito;
    }

    /**
     * Define o valor da propriedade datapedidodedeposito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATAPEDIDODEDEPOSITO(String value) {
        this.datapedidodedeposito = value;
    }

    /**
     * Obtém o valor da propriedade datadepedidodeexame.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADEPEDIDODEEXAME() {
        return datadepedidodeexame;
    }

    /**
     * Define o valor da propriedade datadepedidodeexame.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADEPEDIDODEEXAME(String value) {
        this.datadepedidodeexame = value;
    }

    /**
     * Obtém o valor da propriedade datadeconcessao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADECONCESSAO() {
        return datadeconcessao;
    }

    /**
     * Define o valor da propriedade datadeconcessao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADECONCESSAO(String value) {
        this.datadeconcessao = value;
    }

    /**
     * Obtém o valor da propriedade instituicaodepositoregistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINSTITUICAODEPOSITOREGISTRO() {
        return instituicaodepositoregistro;
    }

    /**
     * Define o valor da propriedade instituicaodepositoregistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINSTITUICAODEPOSITOREGISTRO(String value) {
        this.instituicaodepositoregistro = value;
    }

    /**
     * Obtém o valor da propriedade numerodepositopct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODEPOSITOPCT() {
        return numerodepositopct;
    }

    /**
     * Define o valor da propriedade numerodepositopct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODEPOSITOPCT(String value) {
        this.numerodepositopct = value;
    }

    /**
     * Obtém o valor da propriedade formatodatadepositopct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATADEPOSITOPCT() {
        if (formatodatadepositopct == null) {
            return "DDMMAAAA";
        } else {
            return formatodatadepositopct;
        }
    }

    /**
     * Define o valor da propriedade formatodatadepositopct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATADEPOSITOPCT(String value) {
        this.formatodatadepositopct = value;
    }

    /**
     * Obtém o valor da propriedade datadepositopct.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATADEPOSITOPCT() {
        return datadepositopct;
    }

    /**
     * Define o valor da propriedade datadepositopct.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATADEPOSITOPCT(String value) {
        this.datadepositopct = value;
    }

    /**
     * Obtém o valor da propriedade nomedotitular.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOTITULAR() {
        return nomedotitular;
    }

    /**
     * Define o valor da propriedade nomedotitular.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOTITULAR(String value) {
        this.nomedotitular = value;
    }

    /**
     * Obtém o valor da propriedade nomedodepositante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDODEPOSITANTE() {
        return nomedodepositante;
    }

    /**
     * Define o valor da propriedade nomedodepositante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDODEPOSITANTE(String value) {
        this.nomedodepositante = value;
    }

}
