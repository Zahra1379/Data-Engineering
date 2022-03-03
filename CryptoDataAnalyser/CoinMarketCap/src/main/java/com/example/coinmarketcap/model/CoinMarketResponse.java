package com.example.coinmarketcap.model;

import java.util.ArrayList;
import java.util.List;


public class CoinMarketResponse {

    private List<Crypto> data = new ArrayList<>();

    public CoinMarketResponse() {
    }

    public List<Crypto> getData() {
        return data;
    }

    public void setData(List<Crypto> data) {
        this.data = data;
    }
}
