package com.demo.producer.controller;


import com.demo.producer.model.RiderLocation;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;


//./kafka-console-consumer.sh \
//        --topic my-topic \
//        --bootstrap-server kafka:29092 \
//        --from-beginning \
//        --property print.partition=true \
//        --property print.key=true

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String,RiderLocation> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String,RiderLocation> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    @PostMapping("/send")
    public String sendMessage(@RequestParam String message){
        RiderLocation riderLocation = new RiderLocation("rider123",28.61,77.23);

        kafkaTemplate.send("my-new-topic-2", riderLocation);
        return "Message sent: "+ riderLocation.getRiderId();
    }

}
