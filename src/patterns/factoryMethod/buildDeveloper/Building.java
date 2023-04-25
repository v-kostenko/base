package patterns.factoryMethod.buildDeveloper;

public abstract class Building {
    private double price;
    private String description;

    public Building(double price, String description) {
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price=" + price +
                ", description='" + description + '\'' +
                '}' ;
    }
}
