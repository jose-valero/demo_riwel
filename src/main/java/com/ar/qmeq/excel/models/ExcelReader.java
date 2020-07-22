package com.ar.qmeq.excel.models;

import com.ar.qmeq.entities.Maquinaria;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ExcelReader {


    private List<ExcelMaquinaria>  getExcelMaquinariasFromFile(MultipartFile file) {
        PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().sheetIndex(0).build();
        List<ExcelMaquinaria> maquinarias = null;
        try {
             maquinarias = Poiji.fromExcel(file.getInputStream(), PoijiExcelType.XLS, ExcelMaquinaria.class, options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maquinarias;
    }

    private List<ExcelMaquinariaMainFile>  getExcelMaquinariasMainFromFile(MultipartFile file) {
        PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().sheetIndex(1).build();
        List<ExcelMaquinariaMainFile> maquinarias = null;
        try {
            maquinarias = Poiji.fromExcel(file.getInputStream(), PoijiExcelType.XLS, ExcelMaquinariaMainFile.class, options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return maquinarias;
    }

    private List<Maquinaria> converTomaquianria( List<ExcelMaquinariaMainFile> mf){
       return mf.stream().map(v->{
            var Maquinaria = new Maquinaria();
            Maquinaria.setIdCompuesta(v.getMarca() + '-' + v.getModelo());
            Maquinaria.setMarca(v.getMarca());
            Maquinaria.setModelo(v.getModelo());
            Maquinaria.setSegmento(v.getSegmento());
            Maquinaria.setTipo(v.getTipo().toUpperCase());
            Maquinaria.setChina(v.getChina());
            Maquinaria.setPesoOperativo(v.getApplicableCarrierWeight());
            Maquinaria.setTraccion(v.getTraccion());
            Maquinaria.setSubCategoria1(v.getSubCategoria1());
            Maquinaria.setSubCategoria2(v.getSubCategoria2());
            Maquinaria.setSubCategoria3(v.getSubCategoria3());
            return Maquinaria;
        }).collect(Collectors.toList());
    }

    public List<Maquinaria> getMaquinariasFromMainFile(MultipartFile file){
       return converTomaquianria(this.getExcelMaquinariasMainFromFile(file));
    }





}
