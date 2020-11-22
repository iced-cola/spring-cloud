package com.pi.shop.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 13:37:25
 * @description :  payment实体类
 * @since :  v1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentPo implements Serializable {

    // id
    private Long id;

    // 流水号
    private String serial;

}
