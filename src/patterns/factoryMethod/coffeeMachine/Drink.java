package patterns.factoryMethod.coffeeMachine;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink {
    private List<Ingridient> ingridients = new ArrayList<>();

    public String toString() {
        StringBuilder builder = new StringBuilder("");
        double totalPrice = 0;
        for (Ingridient ingr : ingridients) {
            builder.append(ingr + "\n");
            totalPrice += ingr.getPrice();
        }
        return getClass().getSimpleName() + " :\n" + builder + "\nTotal price: " + totalPrice + "y.e.";
    }

    public void addIngridients(Ingridient ingridient) {
        ingridients.add(ingridient);
    }
}
