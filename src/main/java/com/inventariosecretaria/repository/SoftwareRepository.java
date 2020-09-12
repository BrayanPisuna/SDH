package com.inventariosecretaria.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.inventariosecretaria.entity.Software;

@Repository
public interface SoftwareRepository extends CrudRepository<Software, Long> {

}
