package com.blog.recette.dao;

import com.blog.recette.pojos.Categorie;
import com.blog.recette.pojos.Membre;
import com.blog.recette.pojos.Recette;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetteDao extends JpaRepository<Recette, Long> {

    // Par dérivation
    List<Recette> findByMembre(Membre membre);
    List<Recette> findByCategorie(Categorie categorie);
}
