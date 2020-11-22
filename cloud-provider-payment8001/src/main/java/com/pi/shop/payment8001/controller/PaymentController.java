package com.pi.shop.payment8001.controller;

import com.pi.shop.common.entity.PaymentPo;
import com.pi.shop.common.response.CommonResult;
import com.pi.shop.payment8001.constant.CodeType;
import com.pi.shop.payment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 14:34:57
 * @description :  支付api
 * @since :  v1.0
 */
@RestController
@RequestMapping(value = "/payment")
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/create")
    public CommonResult<Object> create(@RequestBody PaymentPo paymentPo) {
        try {
            paymentService.create(paymentPo);
            return new CommonResult<>(CodeType.SUCCESS.getCode(),
                    CodeType.SUCCESS.getMessage() + " 端口: " + serverPort);
        } catch (Exception e) {
            return new CommonResult<>(CodeType.INTERNAL_ERROR.getCode(),
                    CodeType.INTERNAL_ERROR.getMessage());
        }
    }

    @GetMapping(value = "/{id}")
    public CommonResult<PaymentPo> queryPayment(@PathVariable("id") long id) {
        try {
            PaymentPo paymentPo = paymentService.getPaymentById(id);
            return new CommonResult<>(CodeType.SUCCESS.getCode(),
                    CodeType.SUCCESS.getMessage() + " 端口: " + serverPort, paymentPo);
        } catch (Exception e) {
            return new CommonResult<>(CodeType.INTERNAL_ERROR.getCode(),
                    CodeType.INTERNAL_ERROR.getMessage());
        }
    }
}
