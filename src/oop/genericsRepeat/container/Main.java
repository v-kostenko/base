package oop.genericsRepeat.container;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(100.5);

        Container<Product> container = new Container<>();
        container.add(product);
        container.print();

        container.remove(product);
        container.print();




    }
}
