package com.ar.qmeq.models;

import com.ar.qmeq.service.DoubleDeserializer;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CSVBruto {

    @JsonProperty("Importador (prob.)")
    private String importadorProb;
    @JsonProperty("Cuit")
    private String cuit;
    @JsonProperty("Mes/A\u00f1o")
    private String MesAno;
    @JsonProperty("Fecha oficializaci\u00f3n")
    private String fechaOficializacion;
    @JsonProperty("Destinaci\u00f3n")
    private String destinacion;
    @JsonProperty("Despacho")
    private String despacho;
    @JsonProperty("Posici\u00f3n SIM")
    private String posicionSIM;
    @JsonProperty("Descripci\u00f3n")
    private String descripcion;
    @JsonProperty("Descripci\u00f3n NCM")
    private String descripcionNCM;
    @JsonProperty("Descripci\u00f3n SIM")
    private String descripcionSIM;
    @JsonProperty("Aduana")
    private String aduana;
    @JsonProperty("Origen")
    private String origen;
    @JsonProperty("Pais de procedencia")
    private String paisDeProcedencia;
    @JsonProperty("Medio")
    private String medio;
    @JsonProperty("Transporte")
    private String transporte;
    @JsonProperty("Cond. venta")
    private String condVenta;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Kg. netos")
    private Double kgNetos;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Kg. Brutos")
    private Double kgBrutos;
    @JsonProperty("Divisa")
    private String divisa;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Flete")
    private Double flete;
    @JsonProperty("Cantidad estad\u00edstica")
    private String cantidadEstadStica;
    @JsonProperty("Unidad estad\u00edstica")
    private String unidadEstaditica;
    @JsonProperty("Unidad declarada")
    private String unidadDeclarada;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Seguro d\u00f3lar")
    private Double seguroDolar;
    @JsonProperty("Estado de la mercader\u00eda")
    private String estadoDeLaMercaderia;
    @JsonProperty("Item - sub \u00edtem")
    private String itemSubitem;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Cantidad declarada")
    private Double cantidadDeclarada;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Precio unitario en divisas")
    private Double precioUnitarioEnDivisas;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Fob total en divisas")
    private Double fobTotalEnDivisas;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Precio unitario en d\u00f3lares")
    private Double precioUnitarioEnDolares;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Fob total en d\u00f3lares")
    private Double fobTotalEnDolares;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("CIF")
    private Double cIF;
    @JsonProperty("Marca")
    private String marca;
    @JsonProperty("Modelo")
    private String modelo;
    @JsonProperty("Versi\u00f3n")
    private String version;
    @JsonProperty("C\u00f3digo")
    private String codigo;
    @JsonProperty("Presentaci\u00f3n")
    private String presentacion;
    @JsonProperty("Vencimiento")
    private String vencimiento;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Base imponible")
    private Double baseImponible;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% Derechos")
    private Double derechos;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Derechos de importaci\u00f3n")
    private Double derechosDeImportacion;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Derechos de importaci\u00f3n en garant\u00eda")
    private Double derechosDeImportacionEnGarantia;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% Estad\u00edstica")
    private Double procentajeEstadistica;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Tasa estad\u00edstica")
    private Double tasaEstadistica;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Tasa estadistica monto maximo")
    private Double tasaEstadisticaMontoMaximo;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% IVA")
    private Double porcentajeIVA;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("IVA")
    private Double iVA;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("IVA en garant\u00eda")
    private Double iVAEnGarania;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% IVA adicional")
    private Double procentajeiVAAdicional;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("IVA adicional insc.")
    private Double iVAAdicionalInsc;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% IIBB")
    private Double procentajeIIBB;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("IIBB")
    private Double iIBB;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% Ganancias")
    private Double ganancias;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Impuesto a las ganancias")
    private Double impuestoALasGanancias;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Impuesto a las ganancias en garant\u00eda")
    private Double impuestoALasGananciasEnGarantia;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("% Arancel SIM")
    private Double procentajeArancelSIM;
    @JsonDeserialize(using = DoubleDeserializer.class)
    @JsonProperty("Arancel SIM")
    private Double arancelSIM;
    @JsonProperty("Detalle")
    private String detalle;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }
    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
