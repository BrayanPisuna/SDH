package com.inventariosecretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.InformeEquipo;

@Repository
public interface InformeEquipoRepository extends CrudRepository<InformeEquipo, Long> {

}
