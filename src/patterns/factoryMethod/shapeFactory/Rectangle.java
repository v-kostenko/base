package patterns.factoryMethod.shapeFactory;

public class Rectangle extends Shape{

    public Rectangle(Color color, Border border, Point leftPoint, Point rightPoint) {
        super(color, border, leftPoint, rightPoint);
    }

    @Override
    public void draw() {
        System.out.println("Draw rectangle algorithm...");
    }


}
