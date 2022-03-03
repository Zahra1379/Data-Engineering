package com.example.persister.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.kafka.listener.KafkaListenerErrorHandler;
import org.springframework.kafka.support.converter.StringJsonMessageConverter;

@Configuration
public class KafkaConsumerConfig {
    @Bean
    public StringJsonMessageConverter messageConverter() {
        return new StringJsonMessageConverter();
    }

    @Bean
    public KafkaListenerErrorHandler kafkaErrorHandler() {
        return (message, exception) -> {
            System.out.println("error getting data from kafka");
            return null;
        };
    }
}
