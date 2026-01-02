package com.tp.tp_jsf_part1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ManagedBean(name = "etudiant")
@SessionScoped
public class Etudiant implements Serializable {

    private int id;
    private String cne;
    private String nom;
    private String prenom;
    private String ville;
    private Date dateNaissance;
    private int bourse;

    private List<Etudiant> etudiants = new ArrayList<>();
    public Etudiant() {}

    public Etudiant(int id, String cne, String nom, String prenom, String ville, Date dateNaissance, int bourse) {
        this.id = id;
        this.cne = cne;
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
        this.dateNaissance = dateNaissance;
        this.bourse = bourse;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getCne() {return cne;}
    public void setCne(String cne) {this.cne = cne;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public String getVille() {return ville;}
    public void setVille(String ville) {this.ville = ville;}
    public Date getDateNaissance() {return dateNaissance;}
    public void setDateNaissance(Date dateNaissance) {this.dateNaissance = dateNaissance;}
    public int getBourse() {return bourse;}
    public void setBourse(int bourse) {this.bourse = bourse;}
    public List<Etudiant> getEtudiants() {return etudiants;}
    public void setEtudiants(List<Etudiant> etudiants) {this.etudiants = etudiants;}
    public String enregistrer() {
        Etudiant e = new Etudiant(id, cne,nom, prenom, ville, dateNaissance,bourse);
        etudiants.add(e);
        return "affichage";
    }
}
