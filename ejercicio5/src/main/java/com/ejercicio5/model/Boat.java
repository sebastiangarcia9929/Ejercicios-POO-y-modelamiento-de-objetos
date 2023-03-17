package com.ejercicio5.model;

public class Boat extends Vehicle{
    private String power;
    private String motor;

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPotencia: " + power +" hp"+
                "\nMotor: " + motor;
    }
}
