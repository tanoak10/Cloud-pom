package com.tanoak.consul2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author tanoak@qq.com
 * @date 2018/10/20 23:40    
 * @Desc
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Consul2Application {

    public static void main(String[] args) {
        SpringApplication.run(Consul2Application.class, args);
    }
}
