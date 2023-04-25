package patterns.factoryMethod.buildDeveloper;

public class WoodDeveloper extends Developer {

    @Override
    public Building createBuilding(BuildingType type) {
        if (type == BuildingType.ONE_FLOOR) {
            return new WoodHouse(1000, "One floor house");
        } else if (type == BuildingType.MULTIPLE_FLOOR) {
            return new WoodHouse(99999, "Multiple floor house");
        }
        return null;
    }
}
