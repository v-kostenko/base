package oop.stream.orders;

public class OrderItem {
    private int amount;
    private Product product;

    public OrderItem(int amount, Product product){
        this.amount = amount;
        this.product = product;
    }

    public int getAmount(){
        return amount;
    }

    public double getProductPrice(){
        return product.getPrice();
    }

    public Product getProduct(){
        return product;
    }

    public double total(){
        return amount * product.getPrice();
    }

    public String toString(){
        return product + "| " + amount + " шт.| Сумма " + total();
    }







}
