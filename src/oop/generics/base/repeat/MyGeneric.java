package oop.generics.base.repeat;

import java.util.ArrayList;
import java.util.List;

public class MyGeneric<W extends Product> {
    private W fieldW;
    private List<W> list = new ArrayList<>();

    public MyGeneric(W fieldW){
        this.fieldW = fieldW;
    }

    public void setFieldW(W w){
        fieldW = w;
    }

    public void addToList(W fieldW){
        list.add(fieldW);
    }

    public W getFieldW(){
        return fieldW;
    }

    public double averagePrice(){
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i).getPrice();
        }
        return sum / list.size();
    }
}
