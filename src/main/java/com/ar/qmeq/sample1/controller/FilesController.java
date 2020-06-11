package com.ar.qmeq.sample1.controller;


import com.ar.qmeq.sample1.service.FileServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "file_uploader")
public class FilesController {

    @Autowired
    FileServices fileServices;

    @PostMapping
    public void GetFiles(@RequestParam("Importaciones") MultipartFile file) {
        fileServices.readFileService(file);
        System.out.println("upload successfully");

    }

}
