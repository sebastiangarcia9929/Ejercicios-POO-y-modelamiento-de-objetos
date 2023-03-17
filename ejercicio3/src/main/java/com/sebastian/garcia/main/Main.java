package com.sebastian.garcia.main;



import com.sebastian.garcia.method.Methods;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int answer;
        int max = 10;
        Scanner entrada = new Scanner(System.in);
        Methods method = new Methods();
        int[] realNumbers;

        System.out.println("cantidad de numeros aleatorios a generar: ");
        answer = entrada.nextInt();
        realNumbers = new int[answer];
        System.out.println();

        Random RandomNumber = new Random();
        for (int i = 0; i < realNumbers.length; i++) {
            realNumbers[i] = RandomNumber.nextInt(max);
            System.out.print(realNumbers[i]);
            if (i < realNumbers.length-1) {
                System.out.print(",");
            }
        }
        System.out.println("\nOrdenar por:\n1. metodo burbuja\n2. metodo quick sort");
        answer=entrada.nextInt();

        switch (answer) {
            case 1:
                method.bubble(realNumbers);
                System.out.println("\numeros ordenados");
                method.show(realNumbers);

                break;
            case 2:
                method.quick_sort(realNumbers,0,realNumbers.length-1);
                System.out.println("\numeros ordenados");
                method.show(realNumbers);
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
        }


    }
}
