/*package com.mbaye.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mbaye.Dao.EnderecoDao;
import com.mbaye.Model.Endereco;
import com.mbaye.Service.EnderecoService;

@Service
@Transactional
public class EnderecoServiceImpl implements EnderecoService {
	
	@Autowired
	EnderecoDao enderecoDao;

	@Override
	public void inserirEndereco(Endereco endereco) {
		enderecoDao.inserirEndereco(endereco);
	}

	@Override
	public void alterarEndereco(Endereco endereco) {
		enderecoDao.alterarEndereco(endereco);
	}

	@Override
	public void excluirEndereco(Endereco endereco) {
		enderecoDao.excluirEndereco(endereco);
	}

	@Override
	public Endereco buscarEnderecoPorId(Long id) {
		return enderecoDao.buscarEnderecoPorId(id);
	}

	@Override
	public List<Endereco> listarTodoEndereco() {
		return enderecoDao.listarTodoEndereco();
	}
	

}
*/