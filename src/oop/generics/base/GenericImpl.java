package oop.generics.base;

public abstract class GenericImpl<E> implements IGeneric<E> {

    int sum(int x, int y) {
        return x + y;
    }
}
