package com.example.persister.controller;

import com.example.persister.kafka.CryptoDataListener;
import com.example.persister.model.Crypto;
import com.example.persister.service.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class CryptoController {

    @GetMapping("/data")
    public HashMap<String, List<Crypto>> getReceivedData() {

        HashMap<String, List<Crypto>> response = new HashMap<>();
        List<Crypto> savedData = new ArrayList<>();

        for (int i = 0; i < CryptoDataListener.counter; i++) {
            String fileName = "crypt" + i++ + ".bin";

            File file = new File(fileName);
            for (int j = 0; j < 100; j++) {

                try {
                    Crypto crypto = StoreService.readObjectFromFile(file);
                    savedData.add(crypto);

                } catch (Exception e) {
                    System.out.println(e.toString());
                }
            }
        }

        response.put("data", savedData);
        return response;
    }
}
