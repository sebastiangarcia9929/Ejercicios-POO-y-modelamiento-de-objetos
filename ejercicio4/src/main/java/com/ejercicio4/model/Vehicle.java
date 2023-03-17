package com.ejercicio4.model;

public class Vehicle {
    private int passengerNumber;
    private int wheelsNumber;
    private String crew;
    private String dateOfRegistration;
    private String vehicleColor;
    private String vehicleBrand;

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getDateOfRegistration() {
        return dateOfRegistration;
    }

    public void setDateOfRegistration(String dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public String getvehicleBrand() {
        return vehicleBrand;
    }

    public void setvehicleBrand(String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }

    @Override
    public String toString() {
        return  "\nMarca del vehiculo: " + vehicleBrand+
                "\nNumero de pasajeros: " + passengerNumber +
                "\nNumero de llantas: " + wheelsNumber +
                "\nTripulacion: " + crew +
                "\nFecha de matricula: " + dateOfRegistration  +
                "\nColor del vehiculo: " + vehicleColor
                ;
    }
}
