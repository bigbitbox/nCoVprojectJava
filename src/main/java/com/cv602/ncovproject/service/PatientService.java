package com.cv602.ncovproject.service;

import com.cv602.ncovproject.pojo.QueryBean;
import com.cv602.ncovproject.resp.RespModel;

/**
 * @author qin
 * @create 2022--10--11--9:08
 */
public interface PatientService {
    /**
     * 查询所有数据
     * 条件分页查询
     *
     * @return
     */
    RespModel getAllPatient(QueryBean queryBean, Integer pageNum, Integer limit);

    /**
     * 查询累计确诊
     */
    RespModel getCount();

    /**
     * 治疗中/已治愈/死亡 饼状图
     */
    RespModel getByStateForPie();

    //    新增
    RespModel getByLineChartShape();

    /**
     * 查询 各地区的感染人数
     */
    RespModel getCountByMapS();

    RespModel getCountByZrS();

    RespModel getydCount();


//    按id删除数据

    RespModel deleteById(Integer id);

}
