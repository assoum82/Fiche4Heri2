package com.company;

/**
 * Created by lamia on 29/10/2016.
 */
public class PointNOM extends Point {
    private String nom;

    public PointNOM(String nom, int x, int y) {
        super(x, y);
        this.nom = nom;
    }

    public PointNOM(String nom, int x) {
        super(x);
        this.nom = nom;
    }
    public PointNOM(String nom) {
        super();
        this.nom = nom;
    }



    public String getNom() {
        return nom;
    }

    public void afficheCor() {
        System.out.println(nom + "( " + getX() + " , " + getY() + " )");
    }
}

