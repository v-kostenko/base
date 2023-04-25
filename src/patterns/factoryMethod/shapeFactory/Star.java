package patterns.factoryMethod.shapeFactory;

public class Star extends Shape{

    public Star(Color color, Border border, Point leftPoint, Point rightPoint) {
        super(color, border, leftPoint, rightPoint);
    }

    @Override
    public void draw() {
        System.out.println("Draw star algorithm...");
    }


}
