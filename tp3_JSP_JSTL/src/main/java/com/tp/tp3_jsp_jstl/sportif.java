package com.tp.tp3_jsp_jstl;
public class sportif {
    private int id;
    private String code;
    private String nom;
    private String prenom;
    private int age;
    private String sexe;
    private String pays;
    private String discipline;

    public sportif() {}
    public sportif(int id,String code,String nom,String prenom,int age,String sexe, String pays, String discipline) {
        this.id = id;
        this.code = code;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.discipline = discipline;
        this.sexe = sexe;
        this.pays = pays;

    }
    public int getId() { return id; }
    public String getCode() { return code; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public int getAge() { return age; }
    public String getSexe() { return sexe; }
    public String getPays() { return pays; }
    public String getDiscipline() { return discipline; }
    public void setId(int id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

}
