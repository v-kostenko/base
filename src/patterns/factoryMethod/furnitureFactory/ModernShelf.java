package patterns.factoryMethod.furnitureFactory;

public class ModernShelf extends Shelf {

    public ModernShelf(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства современной полочки");
    }
}
