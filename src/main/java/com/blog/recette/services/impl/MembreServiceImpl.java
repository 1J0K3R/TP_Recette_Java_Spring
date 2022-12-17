package com.blog.recette.services.impl;

import com.blog.recette.dao.MembreDao;
import com.blog.recette.dao.RecetteDao;
import com.blog.recette.pojos.Membre;
import com.blog.recette.pojos.Recette;
import com.blog.recette.services.MembreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembreServiceImpl implements MembreService {
    @Autowired
    private MembreDao membreDao;

    @Autowired
    private RecetteDao recetteDao;

    @Override
    public Membre ajouterMembre(Membre membre){
        return membreDao.save(membre);
    }

    @Override
    public Membre recupererMembre(Long idMembre){
        return membreDao.findById(idMembre).orElse(null);
    }

    @Override
    public List<Membre> recupererMembres() {
        return membreDao.findAll();
    }

    @Override
    public List<Recette> recupererRecettes(Membre membre){
        return recetteDao.findByMembre(membre);
    }
}
