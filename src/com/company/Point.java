package com.company;

/**
 * Created by LAMIA on 29/10/2016.
 */
public class Point {
    private double x, y;


    public Point(double x, double y) {

        this.x = x;
        this.y = y;
    }

    public Point(double x) {
        this.x = x;
        this.y = x;

    }

    public Point() {
        this.x = this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void deplace(int dx, int dy) {
        x += dx;
        y += dy;
    }
    public void deplace1(int dx) {
        x += dx;
        y += dx;

    }


}

