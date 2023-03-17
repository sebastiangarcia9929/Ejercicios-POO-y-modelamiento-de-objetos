package com.ejercicio4.gui;

import com.ejercicio4.service.Service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int answer;
        Scanner datum = new Scanner(System.in);
        Service service = new Service();

        do {
            service.registerVehicle();
            System.out.println("\nContinuar registrando vehiculos \n1. si \n2. no");
            answer = datum.nextInt();
        } while (answer == 1);

        service.toList();

    }
}
