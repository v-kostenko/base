package oop.statics.basik;

import oop.statics.basik.BloodGroup;
import oop.statics.basik.Human;

public class Main {
    public static void main(String[] args) {
        System.out.println( Human.getPopulations());

        Human Vasya = new Human("Vasya", Human.ASIAT_RACE, BloodGroup.THIRD);
        System.out.println(Vasya);
        Human Petya = new Human("Petya", Human.EUROPE_RACE, BloodGroup.SECOND);
        System.out.println(Petya);
        Human Kolia = new Human("Kolia", 56, BloodGroup.THIRD);

        System.out.println(Vasya);
        System.out.println(Petya);
        System.out.println(Kolia);

        Vasya.die();
        System.out.println(Kolia);

        Kolia.getNameAndPopulation();

        Human.sun.sunShine();

        Human.sun.setColor("Red");
        Human.sun.sunShine();

        Planetari planetari1 = new Planetari();
        planetari1.showPlanets();
        System.out.println();

        Planetari planetari2 = new Planetari();
        planetari2.showPlanets();
        System.out.println();

        Planetari planetari3 = new Planetari();
        planetari3.showPlanets();

//        Human.sun = null;
//        Human.sun.sunShine();





    }
}
