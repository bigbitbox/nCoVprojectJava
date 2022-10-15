package com.cv602.ncovproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author qin
 * @create 2022--10--11--9:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Integer id;
    private Integer districtId;
    private String patientName;
    private Integer age;
    private String patientType;
    private String patientState;
    private Date createDateTime;
    private Date sureTime;
    private Date cureTime;
    private Date dieTime;
}
