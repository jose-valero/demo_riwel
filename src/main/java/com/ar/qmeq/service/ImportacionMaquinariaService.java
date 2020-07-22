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

import java.time.LocalDate;
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

    public HashMap<String, HashMap<String, List<VistaGetMaquinaria>>> getmaquinariaByParams(Date fromdate,
                                                                                                                                                         Date todate,
                                                                                                                                                         String tipoMaquinaria,
                                                                                                                                                         String[] codVenta) {
        List<VistaGetMaquinaria> maquinaria = repository.getMaquinariaDemo(fromdate, todate, tipoMaquinaria, codVenta);
        var maquinariaAno = new HashMap<String, HashMap<String, List<VistaGetMaquinaria>>>();
        var maquinarias = new HashMap<String, List<VistaGetMaquinaria>>();
        maquinaria.forEach(v -> {
            var calendario = Calendar.getInstance();
            calendario.setTime(v.getMesAno());
            var year = calendario.get(Calendar.YEAR);
            var yearList = maquinariaAno.get(String.valueOf(year));
            if (yearList == null){
                yearList = new HashMap<String, List<VistaGetMaquinaria>>();
            }


            var list = yearList.get(getMonthByDate(v.getMesAno()));
            if (list == null) {
                list = new ArrayList<VistaGetMaquinaria>();
            }
            list.add(v);
            maquinarias.put(getMonthByDate(v.getMesAno()), list);
            maquinariaAno.put(String.valueOf(year),maquinarias);
        });

        return maquinariaAno;
    }

    private String getMonthByDate(Date date){
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
    }
}


