package com.cv602.ncovproject.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cv602.ncovproject.domain.Patient;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientDao extends BaseMapper<Patient> {
}
