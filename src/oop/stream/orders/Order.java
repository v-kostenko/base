package oop.stream.orders;

import java.util.Date;
import java.util.List;
import java.util.function.Consumer;

public class Order implements Comparable<Order> {
    private int id;
    private Date dateOfOrder;
    private Client client;
    private Manager manager;
    private List<OrderItem> orderItemList;
    private double discount = 1;

    public Order(int id, Date dateOfOrder, Client client, Manager manager, List<OrderItem> orderItemList) {
        this.id = id;
        this.dateOfOrder = dateOfOrder;
        this.client = client;
        this.manager = manager;
        this.orderItemList = orderItemList;
    }


    public boolean containsAnyOrderItem(List<OrderItem> list) {
       return this.orderItemList.stream().filter(oi -> list.contains(oi)).count() > 0;
    }

    public boolean containsTitle(String title){
        return this.orderItemList.stream().filter(oi -> oi.getProduct().getTitle().startsWith(title)).count() > 0;
    }

    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public double totalBill() {
        Wrapper wrapper = new Wrapper();
        orderItemList.forEach(o -> wrapper.setSum(o.total()));
        return Math.round(((wrapper.getSum()) * discount) * 100) / 100.0;
    }

    public double setDiscount(double discount) {
        return this.discount = discount;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("");
        orderItemList.forEach((OrderItem item) -> s.append(item + "\n"));

        return "Накладная " + id + " от " + dateOfOrder +
                "\nКлиент: " + client +
                "\nМенеджер: " + manager +
                "\n" + s +
                "                  ИТОГО: " + totalBill();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order temp = (Order) obj;
        return this.id == temp.id;
    }

    public int hashCode() {
        int hashCode = 7;
        hashCode = hashCode * 7 + this.id;
        return hashCode;
    }

    public Client getClient() {
        return client;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public Manager getManager() {
        return manager;
    }

    public int getId() {
        return id;
    }

    public int compareTo(Order order) {
        return -Double.compare(this.totalBill(), order.totalBill());
    }

    public Product getVeryExpensiveProduct() {
        return orderItemList.stream().max((oi1, oi2) -> Double.compare(oi1.getProductPrice(), oi2.getProductPrice())).get().getProduct();
    }


}
