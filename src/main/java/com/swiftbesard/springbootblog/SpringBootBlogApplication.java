package com.swiftbesard.springbootblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBlogApplication {

    public static void main(String[] args) {

        System.setProperty("es.set.netty.runtime.available.processors", "false");
        SpringApplication.run(SpringBootBlogApplication.class, args);
    }

}
