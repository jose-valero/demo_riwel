package com.ar.qmeq.service;

import com.ar.qmeq.excel.models.ExcelReader;
import com.ar.qmeq.repository.MaquinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class MaquinariaServices {

    @Autowired
    ExcelReader excelReader;

    @Autowired
    MaquinariaRepository repository;

    public void saveMaquinariasFromMainFile(MultipartFile file) {
      var listMaquinarias =  excelReader.getMaquinariasFromMainFile(file);
      repository.saveAll(listMaquinarias);
    }

    public List<String> getTipos(){
       return repository.getTipos();
    }

}
