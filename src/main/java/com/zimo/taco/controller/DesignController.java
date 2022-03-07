package com.zimo.taco.controller;

import com.zimo.taco.pojo.Ingredient;
import com.zimo.taco.pojo.Taco;
import com.zimo.taco.service.IngredientService;
import com.zimo.taco.service.TacoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create by zimo at 2021/12/16
 */
@Log4j2
@Controller
@RequestMapping("/design")
public class DesignController {

    @Autowired
    IngredientService ingredientService;

    @Autowired
    TacoService tacoService;

    @ModelAttribute
    public void addIngredientToModel(Model model) {
        List<Ingredient> ingredients;
        ingredients = ingredientService.getAllIngredient();
        log.info(String.valueOf(ingredients));
        Ingredient.Type[] types = Ingredient.Type.values();
        for (Ingredient.Type type : types) {
            model.addAttribute(
                    type.toString().toLowerCase(),
                    filterByType(ingredients, type)
            );
        }
    }

    @GetMapping
    public String showDesignForm(Model model) {
        model.addAttribute("taco", new Taco());
        return "design";
    }

    @PostMapping
    public String processTaco(Taco taco){
        // save the taco
        tacoService.addTaco(taco);
        log.info("Process taco: " + taco);
        log.info("taco.id = " + taco.getId());
        return "redirect:/orders/current";
    }

    private Iterable<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}
