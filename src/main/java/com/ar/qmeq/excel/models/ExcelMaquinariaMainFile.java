package com.ar.qmeq.excel.models;

import com.poiji.annotation.ExcelCell;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExcelMaquinariaMainFile {

    @ExcelCell(0)
    private String marca;
    @ExcelCell(2)
    private String modelo;
    @ExcelCell(5)
    private String tipo;
    @ExcelCell(6)
    private String china;
    @ExcelCell(7)
    private String subCategoria1;
    @ExcelCell(8)
    private String subCategoria2;
    @ExcelCell(9)
    private String subCategoria3;
    @ExcelCell(10) //Metros de Carga/Peso operativo/ Profundidad de excavación/PO/HP
    private Double applicableCarrierWeight;
    @ExcelCell(11)
    private String segmento;
    @ExcelCell(12)
    private String traccion;
}
