package patterns.factoryMethod.furnitureFactory;

public class ModernArmchair extends Armchair {

    public ModernArmchair(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства современного кресла");
    }
}
