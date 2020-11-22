package com.pi.shop.payment8004.dao;

import com.pi.shop.common.entity.PaymentPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 13:45:50
 * @description :  支付数据访问层
 * @since :  v1.0
 */
@Mapper
//@Repository 需要配置扫描再注入
public interface PaymentDao {

    int insert(PaymentPo paymentPo);

    PaymentPo selectById(@Param("id") Long id);

}
