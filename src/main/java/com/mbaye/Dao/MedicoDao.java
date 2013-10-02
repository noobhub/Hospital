package com.mbaye.Dao;

import java.util.List;

import com.mbaye.Model.Medico;

public interface MedicoDao {
	
	public void inserirMedico(Medico medico);
	
	public void alterarMedico(Medico medico);
	
	public void excluirMedico(Medico medico);
	
	public Medico buscarMedicoPorId(Long id);

	public List<Medico> listarTodoMedico();
	
}
