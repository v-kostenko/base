package patterns.factoryMethod.coffeeMachine;

public class Ingridient {
    private String title;
    private double portion;
    private double price;

    public Ingridient(String title, double portion, double price) {
        this.title = title;
        this.portion = portion;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPortion() {
        return portion;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return title ;
    }
}
