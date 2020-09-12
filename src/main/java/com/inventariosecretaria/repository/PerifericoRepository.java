package com.inventariosecretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.Periferico;
@Repository
public interface PerifericoRepository extends CrudRepository<Periferico,Long> {

}
