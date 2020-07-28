package com.ar.qmeq.service;

import com.ar.qmeq.CsvFileMapper;
import com.ar.qmeq.builder.MaquinariaBuilder;
import com.ar.qmeq.entities.ImportacionMaquinaria;
import com.ar.qmeq.models.SabanaEnbruto;
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

    public void saveImportacionMaquinariaFromOriginalSabanFile(MultipartFile file) {
        List<SabanaEnbruto> maquinaria = csvFileMapper.fileTojson(file);

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

/*




    private String getMonthByDate(Date date) {
        switch (date.getMonth()) {
            case 0:
                return "Ene";
            case 1:
                return "Feb";
            case 2:
                return "Mar";
            case 3:
                return "Abr";
            case 4:
                return "May";
            case 5:
                return "Jun";
            case 6:
                return "Jul";
            case 7:
                return "Ago";
            case 8:
                return "Sep";
            case 9:
                return "Oct";
            case 10:
                return "Nov";
            case 11:
                return "Dic";

        }
        return null;
    }*/
}


