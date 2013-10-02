package com.mbaye.ServiceImpl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbaye.Dao.MedicoDao;
import com.mbaye.Model.Medico;
import com.mbaye.Service.MedicoService;

@Service
@Transactional
public class MedicoServiceImpl implements MedicoService, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2830730233007301090L;
	@Autowired
	MedicoDao medicoDao;
	/*@Autowired
	EnderecoDao enderecoDao;*/
	@Override
	public void inserirMedico(Medico medico) {
		medicoDao.inserirMedico(medico);

	}

	@Override
	public void alterarMedico(Medico medico) {

		medicoDao.alterarMedico(medico);
		 	      
	}

	@Override
	public void excluirMedico(Medico medico) {
		medico = buscarMedicoPorId(medico.getMedicoId());
		medicoDao.excluirMedico(medico);

	}

	@Override
	public Medico buscarMedicoPorId(Long id) {
		return medicoDao.buscarMedicoPorId(id);
	}

	@Override
	public List<Medico> listarTodoMedico() {
		return medicoDao.listarTodoMedico();
	}

}
