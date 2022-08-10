package oop.statics.basik;

import java.util.ArrayList;

public class Planetari {
     private static ArrayList<String> planets = new ArrayList<>();

     static {
         planets.add("Earth");
         planets.add("Mars");
         planets.add("Jupiter");
     }

     public void showPlanets(){
         for (int i = 0; i < planets.size(); i++) {
             System.out.println(planets.get(i));
         }
     }
 }
