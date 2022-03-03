package com.example.batchprocessing.model;

import java.util.ArrayList;
import java.util.List;

public class PersisterResponse {

    private List<Crypto> data = new ArrayList<>();

    public PersisterResponse() {
    }

    public List<Crypto> getData() {
        return data;
    }

    public void setData(List<Crypto> data) {
        this.data = data;
    }
}
