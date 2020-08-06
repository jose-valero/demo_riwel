package com.ar.qmeq.service;

import com.ar.qmeq.CsvFileMapper;
import com.ar.qmeq.builder.MaquinariaBuilder;
import com.ar.qmeq.entities.ImportacionMaquinaria;
import com.ar.qmeq.models.CSVBruto;
import com.ar.qmeq.repository.ImportacionesMaquinariaRepository;
import com.ar.qmeq.repository.MaquinariaRepository;
import com.ar.qmeq.repository.NativeQueries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ImportacionMaquinariaService {

    @Autowired
    ImportacionesMaquinariaRepository repository;

    @Autowired
    MaquinariaRepository maquinariaRepository;

    @Autowired
    CsvFileMapper csvFileMapper;

    @Autowired
    NativeQueries nativeQueries;

    public void saveAduanaFile(MultipartFile file) {
        List<CSVBruto> maquinaria = csvFileMapper.fileTojson(file);

        List<ImportacionMaquinaria> lisToSave = maquinaria.stream().map(v -> MaquinariaBuilder.BuildIM(v)).collect(Collectors.toList());

        List<String> ids = lisToSave.stream().map(v -> v.getMaquinaria().getIdCompuesta()).collect(Collectors.toList());
        var maquinariasBD = maquinariaRepository.findAllById(ids);
        lisToSave.forEach(m -> {
            maquinariasBD.forEach(maqui -> {
                if (maqui.getIdCompuesta().equals(m.getMaquinaria().getIdCompuesta())) {
                    m.setMaquinaria(maqui);
                }
            });
        });
        repository.saveAll(lisToSave);
    }

    public List<Object> getImportacionesNative(String fromdate, String todate, String tipoMaquinaria, List<String> codVenta) {
        return nativeQueries.GetMaquinariasNative(fromdate, todate, tipoMaquinaria, codVenta);
    }

    private void LoadEmptyMonth(List<ImportacionMaquinaria> lisToSave) {

    }

}


