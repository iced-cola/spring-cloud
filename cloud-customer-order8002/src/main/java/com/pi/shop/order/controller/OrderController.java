package com.pi.shop.order.controller;

import com.pi.shop.common.entity.PaymentPo;
import com.pi.shop.common.response.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 16:02:53
 * @description :  订单api类
 * @since :  v1.0
 */
@RestController
@RequestMapping(value = "/order")
@Slf4j
public class OrderController {

    // 对外不指定端口，通过微服务名称使用负载均衡
    // private static final String PAYMENT_URL = "http://localhost:8001";
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @SuppressWarnings("unchecked")
    @PostMapping(value = "/create")
    public CommonResult<PaymentPo> create(@RequestBody PaymentPo paymentPo) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", paymentPo,
                CommonResult.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping(value = "/{id}")
    public CommonResult<PaymentPo> queryPayment(@PathVariable("id") long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id,
                CommonResult.class);
    }

}
