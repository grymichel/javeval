package com.evaluation.eval.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="seq", initialValue=10, allocationSize=100)

public class Constructeur {

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private int id;
    private String nom;
    private int creation;
    private String fondateur;
    private String pays;

    public Constructeur(){

    }

    public Constructeur(int id,String nom,int creation,String fondateur, String pays){
        super();
        this.id = id;
        this.nom = nom;
        this.creation = creation;
        this.fondateur = fondateur;
        this.pays=pays;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public String getFondateur() {
        return fondateur;
    }

    public void setFondateur(String fondateur) {
        this.fondateur = fondateur;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @Override
    public String toString() {
        return id+ "Marque " + nom +"créée en " + creation  + " par " + fondateur + "dans le pays " + pays ; }

}
