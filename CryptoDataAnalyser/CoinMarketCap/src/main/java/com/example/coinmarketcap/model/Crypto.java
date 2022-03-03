package com.example.coinmarketcap.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Crypto implements Serializable {
    public int id;
    public String name;
    public String symbol;
    public String slug;
    public int cmc_rank;
    public int num_market_pairs;
    public int circulating_supply;
    public int total_supply;
    public int max_supply;
    public Date last_updated;
    public Date date_added;
    public ArrayList<String> tags;
    public Object platform;
    public Map<String, Money> quote = new HashMap<>();

    @Override
    public String toString() {
        return "Crypto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", slug='" + slug + '\'' +
                ", cmc_rank=" + cmc_rank +
                ", num_market_pairs=" + num_market_pairs +
                ", circulating_supply=" + circulating_supply +
                ", total_supply=" + total_supply +
                ", max_supply=" + max_supply +
                ", last_updated=" + last_updated +
                ", date_added=" + date_added +
                ", tags=" + tags +
                ", platform=" + platform +
                ", quote=" + quote +
                '}';
    }
}
