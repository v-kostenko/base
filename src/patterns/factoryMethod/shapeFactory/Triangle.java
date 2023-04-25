package patterns.factoryMethod.shapeFactory;

public class Triangle extends Shape {


    public Triangle(Color color, Border border, Point leftPoint, Point rightPoint) {
        super(color, border, leftPoint, rightPoint);
    }

    @Override
    public void draw() {
        System.out.println("Triangle with color " + color + " and line type " + border + " was drawn on coordinats:\n " +
                leftPoint + " " + rightPoint);
    }
}
