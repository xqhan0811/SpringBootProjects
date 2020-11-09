package com.leoxu.boot.lanuch;

import com.leoxu.boot.lanuch.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootLanuchApplication {

    public static void main(String[] args) {

        SpringApplication.run(BootLanuchApplication.class, args);

        User.builder().name("zhangsan").age(22).build();
    }

}
