package oop.io.bytes.data;

import java.util.Date;

public class Clock {
    private String brand;
    private String material;
    private Battery battery;
    private double price;
    private long serNumb;
    private Date date;
    private boolean isNew;

    public Clock(String brand, String material, Battery battery, double price, long serNumb, Date date, boolean isNew) {
        this.brand = brand;
        this.material = material;
        this.battery = battery;
        this.price = price;
        this.serNumb = serNumb;
        this.date = date;
        this.isNew = isNew;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public Battery getBattery() {
        return battery;
    }

    public double getPrice() {
        return price;
    }

    public long getSerNumb() {
        return serNumb;
    }

    public Date getDate() {
        return date;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    @Override
    public boolean equals(Object object){
        if (this == object){
            return true;
        }
        if (object == null){
            return false;
        }
        if (!(object instanceof Clock)){
            return false;
        }
        Clock temp = (Clock) object;
        return this.serNumb == temp.serNumb;
    }

    @Override
    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * Long.hashCode(serNumb);
        return hashCode;
    }

    @Override
    public String toString() {
        return "Clock{" +
                "brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", battery=" + battery +
                ", price=" + price +
                ", serNumb=" + serNumb +
                ", date=" + date +
                ", isNew=" + isNew +
                '}';
    }
}
