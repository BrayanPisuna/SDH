package com.inventariosecretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.InformePeriferico;
@Repository
public interface InformePerifericoRepository extends CrudRepository<InformePeriferico, Long> {

}
