package patterns.observer.dog_cat_human;

import java.util.ArrayList;
import java.util.List;

public class Dog implements IObservable, IObserver {
    private String name;
    private List<IObserver> observerList = new ArrayList<>();

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println("Dog is barking... ");
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
        for (IObserver observer : observerList) {
            observer.update(this);
        }
    }

    @Override
    public void update(IObservable observable) {
        if (observable instanceof Human){
            System.out.println("Dog goes with human");
        }
    }

}
