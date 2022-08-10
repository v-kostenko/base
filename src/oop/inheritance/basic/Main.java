package oop.inheritance.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ChefExecutiveOfficer chefExecutiveOfficer = new ChefExecutiveOfficer(5000, Gender.MALE);
        Position accountant = new Accountant(750, 2, Gender.FEMALE, 19);
        Engineer engineer = new Engineer(850, 3, Gender.MALE);
        Position secretarian = new Secretarian(500, 1);
        MainEngineer mainEngineer = new MainEngineer(1000, Gender.MALE, 10, 3);
        Manager mainAccountant = new MainAccountant(2000, Gender.FEMALE, 2, 3);

        ArrayList<Manager> managers = new ArrayList<>();
        managers.add(mainEngineer);
        managers.add(mainAccountant);
        managers.add(chefExecutiveOfficer);

        for (int i = 0; i < managers.size(); i++) {
            System.out.println(managers.get(i));
        }
        int a = 45;
        double d = (double) a;
        double c = 34.5343;
        int n = (int) c;

        int x = 100;
        float f = (float) x;

        double d1 = 23.4;
        byte b = (byte)d1;

        Date date = new Date();
        System.out.println(date.toString());

        Secretarian s = (Secretarian) secretarian;
        s.makeCoffee();

        ((Secretarian) secretarian).makeCoffee();

        System.out.println("---------------------");
        //ChefExecutiveOfficer director = (ChefExecutiveOfficer) s;
        Object accountant1 = (Object) secretarian;
        accountant1.toString();
        System.out.println("---------------------");


        System.out.println(chefExecutiveOfficer);
        HashSet<Position> positions = new HashSet<>();
        positions.add(chefExecutiveOfficer);
        positions.add(mainAccountant);
        positions.add(mainEngineer);
        positions.add(accountant);
        positions.add(engineer);
        positions.add(secretarian);


        for (Position position : positions) {
            position.descriptionWorkFlow();
        }
    }
}
