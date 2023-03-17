package com.ejercicio5.model;

public class Truck extends Vehicle {
    private double height;
    private String maxLoad;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(String maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAltura: " + height + " mts"+
                "\nCarga maxima:" + maxLoad +" kg";
    }
}
