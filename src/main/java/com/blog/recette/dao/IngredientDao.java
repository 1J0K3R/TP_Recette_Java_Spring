package com.blog.recette.dao;

import com.blog.recette.pojos.Ingredient;
import com.blog.recette.pojos.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientDao extends JpaRepository<Ingredient, Long> {
    List<Ingredient> findByRecette(Recette recette);
}
