package com.mbaye.Controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.mbaye.Model.Medico;
import com.mbaye.Model.Paciente;
import com.mbaye.Service.MedicoService;
import com.mbaye.Service.PacienteService;

@Controller
@Scope("view")
public class PacienteCtrl implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5911364552534668828L;
	@Autowired
	private PacienteService pacienteService;
	@Autowired
	private MedicoService medicoService;

	private Paciente paciente;

	private DataModel<Paciente> listarPaciente;

	

	private MedicoDataModel listarMedico;


	@PostConstruct
	public void init() {
		paciente = new Paciente();
		List<Medico> lista = medicoService.listarTodoMedico();
		listarMedico = new MedicoDataModel(lista);
	}

	public void salvar() {
		if (paciente != null) {
			if (paciente.getPacienteId() != 0) {
				pacienteService.alterarPaciente(paciente);
			} else {
				pacienteService.inserirPaciente(paciente);
			}
		}
		init();

	}

	public void update() {
		pacienteService.alterarPaciente(paciente);
	}

	public void delete(Paciente paciente) {
		paciente.setMedico(null);
		pacienteService.excluirPaciente(paciente);
	}

	public void preparareEditar(Paciente paciente) {
		setPaciente(pacienteService.buscarPacientePorId(paciente
				.getPacienteId()));

	}

	/* Getter Setter */
	public Paciente getPaciente() {
		if (paciente == null)
			paciente = new Paciente();
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	public DataModel<Paciente> getListarPaciente() {
		List<Paciente> lista = pacienteService.listarTodoPaciente();
		listarPaciente = new PacienteDataModel(lista);
		return listarPaciente;
	}

	public MedicoDataModel getListarMedico() {
		return listarMedico;
	}
	class PacienteDataModel extends ListDataModel<Paciente> implements
			SelectableDataModel<Paciente>, Serializable {

		private static final long serialVersionUID = -881832087214823526L;

		public PacienteDataModel(List<Paciente> list) {
			super(list);
		}

		@SuppressWarnings("unchecked")
		@Override
		public Paciente getRowData(String arg0) {

			List<Paciente> list = (List<Paciente>) getWrappedData();
			long pacienteId = Long.parseLong(arg0);
			for (Paciente paciente : list) {
				if (paciente.getPacienteId() == pacienteId)
					return paciente;
			}
			return null;
		}

		@Override
		public Object getRowKey(Paciente arg0) {
			if (arg0 == null)
				return null;

			return arg0.getPacienteId();
		}
	}

	public void setListarMedico(MedicoDataModel listarMedico) {
		this.listarMedico = listarMedico;
	}

	class MedicoDataModel extends ListDataModel<Medico> implements
			SelectableDataModel<Medico>, Serializable {
		private static final long serialVersionUID = 6606355309376014178L;

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