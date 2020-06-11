package com.ar.qmeq.sample1.controller;


import com.ar.qmeq.sample1.entities.Importaciones;
import com.ar.qmeq.sample1.service.ImportacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleController {

    @Autowired
    private ImportacionesService importacionesService;

    @GetMapping
    public Importaciones GetMaster(@RequestParam("id") String id) {
        return importacionesService.GetMaster(id);
    }

    //
    @PostMapping
    public String SavingMaster(@RequestBody Importaciones sabana) {
        importacionesService.SaveMaster(sabana);
        return "successfully uploaded data";
    }

    @GetMapping("getAll")
    public List<Importaciones> getAllMaster() {
        return importacionesService.GetAllMaster();
    }

}
