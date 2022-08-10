package oop.animals;

public class Dog {
    private String breed = "Pug";
    private String name;
    private int age;
    private boolean isVaccinated;
    private double weight;

    public Dog(String initName, int initAge){
        System.out.println(this);
        this.info();
        name = initName;
        age = initAge;
    }

    public Dog(double initWeight, String breed, int age, boolean isVaccinated) {
        this.age
                = age;
        weight = initWeight;
        this.breed = breed;
        this.isVaccinated = isVaccinated;
    }

//    public void setName(String name){
//        this.name = name;
//    }

    public boolean isVaccinated(){
        return isVaccinated;
    }

    public void setIsVaccinated(boolean isVaccinated){
        this.isVaccinated = isVaccinated;
    }

    public void eat(String food){
        System.out.println("I'm eating " + food);
        digets(food);
    }

    private void digets(String food){
        System.out.println(food + " is digesting");
    }

    public void sleep() {
        System.out.println(name + "I`m sleeping");
    }

    public void info() {
        System.out.println("breed " + breed);
        System.out.println("name " + name);
        System.out.println("age " + age);
        System.out.println("isVaccinated " + isVaccinated);
        System.out.println("weight " + weight);
    }

    public String toString(){
        return "breed " + breed + "\n" +
                "name " + name + " \n" +
                "age " + age + " \n" +
                "isVaccinated " + "\n";
    }



}
