package patterns.observer.dog_cat_human;

public interface IObservable {

    void addObserver(IObserver observer);
    void deleteObserver(IObserver observer);
    void notifyObservers();
}
