package oop.inheritance.compario;

public class Gearbox {
    private int speed;
    private String type;
    private String brand;

    public Gearbox(int speed, String type, String brand){
        this.speed = speed;
        this.type = type;
        this.brand = brand;
    }

    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (object == this){
            return true;
        }
        if (!(object instanceof Gearbox)){
            return false;
        }
        Gearbox temp = (Gearbox) object;
        return this.speed == temp.speed && this.type.equals(temp.type) && this.brand.equals(temp.brand);
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + speed;
        hashCode = 7 * hashCode + type.hashCode();
        hashCode = 7 * hashCode + brand.hashCode();
        return hashCode;
    }

}
