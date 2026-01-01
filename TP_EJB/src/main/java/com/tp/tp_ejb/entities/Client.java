package com.tp.tp_ejb.entities;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Client{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;

    private String nom;
    private String prenom;

    private String ville;

    @ManyToMany
    @JoinTable(
            name = "commander",
            joinColumns = @JoinColumn(name="client_id"),
            inverseJoinColumns = @JoinColumn(name="produit_id")
    )
    private List<Produit> produits;

    @OneToOne(mappedBy = "client")
    private CompteSociete compte;

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public CompteSociete getCompte() {
        return compte;
    }

    public void setCompte(CompteSociete compte) {
        this.compte = compte;
    }
}