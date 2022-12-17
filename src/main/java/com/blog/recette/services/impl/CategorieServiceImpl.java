package com.blog.recette.services.impl;

import com.blog.recette.dao.CategorieDao;
import com.blog.recette.dao.RecetteDao;
import com.blog.recette.pojos.Categorie;
import com.blog.recette.pojos.Recette;
import com.blog.recette.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService {

    @Autowired
    private CategorieDao categorieDao;

    @Autowired
    private RecetteDao recetteDao;

    @Override
    public Categorie ajouterCategorie(Categorie categorie){
        return categorieDao.save(categorie);
    }

    @Override
    public Categorie recupererCategorie(Long idCategorie){
        return categorieDao.findById(idCategorie).orElse(null);
    }

    @Override
    public List<Categorie> recupererCategories(){
        return categorieDao.findAll();
    }

    @Override
    public List<Recette> recupererRecettes(Categorie categorie){
        return recetteDao.findByCategorie(categorie);
    }

}
