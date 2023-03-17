package com.ejercicio5.gui;

import com.ejercicio5.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer;
        Scanner datum = new Scanner(System.in);
        Service service = new Service();

        do {
            System.out.println("""
                    Registro de vheiculos:
                    1. Carro
                    2. Motocicleta
                    3. Camion
                    4. Bote
                    5. Bicicleta""");
            answer = datum.nextInt();
            switch (answer){
                case 1:
                    service.registerCar();
                    break;
                case 2:
                    service.registerMotorcycle();
                    break;
                case 3:
                    service.registerTruck();
                    break;
                case 4:
                    service.registerBoat();
                    break;
                case 5:
                    service.registerBicycle();
                    break;
                default:
                    System.out.println("Opcion erronea");
                    break;
            }
            System.out.println("Continuar registrando vehiculos"+"\n1. si"+"\n2. no");
            answer = datum.nextInt();
        } while (answer == 1);

        service.toList();

    }
}
