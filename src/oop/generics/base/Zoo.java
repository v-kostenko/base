package oop.generics.base;

import java.util.ArrayList;

public class Zoo<T extends Animal> {

    private ArrayList<T> arrayList = new ArrayList<>();

    public void add(T t) {
        arrayList.add(t);
    }

    public void printVoice() {
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i).voice();
        }
    }
}
