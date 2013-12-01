package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estudiante")
public class Estudiante {
private String cedula;
private String nombre;
private String apellido;
private int edad;
private String sexo;
private char status;




public Estudiante(String cedula, String nombre, String apellido, int edad, String sexo, char status) {
	super();
	this.cedula = cedula;
	this.nombre = nombre;
	this.apellido = apellido;
	this.edad = edad;
	this.sexo = sexo;
	this.status = status;
	
}



public Estudiante() {
	super();
	// TODO Auto-generated constructor stub
}
@Id
@Column(name="cedula")
public String getCedula() {
	return cedula;
}

public void setCedula(String cedula) {
	this.cedula= cedula;
}

@Column(name="nombre")
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

@Column(name="apellido")
public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

@Column(name="edad")
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}

public String getSexo() {
	return sexo;
}

/**
 * @param sexo the sexo to set
 */
public void setSexo(String sexo) {
	this.sexo = sexo;
}



/**
 * @return the status
 */
public char getStatus() {
	return status;
}



/**
 * @param status the status to set
 */
public void setStatus(char status) {
	this.status = status;
}

}
