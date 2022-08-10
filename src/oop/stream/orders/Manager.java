package oop.stream.orders;

public class Manager {
    private String name;
    private long phone;

    public Manager(String name, long phone){
        this.name = name;
        this.phone = phone;
    }

    public String getName(){
        return name;
    }

    public long getPhone(){
        return phone;
    }

    public String toString(){
        return name + "\nPhone: " + phone + "\n";
    }

    

}
