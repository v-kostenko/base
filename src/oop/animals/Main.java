package oop.animals;

public class Main {
    public static void main(String[] args) {
        Dog sharik;
//        int k;
//        new Dog();
//        System.out.println(new Dog());
//        //System.out.println(k);
//        sharik = new Dog();
//        System.out.println("sharik = "+sharik);
//        {
//            Dog palkan;
//        }
//        int palkan;
//        Dog bobik = new Dog();
//        Dog tuzic = new Dog();
//
//        System.out.println("bobik = " + bobik);
//        System.out.println("tuzic = " + tuzic);
//        bobik  = tuzic;
//        System.out.println();
//
//        System.out.println("sharik = "+sharik);
//        System.out.println("bobik = " + bobik);
//        System.out.println("tuzic = " + tuzic);
//
//        bobik = null;
//        tuzic = null;
//        System.out.println();
//
//        System.out.println("sharik = "+sharik);
//        System.out.println("bobik = " + bobik);
//        System.out.println("tuzic = " + tuzic);
//
//        System.out.println("-----------------------------------------------------");
//        //tuzic.sleep();
//        sharik.sleep();
//        sharik.info();
//
//        System.out.println("-----------------------------------------------------");
        Dog tuzic = new Dog(2.2, "Pug", 5, true);
        tuzic.info();

        System.out.println();

        Dog bobik = new Dog("Bobikkkkkkkkkkkkkkkkk", 777777777);
        System.out.println(bobik);
        bobik.info();

        bobik.eat(" Meat");

        System.out.println(tuzic.toString());
        System.out.println(bobik);







    }
}
 