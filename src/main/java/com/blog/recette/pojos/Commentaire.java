package com.blog.recette.pojos;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String auteur;
    private String Contenu;
    private int note;
    private Date dateCreation;

    @ManyToOne
    private Recette recette;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getContenu() {
        return Contenu;
    }

    public void setContenu(String contenu) {
        Contenu = contenu;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Recette getRecette() {
        return recette;
    }

    public void setRecette(Recette recette) {
        this.recette = recette;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Commentaire() {
    }

    public Commentaire(String auteur, String contenu, int note, Date dateCreation) {
        this.auteur = auteur;
        Contenu = contenu;
        this.note = note;
        this.dateCreation = dateCreation;
    }
}
