package com.ar.qmeq.excel.models;

import com.poiji.annotation.ExcelCell;
import lombok.Data;

@Data
public class ExcelMaquinaria {
    @ExcelCell(1)
    private String marca;
    @ExcelCell(3)
    private String modelo;
    @ExcelCell(6)
    private String tipo;
    @ExcelCell(7)
    private String chinas;
    @ExcelCell(8)
    private String ApplicableCarrierWeight;
    @ExcelCell(9)
    private String Segmento;
}
