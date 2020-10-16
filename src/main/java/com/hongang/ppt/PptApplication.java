package com.hongang.ppt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hongang.ppt.dao")
public class PptApplication {

    public static void main(String[] args) {
        SpringApplication.run(PptApplication.class, args);
    }

}
