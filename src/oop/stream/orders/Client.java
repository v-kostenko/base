package oop.stream.orders;

import com.sun.jdi.ObjectReference;

public class Client implements Comparable<Client>{
    private String name;
    private long phone;
    private String addressToDepart;
    private int id;

    public Client(String name, long phone, String addressToDepart, int id){
        this.name = name;
        this.phone = phone;
        this.addressToDepart = addressToDepart;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + "\nPhone: " + phone +
                "\nAddress to Depart: " + addressToDepart + "\nID: " + id + "\n";
    }

    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Client)){
            return false;
        }
        Client temp = (Client) obj;
        return this.id == temp.id;
    }

    public int hashCode(){
        int hashCode = 7;
        hashCode = 7 * hashCode + this.id;
        return hashCode;
    }

    @Override
    public int compareTo(Client client){
        return this.name.compareTo(client.name);
    }







}
