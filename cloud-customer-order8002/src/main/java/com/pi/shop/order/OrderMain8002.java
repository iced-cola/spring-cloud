package com.pi.shop.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 15:57:29
 * @description :  订单测试启动类
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain8002 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain8002.class, args);
    }

}
