package oop.genericsRepeat.interfaceGeneric;

public class Robot<T, R> implements IGeneric<T> {
    private int price;
    private R r;

    public Robot(int price, R r){
        this.price = price;
        this.r = r;
    }

    public void setR(R r){
         this.r=r;
    }

    public R getR(){
        return this.r;
    }


    @Override
    public void print(T t) {
        System.out.println(t);
    }

    @Override
    public String toString(){
        return "R " + r;
    }

}
