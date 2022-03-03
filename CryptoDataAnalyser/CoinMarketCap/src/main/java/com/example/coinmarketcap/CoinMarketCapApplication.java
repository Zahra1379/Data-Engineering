package com.example.coinmarketcap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoinMarketCapApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoinMarketCapApplication.class, args);
    }

}
