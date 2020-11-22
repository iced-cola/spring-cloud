package com.pi.shop.payment8004.service;

import com.pi.shop.common.entity.PaymentPo;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 14:31:55
 * @description :  支付服务
 * @since :  v1.0
 */
public interface PaymentService {

    int create(PaymentPo paymentPo);

    PaymentPo getPaymentById(long id);

}
