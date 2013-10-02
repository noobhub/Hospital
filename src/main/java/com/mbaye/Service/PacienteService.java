package com.mbaye.Service;

import java.util.List;

import com.mbaye.Model.Paciente;

public interface PacienteService {
	
	public void inserirPaciente(Paciente paciente);
	
	public void alterarPaciente(Paciente paciente);
	
	public void excluirPaciente(Paciente paciente);
	
	public Paciente buscarPacientePorId(Long id);

	public List<Paciente> listarTodoPaciente();


}
