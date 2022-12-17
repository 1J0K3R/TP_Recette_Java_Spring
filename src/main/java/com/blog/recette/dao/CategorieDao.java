package com.blog.recette.dao;

import com.blog.recette.pojos.Categorie;
import com.blog.recette.pojos.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieDao  extends JpaRepository<Categorie, Long> {
}