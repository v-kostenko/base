package oop.interfaces.clone.cloningConstructor;

public class Main {
    public static void main(String[] args) {
        Engine engineOriginal = new Engine(2000, 3000, "E23/1");
        Car carOriginal = new Car("BMW", 40999, "Black", engineOriginal);

        Car carCopy = new Car(carOriginal);

        System.out.println(carOriginal);
        System.out.println(carCopy);

        engineOriginal.setModel("QWERTY");
        engineOriginal.setPrice(456789);

        System.out.println();
        System.out.println(carOriginal);
        System.out.println(carCopy);
    }
}
