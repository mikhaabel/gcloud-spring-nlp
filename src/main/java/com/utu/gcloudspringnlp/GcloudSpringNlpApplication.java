package com.utu.gcloudspringnlp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class GcloudSpringNlpApplication {

    public static void main(String[] args) {
        log.info("I'm starting!");
        SpringApplication.run(GcloudSpringNlpApplication.class, args);
    }
}
