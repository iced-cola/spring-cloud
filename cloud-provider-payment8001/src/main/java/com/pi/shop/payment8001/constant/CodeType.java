package com.pi.shop.payment8001.constant;

/**
 * @author :  zhulongkun20@gmail.com
 * @create :  11-21-2020 14:42:01
 * @description :  返回代码
 * @since :  v1.0
 */
public enum CodeType {
    SUCCESS(200, "操作成功"),
    PARAM_ERROR(400, "参数错误"),
    FORBIDDEN(403, "权限不足"),
    INTERNAL_ERROR(500, "系统错误");

    private Integer code;

    private String message;

    CodeType(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
