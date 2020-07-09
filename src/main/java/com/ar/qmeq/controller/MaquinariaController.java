package com.ar.qmeq.controller;

import com.ar.qmeq.excel.models.ExcelMaquinaria;
import com.ar.qmeq.service.MaquinariaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping(path = "maquinaria")
public class MaquinariaController {

    @Autowired
    MaquinariaServices maquinariaServices;

    @PostMapping(path = "excel")
    public void getMaquinariaFromExcel(@RequestParam("total") MultipartFile file) {
        maquinariaServices.saveMaquinariasFromMainFile(file);
    }
    @GetMapping(path = "tipos")
    public List<String> getMaquinariasTipo() {
       return maquinariaServices.getTipos();
    }
}
