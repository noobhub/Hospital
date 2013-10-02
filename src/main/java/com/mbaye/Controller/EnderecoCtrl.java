/*package com.mbaye.Controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mbaye.Model.Endereco;
import com.mbaye.Service.EnderecoService;

@Controller
@Scope("view")
public class EnderecoCtrl implements Serializable {

	*//**
	 * 
	 *//*
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private EnderecoService enderecoService;
	
	private DataModel<Endereco> listarEndereco;//=new ArrayList<Endereco>();
	
	public DataModel<Endereco> getListarEndereco() {
		List<Endereco> lista=enderecoService.listarTodoEndereco();
		listarEndereco=new ListDataModel<Endereco>(lista);
		return listarEndereco;
	}

	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	@PostConstruct
	public void init(){
		    endereco = new Endereco();
		   // listarEndereco=enderecoService.listarTodoEndereco();
	}

	public EnderecoCtrl(){
	}
	
	public void salvar(){
		enderecoService.inserirEndereco(endereco);
	}
	
	public void update(){
		enderecoService.alterarEndereco(endereco);
	}
	
	public void delete(){
		enderecoService.excluirEndereco(endereco);
	}

//	public List<Endereco> getListarEndereco() {
//		return listarEndereco;
//	}
//
//	public void setListarEndereco(List<Endereco> listarEndereco) {
//		this.listarEndereco = listarEndereco;
//	}



}
*/