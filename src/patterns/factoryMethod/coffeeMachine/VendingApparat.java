package patterns.factoryMethod.coffeeMachine;

public class VendingApparat {



    public Drink makeDrink(DrinkType type) {
        switch (type) {
            case LATTE:
                return new Latte();
            case AMERICANO:
                return new Americano();
            case CAPPUCHINO:
                return new Cappuchino();
            default:
                return null;
        }
    }


}
