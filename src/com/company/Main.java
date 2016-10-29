package com.company;

public class Main {

    public static void main(String[] args) {
	PointNOM X = new PointNOM("X",7,1);
    PointNOM Z = new PointNOM("Z",3);
    PointNOM O = new PointNOM("O");

        System.out.println("-- les coordonees des points X,Z,O sont :");
        X.afficheCor();
        Z.afficheCor();
        O.afficheCor();

        System.out.println(" -- Utilisation de la methode deplace et afficher ");

        X.deplace(5,3);
        Z.deplace1(7);
        O.deplace(8,3);

        X.afficheCor();
        Z.afficheCor();
        O.afficheCor();


}}
