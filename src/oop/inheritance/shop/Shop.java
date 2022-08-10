package oop.inheritance.shop;

public class Shop {
    private FoodDepartment foodDepartment = new FoodDepartment();
    private JewelryDepartment jewelryDepartment = new JewelryDepartment();
    private ToyDepartment toyDepartment = new ToyDepartment();
    private Dispatcher dispatcher = new Dispatcher();

    public void addProduct(Product product) {
        dispatcher.dispatchProduct(product);
    }

    private class Dispatcher {
        public void dispatchProduct(Product product) {
            if (product instanceof Food) {
                Food food = (Food) product;
                foodDepartment.addFood(food);
            }
            if (product instanceof Toy) {
                Toy toy = (Toy) product;
                toyDepartment.addToy(toy);
            }
            if (product instanceof Jewelry) {
                Jewelry jewelry = (Jewelry) product;
                jewelryDepartment.addJewelry(jewelry);
            }
        }
    }

    public String toString(){
        return "**** Wallmart ****\n " + foodDepartment + "\n" + jewelryDepartment + "\n" + toyDepartment;
    }


}
