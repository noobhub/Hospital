package com.mbaye.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="PACIENTE")
public class Paciente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PACIENTE_ID",unique=true,nullable=false)
	private long pacienteId;
	
	@Column(name="PACIENTE_NOME",nullable=false)
	private String nome;
	
	@Temporal(TemporalType.DATE)
	private Date data_nascemento;
	
	@Column(name="PACIENTE_LOGRADOURO",nullable=false)
	private String logradouro;
	
	@Column(name="PACIENTE_NUMERO",nullable=false)
	private int numero;
	
	@Column(name="PACIENTE_BAIRRO",nullable=true)
	private String bairro;
	
	@Column(name="PACIENTE_CIDADE",nullable=false)
	private String cidade;
	
	@Column(name="PACIENTE_ESTADO",nullable=false)
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="medicoId",nullable=false)
	private Medico medico;
	
	public Paciente(){
	}

	public long getPacienteId() {
		return pacienteId;
	}

	public void setPacienteId(long pacienteId) {
		this.pacienteId = pacienteId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascemento() {
		return data_nascemento;
	}


	public void setData_nascemento(Date data_nascemento) {
		this.data_nascemento = data_nascemento;
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

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente(long pacienteId, String nome, Date data_nascemento,
			String logradouro, int numero, String bairro, String cidade,
			String estado) {
		super();
		this.pacienteId = pacienteId;
		this.nome = nome;
		this.data_nascemento = data_nascemento;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}


	public Paciente(long pacienteId, String nome, Date data_nascemento,
			String logradouro, int numero, String bairro, String cidade,
			String estado, Medico medico) {
		super();
		this.pacienteId = pacienteId;
		this.nome = nome;
		this.data_nascemento = data_nascemento;
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.medico = medico;
	}

}