package com.sebastian.garcia.model;

public class Planet {

    private String name;
    private int id;
    private  double mass;
    private  double density;
    private double diameter;
    private double distanceSun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getDistanceSun() {
        return distanceSun;
    }

    public void setDistanceSun(double distanceSun) {
        this.distanceSun = distanceSun;
    }

    @Override
    public String toString() {
        return  "Nombre:" + name +
                "\nId:" + id +
                "\nMass:" + mass +
                "\nDensidad:" + density +
                "\nDiametro" + diameter +
                "\nDistancia al sol:" + distanceSun;
    }
}
