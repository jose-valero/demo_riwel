package com.ar.qmeq.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class VistaGetMaquinaria {
    private Double cantDeclarada;
    private Double precioUnitarioDolares;
    private Double fobTotalDolares;
    private Double cif;
    private String codVenta;
    private Date mesAno;
}
