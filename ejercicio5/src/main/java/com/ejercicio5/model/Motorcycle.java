package com.ejercicio5.model;

public class Motorcycle extends Vehicle {
    private int maxSpeed;
    private String cylinderCapacity;
    private float weight;
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(String cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nVelocidad Maxima: " + maxSpeed + " km/h"+
                "\nCilindraje: " + cylinderCapacity  + " CC"+
                "\nPeso: " + weight;
    }
}
