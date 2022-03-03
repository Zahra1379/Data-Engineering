package com.example.batchprocessing.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class CryptoSavedData {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int marketId;
    private String name;
    private String symbol;
    private String slug;
    private int cmcRank;
    private int numMarketPairs;
    private int circulatingSupply;
    private int totalSupply;
    private int maxSupply;
    private Date lastUpdated;
    private Date dateAdded;

    public CryptoSavedData() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMarketId() {
        return marketId;
    }

    public void setMarketId(int marketId) {
        this.marketId = marketId;
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

    public int getCmcRank() {
        return cmcRank;
    }

    public void setCmcRank(int cmcRank) {
        this.cmcRank = cmcRank;
    }

    public int getNumMarketPairs() {
        return numMarketPairs;
    }

    public void setNumMarketPairs(int numMarketPairs) {
        this.numMarketPairs = numMarketPairs;
    }

    public int getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(int circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public int getTotalSupply() {
        return totalSupply;
    }

    public void setTotalSupply(int totalSupply) {
        this.totalSupply = totalSupply;
    }

    public int getMaxSupply() {
        return maxSupply;
    }

    public void setMaxSupply(int maxSupply) {
        this.maxSupply = maxSupply;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }
}
