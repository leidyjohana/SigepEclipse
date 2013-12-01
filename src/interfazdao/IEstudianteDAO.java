package interfazdao;


import modelo.Estudiante;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IEstudianteDAO extends JpaRepository<Estudiante, String> {

}

