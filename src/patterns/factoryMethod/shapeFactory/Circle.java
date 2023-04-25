package patterns.factoryMethod.shapeFactory;

public class Circle extends Shape {

    public Circle(Color color, Border border, Point leftPoint, Point rightPoint) {
        super(color, border, leftPoint, rightPoint);
    }

    @Override
    public void draw() {
        System.out.println("Draw circle algorithm...");
    }


}
