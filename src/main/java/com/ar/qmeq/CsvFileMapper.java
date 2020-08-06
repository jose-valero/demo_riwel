package com.ar.qmeq;

import com.ar.qmeq.models.CSVBruto;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class CsvFileMapper {

    private final CsvMapper mapper = CsvFileMapper.getFileMapper();

    private static CsvMapper getFileMapper() {
        CsvMapper csvMapper = new CsvMapper();
        csvMapper.enable(CsvParser.Feature.IGNORE_TRAILING_UNMAPPABLE);
        csvMapper.disable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
        csvMapper.enable(CsvParser.Feature.TRIM_SPACES);
        return csvMapper;
    }

    public List<CSVBruto> fileTojson(MultipartFile file) {
        CsvSchema bootstrap = CsvSchema.builder()
                .addColumn("Importador (prob.)")
                .addColumn("Cuit")
                .addColumn("Mes/Año")
                .addColumn("Fecha oficialización")
                .addColumn("Vencimiento")
                .addColumn("Base imponible")
                .addColumn("% Derechos")
                .addColumn("Derechos de importación")
                .addColumn("Derechos de importación en garantía")
                .addColumn("% Estadística")
                .addColumn("Tasa estadística")
                .addColumn("Tasa estadistica monto maximo")
                .addColumn("% IVA")
                .addColumn("Importaciones")
                .addColumn("IVA")
                .addColumn("IVA en garantía")
                .addColumn("% IVA adicional")
                .addColumn("IVA adicional insc.")
                .addColumn("% IIBB")
                .addColumn("IIBB")
                .addColumn("% Ganancias")
                .addColumn("Impuesto a las ganancias")
                .addColumn("Impuesto a las ganancias en garantía")
                .addColumn("IVA")
                .addColumn("% Arancel SIM")
                .addColumn("Arancel SIM")
                .addColumn("Código")
                .addColumn("Detalle")
                .addColumn("Destinación")
                .addColumn("Despacho")
                .addColumn("Posición SIM")
                .addColumn("Descripción")
                .addColumn("Descripción NCM")
                .addColumn("Descripción SIM")
                .addColumn("Aduana")
                .addColumn("Origen")
                .addColumn("Pais de procedencia")
                .addColumn("Transporte")
                .addColumn("Cond. venta")
                .addColumn("Kg. netos")
                .addColumn("Kg. Brutos")
                .addColumn("Divisa")
                .addColumn("Pais de procedencia")
                .addColumn("Divisa")
                .addColumn("Flete")
                .addColumn("Cantidad estadística")
                .addColumn("Unidad estadística")
                .addColumn("Unidad declarada")
                .addColumn("Seguro dólar")
                .addColumn("Cantidad estadística")
                .addColumn("Estado de la mercadería")
                .addColumn("Item - sub ítem")
                .addColumn("Cantidad declarada")
                .addColumn("Precio unitario en divisas")
                .addColumn("Fob total en divisas")
                .addColumn("Precio unitario en dólares")
                .addColumn("Fob total en dólares")
                .addColumn("Cantidad estadística")
                .addColumn("CIF")
                .addColumn("Marca")
                .addColumn("Modelo")
                .addColumn("Versión")
                .addColumn("Código")
                .addColumn("Presentación")
                .addColumn("Vencimiento")
                .addColumn("Base imponible")
                .build().withColumnSeparator(';').withColumnReordering(true).withHeader();
        try {
            MappingIterator<CSVBruto> mappingIterator = this.mapper.readerFor(CSVBruto.class).with(bootstrap).readValues(this.getFilebytes(file));
            return mappingIterator.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }

    private String getFilebytes(MultipartFile file) {
        try {
            byte[] bytes = file.getInputStream().readAllBytes();
            return new String(bytes, StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}


