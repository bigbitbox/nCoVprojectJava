package com.cv602.ncovproject.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

@Data
public class District {
    private Integer id;
    private Integer cityid;
    private String name;
    private Integer postcode;
}
