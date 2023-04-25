package patterns.factoryMethod.furnitureFactory;

public class Main {
    public static void main(String[] args) {

        FurnitureFactory factory = new ModernFactory();
        Furniture furniture = factory.makeFurniture(FurnitureType.TABLE);
        furniture.creationalFlow();

        Furniture furniture1 = factory.makeFurniture(FurnitureType.SHELF);
        furniture1.creationalFlow();

        factory = new RetroFactory();
        Furniture retroTable = factory.makeFurniture(FurnitureType.TABLE);
        retroTable.creationalFlow();


    }
}
