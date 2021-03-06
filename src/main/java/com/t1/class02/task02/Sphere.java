package com.t1.class02.task02;

public class Sphere extends Abstract3dFigure{
    double r;
    Sphere(String name, double r) {
        super.setName(name);
        this.r = r;
    }
    double getVolume() {
        return Math.PI*r*r*r*4/3;
    };
    double getSurfaceArea() {
        return 4*Math.PI*r*r;
    };
}