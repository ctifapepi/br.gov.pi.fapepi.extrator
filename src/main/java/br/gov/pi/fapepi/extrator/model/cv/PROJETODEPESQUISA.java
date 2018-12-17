//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: 2018.11.30 �s 02:01:16 PM GMT-03:00 
//


package br.gov.pi.fapepi.extrator.model.cv;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}EQUIPE-DO-PROJETO" minOccurs="0"/>
 *         &lt;element ref="{}FINANCIADORES-DO-PROJETO" minOccurs="0"/>
 *         &lt;element ref="{}PRODUCOES-CT-DO-PROJETO" minOccurs="0"/>
 *         &lt;element ref="{}ORIENTACOES" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SEQUENCIA-PROJETO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-INICIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ANO-FIM" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-PROJETO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SITUACAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="EM_ANDAMENTO"/>
 *             &lt;enumeration value="DESATIVADO"/>
 *             &lt;enumeration value="CONCLUIDO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NATUREZA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="DESENVOLVIMENTO"/>
 *             &lt;enumeration value="EXTENSAO"/>
 *             &lt;enumeration value="PESQUISA"/>
 *             &lt;enumeration value="OUTRA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NUMERO-GRADUACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-ESPECIALIZACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-MESTRADO-ACADEMICO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-MESTRADO-PROF" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO-DOUTORADO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DESCRICAO-DO-PROJETO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="IDENTIFICADOR-PROJETO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="DESCRICAO-DO-PROJETO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NOME-DO-PROJETO-INGLES" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FLAG-POTENCIAL-INOVACAO" default="NAO">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *             &lt;enumeration value="SIM"/>
 *             &lt;enumeration value="NAO"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="NOME-COORDENADOR-CERTIFICACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="FORMATO-DATA-CERTIFICACAO" default="DDMMAAAA">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="DDMMAAAA"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DATA-CERTIFICACAO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="NUMERO_TECNICO_NIVEL_MEDIO" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "equipedoprojeto",
    "financiadoresdoprojeto",
    "producoesctdoprojeto",
    "orientacoes"
})
@XmlRootElement(name = "PROJETO-DE-PESQUISA")
public class PROJETODEPESQUISA {

    @XmlElement(name = "EQUIPE-DO-PROJETO")
    protected EQUIPEDOPROJETO equipedoprojeto;
    @XmlElement(name = "FINANCIADORES-DO-PROJETO")
    protected FINANCIADORESDOPROJETO financiadoresdoprojeto;
    @XmlElement(name = "PRODUCOES-CT-DO-PROJETO")
    protected PRODUCOESCTDOPROJETO producoesctdoprojeto;
    @XmlElement(name = "ORIENTACOES")
    protected ORIENTACOES orientacoes;
    @XmlAttribute(name = "SEQUENCIA-PROJETO")
    @XmlSchemaType(name = "anySimpleType")
    protected String sequenciaprojeto;
    @XmlAttribute(name = "ANO-INICIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String anoinicio;
    @XmlAttribute(name = "ANO-FIM")
    @XmlSchemaType(name = "anySimpleType")
    protected String anofim;
    @XmlAttribute(name = "NOME-DO-PROJETO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoprojeto;
    @XmlAttribute(name = "SITUACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String situacao;
    @XmlAttribute(name = "NATUREZA")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String natureza;
    @XmlAttribute(name = "NUMERO-GRADUACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerograduacao;
    @XmlAttribute(name = "NUMERO-ESPECIALIZACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeroespecializacao;
    @XmlAttribute(name = "NUMERO-MESTRADO-ACADEMICO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeromestradoacademico;
    @XmlAttribute(name = "NUMERO-MESTRADO-PROF")
    @XmlSchemaType(name = "anySimpleType")
    protected String numeromestradoprof;
    @XmlAttribute(name = "NUMERO-DOUTORADO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerodoutorado;
    @XmlAttribute(name = "DESCRICAO-DO-PROJETO")
    @XmlSchemaType(name = "anySimpleType")
    protected String descricaodoprojeto;
    @XmlAttribute(name = "IDENTIFICADOR-PROJETO")
    @XmlSchemaType(name = "anySimpleType")
    protected String identificadorprojeto;
    @XmlAttribute(name = "DESCRICAO-DO-PROJETO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String descricaodoprojetoingles;
    @XmlAttribute(name = "NOME-DO-PROJETO-INGLES")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomedoprojetoingles;
    @XmlAttribute(name = "FLAG-POTENCIAL-INOVACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String flagpotencialinovacao;
    @XmlAttribute(name = "NOME-COORDENADOR-CERTIFICACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String nomecoordenadorcertificacao;
    @XmlAttribute(name = "FORMATO-DATA-CERTIFICACAO")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String formatodatacertificacao;
    @XmlAttribute(name = "DATA-CERTIFICACAO")
    @XmlSchemaType(name = "anySimpleType")
    protected String datacertificacao;
    @XmlAttribute(name = "NUMERO_TECNICO_NIVEL_MEDIO")
    @XmlSchemaType(name = "anySimpleType")
    protected String numerotecniconivelmedio;

    /**
     * Obt�m o valor da propriedade equipedoprojeto.
     * 
     * @return
     *     possible object is
     *     {@link EQUIPEDOPROJETO }
     *     
     */
    public EQUIPEDOPROJETO getEQUIPEDOPROJETO() {
        return equipedoprojeto;
    }

    /**
     * Define o valor da propriedade equipedoprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link EQUIPEDOPROJETO }
     *     
     */
    public void setEQUIPEDOPROJETO(EQUIPEDOPROJETO value) {
        this.equipedoprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade financiadoresdoprojeto.
     * 
     * @return
     *     possible object is
     *     {@link FINANCIADORESDOPROJETO }
     *     
     */
    public FINANCIADORESDOPROJETO getFINANCIADORESDOPROJETO() {
        return financiadoresdoprojeto;
    }

    /**
     * Define o valor da propriedade financiadoresdoprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link FINANCIADORESDOPROJETO }
     *     
     */
    public void setFINANCIADORESDOPROJETO(FINANCIADORESDOPROJETO value) {
        this.financiadoresdoprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade producoesctdoprojeto.
     * 
     * @return
     *     possible object is
     *     {@link PRODUCOESCTDOPROJETO }
     *     
     */
    public PRODUCOESCTDOPROJETO getPRODUCOESCTDOPROJETO() {
        return producoesctdoprojeto;
    }

    /**
     * Define o valor da propriedade producoesctdoprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link PRODUCOESCTDOPROJETO }
     *     
     */
    public void setPRODUCOESCTDOPROJETO(PRODUCOESCTDOPROJETO value) {
        this.producoesctdoprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade orientacoes.
     * 
     * @return
     *     possible object is
     *     {@link ORIENTACOES }
     *     
     */
    public ORIENTACOES getORIENTACOES() {
        return orientacoes;
    }

    /**
     * Define o valor da propriedade orientacoes.
     * 
     * @param value
     *     allowed object is
     *     {@link ORIENTACOES }
     *     
     */
    public void setORIENTACOES(ORIENTACOES value) {
        this.orientacoes = value;
    }

    /**
     * Obt�m o valor da propriedade sequenciaprojeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSEQUENCIAPROJETO() {
        return sequenciaprojeto;
    }

    /**
     * Define o valor da propriedade sequenciaprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSEQUENCIAPROJETO(String value) {
        this.sequenciaprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade anoinicio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOINICIO() {
        return anoinicio;
    }

    /**
     * Define o valor da propriedade anoinicio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOINICIO(String value) {
        this.anoinicio = value;
    }

    /**
     * Obt�m o valor da propriedade anofim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getANOFIM() {
        return anofim;
    }

    /**
     * Define o valor da propriedade anofim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setANOFIM(String value) {
        this.anofim = value;
    }

    /**
     * Obt�m o valor da propriedade nomedoprojeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOPROJETO() {
        return nomedoprojeto;
    }

    /**
     * Define o valor da propriedade nomedoprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOPROJETO(String value) {
        this.nomedoprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade situacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSITUACAO() {
        return situacao;
    }

    /**
     * Define o valor da propriedade situacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSITUACAO(String value) {
        this.situacao = value;
    }

    /**
     * Obt�m o valor da propriedade natureza.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNATUREZA() {
        return natureza;
    }

    /**
     * Define o valor da propriedade natureza.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNATUREZA(String value) {
        this.natureza = value;
    }

    /**
     * Obt�m o valor da propriedade numerograduacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROGRADUACAO() {
        return numerograduacao;
    }

    /**
     * Define o valor da propriedade numerograduacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROGRADUACAO(String value) {
        this.numerograduacao = value;
    }

    /**
     * Obt�m o valor da propriedade numeroespecializacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROESPECIALIZACAO() {
        return numeroespecializacao;
    }

    /**
     * Define o valor da propriedade numeroespecializacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROESPECIALIZACAO(String value) {
        this.numeroespecializacao = value;
    }

    /**
     * Obt�m o valor da propriedade numeromestradoacademico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROMESTRADOACADEMICO() {
        return numeromestradoacademico;
    }

    /**
     * Define o valor da propriedade numeromestradoacademico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROMESTRADOACADEMICO(String value) {
        this.numeromestradoacademico = value;
    }

    /**
     * Obt�m o valor da propriedade numeromestradoprof.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROMESTRADOPROF() {
        return numeromestradoprof;
    }

    /**
     * Define o valor da propriedade numeromestradoprof.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROMESTRADOPROF(String value) {
        this.numeromestradoprof = value;
    }

    /**
     * Obt�m o valor da propriedade numerodoutorado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMERODOUTORADO() {
        return numerodoutorado;
    }

    /**
     * Define o valor da propriedade numerodoutorado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMERODOUTORADO(String value) {
        this.numerodoutorado = value;
    }

    /**
     * Obt�m o valor da propriedade descricaodoprojeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAODOPROJETO() {
        return descricaodoprojeto;
    }

    /**
     * Define o valor da propriedade descricaodoprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAODOPROJETO(String value) {
        this.descricaodoprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorprojeto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDENTIFICADORPROJETO() {
        return identificadorprojeto;
    }

    /**
     * Define o valor da propriedade identificadorprojeto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDENTIFICADORPROJETO(String value) {
        this.identificadorprojeto = value;
    }

    /**
     * Obt�m o valor da propriedade descricaodoprojetoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESCRICAODOPROJETOINGLES() {
        return descricaodoprojetoingles;
    }

    /**
     * Define o valor da propriedade descricaodoprojetoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESCRICAODOPROJETOINGLES(String value) {
        this.descricaodoprojetoingles = value;
    }

    /**
     * Obt�m o valor da propriedade nomedoprojetoingles.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMEDOPROJETOINGLES() {
        return nomedoprojetoingles;
    }

    /**
     * Define o valor da propriedade nomedoprojetoingles.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMEDOPROJETOINGLES(String value) {
        this.nomedoprojetoingles = value;
    }

    /**
     * Obt�m o valor da propriedade flagpotencialinovacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAGPOTENCIALINOVACAO() {
        if (flagpotencialinovacao == null) {
            return "NAO";
        } else {
            return flagpotencialinovacao;
        }
    }

    /**
     * Define o valor da propriedade flagpotencialinovacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAGPOTENCIALINOVACAO(String value) {
        this.flagpotencialinovacao = value;
    }

    /**
     * Obt�m o valor da propriedade nomecoordenadorcertificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOMECOORDENADORCERTIFICACAO() {
        return nomecoordenadorcertificacao;
    }

    /**
     * Define o valor da propriedade nomecoordenadorcertificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOMECOORDENADORCERTIFICACAO(String value) {
        this.nomecoordenadorcertificacao = value;
    }

    /**
     * Obt�m o valor da propriedade formatodatacertificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFORMATODATACERTIFICACAO() {
        if (formatodatacertificacao == null) {
            return "DDMMAAAA";
        } else {
            return formatodatacertificacao;
        }
    }

    /**
     * Define o valor da propriedade formatodatacertificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFORMATODATACERTIFICACAO(String value) {
        this.formatodatacertificacao = value;
    }

    /**
     * Obt�m o valor da propriedade datacertificacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDATACERTIFICACAO() {
        return datacertificacao;
    }

    /**
     * Define o valor da propriedade datacertificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDATACERTIFICACAO(String value) {
        this.datacertificacao = value;
    }

    /**
     * Obt�m o valor da propriedade numerotecniconivelmedio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNUMEROTECNICONIVELMEDIO() {
        return numerotecniconivelmedio;
    }

    /**
     * Define o valor da propriedade numerotecniconivelmedio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNUMEROTECNICONIVELMEDIO(String value) {
        this.numerotecniconivelmedio = value;
    }

}
