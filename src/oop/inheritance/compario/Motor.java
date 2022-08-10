package oop.inheritance.compario;

public class Motor {
    private int volume;
    private String brand;
    private double power;
    private String type;

    public Motor(int volume, String brand, double power, String type) {
        this.volume = volume;
        this.brand = brand;
        this.power = power;
        this.type = type;
    }

    public boolean equals(Object object){
        if (object == null){
            return false;
        }
        if (object == this){
            return true;
        }
        if (!(object instanceof Motor)){
            return false;
        }
        Motor temp = (Motor) object;
        return this.volume == temp.volume && this.brand.equals(temp.brand) && this.power == temp.power &&
                this.type.equals(temp.type);
    }

    public int hashCode(){
        int hashcode = 7;
        hashcode = hashcode * 7 + volume;
        hashcode = hashcode * 7 + brand.hashCode();
        hashcode = hashcode * 7 + Double.hashCode(power);
        hashcode = hashcode * 7 + type.hashCode();
        return hashcode;
    }


}
