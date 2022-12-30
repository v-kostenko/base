package oop.genericsRepeat.catDog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", "Mey");
        Dog dog = new Dog("Bobik", "Gow");

        Frog frog = new Frog();

        Zoo<Animal> zoo = new Zoo<>();

        zoo.add(cat);
        zoo.add(dog);

        zoo.show();

        Zoo<Dog> dogZoo = new Zoo<>();

        dogZoo.add(dog);



    }
}
