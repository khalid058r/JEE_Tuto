package com.tp.tp_ejb.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Fournisseur
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String nom;
    private String adresse;

    @OneToMany(mappedBy = "fournisseur")
    private List<Produit> produitList;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produit> getProduitList() {
        return produitList;
    }

    public void setProduitList(List<Produit> produitList) {
        this.produitList = produitList;
    }
}

