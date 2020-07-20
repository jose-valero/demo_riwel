package com.ar.qmeq.repository;

import com.ar.qmeq.entities.ImportacionMaquinaria;
import com.ar.qmeq.models.VistaGetMaquinaria;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Repository
public interface ImportacionesMaquinariaRepository extends CrudRepository<ImportacionMaquinaria, UUID> {


    @Query(value = " select new com.ar.qmeq.models.VistaGetMaquinaria( sum(m.cantidadDeclarada)  , sum(m.precioUnitarioEnDolares) ," +
            "       sum(m.fobTotalEnDolares) , sum(m.cif), m.condVenta,  m.mesAno) " +
            "from ImportacionMaquinaria m where m.condVenta in (:codventa) and m.maquinaria.tipo = :tipomaquinaria and m.mesAno between :fromdate and :todate group by m.mesAno,m.condVenta")
    List<VistaGetMaquinaria> getMaquinariaDemo(@Param("fromdate") Date fromdate,
                                               @Param("todate") Date todate,
                                               @Param("tipomaquinaria") String tipoMaquinaria,
                                               @Param("codventa") String[] codVenta);




}
