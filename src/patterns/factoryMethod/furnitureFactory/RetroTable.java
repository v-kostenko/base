package patterns.factoryMethod.furnitureFactory;

public class RetroTable extends Table{

    public RetroTable(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства ретро стола");
    }
}
