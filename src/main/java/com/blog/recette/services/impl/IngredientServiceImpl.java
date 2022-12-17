package com.blog.recette.services.impl;

import com.blog.recette.dao.IngredientDao;
import com.blog.recette.pojos.Ingredient;
import com.blog.recette.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService {

    @Autowired
    private IngredientDao ingredientDao;

    @Override
    public Ingredient ajouterIngredient(Ingredient ingredient){
        return ingredientDao.save(ingredient);
    }

    @Override
    public Ingredient recupererIngredient(Long idIngredient){
        return ingredientDao.findById(idIngredient).orElse(null);
    }

    @Override
    public List<Ingredient> recupererIngredients(){
        return ingredientDao.findAll();
    }
}
