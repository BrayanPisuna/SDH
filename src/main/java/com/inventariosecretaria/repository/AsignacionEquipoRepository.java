package com.inventariosecretaria.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.AsignacionEquipo;

@Repository
public interface AsignacionEquipoRepository extends CrudRepository<AsignacionEquipo, Long> {

	@Query("select e from AsignacionEquipo e where e.idfuncionario.cedula=:cedula")
	List<AsignacionEquipo> filtrocedula(String cedula);

}
