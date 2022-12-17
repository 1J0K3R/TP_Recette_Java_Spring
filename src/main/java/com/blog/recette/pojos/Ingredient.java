package com.blog.recette.pojos;

import javax.persistence.*;

@Entity
public class Ingredient {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private int quantité;
    private String unit;

    @ManyToOne
    private Recette recette;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantité() {
        return quantité;
    }

    public void setQuantité(int quantité) {
        this.quantité = quantité;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
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

    public Ingredient() {
    }

    public Ingredient(String nom, int quantité, String unit, Recette recette) {
        this.nom = nom;
        this.quantité = quantité;
        this.unit = unit;
        this.recette = recette;
    }
}
