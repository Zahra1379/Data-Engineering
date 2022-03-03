package com.example.batchprocessing.service;

import com.example.batchprocessing.model.Crypto;
import com.example.batchprocessing.model.CryptoSavedData;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JobService {

    private final CryptoSaveService cryptoSaveService;
    private final ReadPersisterDataService persisterDataService;

    public JobService(CryptoSaveService cryptoSaveService, ReadPersisterDataService persisterDataService) {
        this.cryptoSaveService = cryptoSaveService;
        this.persisterDataService = persisterDataService;
    }

    @Scheduled(fixedDelay = 60 * 10 * 1000)
    public void readDataOfPersister() {

        List<Crypto> cryptos = persisterDataService.readFromPersister();

        cryptos.forEach(crypto -> {
            CryptoSavedData cryptoSavedData = processOnData(crypto);
            cryptoSaveService.save(cryptoSavedData);
        });

    }

    public CryptoSavedData processOnData(Crypto crypto){
        CryptoSavedData entity = new CryptoSavedData();
        // TODO: 1/30/2022 add processing algorithem
        entity.setCmcRank(crypto.getCmc_rank());
        entity.setDateAdded(crypto.getDate_added());
        entity.setCirculatingSupply(crypto.getCirculating_supply());
        entity.setLastUpdated(crypto.getLast_updated());
        entity.setMarketId(crypto.getId());
        entity.setMaxSupply(crypto.getMax_supply());
        entity.setName(crypto.getName());
        entity.setSymbol(crypto.getSymbol());
        entity.setSlug(crypto.getSlug());
        entity.setNumMarketPairs(crypto.getNum_market_pairs());
        entity.setTotalSupply(crypto.getTotal_supply());

        return entity;
    }

}
