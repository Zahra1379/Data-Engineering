package com.example.persister.kafka;

import com.example.persister.model.Crypto;
import com.example.persister.service.StoreService;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.Message;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import com.google.common.collect.Lists;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CryptoDataListener {

    private static List<Crypto> cryptos = new ArrayList<>();
    private boolean updatedIn30Min = false;

    public static int counter = 0;

    @KafkaListener(topics = "crypto-updated-topic")
    public void orderItemRegisteredListener(List<Message<Crypto>> events) {

        List<Crypto> newEvents = events.stream().map(Message::getPayload).collect(Collectors.toList());

        cryptos.addAll(newEvents);


        if (cryptos.size() > 100) {

            updatedIn30Min = true;
            saveData(100);

        }

    }

    private void saveData(int size) {
        List<Crypto> toWriteInFile = new ArrayList<>(cryptos);

        cryptos = new ArrayList<>();
        
        Lists.partition(toWriteInFile, size).forEach(list -> {
            if (list.size() < size){
                cryptos = list;
            }else{
                saveToFile(list);
            }
        });
    }

    private void saveToFile(List<Crypto> list) {
        String fileName = "crypt" + counter++  + ".bin";

        File file = new File(fileName);

        for (Crypto crypto : list) {
            try {
                StoreService.writeObjectToFile(crypto, file);
            } catch (IOException e) {
                System.out.println("error for store data in file");
            }
        }

    }

    @Scheduled(fixedDelay = 30 * 60 * 1000, initialDelay =  30 * 60 * 1000)
    public void checkSaveData(){
        if(updatedIn30Min)
            return;
        
        updatedIn30Min = false;
        
        saveData(cryptos.size());
    }

}
