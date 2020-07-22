package com.ar.qmeq.controller;

import com.ar.qmeq.models.VistaGetMaquinaria;
import com.ar.qmeq.service.ImportacionMaquinariaService;
import com.ar.qmeq.service.MaquinariaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

@CrossOrigin(CorsConfiguration.ALL)
@RestController
@RequestMapping(path = "maquinaria")
public class MaquinariaController {

    @Autowired
    MaquinariaServices maquinariaServices;

    @Autowired
    ImportacionMaquinariaService IMService;

    @PostMapping(path = "excel/mainfile")
    public void getMaquinariaFromExcel(@RequestParam("total") MultipartFile file) {
        maquinariaServices.saveMaquinariasFromMainFile(file);
    }

    @PostMapping(path = "excel/aduana")
    public void saveMaquinaria(@RequestParam("total") MultipartFile file) {
        IMService.saveImportacionMaquinariaFromOriginalSabanFile(file);
    }

    @GetMapping
    public HashMap<?, ?> getMaquinarias(
            @RequestParam("fromdate") @DateTimeFormat(pattern = "yyyy") Date fromdate,
            @RequestParam("todate") @DateTimeFormat(pattern = "yyyy") Date todate,
            @RequestParam("tipomaquinaria") String tipoMaquinaria,
            @RequestParam("codeventa") String[] codVenta) {
        return IMService.getmaquinariaByParams(fromdate, todate, tipoMaquinaria, codVenta);
    }

    @GetMapping(path = "categoria")
    public List<String> getMaquinariasTipo() {
        return maquinariaServices.getTipos();
    }

    @GetMapping(path = "cod-venta")
    public List<String> getCodigosDeVenta() {
        return maquinariaServices.getCodigosDeVenta();
    }
}
