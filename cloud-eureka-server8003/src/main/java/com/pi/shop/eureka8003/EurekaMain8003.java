package com.pi.shop.eureka8003;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-22-2020 13:33:07
 * @description :  Eureka集群启动类
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMain8003 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain8003.class, args);
    }

}
