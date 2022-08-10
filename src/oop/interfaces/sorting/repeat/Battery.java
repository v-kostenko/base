package oop.interfaces.sorting.repeat;

public class Battery implements Comparable<Battery>{
    private double batteryPrice;
    private String brand;

    public Battery(double batteryPrice, String brand) {
        this.batteryPrice = batteryPrice;
        this.brand = brand;
    }

    @Override
    public int compareTo(Battery battery){
        //return - Double.compare(this.batteryPrice, battery.batteryPrice);
        return - this.brand.compareTo(battery.brand);
    }

    @Override
    public String toString() {
        return "Battery{" +
                "batteryPrice=" + batteryPrice +
                ", Brand='" + brand + '\'' +
                '}';
    }
}
