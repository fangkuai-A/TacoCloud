package com.zimo.taco.service.impl;

import com.zimo.taco.mapper.IngredientMapper;
import com.zimo.taco.pojo.Ingredient;
import com.zimo.taco.service.IngredientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Create by zimo at 2021/12/16
 */
@Service
public class IngredientServiceImpl implements IngredientService {

    @Resource
    private IngredientMapper ingredientMapper;

    @Override
    public List<Ingredient> getAllIngredient() {
        return ingredientMapper.getAllIngredient();
    }
}
