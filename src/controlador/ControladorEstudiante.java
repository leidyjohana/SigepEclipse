package controlador;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Estudiante;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Textbox;

import servicio.ServicioEstudiante;
import configuracion.ApplicationContextProvider;
@Controller
public class ControladorEstudiante extends SelectorComposer<Component> {
ServicioEstudiante serv = ApplicationContextProvider.getServicioEstudiante();
@Wire
private Textbox txtCedula;
@Wire
private Textbox txtNombre;
@Wire
private Textbox txtApellido;
@Wire
private Textbox ape;

@Listen("onClick = #boton")
	public void toman() {

	String nombre = txtNombre.getValue();
	String apellido = txtApellido.getValue();
	int eda = edad.getValue();
	Estudiante e = new Estudiante(cedula, nombre, apellido, edad, sexo, status);
	serv.guardar(e);
	System.out.println("Listo"+nombre);
	System.out.println("Edad"+eda);
	System.out.println("apellido"+apel);

}
}
