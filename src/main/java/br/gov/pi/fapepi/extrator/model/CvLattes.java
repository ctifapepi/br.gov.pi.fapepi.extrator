package br.gov.pi.fapepi.extrator.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CvLattes {
	
	@Id
	private String idLattes;
	private String data;
	private String hora;
	private String nome;
	private  String resumo;
	private String nomeGrandeAreaDoConhecimento;
	private String nomeDaAreaDoConhecimento;
	private String nomeDaSubareaDoConhecimento;
	private String nomeDaEspecialidade;
	
	public String getIdLattes() {
		return idLattes;
	}
	public void setIdLattes(String idLattes) {
		this.idLattes = idLattes;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getNomeGrandeAreaDoConhecimento() {
		return nomeGrandeAreaDoConhecimento;
	}
	public void setNomeGrandeAreaDoConhecimento(String nomeGrandeAreaDoConhecimento) {
		this.nomeGrandeAreaDoConhecimento = nomeGrandeAreaDoConhecimento;
	}
	public String getNomeDaAreaDoConhecimento() {
		return nomeDaAreaDoConhecimento;
	}
	public void setNomeDaAreaDoConhecimento(String nomeDaAreaDoConhecimento) {
		this.nomeDaAreaDoConhecimento = nomeDaAreaDoConhecimento;
	}
	public String getNomeDaSubareaDoConhecimento() {
		return nomeDaSubareaDoConhecimento;
	}
	public void setNomeDaSubareaDoConhecimento(String nomeDaSubareaDoConhecimento) {
		this.nomeDaSubareaDoConhecimento = nomeDaSubareaDoConhecimento;
	}
	public String getNomeDaEspecialidade() {
		return nomeDaEspecialidade;
	}
	public void setNomeDaEspecialidade(String nomeDaEspecialidade) {
		this.nomeDaEspecialidade = nomeDaEspecialidade;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idLattes == null) ? 0 : idLattes.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CvLattes other = (CvLattes) obj;
		if (idLattes == null) {
			if (other.idLattes != null)
				return false;
		} else if (!idLattes.equals(other.idLattes))
			return false;
		return true;
	}
	
	
}
