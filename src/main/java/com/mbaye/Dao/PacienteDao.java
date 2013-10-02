package com.mbaye.Dao;

import java.util.List;

import com.mbaye.Model.Paciente;


public interface PacienteDao {
	
	public void inserirPaciente(Paciente paciente);
	
	public void alterarPaciente(Paciente paciente);
	
	public void excluirPaciente(Paciente paciente);
	
	public Paciente buscarPacientePorId(Long id);

	public List<Paciente> listarTodoPaciente();

}
