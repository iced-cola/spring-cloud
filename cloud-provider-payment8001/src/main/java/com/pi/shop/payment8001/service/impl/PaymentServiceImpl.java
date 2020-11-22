package com.pi.shop.payment8001.service.impl;

import com.pi.shop.common.entity.PaymentPo;
import com.pi.shop.payment8001.dao.PaymentDao;
import com.pi.shop.payment8001.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 14:32:29
 * @description :  支付接口实现类
 * @since :  v1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(PaymentPo paymentPo) {
        return paymentDao.insert(paymentPo);
    }

    @Override
    public PaymentPo getPaymentById(long id) {
        return paymentDao.selectById(id);
    }

}
