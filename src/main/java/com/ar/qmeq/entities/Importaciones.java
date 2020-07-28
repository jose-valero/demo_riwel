package com.ar.qmeq.entities;


import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;


@Data
@Entity
public class Importaciones {

    @Id
    @Type(type = "pg-uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column
    private String importadorProb;
    @Column
    private String cuit;
    @Column
    private String mesAño;
    @Column
    private String fechaOficializacion;
    @Column
    private String destinacion;
    @Column
    private String despacho1;
    @Column
    private String despacho2;
    @Column
    private String descripcion;
    @Column
    private String descripcionNCM;
    @Column
    private String descripcionSIM;
    @Column
    private String aduana;
    @Column
    private String origen;
    @Column
    private String paisProcedencia;
    @Column
    private String medio;
    @Column
    private String transporte;
    @Column
    private String condVenta;
    @Column
    private Double kgNetos;
    @Column
    private Double kgBrutos;
    @Column
    private String divisa;
    @Column
    private Double flete;
    @Column
    private Long cantidadEstadistica;
    @Column
    private String unidadEstadistica;
    @Column
    private String unidadDeclarada;
    @Column
    private Double seguroDolar;
    @Column
    private String estadoMercaderia;
    @Column
    private String itemSubitem;
    @Column
    private Long cantidadDeclarada;
    @Column
    private Double precioUnitarioDivisas;
    @Column
    private Double FOBTotalDivisas;
    @Column
    private Double precioUnitarioDolares;
    @Column
    private Double FOBTotalDolares;
    @Column
    private Double CIF;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String version;
    @Column
    private String codigo1;
    @Column
    private String presentacion;
    @Column
    private String vencimiento;
    @Column
    private Double baseImponible;
    @Column
    private Double porcDerechos;
    @Column
    private Long derechosImportacion;
    @Column
    private Long derechosImportancionGarantia;
    @Column
    private Double porcEstadistica;
    @Column
    private Double tasaEstadistica;
    @Column
    private Double tasaEstadisticaMontoMaximo;
    @Column
    private Double porcIva;
    @Column
    private Double iva;
    @Column
    private Double ivaGarantia;
    @Column
    private Double porcIvaAdicional;
    @Column
    private Double ivaAdicionalInsc;
    @Column
    private Double porcIibb;
    @Column
    private Double iibb;
    @Column
    private Double porcGanacias;
    @Column
    private Double impuestosGanacias;
    @Column
    private Double impuestosGanaciasGarantia;
    @Column
    private Double porcAranselSim;
    @Column
    private Double AranselSim;
    @Column
    private String codigo2;
    @Column
    private String detalle;


}





