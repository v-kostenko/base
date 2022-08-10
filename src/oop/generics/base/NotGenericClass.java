package oop.generics.base;

public class NotGenericClass {
    private double weight;

    double mult(double weight, double x) {
        return weight * x;
    }

    public <T> void genericMethod(T value) {
        System.out.println(value);
    }
}
