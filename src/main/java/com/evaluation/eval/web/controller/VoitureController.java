package com.evaluation.eval.web.controller;

import com.evaluation.eval.DAO.VoitureDAO;
import com.evaluation.eval.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class VoitureController {

    @Autowired
    private VoitureDAO voitureDAO;

    @GetMapping(value= "/voiture")
    public List<Voiture> listeDesVoitures() { return voitureDAO.findAll();}

    @GetMapping(value= "/voiture/{id}")
    public Voiture listeParId(@PathVariable int id) { return voitureDAO.findById(id);}

    @PostMapping(value = "/voiture")
    public void ajouterVoiture(@RequestBody Voiture voiture){
        System.err.println("in");
        voitureDAO.save(voiture);
        System.err.println("out");
    }

    @PutMapping(value = "/voiture/maj")
    public void updateVoiture(@RequestBody Voiture v) {
        voitureDAO.save(v);
    }

    @GetMapping(value = "/voiture/parNom/{nom}")
    public Voiture obtenirVoitureAvecNom(@PathVariable String nom) {
        Voiture v = voitureDAO.findByNomIgnoreCase(nom);
        return v;
    }




}
