package com.mbaye.DaoImpl;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mbaye.Dao.MedicoDao;
import com.mbaye.Model.Medico;

@Repository
public class MedicoDaoImpl implements MedicoDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6986637703022446606L;
	@PersistenceContext
	protected EntityManager entityManager;

	@Override
	public void inserirMedico(Medico medico) {
		entityManager.persist(medico);
	}

	@Override
	public void alterarMedico(Medico medico) {
		entityManager.merge(medico);
	}

	@Override
	public void excluirMedico(Medico medico) {
		entityManager.remove(medico);
	}

	@Override
	public Medico buscarMedicoPorId(Long medicoId) {
		return entityManager.find(Medico.class, medicoId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Medico> listarTodoMedico() {
		Query query = entityManager.createQuery("select m from Medico m ");
		List<Medico> resultList = query.getResultList();
		return resultList;
	}

}
