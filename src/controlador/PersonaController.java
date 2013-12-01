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
public class PersonaController extends SelectorComposer<Component> {
	ServicioEstudiante serv = ApplicationContextProvider.getServicioEstudiante();

	@Wire
	private Textbox txtCedula, txtNombre, txtApellido;
	@Wire
	private Spinner txtEdad;
	@Wire
	private Radiogroup Sexo;
	@Wire
	private Listbox listado;
	
	
	@Listen("onClick = #btnAgregar")
	public void toman() {

		String cedula= txtCedula.getValue();
		String nombre = txtNombre.getValue();
		String apellido = txtApellido.getValue();
		int edad = Integer.valueOf(txtEdad.getText());
		String sexo = Sexo.getSelectedItem().getLabel();
		char status = '1';
		//	Boolean estadoEliminacion = true;
		Estudiante e = new Estudiante (cedula, nombre, apellido, edad, sexo, status);
		serv.guardar(e);
		List<Estudiante> es = serv.listadoEstudiante();
		listado.setModel(new ListModelList<Estudiante>(es));
		limpiarFormulario();
		System.out.println("Listo" + nombre);
		System.out.println("Nombre:" + nombre);
		System.out.println("Apellido:" + apellido);
		System.out.println("Edad:" + edad);
		System.out.println("Sexo:" + sexo);
	}
	

	@Listen("onClick = #btnEliminar")
	public void eliminarEstudiante() {

	String cedula = txtCedula.getValue();
	String nombre = txtNombre.getValue();
	String apellido = txtApellido.getValue();
	int edad = txtEdad.getValue();
	String sexo = Sexo.getSelectedItem().getLabel();
	char status = '0';
	Estudiante e = new Estudiante(cedula, nombre, apellido, edad, sexo, status);
	serv.borrar(e);
	
	List<Estudiante> es = serv.listadoEstudiante();
	listado.setModel(new ListModelList<Estudiante>(es));
	System.out.println("Estudiante Eliminado");
	limpiarFormulario();
	}

	@Listen("onClick = #boton3")
	public void limpiarFormulario() {

		txtCedula.setValue("");
		txtNombre.setValue("");
		txtApellido.setValue("");
		txtEdad.setValue(1);
		Sexo.setSelectedItem(null);
	}
	
	 @Listen ("onDoubleClicked = #selectedItem")
	  public void seleccionarItem() {
		 txtNombre.setValue("hhhh");
		 Messagebox.show( "s");
	 }
	//public void onClick$btnAgregar(){
		//Listitem g = new Listitem();
		//g.appendChild(new Listcell(txtNombre.getValue()));
		//g.appendChild(new Listcell(txtApellido.getValue()));
		//g.appendChild(new Listcell(txtEdad.getText()));
		//g.appendChild(new Listcell(sexo.getSelectedItem().getLabel()));
		//listado.appendChild(g);
		
	//}
}
