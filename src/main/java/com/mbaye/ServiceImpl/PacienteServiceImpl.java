package com.mbaye.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbaye.Dao.PacienteDao;
import com.mbaye.Model.Paciente;
import com.mbaye.Service.PacienteService;

@Service
@Transactional
public class PacienteServiceImpl implements PacienteService, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5730331099453486055L;
	@Autowired
	PacienteDao pacienteDao;

	@Override
	public void inserirPaciente(Paciente paciente) {
		pacienteDao.inserirPaciente(paciente);
		
	}

	@Override
	public void alterarPaciente(Paciente paciente) {
		pacienteDao.alterarPaciente(paciente);
		
	}

	@Override
	public void excluirPaciente(Paciente paciente) {
		paciente=buscarPacientePorId(paciente.getPacienteId());
		pacienteDao.excluirPaciente(paciente);
	}

	@Override
	public Paciente buscarPacientePorId(Long id) {
		return pacienteDao.buscarPacientePorId(id);
	}

	@Override 
	public List<Paciente> listarTodoPaciente() {
		return pacienteDao.listarTodoPaciente();
	}

}
