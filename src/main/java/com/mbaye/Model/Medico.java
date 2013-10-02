package com.mbaye.Model;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="MEDICO")
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MEDICO_ID",unique=true,nullable=false)
	private long medicoId;
	
	@Column(name="MEDICO_NOME",nullable=false)
	private String nome;
	
	@Column(name="MEDICO_CRM",nullable=false)
	private String crm;
	
	@Column(name="MEDICO_LOGRADOURO",nullable=false)
	private String logradouro;
	
	@Column(name="MEDICO_NUMERO",nullable=false)
	private int numero;
	
	@Column(name="MEDICO_BAIRRO",nullable=true)
	private String bairro;
	
	@Column(name="MEDICO_CIDADE",nullable=false)
	private String cidade;
	
	@Column(name="MEDICO_ESTADO",nullable=false)
	private String estado;
	
	@OneToMany(fetch=FetchType.EAGER,mappedBy="medico",cascade = CascadeType.REMOVE,orphanRemoval=true)
	private List<Paciente> paciente;
	
	

	public Medico() {
		
	}

	public long getMedicoId() {
		return medicoId;
	}

	public void setMedicoId(long medicoId) {
		this.medicoId = medicoId;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCrm() {
		return crm;
	}



	public void setCrm(String crm) {
		this.crm = crm;
	}



	public String getLogradouro() {
		return logradouro;
	}



	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}



	public int getNumero() {
		return numero;
	}



	public void setNumero(int numero) {
		this.numero = numero;
	}



	public String getBairro() {
		return bairro;
	}



	public void setBairro(String bairro) {
		this.bairro = bairro;
	}



	public String getCidade() {
		return cidade;
	}



	public void setCidade(String cidade) {
		this.cidade = cidade;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



	public List<Paciente> getPaciente() {
		return paciente;
	}



	public void setPaciente(List<Paciente> paciente) {
		this.paciente = paciente;
	}



	public Medico(long medicoId, String nome, String crm, String logradouro,
			int numero, String bairro, String cidade, String estado) {
		super();
		this.medicoId = medicoId;
		this.nome = nome;
		this.crm = crm;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}



	public Medico(long medicoId, String nome, String crm, String logradouro,
			int numero, String bairro, String cidade, String estado,
			List<Paciente> paciente) {
		super();
		this.medicoId = medicoId;
		this.nome = nome;
		this.crm = crm;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.paciente = paciente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((crm == null) ? 0 : crm.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result
				+ ((logradouro == null) ? 0 : logradouro.hashCode());
		result = prime * result + (int) (medicoId ^ (medicoId >>> 32));
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numero;
		result = prime * result
				+ ((paciente == null) ? 0 : paciente.hashCode());
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
		Medico other = (Medico) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (crm == null) {
			if (other.crm != null)
				return false;
		} else if (!crm.equals(other.crm))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (logradouro == null) {
			if (other.logradouro != null)
				return false;
		} else if (!logradouro.equals(other.logradouro))
			return false;
		if (medicoId != other.medicoId)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Medico [medicoId=" + medicoId + ", nome=" + nome + ", crm="
				+ crm + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", bairro=" + bairro + ", cidade=" + cidade + ", estado="
				+ estado + ", paciente=" + paciente + "]";
	}

	
	
	
	
}
