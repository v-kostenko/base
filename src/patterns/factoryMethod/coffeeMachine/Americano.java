package patterns.factoryMethod.coffeeMachine;

public class Americano extends Drink {

    public Americano() {
        Ingridient coffee = new Ingridient("Coffee", 10, 0.5);
        Ingridient water = new Ingridient("Water", 50, 0.5);
        addIngridients(coffee);
        addIngridients(water);
    }
}
