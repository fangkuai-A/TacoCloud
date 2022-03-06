package com.zimo.taco.mapper;


import com.zimo.taco.pojo.Taco;
import org.apache.ibatis.annotations.Mapper;

/**
 * Create by zimo at 2021/12/16
 */
@Mapper
public interface TacoMapper {

    Integer addTaco(Taco taco);
}
