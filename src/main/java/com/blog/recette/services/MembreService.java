package com.blog.recette.services;

import com.blog.recette.pojos.Membre;
import com.blog.recette.pojos.Recette;

import java.util.List;

public interface MembreService {
    Membre ajouterMembre(Membre membre);
    Membre recupererMembre(Long idMembre);
    List<Membre> recupererMembres();
    List<Recette> recupererRecettes(Membre membre);
}
