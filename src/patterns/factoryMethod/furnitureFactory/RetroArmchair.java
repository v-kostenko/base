package patterns.factoryMethod.furnitureFactory;

public class RetroArmchair extends Armchair {

    public RetroArmchair(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства ретро кресла");
    }
}
