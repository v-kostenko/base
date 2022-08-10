package oop.stream.orders;

public class Product {
    private double price;
    private String title;
    private String brand;

    public Product(double price, String title, String brand) {
        this.price = price;
        this.title = title;
        this.brand = brand;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double setPriseWithDiscount(double discount){
        return this.price = price * discount;
    }


    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", brand='" + brand + '\'' +
                "price=" + price;
    }

    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (this == object){
            return true;
        }
        if (!(object instanceof Product)){
            return false;
        }
        Product temp = (Product) object;
        return this.title.equals(temp.title) && this.brand.equals(temp.brand) && this.price == temp.price;
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = hashCode * 7 + Double.hashCode(price);
        hashCode = hashCode * 7 + title.hashCode();
        hashCode = hashCode * 7 + brand.hashCode();
        return hashCode;
    }

}
