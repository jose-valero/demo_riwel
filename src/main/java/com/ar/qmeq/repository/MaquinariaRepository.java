package com.ar.qmeq.repository;

import com.ar.qmeq.entities.ImportacionMaquinaria;
import com.ar.qmeq.entities.Maquinaria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface MaquinariaRepository extends CrudRepository <Maquinaria, String> {

    @Query(value = "select distinct m.tipo from maquinaria m", nativeQuery =true )
    List<String> getTipos();
}