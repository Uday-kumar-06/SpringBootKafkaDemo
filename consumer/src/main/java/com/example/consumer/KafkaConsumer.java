package com.example.consumer;

import com.example.consumer.model.RiderLocation;
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

    @KafkaListener(topics = "my-new-topic-2" ,groupId = "my-new-group-rider")
    public void listen3(RiderLocation location){
        System.out.println("Received Message: "+ location.getRiderId()+
                location.getLatitude()+location.getLongitude()
                +"my-new-group-rider");
    }
}
