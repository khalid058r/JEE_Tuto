package com.tp.tp7_spring.entities;


public class Client {

    private Long code;
    private String nom;
    private String prenom;
    private int age;
    private String ville;

    public Client() {}

    public Long getCode() { return code; }
    public void setCode(Long code) { this.code = code; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getVille() { return ville; }
    public void setVille(String ville) { this.ville = ville; }
}

