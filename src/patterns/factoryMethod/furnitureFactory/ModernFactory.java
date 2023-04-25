package patterns.factoryMethod.furnitureFactory;

public class ModernFactory extends FurnitureFactory {

    public Furniture makeFurniture(FurnitureType type) {
        switch (type) {
            case TABLE:
                return new ModernTable("Black", "Wood", 1000);
            case SOFA:
                return new ModernSofa("Red", "Wool", 333);
            case ARMCHAIR:
                return new ModernArmchair("Blue", "Steal", 23124);
            case SHELF:
                return new ModernShelf("White", "Plastic", 222);
            default:
                return null;
        }
    }
}
