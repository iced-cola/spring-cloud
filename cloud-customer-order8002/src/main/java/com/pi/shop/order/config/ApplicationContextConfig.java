package com.pi.shop.order.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 16:05:58
 * @description :  restTemplate配置类
 * @since :  v1.0
 */
@Configuration
public class ApplicationContextConfig {

    // RestTemplate 默认的负载均衡
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
