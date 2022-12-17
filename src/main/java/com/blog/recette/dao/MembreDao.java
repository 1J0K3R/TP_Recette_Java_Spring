package com.blog.recette.dao;

import com.blog.recette.pojos.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembreDao  extends JpaRepository<Membre, Long> {
    // Methode par dérivation
    Membre findByPseudo(String pseudo);
}
