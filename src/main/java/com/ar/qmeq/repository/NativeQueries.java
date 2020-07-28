package com.ar.qmeq.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class NativeQueries {

    @Autowired
    EntityManager em;


    public String buildimQuery(String fromdate, String todate, String tipoMaquinaria, List<String> codVenta) {
        String where = "";
        if (fromdate != null && todate != null) {
            where = where + " (im.mes_ano between to_date('" + fromdate + "','YYYY') and to_date('" + todate + "','YYYY'))";
        }

        if (tipoMaquinaria != null) {
            where = where + " and ma.tipo = '" + tipoMaquinaria + "'";
        }

        if (codVenta != null && !codVenta.isEmpty()) {
            String inValue = codVenta.stream().map(v -> "'" + v + "'").collect(Collectors.joining(","));
            where = where + "and  im.cond_venta in (" + inValue + ")";
        }

        String Query = "select jsonb_build_object(an.year , json_object_agg(an.mon,jsonb_build_object('cif',an.cif,'fob',an.fob,'cantidad_declarada',an.cantidad_declarada) ))   from" +
                "(select sum(im.cantidad_declarada) cantidad_declarada , sum(im.fob_total_en_dolares) fob , sum(im.cif) cif, EXTRACT(YEAR FROM im.mes_ano) as year, TO_CHAR(im.mes_ano, 'Mon') mon " +
                "from  importacion_maquinaria im inner join maquinaria ma on ma.id_compuesta=im.maquinaria_id_compuesta where " + where + " group by im.mes_ano) an group by an.year";

        return Query;
    }

    public List<Object> GetMaquinariasNative(String fromdate, String todate, String tipoMaquinaria, List<String> codVenta) {
        return em.createNativeQuery((buildimQuery(fromdate, todate, tipoMaquinaria, codVenta))).getResultList();
    }


}
