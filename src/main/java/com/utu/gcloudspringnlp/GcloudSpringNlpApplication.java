package com.utu.gcloudspringnlp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class GcloudSpringNlpApplication {

    public static void main(String[] args) {
        log.info("I'm starting!");
        SpringApplication.run(GcloudSpringNlpApplication.class, args);
    }
}
