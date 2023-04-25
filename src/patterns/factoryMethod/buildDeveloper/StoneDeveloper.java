package patterns.factoryMethod.buildDeveloper;

public class StoneDeveloper extends Developer {


    @Override
    public Building createBuilding(BuildingType type) {
        if (type == BuildingType.ONE_FLOOR) {
            return new StoneHouse(8888, "One floor house");
        } else if (type == BuildingType.MULTIPLE_FLOOR) {
            return new StoneHouse(7777777, "Multiple floor");
        }
        return null;
    }
}
