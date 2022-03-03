package com.example.batchprocessing.service;

import com.example.batchprocessing.model.Crypto;
import com.example.batchprocessing.model.PersisterResponse;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class ReadPersisterDataService {

    public List<Crypto> readFromPersister() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        String url = "http://localhost:8085/data";

        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<PersisterResponse> result = restTemplate.exchange(url, HttpMethod.GET, requestEntity, PersisterResponse.class);

        System.out.println(result.getBody().getData().get(0).toString());

        return result.getBody().getData();

    }

}
