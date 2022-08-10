package oop.interfaces.sorting.task;

public class Dog implements ItemI{
    private String breed;
    private int age;
    private String color;
    private double weight;

    public Dog(String breed, int age, String color, double weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public void showInfo(){
        System.out.println();
    }

    @Override
    public String getText(){
        return this.breed;
    }

    @Override
    public int compareTo(ItemI item){
        return this.breed.compareTo(item.getText());
    }


}
