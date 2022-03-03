package com.example.coinmarketcap.kafka;

import com.example.coinmarketcap.model.Crypto;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CryptoDataPublisher {

    private final KafkaTemplate<String, Object> template;

    public CryptoDataPublisher(KafkaTemplate<String, Object> template) {
        this.template = template;
    }

    public void sendCryptoEvent(List<Crypto> cryptos) {

        cryptos.forEach(this::sendCryptoEvent);
    }

    private void sendCryptoEvent(Crypto event) {
        template.send("crypto-updated-topic", event);
    }

}
