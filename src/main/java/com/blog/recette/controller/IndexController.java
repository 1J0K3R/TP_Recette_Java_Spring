package com.blog.recette.controller;


import com.blog.recette.pojos.Recette;
import com.blog.recette.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Access;

@Controller
@RequestMapping("/")
public class IndexController {

    @Autowired
    RecetteService recetteService;

    public IndexController(RecetteService recetteService) {
        super();
        this.recetteService = recetteService;
    }

    @GetMapping({ "index"})
    public String index(){

        return "index";
    }

    @GetMapping("recette/{id}")
    public String testPathVariable(Model model, @PathVariable long id)
    {
        Recette recette = recetteService.recupererRecette(id);

        model.addAttribute("recette", recette);

        return "recette_id";
    }
}
