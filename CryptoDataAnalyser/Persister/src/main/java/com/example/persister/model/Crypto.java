package com.example.persister.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Crypto implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private String symbol;
    private String slug;
    private int cmc_rank;
    private int num_market_pairs;
    private int circulating_supply;
    private int total_supply;
    private int max_supply;
    private Date last_updated;
    private Date date_added;
    private ArrayList<String> tags;
    private Object platform;

    public Map<String, Money> quote;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getCmc_rank() {
        return cmc_rank;
    }

    public void setCmc_rank(int cmc_rank) {
        this.cmc_rank = cmc_rank;
    }

    public int getNum_market_pairs() {
        return num_market_pairs;
    }

    public void setNum_market_pairs(int num_market_pairs) {
        this.num_market_pairs = num_market_pairs;
    }

    public int getCirculating_supply() {
        return circulating_supply;
    }

    public void setCirculating_supply(int circulating_supply) {
        this.circulating_supply = circulating_supply;
    }

    public int getTotal_supply() {
        return total_supply;
    }

    public void setTotal_supply(int total_supply) {
        this.total_supply = total_supply;
    }

    public int getMax_supply() {
        return max_supply;
    }

    public void setMax_supply(int max_supply) {
        this.max_supply = max_supply;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public void setTags(ArrayList<String> tags) {
        this.tags = tags;
    }

    public Object getPlatform() {
        return platform;
    }

    public void setPlatform(Object platform) {
        this.platform = platform;
    }

    public Map<String, Money> getQuote() {
        return quote;
    }

    public void setQuote(Map<String, Money> quote) {
        this.quote = quote;
    }

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
