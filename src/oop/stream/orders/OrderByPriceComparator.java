package oop.stream.orders;

import java.util.Comparator;

public class OrderByPriceComparator implements Comparator<Order> {

    @Override
    public int compare(Order order1, Order order2){
        return Double.compare(order1.totalBill(), order2.totalBill());
    }



}
