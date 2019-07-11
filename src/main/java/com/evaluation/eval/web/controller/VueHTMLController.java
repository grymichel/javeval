package com.evaluation.eval.web.controller;

import com.evaluation.eval.DAO.ConstructeurDAO;
import com.evaluation.eval.DAO.VoitureDAO;
import com.evaluation.eval.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class VueHTMLController {

    @Autowired
    private VoitureDAO voitureDAO;

    @GetMapping(value= "/vue/voiture")
    public String pageAccueil(Model model) {
        System.err.println("in");
        List<Voiture> voiture = voitureDAO.findAll();
        System.err.println(voiture);

        model.addAttribute("vs", voiture);
        return "Acceuil";
    }


    @GetMapping(value= "/voiture/detail/{id}")
    public String voituredetail(Model model, @PathVariable int id) {

        Voiture voiture = voitureDAO.findById(id);

        model.addAttribute("v", voiture );
        return "Detailvoiture";
    }


}
