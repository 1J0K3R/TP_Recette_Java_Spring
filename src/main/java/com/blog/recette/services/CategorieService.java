package com.blog.recette.services;

import com.blog.recette.pojos.Categorie;
import com.blog.recette.pojos.Recette;

import java.util.List;

public interface CategorieService {
    Categorie ajouterCategorie(Categorie categorie);
    Categorie recupererCategorie(Long idCategorie);
    List<Categorie> recupererCategories();
    List<Recette> recupererRecettes(Categorie categorie);
}
