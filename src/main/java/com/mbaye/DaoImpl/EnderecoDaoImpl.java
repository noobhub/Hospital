/*package com.mbaye.DaoImpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.mbaye.Dao.EnderecoDao;
import com.mbaye.Model.Endereco;

@Repository
public class EnderecoDaoImpl implements EnderecoDao {

	@PersistenceContext
	protected EntityManager entityManager;

	public void inserirEndereco(Endereco endereco) {
		entityManager.persist(endereco);
	}

	@Override
	public void alterarEndereco(Endereco endereco) {
		entityManager.merge(endereco);

	}

	@Override
	public void excluirEndereco(Endereco endereco) {
		entityManager.remove(endereco);

	}

	@Override
	public Endereco buscarEnderecoPorId(Long enderecoId) {
		return entityManager.find(Endereco.class, enderecoId);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Endereco> listarTodoEndereco() {
		Query query = entityManager.createQuery("select e from Endereco e ");
		List<Endereco> resultList = query.getResultList();
		return resultList;
	}

}
*/