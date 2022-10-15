package com.cv602.ncovproject.mapper;

import com.cv602.ncovproject.domain.Patient;
import com.cv602.ncovproject.pojo.CountBean;
import com.cv602.ncovproject.pojo.MonthBean;
import com.cv602.ncovproject.pojo.QueryBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author qin
 * @create 2022--10--11--9:05
 */
@Mapper
public interface PatientMapper {
    /**
     * 动态sql条件查询
     *
     * @return
     */
    List<Patient> getAllPatient(QueryBean queryBean);

    /**
     * 查询数据总数
     */
    long totalCount(QueryBean queryBean);

    /**
     * 查询 治疗中/已治愈/死亡 总数
     */
    List<CountBean> getCountByState();


    //    新增
    List<MonthBean> getCountByLineChart();

    /**
     * 查询 各地区的感染人数
     */
    List<CountBean> getCountByMap();

    /**
     * 查询 昨日各省新增
     */
    List<CountBean> getCountByZr();

    long ydCount();

}
