package com.ar.qmeq.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class VistaGetMaquinaria {
    private Double cantDeclarada;
    private Double precioUnitarioDolares;
    private Double fobTotalDolares;
    private Double cif;
    private String codVenta;
    private LocalDate mesAno;
}
