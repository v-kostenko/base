package patterns.factoryMethod.furnitureFactory;

public class ModernSofa extends Sofa {

    public ModernSofa(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства современного дивана");
    }
}
