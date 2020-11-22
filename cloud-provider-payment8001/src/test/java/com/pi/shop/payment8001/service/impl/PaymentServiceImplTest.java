package com.pi.shop.payment8001.service.impl;

import com.pi.shop.common.entity.PaymentPo;
import com.pi.shop.payment8001.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PaymentServiceImplTest {

    @Resource
    private PaymentService paymentService;

    @Test
    public void createTest() {
        PaymentPo paymentPo = new PaymentPo();
        paymentPo.setSerial("1001");
        int result = paymentService.create(paymentPo);
        log.info("create result: {}", result);
    }

    @Test
    public void getPaymentByIdTest() {
        long id = 1;
        PaymentPo payment = paymentService.getPaymentById(id);
        log.info("query result: {}", payment);
    }
}
