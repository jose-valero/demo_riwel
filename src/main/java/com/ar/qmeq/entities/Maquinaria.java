package com.ar.qmeq.entities;

import lombok.Data;

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
    private String version;
    @Column
    private String codigo;
    @Column
    private String presentacion;
    @Column
    private String vencimiento;
    @Column
    private String descripcion;
    @Column
    private String descripcion_NCM;
    @Column
    private String descripcion_SIM;

}
