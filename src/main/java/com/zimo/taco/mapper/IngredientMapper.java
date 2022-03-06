package com.zimo.taco.mapper;

import com.zimo.taco.pojo.Ingredient;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Create by zimo at 2021/12/16
 */
@Mapper
public interface IngredientMapper {

    List<Ingredient> getAllIngredient();
}
