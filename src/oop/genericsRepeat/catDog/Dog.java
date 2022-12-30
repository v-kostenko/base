package oop.genericsRepeat.catDog;

public class Dog extends Animal{
    private String voice;

    public Dog(String name, String voice){
        super(name);
        this.voice = voice;
    }

    @Override
    public void sayHello(){
        System.out.println(getClass().getSimpleName() + " " + getName() + " says " + voice);
    }

}
