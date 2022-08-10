package oop.inheritance.shop;

public class Chain extends Jewelry{
    private double length;

   public Chain(Material material, double weight, double price, double length){
       super("Chain", material, weight, price);
       this.length = length;
   }

   public String toString(){
       return super.toString() + "\nLength: " + length + " sm\n";
   }
}
