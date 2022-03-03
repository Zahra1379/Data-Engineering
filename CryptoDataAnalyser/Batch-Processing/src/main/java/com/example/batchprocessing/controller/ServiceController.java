package com.example.batchprocessing.controller;


import com.example.batchprocessing.model.CryptoSavedData;
import com.example.batchprocessing.service.CryptoSaveService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    private final CryptoSaveService service;

    public ServiceController(CryptoSaveService service) {
        this.service = service;
    }

    @GetMapping("/processed-data")
    public List<CryptoSavedData> getProcessedData() {
        return service.getList();
    }
}
