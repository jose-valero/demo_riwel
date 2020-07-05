package com.ar.qmeq.repository;

import com.ar.qmeq.entities.Importaciones;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImportacionesRepository extends CrudRepository<Importaciones, UUID> {


}
