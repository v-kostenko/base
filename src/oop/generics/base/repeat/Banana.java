package oop.generics.base.repeat;

public class Banana extends Product{
    private String sort;

    public Banana(double price, String title, String sort){
        super(price, title);
        this.sort = sort;
    }
}
