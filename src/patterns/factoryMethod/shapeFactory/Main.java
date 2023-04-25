package patterns.factoryMethod.shapeFactory;

public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        paint.drawFigure(ShapeType.RECTANGLE);
        paint.drawFigure(ShapeType.CIRCLE);
    }
}
