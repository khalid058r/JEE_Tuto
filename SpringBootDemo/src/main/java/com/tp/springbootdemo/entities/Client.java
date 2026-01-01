package com.tp.springbootdemo.entities;


import jakarta.persistence.*;

@Entity
@Table(name="client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long code;

    private String nom;
    private String prenom;
    private String ville;
    private int age;

    public long getCode() {return code;}
    public void setCode(long code) {this.code = code;}
    public String getNom() {return nom;}
    public void setNom(String nom) {this.nom = nom;}
    public String getPrenom() {return prenom;}
    public void setPrenom(String prenom) {this.prenom = prenom;}
    public String getVille() {return ville;}
    public void setVille(String ville) {this.ville = ville;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
}
