package com.blog.recette.dao;

import com.blog.recette.pojos.Commentaire;
import com.blog.recette.pojos.Recette;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentaireDao extends JpaRepository<Commentaire, Long> {
    List<Commentaire> findByRecette(Recette recette);
}
