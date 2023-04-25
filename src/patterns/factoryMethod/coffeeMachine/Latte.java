package patterns.factoryMethod.coffeeMachine;

public class Latte extends Drink{

    public Latte(){
        Ingridient water = new Ingridient("Water", 50, 1);
        Ingridient coffee = new Ingridient("Coffee", 10, 1.5);
        Ingridient milk = new Ingridient("Milk", 10, 1.5);
        addIngridients(water);
        addIngridients(coffee);
        addIngridients(milk);
    }
}
