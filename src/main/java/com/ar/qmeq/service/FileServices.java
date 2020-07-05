package com.ar.qmeq.service;

import com.ar.qmeq.entities.Importaciones;
import com.ar.qmeq.repository.ImportacionesRepository;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;


@Service
public class FileServices {
    @Autowired
    ImportacionesRepository sabanaRepository;

    public void readFileService(MultipartFile file) {

        Workbook workbook = null;
        InputStream fis = null;
        ArrayList<Importaciones> arrayMaster = new ArrayList<>();

        try {
            fis = file.getInputStream();
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> iterator = sheet.rowIterator();
        while (iterator.hasNext()) {
            Row oneRow = iterator.next();
            System.out.println("the row is:" + oneRow.getRowNum());
            if (oneRow.getCell(0).getStringCellValue().equals("Importador (prob.)")) {
                continue;
            }

            oneRow.cellIterator().forEachRemaining(cell -> {
                cell.setCellType(CellType.STRING);
            });

            Importaciones sabana = new Importaciones();
            sabana.setImportadorProb(oneRow.getCell(0)== null? "falta el dato" :oneRow.getCell(0).getStringCellValue());
            sabana.setCuit(oneRow.getCell(1)== null? "falta el dato" :oneRow.getCell(1).getStringCellValue());
            sabana.setMesAño(oneRow.getCell(2)== null? "falta el dato" :oneRow.getCell(2).getStringCellValue());
            sabana.setFechaOficializacion(oneRow.getCell(3)== null? "falta el dato" :oneRow.getCell(3).getStringCellValue());
            sabana.setDestinacion(oneRow.getCell(4)== null? "falta el dato" :oneRow.getCell(4).getStringCellValue());
            sabana.setDespacho1(oneRow.getCell(5)== null? "falta el dato" :oneRow.getCell(5).getStringCellValue());
            sabana.setDespacho2(oneRow.getCell(6)== null? "falta el dato" :oneRow.getCell(6).getStringCellValue());
            sabana.setDescripcion(oneRow.getCell(7)== null? "falta el dato" :oneRow.getCell(7).getStringCellValue());
            sabana.setDescripcionNCM(oneRow.getCell(8)== null? "falta el dato" :oneRow.getCell(8).getStringCellValue());
            sabana.setDescripcionSIM(oneRow.getCell(9)== null? "falta el dato" :oneRow.getCell(9).getStringCellValue());
            sabana.setAduana(oneRow.getCell(10)== null? "falta el dato" :oneRow.getCell(10).getStringCellValue());
            sabana.setOrigen(oneRow.getCell(11)== null? "falta el dato" :oneRow.getCell(11).getStringCellValue());
            sabana.setPaisProcedencia(oneRow.getCell(12)== null? "falta el dato" :oneRow.getCell(12).getStringCellValue());
            sabana.setMedio(oneRow.getCell(13)== null? "falta el dato" :oneRow.getCell(13).getStringCellValue());
            sabana.setTransporte(oneRow.getCell(14)== null? "En Blanco" :oneRow.getCell(14).getStringCellValue());
            sabana.setCondVenta(oneRow.getCell(15)== null? "En Blanco" :oneRow.getCell(15).getStringCellValue());
            sabana.setKgNetos(Double.parseDouble(oneRow.getCell(16)== null? "falta el dato" :oneRow.getCell(16).getStringCellValue()));
            sabana.setKgBrutos(Double.parseDouble(oneRow.getCell(17)== null? "falta el dato" :oneRow.getCell(17).getStringCellValue()));
            sabana.setDivisa(oneRow.getCell(18)== null? "falta el dato" :oneRow.getCell(18).getStringCellValue());
            sabana.setFlete(Double.parseDouble(oneRow.getCell(19)== null? "falta el dato" :oneRow.getCell(19).getStringCellValue()));
            sabana.setCantidadEstadistica(Long.parseLong(oneRow.getCell(20)== null? "falta el dato" :oneRow.getCell(20).getStringCellValue()));
            sabana.setUnidadEstadistica(oneRow.getCell(21)== null? "falta el dato" :oneRow.getCell(21).getStringCellValue());
            sabana.setUnidadDeclarada(oneRow.getCell(22)== null? "falta el dato" :oneRow.getCell(22).getStringCellValue());
            sabana.setSeguroDolar(Double.parseDouble(oneRow.getCell(23)== null? "falta el dato" :oneRow.getCell(23).getStringCellValue()));
            sabana.setEstadoMercaderia(oneRow.getCell(24)== null? "falta el dato" :oneRow.getCell(24).getStringCellValue());
            sabana.setItemSubitem(oneRow.getCell(25)== null? "falta el dato" :oneRow.getCell(25).getStringCellValue());
            sabana.setCantidadDeclarada(Long.parseLong(oneRow.getCell(26)== null? "falta el dato" :oneRow.getCell(26).getStringCellValue()));
            sabana.setPrecioUnitarioDivisas(Double.parseDouble(oneRow.getCell(27)== null? "falta el dato" :oneRow.getCell(27).getStringCellValue()));
            sabana.setFOBTotalDivisas(Double.parseDouble(oneRow.getCell(28)== null? "falta el dato" :oneRow.getCell(28).getStringCellValue()));
            sabana.setPrecioUnitarioDolares(Double.parseDouble(oneRow.getCell(29)== null? "falta el dato" :oneRow.getCell(29).getStringCellValue()));
            sabana.setFOBTotalDolares(Double.parseDouble(oneRow.getCell(30)== null? "falta el dato" :oneRow.getCell(30).getStringCellValue()));
            sabana.setCIF(Double.parseDouble(oneRow.getCell(31)== null? "falta el dato" :oneRow.getCell(31).getStringCellValue()));
            sabana.setMarca(oneRow.getCell(32)== null? "falta el dato" :oneRow.getCell(32).getStringCellValue());
            sabana.setModelo(oneRow.getCell(33)== null? "falta el dato" :oneRow.getCell(33).getStringCellValue());
            sabana.setVersion(oneRow.getCell(34)== null? "falta el dato" :oneRow.getCell(34).getStringCellValue());
            sabana.setCodigo1(oneRow.getCell(35)== null? "falta el dato" :oneRow.getCell(35).getStringCellValue());
            sabana.setPresentacion(oneRow.getCell(36)== null? "falta el dato" :oneRow.getCell(36).getStringCellValue());
            sabana.setVencimiento(oneRow.getCell(37)== null? "falta el dato" :oneRow.getCell(37).getStringCellValue());
            sabana.setBaseImponible(Double.parseDouble(oneRow.getCell(38) == null? "0" :oneRow.getCell(38).getStringCellValue()));
            sabana.setPorcDerechos(Double.parseDouble(oneRow.getCell(39)== null? "0" :oneRow.getCell(39).getStringCellValue()));
            sabana.setDerechosImportacion(Long.parseLong(oneRow.getCell(40)== null? "0" :oneRow.getCell(40).getStringCellValue()));
            sabana.setDerechosImportancionGarantia(Long.parseLong(oneRow.getCell(41)== null? "0" :oneRow.getCell(41).getStringCellValue()));
            sabana.setPorcEstadistica(Double.parseDouble(oneRow.getCell(42)== null? "0" :oneRow.getCell(42).getStringCellValue()));
            sabana.setTasaEstadistica(Double.parseDouble(oneRow.getCell(43)== null? "0" :oneRow.getCell(43).getStringCellValue()));
            sabana.setTasaEstadisticaMontoMaximo(Double.parseDouble(oneRow.getCell(44)== null? "0" :oneRow.getCell(44).getStringCellValue()));
            sabana.setPorcIva(Double.parseDouble(oneRow.getCell(45)== null? "0" :oneRow.getCell(45).getStringCellValue()));
            sabana.setIva(Double.parseDouble(oneRow.getCell(46)== null? "0" :oneRow.getCell(46).getStringCellValue()));
            sabana.setIvaGarantia(Double.parseDouble(oneRow.getCell(47)== null? "0" :oneRow.getCell(47).getStringCellValue()));
            sabana.setPorcIvaAdicional(Double.parseDouble(oneRow.getCell(48)== null? "0" :oneRow.getCell(48).getStringCellValue()));
            sabana.setIvaAdicionalInsc(Double.parseDouble(oneRow.getCell(49)== null? "0" :oneRow.getCell(49).getStringCellValue()));
            sabana.setPorcIibb(Double.parseDouble(oneRow.getCell(50)== null? "0" :oneRow.getCell(50).getStringCellValue()));
            sabana.setIibb(Double.parseDouble(oneRow.getCell(51)== null? "0" :oneRow.getCell(51).getStringCellValue()));
            sabana.setPorcGanacias(Double.parseDouble(oneRow.getCell(52)== null? "0" :oneRow.getCell(52).getStringCellValue()));
            sabana.setImpuestosGanacias(Double.parseDouble(oneRow.getCell(53)== null? "0" :oneRow.getCell(53).getStringCellValue()));
            sabana.setImpuestosGanaciasGarantia(Double.parseDouble(oneRow.getCell(54)== null? "0" :oneRow.getCell(54).getStringCellValue()));
            sabana.setPorcAranselSim(Double.parseDouble(oneRow.getCell(55)== null? "0" :oneRow.getCell(55).getStringCellValue()));
            sabana.setAranselSim(Double.parseDouble(oneRow.getCell(56)== null? "0" :oneRow.getCell(56).getStringCellValue()));
            sabana.setCodigo2(oneRow.getCell(57)== null? "sin codigo" :oneRow.getCell(57).getStringCellValue());
            sabana.setDetalle(oneRow.getCell(58)== null? "sin detalle" :oneRow.getCell(58).getStringCellValue());
            arrayMaster.add(sabana);
        }
        sabanaRepository.saveAll(arrayMaster);
    }

}
