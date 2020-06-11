package com.ar.qmeq.sample1.repository;

import com.ar.qmeq.sample1.entities.Importaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImportacionesRepository extends CrudRepository<Importaciones, UUID> {


}
