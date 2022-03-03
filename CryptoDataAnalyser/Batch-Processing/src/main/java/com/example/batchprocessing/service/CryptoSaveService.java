package com.example.batchprocessing.service;

import com.example.batchprocessing.model.CryptoSavedData;
import com.example.batchprocessing.repository.CryptoSavedRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptoSaveService {

    private final CryptoSavedRepository repository;

    public CryptoSaveService(CryptoSavedRepository repository) {
        this.repository = repository;
    }


    public void save(CryptoSavedData cryptoSavedData){
        repository.save(cryptoSavedData);
    }

    public List<CryptoSavedData> getList() {
        return repository.findAll();
    }
}
