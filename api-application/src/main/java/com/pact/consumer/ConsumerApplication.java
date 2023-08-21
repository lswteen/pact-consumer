package com.pact.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDateTime;

@SpringBootApplication
public class ConsumerApplication {
    public static void main(String[] args){
        System.setProperty("timestamp", String.valueOf(LocalDateTime.now()));
        SpringApplication.run(ConsumerApplication.class,args);
    }
}