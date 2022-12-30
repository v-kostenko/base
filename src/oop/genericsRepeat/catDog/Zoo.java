package oop.genericsRepeat.catDog;

import java.util.ArrayList;
import java.util.List;

public class Zoo<T extends Animal> {
    private List<T> list = new ArrayList<>();

    void add(T t) {
        list.add(t);
    }

    void show(){
        list.stream().forEach((T t) -> t.sayHello());
    }
}
