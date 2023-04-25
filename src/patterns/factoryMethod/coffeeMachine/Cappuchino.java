package patterns.factoryMethod.coffeeMachine;

public class Cappuchino extends Drink{

    public Cappuchino(){
        Ingridient water = new Ingridient("Water", 50, 0.5);
        Ingridient coffee = new Ingridient("Coffee", 10, 0.5);
        Ingridient milk = new Ingridient("Milk", 25, 0.5);
        addIngridients(water);
        addIngridients(coffee);
        addIngridients(milk);
    }
}
