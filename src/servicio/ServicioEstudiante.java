package servicio;

import java.util.List;

import modelo.Estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.zkoss.bind.annotation.Command;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;

import interfazdao.IEstudianteDAO;
@Service
public class ServicioEstudiante {
@Autowired
private IEstudianteDAO e;

public void guardar(Estudiante es){
	e.save(es);
}
public void borrar(Estudiante es) {
    e.delete(es);
}    


@Command
 public void onDoubleClicked() {
 Messagebox.show( "s");
}

    
public List<Estudiante> listadoEstudiante() {
	return e.findAll();
	//@Query
	
}


//public List<Estudiante> findByEstatus(Estatus estatus)

}


