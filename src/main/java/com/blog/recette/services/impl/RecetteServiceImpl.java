package com.blog.recette.services.impl;

import com.blog.recette.dao.CommentaireDao;
import com.blog.recette.dao.IngredientDao;
import com.blog.recette.dao.RecetteDao;
import com.blog.recette.pojos.Commentaire;
import com.blog.recette.pojos.Ingredient;
import com.blog.recette.pojos.Recette;
import com.blog.recette.services.RecetteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetteServiceImpl implements RecetteService {
    @Autowired
    private RecetteDao recetteDao;

    @Autowired
    private IngredientDao ingredientDao;

    @Autowired
    private CommentaireDao commentaireDao;

    @Override
    public Recette ajouterRecette(Recette recette){
        return  recetteDao.save(recette);
    }

    @Override
    public Recette recupererRecette(Long idRecette){
        return recetteDao.findById(idRecette).orElse(null);
    }
    @Override
    public List<Recette> recupererRecettes(){
        return recetteDao.findAll();
    }

    @Override
    public List<Ingredient> recupererIngredients(Recette recette){
        return  ingredientDao.findByRecette(recette);
    }
    @Override
    public List<Commentaire> recupererCommentaires(Recette recette){
        return commentaireDao.findByRecette(recette);
    }
}
