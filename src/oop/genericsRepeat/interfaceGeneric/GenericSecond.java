package oop.genericsRepeat.interfaceGeneric;

public interface GenericSecond<T> {

    void print(T t);

    <E> E test(E e);

}
