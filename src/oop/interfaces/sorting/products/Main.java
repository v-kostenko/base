package oop.interfaces.sorting.products;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(99, new Date(2022 - 1900, 10, 15), "Bread", "Adidas",
                321.25, 100001l);
        Product product2 = new Product(888, new Date(2022 - 1900, 10, 15), "Milk", "Korovka",
                1000, 100002l);
        Product product3 = new Product(888, new Date(2021 - 1900, 10, 15), "Milk", "Pork",
                111.24, 100003l);
        Product product4 = new Product(888, new Date(2000 - 1900, 10, 15), "Fish", "Salmon",
                222.22, 100004l);
        Product product5 = new Product(777, new Date(1999 - 1900, 6, 6), "Strawberry", "Malinka",
                99.25, 100005l);



        Product[] products = {product1, product2, product3, product4, product5};

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));

//

    }
}
