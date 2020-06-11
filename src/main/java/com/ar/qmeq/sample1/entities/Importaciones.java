package com.ar.qmeq.sample1.entities;


import com.fasterxml.jackson.annotation.JsonSetter;

import javax.persistence.*;
import java.util.UUID;


@SuppressWarnings("ALL")
@Entity
public class Importaciones {

    @Id
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


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getImportadorProb() {
        return importadorProb;
    }

    public void setImportadorProb(String importadorProb) {
        this.importadorProb = importadorProb;
    }

    public String getCuit() {
        return cuit;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public String getMesAño() {
        return mesAño;
    }

    public void setMesAño(String mesAño) {
        this.mesAño = mesAño;
    }

    public String getFechaOficializacion() {
        return fechaOficializacion;
    }

    public void setFechaOficializacion(String fechaOficializacion) {
        this.fechaOficializacion = fechaOficializacion;
    }

    public String getDestinacion() {
        return destinacion;
    }

    public void setDestinacion(String destinacion) {
        this.destinacion = destinacion;
    }

    public String getDespacho1() {
        return despacho1;
    }

    public void setDespacho1(String despacho1) {
        this.despacho1 = despacho1;
    }

    public String getDespacho2() {
        return despacho2;
    }

    public void setDespacho2(String despacho2) {
        this.despacho2 = despacho2;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcionNCM() {
        return descripcionNCM;
    }

    public void setDescripcionNCM(String descripcionNCM) {
        this.descripcionNCM = descripcionNCM;
    }

    public String getDescripcionSIM() {
        return descripcionSIM;
    }

    public void setDescripcionSIM(String descripcionSIM) {
        this.descripcionSIM = descripcionSIM;
    }

    public String getAduana() {
        return aduana;
    }

    public void setAduana(String aduana) {
        this.aduana = aduana;
    }

    public String getOrigen() { return origen; }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public void setPaisProcedencia(String paisProcedencia) {
        this.paisProcedencia = paisProcedencia;
    }

    public String getMedio() {
        return medio;
    }

    public void setMedio(String medio) {
        this.medio = medio;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getCondVenta() {
        return condVenta;
    }

    public void setCondVenta(String condVenta) {
        this.condVenta = condVenta;
    }

    public Double getKgNetos() {
        return kgNetos;
    }

    public void setKgNetos(Double kgNetos) {
        this.kgNetos = kgNetos;
    }

    public Double getKgBrutos() {
        return kgBrutos;
    }

    public void setKgBrutos(Double kgBrutos) {
        this.kgBrutos = kgBrutos;
    }

    public String getDivisa() {
        return divisa;
    }

    public void setDivisa(String divisa) {
        this.divisa = divisa;
    }

    public Double getFlete() {
        return flete;
    }

    public void setFlete(Double flete) {
        this.flete = flete;
    }

    public Long getCantidadEstadistica() {
        return cantidadEstadistica;
    }

    public void setCantidadEstadistica(Long cantidadEstadistica) {
        this.cantidadEstadistica = cantidadEstadistica;
    }

    public String getUnidadEstadistica() {
        return unidadEstadistica;
    }

    public void setUnidadEstadistica(String unidadEstadistica) {
        this.unidadEstadistica = unidadEstadistica;
    }

    public String getUnidadDeclarada() {
        return unidadDeclarada;
    }

    public void setUnidadDeclarada(String unidadDeclarada) {
        this.unidadDeclarada = unidadDeclarada;
    }

    public Double getSeguroDolar() {
        return seguroDolar;
    }

    public void setSeguroDolar(Double seguroDolar) {
        this.seguroDolar = seguroDolar;
    }

    public String getEstadoMercaderia() {
        return estadoMercaderia;
    }

    public void setEstadoMercaderia(String estadoMercaderia) {
        this.estadoMercaderia = estadoMercaderia;
    }

    public String getItemSubitem() {
        return itemSubitem;
    }

    public void setItemSubitem(String itemSubitem) {
        this.itemSubitem = itemSubitem;
    }

    public Long getCantidadDeclarada() {
        return cantidadDeclarada;
    }

    public void setCantidadDeclarada(Long cantidadDeclarada) {
        this.cantidadDeclarada = cantidadDeclarada;
    }

    public Double getPrecioUnitarioDivisas() {
        return precioUnitarioDivisas;
    }

    public void setPrecioUnitarioDivisas(Double precioUnitarioDivisas) {
        this.precioUnitarioDivisas = precioUnitarioDivisas;
    }

    public Double getFOBTotalDivisas() {
        return FOBTotalDivisas;
    }

    @JsonSetter("fobtotal_divisas")
    public void setFOBTotalDivisas(Double FOBTotalDivisas) {
        this.FOBTotalDivisas = FOBTotalDivisas;
    }

    public Double getPrecioUnitarioDolares() {
        return precioUnitarioDolares;
    }

    public void setPrecioUnitarioDolares(Double precioUnitarioDolares) {
        this.precioUnitarioDolares = precioUnitarioDolares;
    }

    public Double getFOBTotalDolares() {
        return FOBTotalDolares;
    }

    @JsonSetter("fobtotal_dolares")
    public void setFOBTotalDolares(Double FOBTotalDolares) {
        this.FOBTotalDolares = FOBTotalDolares;
    }

    public Double getCIF() {
        return CIF;
    }

    public void setCIF(Double CIF) {
        this.CIF = CIF;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getCodigo1() {
        return codigo1;
    }

    public void setCodigo1(String codigo1) {
        this.codigo1 = codigo1;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public Double getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(Double baseImponible) {
        this.baseImponible = baseImponible;
    }

    public Double getPorcDerechos() {
        return porcDerechos;
    }

    @JsonSetter("porcDerechos")
    public void setPorcDerechos(Double porcDerechos) {
        this.porcDerechos = porcDerechos;
    }

    public Long getDerechosImportacion() {
        return derechosImportacion;
    }

    public void setDerechosImportacion(Long derechosImportacion) {
        this.derechosImportacion = derechosImportacion;
    }

    public Long getDerechosImportancionGarantia() {
        return derechosImportancionGarantia;
    }

    public void setDerechosImportancionGarantia(Long derechosImportancionGarantia) {
        this.derechosImportancionGarantia = derechosImportancionGarantia;
    }

    public Double getPorcEstadistica() {
        return porcEstadistica;
    }

    public void setPorcEstadistica(Double porcEstadistica) {
        this.porcEstadistica = porcEstadistica;
    }

    public Double getTasaEstadistica() {
        return tasaEstadistica;
    }

    public void setTasaEstadistica(Double tasaEstadistica) {
        this.tasaEstadistica = tasaEstadistica;
    }

    public Double getTasaEstadisticaMontoMaximo() {
        return tasaEstadisticaMontoMaximo;
    }

    public void setTasaEstadisticaMontoMaximo(Double tasaEstadisticaMontoMaximo) {
        this.tasaEstadisticaMontoMaximo = tasaEstadisticaMontoMaximo;
    }

    public Double getPorcIva() {
        return porcIva;
    }

    public void setPorcIva(Double porcIva) {
        this.porcIva = porcIva;
    }

    public Double getIva() {
        return iva;
    }

    public void setIva(Double iva) {
        this.iva = iva;
    }

    public Double getIvaGarantia() {
        return ivaGarantia;
    }

    public void setIvaGarantia(Double ivaGarantia) {
        this.ivaGarantia = ivaGarantia;
    }

    public Double getPorcIvaAdicional() {
        return porcIvaAdicional;
    }

    public void setPorcIvaAdicional(Double porcIvaAdicional) {
        this.porcIvaAdicional = porcIvaAdicional;
    }

    public Double getIvaAdicionalInsc() {
        return ivaAdicionalInsc;
    }

    public void setIvaAdicionalInsc(Double ivaAdicionalInsc) {
        this.ivaAdicionalInsc = ivaAdicionalInsc;
    }

    public Double getPorcIibb() {
        return porcIibb;
    }

    public void setPorcIibb(Double porcIibb) {
        this.porcIibb = porcIibb;
    }

    public Double getIibb() {
        return iibb;
    }

    public void setIibb(Double iibb) {
        this.iibb = iibb;
    }

    public Double getPorcGanacias() {
        return porcGanacias;
    }

    public void setPorcGanacias(Double porcGanacias) {
        this.porcGanacias = porcGanacias;
    }

    public Double getImpuestosGanacias() {
        return impuestosGanacias;
    }

    public void setImpuestosGanacias(Double impuestosGanacias) {
        this.impuestosGanacias = impuestosGanacias;
    }

    public Double getImpuestosGanaciasGarantia() {
        return impuestosGanaciasGarantia;
    }

    public void setImpuestosGanaciasGarantia(Double impuestosGanaciasGarantia) {
        this.impuestosGanaciasGarantia = impuestosGanaciasGarantia;
    }

    public Double getPorcAranselSim() {
        return porcAranselSim;
    }

    public void setPorcAranselSim(Double porcAranselSim) {
        this.porcAranselSim = porcAranselSim;
    }

    public Double getAranselSim() {
        return AranselSim;
    }

    @JsonSetter("AranselSim")
    public void setAranselSim(Double aranselSim) {
        AranselSim = aranselSim;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getCodigo2() {
        return codigo2;
    }

    public void setCodigo2(String codigo2) {
        this.codigo2 = codigo2;
    }
}





