package com.blog.recette.controller;

import com.blog.recette.pojos.*;
import com.blog.recette.services.*;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.lang.reflect.Member;
import java.util.Date;
import java.util.List;

// On indique à Spring que cette classe fait partie de la couche contrôleur
@Controller
public class RecetteController {

    // Le contrôleur à besoin de services
    // autrement dit il délègue des traitements à un ou plusieurs services
    private MembreService membreService;
    private CategorieService categorieService;
    private RecetteService recetteService;
    private IngredientService ingredientService;
    private CommentaireService commentaireService;

    // Ce constructeur va provoquer l'inhection de dépendances

    public RecetteController(MembreService membreService, CategorieService categorieService, RecetteService recetteService, IngredientService ingredientService, CommentaireService commentaireService) {
        super();
        this.membreService = membreService;
        this.categorieService = categorieService;
        this.recetteService = recetteService;
        this.ingredientService = ingredientService;
        this.commentaireService = commentaireService;
    }

    /*
    // Cette méthode sera invoquée dès que Spring a injecté tous les objets
    @PostConstruct
    private void init(){
        // Membres Jean
        Membre jean = new Membre("Jean", "Jean-jean", "jj1230", "jean@gmail.com", new Date(12/12/2000));
        membreService.ajouterMembre(jean);

        // Membres Luc
        Membre luc = new Membre("Luc", "Lulu", "luludu69", "lulu@hotmail.com", new Date(17/02/1999));
        membreService.ajouterMembre(luc);

        // 2 Categories
        Categorie categorie1 = new Categorie("categorie1");
        Categorie categorie2 = new Categorie("categorie2");
        categorieService.ajouterCategorie(categorie1);
        categorieService.ajouterCategorie(categorie2);

        // Recette Soupe de Legume
        Recette soupeLegume = new Recette("Soupe", "Soupe de légumes bio pour 5 personnes", "Jean", "Soupe.jpg", new Date(22/11/2022));
        recetteService.ajouterRecette(soupeLegume);
        Ingredient patates = new Ingredient("Patate", 200, "Grammes", soupeLegume);
        Ingredient courgette = new Ingredient("Courgette", 400, "Grammes", soupeLegume);
        Ingredient champignons = new Ingredient("Champignons", 100, "Grammes", soupeLegume);
        Ingredient creme = new Ingredient("Crème", 500, "MilliLitres", soupeLegume);
        Ingredient boeuf = new Ingredient("Boeuf", 1, "KiloGrammes", soupeLegume);
        ingredientService.ajouterIngredient(patates);
        ingredientService.ajouterIngredient(courgette);
        ingredientService.ajouterIngredient(champignons);
        ingredientService.ajouterIngredient(creme);
        ingredientService.ajouterIngredient(boeuf);

        // Recette Couscous
        Recette couscous = new Recette("Couscous", "Couscous épicée", "Luc", "Couscous.jpg", new Date(20/10/2022));
        recetteService.ajouterRecette(couscous);
        Ingredient merguez = new Ingredient("Merguez", 500, "Grammes", couscous);
        Ingredient mouton = new Ingredient("Mouton", 500, "Grammes", couscous);
        Ingredient semoule = new Ingredient("Semoule", 1, "KiloGrammes", couscous);
        Ingredient poichiche = new Ingredient("Poichiche", 100, "Grammes", couscous);
        Ingredient haricot = new Ingredient("Haricot", 500, "Grammes", couscous);
        ingredientService.ajouterIngredient(merguez);
        ingredientService.ajouterIngredient(mouton);
        ingredientService.ajouterIngredient(semoule);
        ingredientService.ajouterIngredient(poichiche);
        ingredientService.ajouterIngredient(haricot);

        // Recette Tartiflette au reblochon
        Recette tartiflette = new Recette("Tartiflette", "La tartiflette savoyarde est un gratin de pommes de terre avec du Reblochon fondu dessus", "Nicolas", "tartiflette.jpg", new Date(23/11/2022));
        recetteService.ajouterRecette(tartiflette);
        Ingredient reblochon = new Ingredient("Reblochon", 500, "Grammes", tartiflette);
        Ingredient pommesDeTerre = new Ingredient("Pomme de terre", 1, "KiloGramme", tartiflette);
        Ingredient lardon = new Ingredient("Lardons", 200, "Grammes", tartiflette);
        Ingredient oignon = new Ingredient("Oignons", 200, "Grammes", tartiflette);
        ingredientService.ajouterIngredient(reblochon);
        ingredientService.ajouterIngredient(pommesDeTerre);
        ingredientService.ajouterIngredient(lardon);
        ingredientService.ajouterIngredient(oignon);

        // Recettte Velouté de carottes au cumin
        Recette velouteCarottesCumin = new Recette("Velouté de carottes au cumin", "Un velouté de carotte au cumin", "Nicolas", "veloute-de-carotte-au-cumin.jpg", new Date(23/11/2022));
        recetteService.ajouterRecette(velouteCarottesCumin);
        Ingredient carotte = new Ingredient("Carotte", 500, "Grammes", velouteCarottesCumin);
        Ingredient cumin = new Ingredient("Epice de Cumin", 50, "Grammes", velouteCarottesCumin);
        Ingredient cremeAllegee = new Ingredient("Creme allégée en matières grasse", 200, "MilliLitres", velouteCarottesCumin);
        ingredientService.ajouterIngredient(carotte);
        ingredientService.ajouterIngredient(cumin);
        ingredientService.ajouterIngredient(cremeAllegee);


        // Commentaire Soupe
        Commentaire comSoupe = new Commentaire("Lucas", "J'ai trouvé ce plat très bon et copieux.", 8,new Date());
        commentaireService.ajouterCommentaire(comSoupe);
        // Commentaire Couscous
        Commentaire comCouscous = new Commentaire("Jacque", "Ce plat était épicée mais c'est ce que je recherchais, j'ai été agréablement surpris", 9, new Date());
        commentaireService.ajouterCommentaire(comCouscous);
        // Commentaire Tartiflette au reblochon
        Commentaire comTartiflette = new Commentaire("Brandon", "Ce plat était incroyable.", 10, new Date());
        commentaireService.ajouterCommentaire(comTartiflette);
        // Commentaire Velouté de carottes au cumin
        Commentaire comVeloute = new Commentaire("lea", "Ce plat n'était pas terrible.", 3, new Date());
        commentaireService.ajouterCommentaire(comVeloute);
    }
    */
}
