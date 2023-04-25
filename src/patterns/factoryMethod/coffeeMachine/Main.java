package patterns.factoryMethod.coffeeMachine;

public class Main {
    public static void main(String[] args) {

        VendingApparat apparat = new VendingApparat();
        Drink drink = apparat.makeDrink(DrinkType.AMERICANO);
        System.out.println(drink);

        drink = apparat.makeDrink(DrinkType.CAPPUCHINO);


    }
}
