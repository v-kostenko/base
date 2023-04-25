package patterns.observer.dog_cat_human;

import java.util.ArrayList;
import java.util.List;

public class Human implements IObserver, IObservable{
    private String name;
    private int age;
    private List<IObserver> observerList = new ArrayList<>();

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void go(){
        System.out.println("Human goes somewhere...");
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer: observerList) {
            observer.update(this);
        }
    }

    @Override
    public void update(IObservable observable){
        if (observable instanceof Dog){
            System.out.println("Give bone.");
        }
    }
}
