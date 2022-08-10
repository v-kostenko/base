package oop.interfaces.sorting.task;

enum Material {
    WOOD, STEEL, GLASS, PLASTIC
}

public class Table implements ItemI {
    private double size;
    private String color;
    private double weight;
    private Material material;

    public Table(double size, String color, double weight, Material material) {
        this.size = size;
        this.color = color;
        this.weight = weight;
        this.material = material;
    }

    @Override
    public void showInfo() {

    }

    @Override
    public String getText(){
        return this.color;
    }

    @Override
    public int compareTo(ItemI itemI) {
        return this.color.compareTo(itemI.getText());
    }
}
