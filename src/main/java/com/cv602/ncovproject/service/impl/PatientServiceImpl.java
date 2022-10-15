package com.cv602.ncovproject.service.impl;

import com.baomidou.mybatisplus.core.injector.methods.DeleteById;
import com.cv602.ncovproject.dao.PatientDao;
import com.github.pagehelper.PageHelper;
import com.cv602.ncovproject.domain.Patient;
import com.cv602.ncovproject.mapper.PatientMapper;
import com.cv602.ncovproject.model.PageModel;
import com.cv602.ncovproject.pojo.QueryBean;
import com.cv602.ncovproject.resp.RespModel;
import com.cv602.ncovproject.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author qin
 * @create 2022--10--11--9:09
 */
@Service
public class
PatientServiceImpl implements PatientService {
    @Resource
    private PatientMapper patientMapper;
    @Autowired
    private PatientDao patientDao;

    @Override
    public RespModel getAllPatient(QueryBean queryBean, Integer pageNum, Integer limit) {
        // 对用户输入要进行处理
        String name = queryBean.getName();
        if (name != null && !"".equals(name.trim())) {
            queryBean.setName("%" + name + "%");
            System.out.println(queryBean.getName());
        }
        try {
            /*
                select * from patient limit 0,10
                开始的索引 = （页码数 - 1）* 每页显示的数量
                使用 pagehelper 分页插件实现分页功能，只需要在查询所有的代码上添加一行代码，
                PageHelper.offsetPage(offset, limit);
                pagehelper会自动帮我们在 select * from patient 后面添加 limit条件
             */
            int offset = (pageNum - 1) * limit;
            PageHelper.offsetPage(offset, limit);
            List<Patient> allPatient = patientMapper.getAllPatient(queryBean);
            // 获取数据总数
            long totalCount = patientMapper.totalCount(queryBean);
            // 获取总页数
            long totalPage = totalCount % limit == 0 ? totalCount / limit : (totalCount / limit + 1);
            PageModel<Patient> patientPageModel = new PageModel<>(allPatient, totalCount, totalPage);
            return new RespModel("200", "请求成功", patientPageModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

    @Override
    public RespModel getCount() {
        try {
            return new RespModel("200", "请求成功", patientMapper.totalCount(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

    @Override
    public RespModel getByStateForPie() {
        try {
            return new RespModel("200", "请求成功", patientMapper.getCountByState());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

    //    新增
    @Override
    public RespModel getCountByMapS() {
        try {
            return new RespModel("200", "请求成功", patientMapper.getCountByMap());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

    @Override
    public RespModel getCountByZrS() {
        try {
            return new RespModel("200", "请求成功", patientMapper.getCountByZr());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

    @Override
    public RespModel getByLineChartShape() {
        try {
            return new RespModel("200", "请求成功", patientMapper.getCountByLineChart());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

    @Override
    public RespModel getydCount() {
        try {
            return new RespModel("200", "请求成功", patientMapper.ydCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }

/*TODO
*  如果没有影响行数那么就是请求失败*/

    @Override
    public RespModel deleteById(Integer id) {
        try {
            return new RespModel("200", "请求成功", patientDao.deleteById(id));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new RespModel("999", "网络异常");
    }


}
