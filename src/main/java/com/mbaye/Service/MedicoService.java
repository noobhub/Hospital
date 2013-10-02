package com.mbaye.Service;

import java.util.List;

import com.mbaye.Model.Medico;

public interface MedicoService {
	
	public void inserirMedico(Medico medico);
	
	public void alterarMedico(Medico Medico);
	
	public void excluirMedico(Medico medico);
	
	public Medico buscarMedicoPorId(Long id);

	public List<Medico> listarTodoMedico();

}
