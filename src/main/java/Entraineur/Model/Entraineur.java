package Entraineur.Model;

import User.Model.User;


public class Entraineur extends User {
    private int id;
    private String nom;
    private String specialite;


    public Entraineur() {
    }


    public Entraineur(int userId, String username, String password, String role, int id, String nom, String specialite) {
        super(userId, username, password, role);
        this.id = id;
        this.nom = nom;
        this.specialite = specialite;
    }

    // Getters and Setters
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

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
}