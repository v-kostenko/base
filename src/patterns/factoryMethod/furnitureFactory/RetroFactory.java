package patterns.factoryMethod.furnitureFactory;

public class RetroFactory extends FurnitureFactory {


    @Override
    public Furniture makeFurniture(FurnitureType type) {
        switch (type) {
            case SOFA:
                return new RetroSofa("White", "Stone", 999);
            case TABLE:
                return new RetroTable("Black", "Glass", 221);
            case ARMCHAIR:
                return new RetroArmchair("Yellow", "Cuprum", 888);
            case SHELF:
                return new RetroShelf("Pink", "Wood", 111);
            default:
                return null;
        }
    }
}
