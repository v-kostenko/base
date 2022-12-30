package oop.genericsRepeat.interfaceGeneric;

import oop.genericsRepeat.Human;

public class Main {
    public static void main(String[] args) {
        Table table = new Table("Red", 100.3);
        table.print("Table");

        Human human = new Human("JACK", 25);
        Robot<String, Human> robot1 = new Robot<>(10, human);
        System.out.println( robot1.getR());

        Car car = new Car("Green", 10500.5);

        GenericSecond<Car> genericSecond = new GenericSecond<Car>() {
            @Override
            public void print(Car car) {
                System.out.println(car);
            }

            @Override
            public <E> E test(E e) {
                return null;
            }
        };

        genericSecond.print(car);

        Plane plane = new Plane("Text", 25) {
            @Override
            public Double get(int amount) {
                return amount * 1.1;
            }
        };

        double x=  plane.get(100);
        System.out.println(x);







    }
}
