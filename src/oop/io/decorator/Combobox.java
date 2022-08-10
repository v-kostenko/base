package oop.io.decorator;

import java.util.ArrayList;

public class Combobox<T> implements IWidget {
    private ArrayList<T> list;

    @Override
    public void draw(){
        System.out.println("ArrayList " + list + " is driwen");
    }
}
