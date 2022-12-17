package com.blog.recette.services;

import com.blog.recette.pojos.Commentaire;
import com.blog.recette.pojos.Ingredient;
import com.blog.recette.pojos.Recette;

import java.util.List;

public interface RecetteService {
    Recette ajouterRecette(Recette recette);
    Recette recupererRecette(Long idRecette);
    List<Recette> recupererRecettes();
    List<Ingredient> recupererIngredients(Recette recette);
    List<Commentaire> recupererCommentaires(Recette recette);
}
