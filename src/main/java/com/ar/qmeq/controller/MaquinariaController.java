package com.ar.qmeq.controller;

import com.ar.qmeq.service.ImportacionMaquinariaService;
import com.ar.qmeq.service.MaquinariaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.multipart.MultipartFile;

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
        IMService.saveAduanaFile(file);
    }

    @GetMapping
    public List<Object> getMaquinariasOther(
            @RequestParam("fromdate") String fromdate,
            @RequestParam("todate") String todate,
            @RequestParam(value = "tipomaquinaria", required = false) String tipoMaquinaria,
            @RequestParam(value = "codeventa", required = false) List<String> codVenta) {
        return IMService.getImportacionesNative(fromdate, todate, tipoMaquinaria, codVenta);
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
