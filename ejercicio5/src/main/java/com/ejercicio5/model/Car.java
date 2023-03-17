package com.ejercicio5.model;

public class Car extends Vehicle{
    private String model;
    private int price;
    private String BoxType;
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getBoxType() {
        return BoxType;
    }

    public void setBoxType(String boxType) {
        BoxType = boxType;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nModelo: " + model +
                "\nPrecio: $ " + price +
                "\nTipo de caja'" + BoxType;
    }
}
