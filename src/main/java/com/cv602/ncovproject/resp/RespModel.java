package com.cv602.ncovproject.resp;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qin
 * @create 2022--10--11--9:36
 * 统一结果处理
 */
@Data
@NoArgsConstructor
public class RespModel {
    private String code; // 响应编码
    private String message; // 响应信息
    private Object data; // 响应结果

    public RespModel(String code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public RespModel(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
