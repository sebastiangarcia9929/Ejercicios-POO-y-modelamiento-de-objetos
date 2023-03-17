package com.sebastian.garcia.ui;

import com.sebastian.garcia.method.PlanetarySystem;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String planetOne;
        String planetTwo;
        int answer;
        Scanner dataEntry = new Scanner(System.in);
        PlanetarySystem planetarySystem = new PlanetarySystem();
        System.out.println("Registro de planetas");
        do {
            planetarySystem.registerPlanet();
            System.out.println("1. continuar registrando planetas"+"\n2. no continuar");
            answer = dataEntry.nextInt();
        }while (answer == 1);

        do {

            System.out.println("1. Listar planetas" + "\n2. Calcular atraccion gravitatoria");
            answer = dataEntry.nextInt();

            switch (answer) {
                case 1:
                    planetarySystem.toList();
                    break;
                case 2:
                    System.out.print("\ningrese el nombre del planeta #1: ");
                    planetOne = dataEntry.next();
                    System.out.print("\ningrese el nombre del planeta #2: ");
                    planetTwo = dataEntry.next();
                    planetarySystem.CalculateAttraction(planetOne, planetTwo);
                    break;

                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
            System.out.println("1. Volver al menu"+"\n2. finalizar ejecucion");
            answer = dataEntry.nextInt();
        }while (answer == 1);

    }
}
