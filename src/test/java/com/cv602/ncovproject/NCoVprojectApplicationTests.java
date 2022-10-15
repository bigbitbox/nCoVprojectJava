package com.cv602.ncovproject;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.cv602.ncovproject.dao.DistrictDao;
import com.cv602.ncovproject.dao.PatientDao;
import com.cv602.ncovproject.domain.District;
import com.cv602.ncovproject.domain.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NCoVprojectApplicationTests {

    @Autowired
    private DistrictDao districtDao;
    @Autowired
    private PatientDao patientDao;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetOne(){
        LambdaQueryWrapper<District> lqw = new LambdaQueryWrapper<District>();
        lqw.eq(District::getId,50);
        District district = districtDao.selectOne(lqw);
        System.out.println(district);
//        districtDao.findById(50);
//        List<Patient> patients = patientDao.selectList(null);
//        System.out.println(patients);
    }

    @Test
    void deleteById() {
        LambdaQueryWrapper<District> lqw = new LambdaQueryWrapper<District>();
        lqw.eq(District::getId,105);
        int i = patientDao.deleteById(103);
    }

}
