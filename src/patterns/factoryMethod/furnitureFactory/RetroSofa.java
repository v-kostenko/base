package patterns.factoryMethod.furnitureFactory;

public class RetroSofa extends Sofa{

    public RetroSofa(String color, String material, double price) {
        super(color, material, price);
    }

    @Override
    public void creationalFlow() {
        System.out.println("Последовательность производства ретро дивана");
    }
}
