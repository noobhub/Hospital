package com.mbaye.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mbaye.Dao.PacienteDao;
import com.mbaye.Model.Paciente;

@Repository
public class PacienteDaoImpl implements PacienteDao {
	@PersistenceContext
	protected EntityManager entityManager;
	
	@Override
	public void inserirPaciente(Paciente paciente) {
			entityManager.persist(paciente);
	}

	@Override
	public void alterarPaciente(Paciente paciente) {
		entityManager.merge(paciente);
	}

	@Override
	public void excluirPaciente(Paciente paciente) {
		entityManager.remove(paciente);
	}

	@Override
	public Paciente buscarPacientePorId(Long pacienteId) {
		return entityManager.find(Paciente.class,pacienteId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Paciente> listarTodoPaciente() {
		Query query=entityManager.createQuery("select p from Paciente p ");
		List<Paciente> resultList=query.getResultList();
		return resultList;
	}

}
