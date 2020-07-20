package com.ar.qmeq.controller;


import com.ar.qmeq.CsvFileMapper;
import com.ar.qmeq.excel.models.ExcelReader;
import com.ar.qmeq.models.SabanaEnbruto;
import com.ar.qmeq.service.FileServices;
import com.ar.qmeq.service.ImportacionMaquinariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@CrossOrigin(CorsConfiguration.ALL)
@RestController
@RequestMapping(path = "file_uploader")
public class FilesController {

    @Autowired
    FileServices fileServices;

    @Autowired
    CsvFileMapper csvFileMapper;

    @Autowired
    ImportacionMaquinariaService IMService;

    @Autowired
    ExcelReader excelReader;

    @PostMapping
    public void GetFiles(@RequestParam("Importaciones") MultipartFile file) {
        fileServices.readFileService(file);
        System.out.println("upload successfully");

    }

    @PostMapping(path = "total")
    public List<SabanaEnbruto> PostFileFromSabana(@RequestParam("total") MultipartFile file) {
        return csvFileMapper.fileTojson(file);
    }

    @PostMapping(path = "save/maquinaria")
    public void saveMaquinaria(@RequestParam("total") MultipartFile file) {
        IMService.saveImportacionMaquinariaFromOriginalSabanFile(file);
    }


}
