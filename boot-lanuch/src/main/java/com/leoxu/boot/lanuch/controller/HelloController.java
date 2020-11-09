package com.leoxu.boot.lanuch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author: Leo.xu
 * @Created: 2020/11/9 15:21
 * @Description:
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(String name){
        return "hello welcome to " + name;


    }
}
