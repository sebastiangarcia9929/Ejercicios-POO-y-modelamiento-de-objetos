package com.ejercicio4.service;

import com.ejercicio4.model.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Service {
    List<Vehicle> vehicleList = new ArrayList<>();
    Scanner datum = new Scanner(System.in);

    //metodo para registrar vehiculos
    public void registerVehicle(){
        Vehicle vehicle = new Vehicle();

        System.out.print("\nIngrese la marca del vehiculo: ");
        vehicle.setvehicleBrand(datum.next());
        System.out.print("\nNumero de pasajeros: ");
        vehicle.setPassengerNumber(datum.nextInt());
        System.out.print("\nNumero de llantas: ");
        vehicle.setWheelsNumber(datum.nextInt());
        System.out.print("\nEl vehiculo cuenta con tripulacion?: ");
        vehicle.setCrew(datum.next());
        System.out.print("\nFecha de matricula del vehiculo: ");
        vehicle.setDateOfRegistration(datum.next());
        System.out.print("\nColor del vehiculo: ");
        vehicle.setVehicleColor(datum.next());
        vehicleList.add(vehicle);
    }

    //metodo para listar vehiculos
    public void toList(){

        for (int i=0; i<vehicleList.size();i++){
            System.out.println(vehicleList.get(i).toString());

        }

    }
}
