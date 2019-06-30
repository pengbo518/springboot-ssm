package com.pengbo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: main
 * @author: Mr.Liu
 * @version: v1.0
 * @create: 2019年6月30日23:13:16
 **/
@SpringBootApplication
public class SpringBootSsmApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSsmApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("服务启动完成...");
    }
}
