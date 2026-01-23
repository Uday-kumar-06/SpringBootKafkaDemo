package com.example.consumer.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    //we can create new topic using this
    @Bean
    public NewTopic createMyTopic(){
        return new NewTopic("my-new-topic-2",3,(short)1);
    }
}
