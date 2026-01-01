package com.tp.tp_jsf_part1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Etudiant {

    private int id;
    private String nom;
    private String prenom;
    private String civilite;
    private int cp;
    private String email;
    private String telephone;
    private String ville;
    private Date dateNaissance;

    private List<Etudiant> list = new ArrayList<>();

    public Etudiant(int id, String nom, String prenom, String civilite, int cp, String email, String telephone, String ville, Date dateNaissance) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.cp = cp;
        this.email = email;
        this.telephone = telephone;
        this.ville = ville;
        this.dateNaissance = dateNaissance;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public List<Etudiant> getListe() { return list; }


    public void addEtudiant() {
        Etudiant etudiant = new Etudiant(id,nom,prenom,civilite,cp,email,telephone,ville,dateNaissance);
        list.add(etudiant);
    }
}
