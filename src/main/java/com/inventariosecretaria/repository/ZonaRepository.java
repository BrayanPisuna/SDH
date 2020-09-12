package com.inventariosecretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.Zona;

@Repository
public interface ZonaRepository extends CrudRepository<Zona, Long> {

}
