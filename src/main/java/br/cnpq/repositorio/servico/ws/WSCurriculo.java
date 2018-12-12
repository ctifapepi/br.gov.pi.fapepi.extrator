
package br.cnpq.repositorio.servico.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.7-b01-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "WSCurriculo", targetNamespace = "http://ws.servico.repositorio.cnpq.br/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface WSCurriculo {


    /**
     * 
     * @param id
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(partName = "return")
    public byte[] getCurriculoCompactado(
        @WebParam(name = "id", partName = "id")
        String id);

    /**
     * 
     * @param id
     * @param login
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(partName = "return")
    public byte[] getCurriculoCompactadoPorUsuario(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "login", partName = "login")
        String login);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getDataAtualizacaoCV(
        @WebParam(name = "id", partName = "id")
        String id);

    /**
     * 
     * @param id
     * @param login
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getDataAtualizacaoCVPorUsuario(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "login", partName = "login")
        String login);

    /**
     * 
     * @param cpf
     * @param dataNascimento
     * @param nomeCompleto
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getIdentificadorCNPq(
        @WebParam(name = "cpf", partName = "cpf")
        String cpf,
        @WebParam(name = "nomeCompleto", partName = "nomeCompleto")
        String nomeCompleto,
        @WebParam(name = "dataNascimento", partName = "dataNascimento")
        String dataNascimento);

    /**
     * 
     * @param cpf
     * @param dataNascimento
     * @param login
     * @param nomeCompleto
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getIdentificadorCNPqPorUsuario(
        @WebParam(name = "cpf", partName = "cpf")
        String cpf,
        @WebParam(name = "nomeCompleto", partName = "nomeCompleto")
        String nomeCompleto,
        @WebParam(name = "dataNascimento", partName = "dataNascimento")
        String dataNascimento,
        @WebParam(name = "login", partName = "login")
        String login);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getOcorrenciaCV(
        @WebParam(name = "id", partName = "id")
        String id);

    /**
     * 
     * @param id
     * @param login
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(partName = "return")
    public String getOcorrenciaCVPorUsuario(
        @WebParam(name = "id", partName = "id")
        String id,
        @WebParam(name = "login", partName = "login")
        String login);

}
