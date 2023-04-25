package patterns.factoryMethod.furnitureFactory;

public class RetroShelf extends Shelf{

    public RetroShelf(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства ретро полочки");
    }
}
