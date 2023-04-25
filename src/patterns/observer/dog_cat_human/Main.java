package patterns.observer.dog_cat_human;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik");
        Dog dog = new Dog("Bobik");
        Human human = new Human("Bob", 33);

        dog.addObserver(cat);
        dog.addObserver(human);
        dog.bark();
        System.out.println();

        dog.deleteObserver(cat);
        human.addObserver(dog);
        human.addObserver(cat);
        dog.bark();
        System.out.println();

        human.go();








    }
}
