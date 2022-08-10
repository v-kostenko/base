package oop.interfaces.sorting.products;

import java.util.Date;

public class Product implements Comparable<Product> {
    private int prise;
    private Date date;
    private String title;
    private String brand;
    private double weight;
    private long id;

    public Product(int prise, Date date, String title, String brand, double weight, long id) {
        this.prise = prise;
        this.date = date;
        this.title = title;
        this.brand = brand;
        this.weight = weight;
        this.id = id;
    }

    @Override
    public int compareTo(Product product) {
        //return - (this.prise - product.prise); // - это реверс
        //return -( Long.compare(this.id, product.id));
        //return this.title.compareTo(product.title); - sorting by alphabet

        int result = this.title.length() - product.title.length();

        if (result != 0) {
            return result;
        }

        result = this.prise - product.prise;
        if (result != 0) {
            return result;
        }
        return this.date.compareTo(product.date);

        //return this.date.compareTo(product.date);

    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " :\nPrice " + prise + "\nDate " + date + "\nTitle " + title + "\nBrand " + brand +
                "\nWeight " + weight + "\nID " + id;
    }


}
