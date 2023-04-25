package patterns.factoryMethod.buildDeveloper;

public class Main {
    public static void main(String[] args) {
        Developer developer = new WoodDeveloper();
        Building building = developer.createBuilding(BuildingType.ONE_FLOOR);
        System.out.println(building);

        building = developer.createBuilding(BuildingType.MULTIPLE_FLOOR);
        System.out.println(building);

        developer = new StoneDeveloper();
        Building building2 = developer.createBuilding(BuildingType.ONE_FLOOR);
        System.out.println(building2);
    }
}
