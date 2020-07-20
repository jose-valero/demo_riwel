package com.ar.qmeq.service;

import com.ar.qmeq.CsvFileMapper;
import com.ar.qmeq.builder.MaquinariaBuilder;
import com.ar.qmeq.entities.ImportacionMaquinaria;
import com.ar.qmeq.models.SabanaEnbruto;
import com.ar.qmeq.models.VistaGetMaquinaria;
import com.ar.qmeq.repository.ImportacionesMaquinariaRepository;
import com.ar.qmeq.repository.MaquinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ImportacionMaquinariaService {

    @Autowired
    ImportacionesMaquinariaRepository repository;

    @Autowired
    MaquinariaRepository maquinariaRepository;

    @Autowired
    CsvFileMapper csvFileMapper;

    public void saveImportacionMaquinariaFromOriginalSabanFile(MultipartFile file) {
        List<SabanaEnbruto> maquinaria = csvFileMapper.fileTojson(file);

        List<ImportacionMaquinaria> lisToSave = maquinaria.stream().map(v -> MaquinariaBuilder.BuildIM(v)).collect(Collectors.toList());
        List<String> ids=lisToSave.stream().map(v->v.getMaquinaria().getIdCompuesta()).collect(Collectors.toList());
        var maquinariasBD = maquinariaRepository.findAllById(ids);
        lisToSave.forEach(m->{
            maquinariasBD.forEach(maqui->{
                if (maqui.getIdCompuesta().equals(m.getMaquinaria().getIdCompuesta())) {
                    m.setMaquinaria(maqui);
                }
            });
        });
        repository.saveAll(lisToSave);


    }

    public HashMap<String, List<VistaGetMaquinaria>> getmaquinariaByParams(Date fromdate,
                                                                           Date todate,
                                                                           String tipoMaquinaria,
                                                                           String[] codVenta) {
        List<VistaGetMaquinaria> maquinaria = repository.getMaquinariaDemo(fromdate, todate, tipoMaquinaria, codVenta);

        HashMap<String, List<VistaGetMaquinaria>> maquinarias = new HashMap<String, List<VistaGetMaquinaria>>();
        maquinaria.forEach(v -> {
            var list = maquinarias.get(v.getMesAno().toString());
            if (list == null) {
                list = new ArrayList<VistaGetMaquinaria>();
            }
            list.add(v);
            maquinarias.put(v.getMesAno().toString(), list);
        });

        return maquinarias;
    }
}
