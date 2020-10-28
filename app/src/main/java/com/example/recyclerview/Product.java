package com.example.recyclerview;

public class Product {
    private String id;
    private String nom;
    private int image;

    public Product() {
    }

    public Product(String id, String nom, int image) {
        this.id = id;
        this.nom = nom;
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
