package com.sebastian.garcia.method;

import com.sebastian.garcia.model.Planet;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanetarySystem {

    List<Planet> planets = new ArrayList<>();
    Scanner dataEntry = new Scanner(System.in);
    public void addPlanet(Planet planet){
        planets.add(planet);
    }

   //metodo para registrar los planetas
    public void registerPlanet(){
        Planet planet = new Planet();
        System.out.print("\nid: ");
        planet.setId(dataEntry.nextInt());
        System.out.print("\nNombre: ");
        planet.setName(dataEntry.next());
        System.out.print("\nMasa: ");
        planet.setMass(dataEntry.nextDouble());
        System.out.print("\nDensidad: ");
        planet.setDensity(dataEntry.nextDouble());
        System.out.print("\n");
        System.out.print("\nDiametro: ");
        planet.setDiameter(dataEntry.nextDouble());
        System.out.print("\n");
        System.out.print("\nDistancia al sol: ");
        planet.setDistanceSun(dataEntry.nextDouble());
        addPlanet(planet);

    }
    //metodo para listas los planetas registrados
    public void toList(){
        for (int i=0; i<planets.size();i++){
            System.out.println("\nNombre: "+planets.get(i).getId()+"  "+"Id: "+planets.get(i).getName());
        }
    }
    //metodo para calcular la atraccion gravitatoria
    public void CalculateAttraction(String planetOne, String planetTwo){
        double massOne =0;
        double massTwo = 0;
        double universalConstant = 0.0000000000667;
        double massDifference;
        double attrationForce;
        for (int i=0; i<planets.size();i++){
            if (planets.get(i).getName().equals(planetOne)){
                massOne = planets.get(i).getMass();
            }
            if (planets.get(i).getName().equals(planetTwo)){
                massTwo = planets.get(i).getMass();
            }
        }
        massDifference = massOne - massTwo;
        attrationForce = (universalConstant*(massOne*massTwo))/Math.pow(massDifference,2);
        System.out.println("atraccion gravitatoria:\n"+attrationForce+" N");
        System.out.println("");

    }
}
