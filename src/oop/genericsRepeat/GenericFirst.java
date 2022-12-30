package oop.genericsRepeat;

public class GenericFirst<T> {
    private T t;

    public GenericFirst(T t){
        this.t = t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT(){
        return this.t;
    }

    @Override
    public String toString(){
        return "" + t;
    }
}
