package oop.genericsRepeat.container;

import java.util.List;
import java.util.Vector;

public class Container<T> {
    private List<T> list = new Vector<>();

    public List<T> getList() {
        return this.list;
    }

    boolean add(T t) {
        return list.add(t);
    }

    boolean remove(T t) {
        return list.remove(t);
    }

    public void print() {
        for (T t: list) {
            System.out.println(t);
        }
    }
}
