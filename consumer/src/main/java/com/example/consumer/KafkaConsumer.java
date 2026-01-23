package com.example.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "my-topic" ,groupId = "my-consumer-group1")
    public void listen1(String message){
        System.out.println("Received Message: "+ message+ "my-consumer-group1");
    }

    @KafkaListener(topics = "my-topic" ,groupId = "my-consumer-group1")
    public void listen2(String message){
        System.out.println("Received Message: "+ message+"my-consumer-group2");
    }
}
