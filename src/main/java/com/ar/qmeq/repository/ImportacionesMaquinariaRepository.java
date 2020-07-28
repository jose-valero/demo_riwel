package com.ar.qmeq.repository;

import com.ar.qmeq.entities.ImportacionMaquinaria;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ImportacionesMaquinariaRepository extends CrudRepository<ImportacionMaquinaria, UUID> {


}
