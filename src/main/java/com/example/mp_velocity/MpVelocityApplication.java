package com.example.mp_velocity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MpVelocityApplication {

    public static void main(String[] args) {
        SpringApplication.run(MpVelocityApplication.class, args);
    }

}
