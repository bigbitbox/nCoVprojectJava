package com.cv602.ncovproject.dao;


import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cv602.ncovproject.domain.District;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
@TableName("district")
public interface DistrictDao extends BaseMapper<District> {
    @Select("select * from district where id = #{id}")
    District findById(Integer id);

}
