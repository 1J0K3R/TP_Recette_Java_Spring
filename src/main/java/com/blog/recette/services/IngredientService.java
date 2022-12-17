package com.blog.recette.services;

import com.blog.recette.pojos.Ingredient;

import java.util.List;

public interface IngredientService {
    Ingredient ajouterIngredient(Ingredient ingredient);
    Ingredient recupererIngredient(Long idIngredient);
    List<Ingredient> recupererIngredients();
}
