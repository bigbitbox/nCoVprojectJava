package com.cv602.ncovproject.controller;

import com.cv602.ncovproject.pojo.QueryBean;
import com.cv602.ncovproject.resp.RespModel;
import com.cv602.ncovproject.service.PatientService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author qin
 * @create 2022--10--11--9:10
 */
@RequestMapping("/patient")
@RestController
public class PatientController {
    @Resource
    private PatientService patientService;

    @GetMapping("/getAll")
    public RespModel getAll(QueryBean queryBean,
                            @RequestParam(defaultValue = "1") Integer pageNum,
                            @RequestParam(defaultValue = "10") Integer limit) {
        System.out.println("请求进来了...");
        System.out.println("queryBean:" + queryBean);
        System.out.println("pageNum:" + pageNum);
        System.out.println("limit:" + limit);
        return patientService.getAllPatient(queryBean, pageNum, limit);
    }

    @GetMapping("/count")
    public RespModel count() {
        System.out.println("累计确诊请求...");
        return patientService.getCount();
    }

    @GetMapping("/getByState")
    public RespModel getByState() {
        System.out.println("查询治疗中/已治愈/死亡 饼状图");
        return patientService.getByStateForPie();
    }

    //    新增
    @GetMapping("/ydCount")
    public RespModel ydCount() {
        System.out.println("1111");
        return patientService.getydCount();
    }

    @GetMapping("/getByLineChartShape")
    public RespModel getByLineChartShape() {
        System.out.println("查询治疗中/已治愈/死亡 饼状图");
        return patientService.getByLineChartShape();
    }

    @GetMapping("/getCountByMap")
    public RespModel getCountByMap() {
        System.out.println("查询治疗中各地区感染者");
        return patientService.getCountByMapS();
    }

    @GetMapping("/getCountByZr")
    public RespModel getCountByZr() {
        System.out.println("查询治疗中各地区感染者");
        return patientService.getCountByZrS();
    }

    @DeleteMapping("/deleteById/{id}")
    public RespModel deleteById(@PathVariable Integer id) {
        System.out.println("按照id删除 id为" + id);

        return patientService.deleteById(id);
    }
}
