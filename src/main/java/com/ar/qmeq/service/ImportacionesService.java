package com.ar.qmeq.service;

import com.ar.qmeq.entities.Importaciones;
import com.ar.qmeq.repository.ImportacionesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ImportacionesService {

    @Autowired
    private ImportacionesRepository importacionesRepository;

    public void SaveMaster(Importaciones sabana) {
        try {
            importacionesRepository.save(sabana);
        } catch (Exception e) {
            System.out.println("Error Saving initial data base (sabana)" + e);
        }
    }

    public Importaciones GetMaster(String id) {
        return importacionesRepository.findById(UUID.fromString(id)).get();
    }

    public List<Importaciones> GetAllMaster() {
        return (List<Importaciones>) importacionesRepository.findAll();
    }
}
