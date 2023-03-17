package com.ejercicio5.service;

import com.ejercicio5.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Service {
    List<Vehicle> vehicleList = new ArrayList<>();
    Scanner datum = new Scanner(System.in);

    //metodo para listar vehiculos
    public void toList(){

        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.toString());
        }
    }
    //metodo para registrar vehiculos tipo motocicleta
    public void registerMotorcycle(){
        Vehicle motorcycle = new Motorcycle();
        System.out.print("\nIngrese la marca del vehiculo: ");
        motorcycle.setvehicleBrand(datum.next());
        System.out.print("\nNumero de pasajeros: ");
        motorcycle.setPassengerNumber(datum.nextInt());
        System.out.print("\nNumero de llantas: ");
        motorcycle.setWheelsNumber(datum.nextInt());
        System.out.print("\nEl vehiculo cuenta con tripulacion?: ");
        motorcycle.setCrew(datum.next());
        System.out.print("\nFecha de matricula del vehiculo: ");
        motorcycle.setDateOfRegistration(datum.next());
        System.out.print("\nColor del vehiculo: ");
        motorcycle.setVehicleColor(datum.next());
        System.out.print("\nVelocidad maxima (km/h): ");
        ((Motorcycle) motorcycle).setMaxSpeed(datum.nextInt());
        System.out.println("\nCilindraje: ");
        ((Motorcycle) motorcycle).setCylinderCapacity(datum.next());
        System.out.println("\nPeso: ");
        ((Motorcycle) motorcycle).setWeight(datum.nextFloat());
        vehicleList.add(motorcycle);
    }
    //metodo para registrar vehiculos tipo carro
    public void registerCar(){
        Vehicle car = new Car();
        System.out.print("\nIngrese la marca del vehiculo: ");
        car.setvehicleBrand(datum.next());
        System.out.print("\nNumero de pasajeros: ");
        car.setPassengerNumber(datum.nextInt());
        System.out.print("\nNumero de llantas: ");
        car.setWheelsNumber(datum.nextInt());
        System.out.print("\nEl vehiculo cuenta con tripulacion?: ");
        car.setCrew(datum.next());
        System.out.print("\nFecha de matricula del vehiculo: ");
        car.setDateOfRegistration(datum.next());
        System.out.print("\nColor del vehiculo: ");
        car.setVehicleColor(datum.next());
        System.out.print("\nModelo: ");
        ((Car) car).setModel(datum.next());
        System.out.print("\nPrecio: ");
        ((Car) car).setPrice(datum.nextInt());
        System.out.println("tipo de caja: ");
        ((Car) car).setBoxType(datum.next());
        vehicleList.add(car);
    }
    //metodo para registrar vehiculos tipo camion
    public void registerTruck(){
        Vehicle truck = new Truck();
        System.out.print("\nIngrese la marca del vehiculo: ");
        truck.setvehicleBrand(datum.next());
        System.out.print("\nNumero de pasajeros: ");
        truck.setPassengerNumber(datum.nextInt());
        System.out.print("\nNumero de llantas: ");
        truck.setWheelsNumber(datum.nextInt());
        System.out.print("\nEl vehiculo cuenta con tripulacion?: ");
        truck.setCrew(datum.next());
        System.out.print("\nFecha de matricula del vehiculo: ");
        truck.setDateOfRegistration(datum.next());
        System.out.print("\nColor del vehiculo: ");
        truck.setVehicleColor(datum.next());
        System.out.print("\nAltura (mts): ");
        ((Truck) truck).setHeight(datum.nextDouble());
        System.out.print("\nCarga maxima (kg): ");
        ((Truck) truck).setMaxLoad(datum.next());
        vehicleList.add(truck);
    }
    //metodo para registrar vehiculos tipo bote
    public void registerBoat(){
        Vehicle boat = new Boat();
        System.out.print("\nIngrese la marca del vehiculo: ");
        boat.setvehicleBrand(datum.next());
        System.out.print("\nNumero de pasajeros: ");
        boat.setPassengerNumber(datum.nextInt());
        System.out.print("\nNumero de llantas: ");
        boat.setWheelsNumber(datum.nextInt());
        System.out.print("\nEl vehiculo cuenta con tripulacion?: ");
        boat.setCrew(datum.next());
        System.out.print("\nFecha de matricula del vehiculo: ");
        boat.setDateOfRegistration(datum.next());
        System.out.print("\nColor del vehiculo: ");
        boat.setVehicleColor(datum.next());
        System.out.print("\nPotencia: ");
        ((Boat) boat).setPower(datum.next());
        System.out.print("\nMotor: ");
        ((Boat) boat).setMotor(datum.next());
        vehicleList.add(boat);
    }
    //metodo para registrar vehiculos tipo bicicleta
    public void registerBicycle(){
        Vehicle bicycle = new Bicycle();
        System.out.print("\nIngrese la marca del vehiculo: ");
        bicycle.setvehicleBrand(datum.next());
        System.out.print("\nNumero de pasajeros: ");
        bicycle.setPassengerNumber(datum.nextInt());
        System.out.print("\nNumero de llantas: ");
        bicycle.setWheelsNumber(datum.nextInt());
        System.out.print("\nEl vehiculo cuenta con tripulacion?: ");
        bicycle.setCrew(datum.next());
        System.out.print("\nFecha de matricula del vehiculo: ");
        bicycle.setDateOfRegistration(datum.next());
        System.out.print("\nColor del vehiculo: ");
        bicycle.setVehicleColor(datum.next());
        System.out.print("\nMaterial: ");
        ((Bicycle) bicycle).setMaterial(datum.next());
        System.out.print("Tamaño de llanta (Pg): ");
        ((Bicycle) bicycle).setTireSize(datum.next());
        vehicleList.add(bicycle);
    }

}
