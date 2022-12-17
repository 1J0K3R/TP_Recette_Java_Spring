package com.blog.recette.services.impl;

import com.blog.recette.dao.CommentaireDao;
import com.blog.recette.pojos.Commentaire;
import com.blog.recette.services.CommentaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentaireServiceImpl implements CommentaireService {
    @Autowired
    private CommentaireDao commentaireDao;

    @Override
    public Commentaire ajouterCommentaire(Commentaire commentaire){
        return commentaireDao.save(commentaire);
    }

    @Override
    public Commentaire recupererCommentaire(Long idCommentaire){
        return commentaireDao.findById(idCommentaire).orElse(null);
    }

    @Override
    public List<Commentaire> recupererCommentaires(){
        return commentaireDao.findAll();
    }
}
