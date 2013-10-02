package com.mbaye.Controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mbaye.Model.Medico;
import com.mbaye.Service.MedicoService;

@Controller("medicoCtrl")
@Scope("view")
public class MedicoCtrl implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	private MedicoService medicoService;

	private Medico medico;

	private DataModel<Medico> listarMedico;



	public void preparareEditar(Medico medico) {
		setMedico(medicoService.buscarMedicoPorId(medico.getMedicoId()));

	}

	public void salvar() {
		medicoService.inserirMedico(medico);
		medico = new Medico();
	}

	public void delete(Medico medico) {
		medicoService.excluirMedico(medico);
	}

	public void update() {
		medicoService.alterarMedico(medico);
	}

	public void crearMedico() {
		medico = new Medico();
	}
	
	public DataModel<Medico> getListarMedico() {
		List<Medico> lista = medicoService.listarTodoMedico();
		listarMedico = new MedicoDataModel(lista);
		return listarMedico;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		if (medico == null)
			medico = new Medico();
		this.medico = medico;
	}

	public List<Medico> getAll() {
		return medicoService.listarTodoMedico();
	}
	
	class MedicoDataModel extends ListDataModel<Medico> implements
			SelectableDataModel<Medico> {
		public MedicoDataModel(List<Medico> list) {
			super(list);
		}

		@SuppressWarnings("unchecked")
		@Override
		public Medico getRowData(String arg0) {

			List<Medico> list = (List<Medico>) getWrappedData();
			long medicoId = Long.parseLong(arg0);
			for (Medico medico : list) {
				if (medico.getMedicoId() == medicoId)
					return medico;
			}
			return null;
		}

		@Override
		public Object getRowKey(Medico arg0) {
			if (arg0 == null)
				return null;

			return arg0.getMedicoId();
		}
	}

}
