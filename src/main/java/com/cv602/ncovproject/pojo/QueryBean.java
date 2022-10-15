package com.cv602.ncovproject.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author qin
 * @create 2022--10--12--9:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryBean {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date beginDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String name;
}
