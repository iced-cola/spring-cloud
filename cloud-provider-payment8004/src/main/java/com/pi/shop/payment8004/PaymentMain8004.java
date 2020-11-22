package com.pi.shop.payment8004;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-22-2020 14:01:54
 * @description :  支付服务集群启动类
 * @since :  v1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8004 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }

}
