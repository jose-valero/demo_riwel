package com.ar.qmeq.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
public class ImportacionMaquinaria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private LocalDate mesAno;
    private String importador;
    private String cuit;
    private String fecha_oficializacion;
    private String destinacion;
    private String despacho;
    private String posicion_SIM;
    private String aduana;
    private String origen;
    private String paisDeProcedencia;
    private String medio;
    private String transporte;
    private String condVenta;
    private Double cif;
    private Double kgNetos;
    private Double KgBrutos;
    private String divisa;
    private Double flete;
    private String cantidadEstadistica;
    private String unidadEstadistica;
    private String unidadDeclarada;
    private Double seguroDolar;
    private String estadoDeLaMercaderia;
    private String iitemSubitem;
    private Double cantidadDeclarada;
    private Double precioUnitarioEnDivisas;
    private Double fobTotalEnDivisas;
    private Double precioUnitarioEnDolares;
    private Double fobTotalEnDolares;
    @ManyToOne(cascade = CascadeType.DETACH)
    private Maquinaria maquinaria;
    private Double baseImponible;
    private Double procentaje_Derechos;
    private Double derechosDeImportacion;
    private Double derechosDeImportacionEnGarantia;
    private Double procentajeEstadistica;
    private Double tasaEstadistica;
    private Double tasaEstadisticaMontoMaximo;
    private Double procentajeIVA;
    private Double iva;
    private Double ivaEnGarantia;
    private Double procentajeivaAdicional;
    private Double ivaAdicionalInsc;
    private Double procentajeIIBB;
    private Double iibb;
    private Double procentajeGanancias;
    private Double impuestoALasGanancias;
    private Double impuestoALasGananciasEnGarantia;
    private Double procentajeArancelSIM;
    private Double arancelSIM;
    private String detalle;
    private Date creationDate = new Date();
}
