package com.ar.qmeq.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Maquinaria {
    @Id
    private String idCompuesta;
    @Column
    private String marca;
    @Column
    private String modelo;
    @Column
    private String Segmento;
    @Column
    private String china;
    @Column
    private String tipo;
    @Column
    private String traccion;
    //Metros de Carga/Peso operativo/ Profundidad de excavación/PO/HP
    @Column
    private Double PesoOperativo;
    @Column
    private String subCategoria1;
    @Column
    private String subCategoria2;
    @Column
    private String subCategoria3;

}
