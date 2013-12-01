package controlador;


import java.util.List;

import modelo.Estudiante;

import org.springframework.stereotype.Controller;
import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listcell;
import org.zkoss.zul.Listitem;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Radio;
import org.zkoss.zul.Radiogroup;
import org.zkoss.zul.Spinner;
import org.zkoss.zul.Textbox;

import servicio.ServicioEstudiante;
import configuracion.ApplicationContextProvider;

@Controller
public class Ejemplo2Controller extends SelectorComposer<Component> {
	ServicioEstudiante serv = ApplicationContextProvider.getServicioEstudiante();

	@Wire
	private Textbox txtCedula, txtNombre, txtApellido;
	@Wire
	private Spinner txtEdad;
	@Wire
	private Radiogroup Sexo;
	@Wire
	private Listbox listado;
	
	@Wire
	private Combobox comboest;
	
	private ListModel<Estudiante> EstudianteModel;
	
	public Ejemplo2Controller(){

	
		List<Estudiante> es = serv.listadoEstudiante();
		comboest.setModel(new ListModelList<Estudiante>(es));
		
	}
	public ListModel<Estudiante> getEstudianteModel() {
		return EstudianteModel;
	}


	public void setEstudianteModel(ListModel<Estudiante> estudianteModel) {
		EstudianteModel = estudianteModel;
	}


	@Listen("onClick = #btnListar")
	public void listadoGeneral() {		
	//	List<Estudiante> es = serv.listadoEstudiante();
		//listado.setModel(new ListModelList<Estudiante>(es));

	}

	
	 @Listen ("onDoubleClicked = #selectedItem")
	  public void seleccionarItem() {
		 txtNombre.setValue("hhhh");
		 Messagebox.show( "s");
	 }
	 
	 
}
