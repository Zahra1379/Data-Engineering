package com.example.coinmarketcap.service;


import com.example.coinmarketcap.kafka.CryptoDataPublisher;
import com.example.coinmarketcap.model.CoinMarketResponse;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class JobService {

    private final CryptoDataPublisher cryptoDataPublisher;

    public JobService(CryptoDataPublisher cryptoDataPublisher) {
        this.cryptoDataPublisher = cryptoDataPublisher;
    }

    @Scheduled(fixedDelay = 60 * 15 * 1000)
    public void getCryptoData(){

        System.out.println("start getting new data");
        CoinMarketResponse cryptoData = CoinMarketCapService.getDataOfCoinMarketCap();

        System.out.println("start sending data");
        cryptoDataPublisher.sendCryptoEvent(cryptoData.getData());

        System.out.println("done");
    }


}
