package oop.genericsRepeat.catDog;

public class Cat extends Animal{
    private String voice;

    public Cat(String name, String voice){
        super(name);
        this.voice = voice;
    }

    @Override
    public void sayHello(){
        System.out.println( getClass().getSimpleName() + " " + getName() + "  says " + voice);
    }

}
