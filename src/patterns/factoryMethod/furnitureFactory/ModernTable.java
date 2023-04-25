package patterns.factoryMethod.furnitureFactory;

public class ModernTable extends Table {

    public ModernTable(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства современного стола");
    }
}
