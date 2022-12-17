package com.blog.recette.services;

import com.blog.recette.pojos.Commentaire;
import java.util.List;

public interface CommentaireService {
    Commentaire ajouterCommentaire(Commentaire commentaire);
    Commentaire recupererCommentaire(Long idCommentaire);
    List<Commentaire> recupererCommentaires();
}
