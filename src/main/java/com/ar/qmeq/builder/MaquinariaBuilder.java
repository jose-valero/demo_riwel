package com.ar.qmeq.builder;

import com.ar.qmeq.entities.ImportacionMaquinaria;
import com.ar.qmeq.entities.Maquinaria;
import com.ar.qmeq.models.SabanaEnbruto;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashMap;

public class MaquinariaBuilder {

    public static HashMap<String, Maquinaria> maquinarias = new HashMap<String, Maquinaria>();

    private static Maquinaria buildMaquinaria(SabanaEnbruto sabana) {
        Maquinaria maquinaria = new Maquinaria();
        maquinaria.setMarca(sabana.getMarca());
        maquinaria.setModelo(sabana.getModelo());
        maquinaria.setMarca(sabana.getMarca());
        maquinaria.setIdCompuesta(sabana.getMarca() + '-' + sabana.getModelo());


        Maquinaria posibleValue = maquinarias.get(maquinaria.getIdCompuesta());

        if (posibleValue != null) {
            return posibleValue;
        }
        maquinarias.put(maquinaria.getIdCompuesta(), maquinaria);
        return maquinarias.get(maquinaria.getIdCompuesta());

    }

    public static ImportacionMaquinaria BuildIM(SabanaEnbruto sabana) {
        ImportacionMaquinaria imaquinaria = new ImportacionMaquinaria();
        imaquinaria.setAduana(sabana.getAduana());
        imaquinaria.setArancelSIM(sabana.getArancelSIM());
        imaquinaria.setBaseImponible(sabana.getBaseImponible());
        imaquinaria.setCantidadDeclarada(sabana.getCantidadDeclarada());
        imaquinaria.setCondVenta(sabana.getCondVenta());
        imaquinaria.setCantidadEstadistica(sabana.getCantidadEstadStica());
        imaquinaria.setCuit(sabana.getCuit());
        imaquinaria.setDerechosDeImportacion(sabana.getDerechosDeImportacion());
        imaquinaria.setDerechosDeImportacionEnGarantia(sabana.getDerechosDeImportacionEnGarantia());
        imaquinaria.setDespacho(sabana.getDespacho());
        imaquinaria.setDestinacion(sabana.getDestinacion());
        imaquinaria.setDetalle(sabana.getDetalle());
        imaquinaria.setDivisa(sabana.getDivisa());
        imaquinaria.setEstadoDeLaMercaderia(sabana.getEstadoDeLaMercaderia());
        imaquinaria.setFecha_oficializacion(sabana.getFechaOficializacion());
        imaquinaria.setFlete(sabana.getFlete());
        imaquinaria.setFobTotalEnDivisas(sabana.getFobTotalEnDivisas());
        imaquinaria.setFobTotalEnDolares(sabana.getFobTotalEnDolares());
        imaquinaria.setIibb(sabana.getIIBB());
        imaquinaria.setIitemSubitem(sabana.getItemSubitem());
        imaquinaria.setImportador(sabana.getImportadorProb());
        imaquinaria.setImpuestoALasGanancias(sabana.getImpuestoALasGanancias());
        imaquinaria.setImpuestoALasGananciasEnGarantia(sabana.getImpuestoALasGananciasEnGarantia());
        imaquinaria.setIva(sabana.getIVA());
        imaquinaria.setCif(sabana.getCIF());
        imaquinaria.setIvaAdicionalInsc(sabana.getIVAAdicionalInsc());
        imaquinaria.setIvaEnGarantia(sabana.getIVAEnGarania());
        imaquinaria.setBaseImponible(sabana.getBaseImponible());
        imaquinaria.setKgBrutos(sabana.getKgBrutos());
        imaquinaria.setKgNetos(sabana.getKgNetos());
        imaquinaria.setMedio(sabana.getMedio());
        imaquinaria.setMesAno(MaquinariaBuilder.DateFromMesAno(sabana.getMesAno()));
        imaquinaria.setOrigen(sabana.getOrigen());
        imaquinaria.setPaisDeProcedencia(sabana.getPaisDeProcedencia());
        imaquinaria.setPosicion_SIM(sabana.getPosicionSIM());
        imaquinaria.setPrecioUnitarioEnDivisas(sabana.getPrecioUnitarioEnDivisas());
        imaquinaria.setPrecioUnitarioEnDolares(sabana.getPrecioUnitarioEnDolares());
        imaquinaria.setProcentaje_Derechos(sabana.getDerechos());
        imaquinaria.setProcentajeArancelSIM(sabana.getProcentajeArancelSIM());
        imaquinaria.setProcentajeEstadistica(sabana.getProcentajeEstadistica());
        imaquinaria.setProcentajeIIBB(sabana.getProcentajeIIBB());
        imaquinaria.setProcentajeIVA(sabana.getPorcentajeIVA());
        imaquinaria.setProcentajeivaAdicional(sabana.getProcentajeiVAAdicional());
        imaquinaria.setTasaEstadisticaMontoMaximo(sabana.getTasaEstadisticaMontoMaximo());
        imaquinaria.setTasaEstadistica(sabana.getTasaEstadistica());
        imaquinaria.setTransporte(sabana.getTransporte());
        imaquinaria.setUnidadEstadistica(sabana.getUnidadEstaditica());
        imaquinaria.setUnidadDeclarada(sabana.getUnidadDeclarada());
        imaquinaria.setSeguroDolar(sabana.getSeguroDolar());
        imaquinaria.setProcentajeGanancias(sabana.getGanancias());
        imaquinaria.setMaquinaria(MaquinariaBuilder.buildMaquinaria(sabana));
        return imaquinaria;
    }

    public static void cleanSet() {
        maquinarias.clear();
    }

    private static Date DateFromMesAno(String mesAno) {
        int month = 0;
        String[] mesAnoSplit = mesAno.split("-");
        switch (mesAnoSplit[0]) {
            case "ene","01":
                month = 1;
                break;
            case "feb","02":
                month = 2;
                break;
            case "mar","03":
                month = 3;
                break;
            case "abr","04":
                month = 4;
                break;
            case "jun","05":
                month = 5;
                break;
            case "mayo","06":
                month = 6;
                break;
            case "jul","07":
                month = 7;
                break;
            case "ago","08":
                month = 8;
                break;
            case "sep","09":
                month = 9;
                break;
            case "oct","10":
                month = 10;
                break;
            case "nov","11":
                month = 11;
                break;
            case "dic","12":
                month = 12;
                break;
        }
        String year = "";
        if(mesAnoSplit[1].length() == 2) {
            year = "20" + mesAnoSplit[1];
        }else if(mesAnoSplit[1].length() == 4) {
            year = mesAnoSplit[1];
        }else {
            throw new RuntimeException("Fecha en formato distinto");
        }
        Date returnDate = java.sql.Date.valueOf(LocalDate.of(Integer.parseInt(year), month, 1));
        return returnDate;

    }

}
