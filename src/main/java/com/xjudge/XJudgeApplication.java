package com.xjudge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


import java.time.LocalDate;

@SpringBootApplication
public class XJudgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(XJudgeApplication.class, args);
    }

}
