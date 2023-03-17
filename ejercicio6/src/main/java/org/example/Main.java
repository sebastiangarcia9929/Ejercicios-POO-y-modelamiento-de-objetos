package org.example;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        int number;
        Scanner datum = new Scanner(System.in);
        Vector<Integer> vector = new Vector<>();
        boolean flag;
        do {
            System.out.println("ingresar numeros: ");
            number = datum.nextInt();
          flag = vector.isEmpty() || vector.get(vector.size() - 1) != number;
          vector.add(number);
        } while (flag);
    }
}
