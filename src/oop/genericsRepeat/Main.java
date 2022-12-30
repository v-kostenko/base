package oop.genericsRepeat;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Green", 10000);
        GenericFirst<Car> carGenericFirst = new GenericFirst<>(car);
        System.out.println(carGenericFirst);

        carGenericFirst.getT().getColor();

        Human human = new Human("Jack", 30);
        GenericFirst<Human> humanGenericFirst = new GenericFirst<>(human);

        Car ca2 = new Car("Black", 2000);
        carGenericFirst.setT(ca2);

        System.out.println(carGenericFirst);

        GenericFirst<Double> doubleGenericFirst = new GenericFirst<>(200.2);
        System.out.println(doubleGenericFirst);
        doubleGenericFirst.setT(5000.2);

        System.out.println(doubleGenericFirst);
        System.out.println(doubleGenericFirst.getT());




    }
}
