package com.ejercicio5.model;

public class Bicycle extends Vehicle {
    private String material;
    private String tireSize;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTireSize() {
        return tireSize;
    }

    public void setTireSize(String tireSize) {
        this.tireSize = tireSize;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nMaterial: " + material +
                "\nTamaño de llanta: " + tireSize + " Pg" ;
    }
}
