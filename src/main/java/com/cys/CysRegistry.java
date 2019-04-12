package com.cys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author chenyushi
 * @date 2019/4/11 17:18
 */
@SpringBootApplication
@EnableEurekaServer
public class CysRegistry {
    public static void main(String[] args) {
        SpringApplication.run(CysRegistry.class, args);
    }

}
