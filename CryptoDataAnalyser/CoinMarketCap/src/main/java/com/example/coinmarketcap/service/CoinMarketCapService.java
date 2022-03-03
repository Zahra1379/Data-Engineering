package com.example.coinmarketcap.service;

import com.example.coinmarketcap.model.CoinMarketResponse;


import org.apache.http.NameValuePair;

import org.apache.http.message.BasicNameValuePair;


import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CoinMarketCapService {

    private static String apiKey = "6e32d115-5e3d-4e80-b5d0-7696db202aff";

    public static CoinMarketResponse getDataOfCoinMarketCap() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-CMC_PRO_API_KEY", apiKey);

        String url = "https://sandbox-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?start=1&limit=5000&convert=USD";

        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<CoinMarketResponse> result = restTemplate.exchange(url, HttpMethod.GET, requestEntity, CoinMarketResponse.class);

        return result.getBody();

    }
}
