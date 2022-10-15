package com.cv602.ncovproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author qin
 * @create 2022--10--11--14:57
 * 做统计查询的对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountBean {
    private Integer value; // 值
    private String name; // 类型
}
