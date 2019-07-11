package com.evaluation.eval.model;

import javax.persistence.*;

@Entity
@SequenceGenerator(name="seq", initialValue=10, allocationSize=100)
public class Voiture {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator="seq")
    private int id;
    @Column(unique=true)
    private String nom;
    private String  description;
    private int constructeur;
    private int production;
    private String image;

    public Voiture(){

    }

    public Voiture( String Nom , String  Description ,int Id  , int Constructeur,int Production,String Image ){
        super();
        this.nom=Nom;
        this.description=Description;
        this.id = Id;
        this.constructeur = Constructeur;
        this.production=Production;
        this.image=Image;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getConstructeur() {
        return constructeur;
    }

    public void setConstructeur(int constructeur) {
        this.constructeur = constructeur;
    }

    public int getProduction() {
        return production;
    }

    public void setProduction(int production) {
        this.production = production;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return id+ " " + nom +  "produite en " + description + "par " + constructeur;};


    }
