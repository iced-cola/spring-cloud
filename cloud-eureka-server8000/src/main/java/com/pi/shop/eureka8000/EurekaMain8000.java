package com.pi.shop.eureka8000;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 23:23:17
 * @description :  Eureka主启动类
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain8000 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain8000.class, args);
    }

}
