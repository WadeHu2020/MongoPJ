package com.example.mongopj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MongoPjApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoPjApplication.class, args);
    }

}
