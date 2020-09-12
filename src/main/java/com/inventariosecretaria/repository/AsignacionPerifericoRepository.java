package com.inventariosecretaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.AsignacionPeriferico;

@Repository
public interface AsignacionPerifericoRepository extends CrudRepository<AsignacionPeriferico, Long> {

	@Query("select e from AsignacionPeriferico e where e.idfuncionario.cedula=:cedula")
	List<AsignacionPeriferico> filtrarcedula(String cedula);
	
}
