package com.aimtupsu.tablebooking.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.annotation.EnableKafkaStreams;

@SpringBootApplication

public class Main {

  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);
  }
}
