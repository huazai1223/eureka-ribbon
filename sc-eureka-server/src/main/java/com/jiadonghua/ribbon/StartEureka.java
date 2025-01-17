package com.jiadonghua.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动注册中心
 */
@SpringBootApplication
@EnableEurekaServer
public class StartEureka {

    public static void main(String[] args) {
        SpringApplication.run(StartEureka.class);
    }
}
