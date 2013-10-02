/*package com.mbaye.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="ENDERECO")
public class Endereco implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ENDERECO_ID")
	private long enderecoId;
	
	@Column(name="LOGRADOURO",nullable=false)
	private String logradouro;
	
	@Column(name="NUMERO",nullable=false)
	private int numero;
	
	@Column(name="BAIRRO",nullable=true)
	private String bairro;
	
	@Column(name="CIDADE",nullable=false)
	private String cidade;
	
	@Column(name="ESTADO",nullable=false)
	private String estado;
	
	@ManyToMany(mappedBy="endereco")
	private List<Medico> medico=new ArrayList<Medico>(0);
	
	
	@ManyToMany(mappedBy="endereco")
	private List<Paciente> paciente=new ArrayList<Paciente>(0);
	
	public Endereco(){
	}

	public Endereco(long enderecoId, String logradouro, int numero,
			String bairro, String cidade, String estado, List<Medico> medico,
			List<Paciente> paciente) {
		this.enderecoId = enderecoId;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.medico = medico;
		this.paciente = paciente;
	}

	public long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(long enderecoId) {
		this.enderecoId = enderecoId;
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

	public List<Medico> getMedico() {
		return medico;
	}

	public void setMedico(List<Medico> medico) {
		this.medico = medico;
	}

	public List<Paciente> getPaciente() {
		if(paciente==null)
			return new ArrayList<Paciente>();
					
		return paciente;
	}

	public void setPaciente(List<Paciente> paciente) {
		this.paciente = paciente;
	}

	
	
}
*/