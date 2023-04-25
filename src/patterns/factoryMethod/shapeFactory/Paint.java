package patterns.factoryMethod.shapeFactory;

import java.util.ArrayList;
import java.util.List;

public class Paint {
    private Color color = Color.BLACK;
    private Border border = Border.SOLID;
    private List<Shape> selectedShapes = new ArrayList<>();
    private List<Shape> pictures = new ArrayList<>();
    private ShapeFactory shapeFactory = new ShapeFactory();

    public void drawFigure(ShapeType type){
        pictures.add(shapeFactory.createShape(type));
    }

    public void changeColor(Color color) {
        this.color = color;
        for (Shape shape : selectedShapes) {
            shape.setColor(this.color);
        }
    }

    private class ShapeFactory{

        public Shape createShape(ShapeType type) {
            switch (type) {
                case STAR:
                    return new Star(color, border, new Point(0, 0), new Point(0, 1));
                case CIRCLE:
                    return new Circle(color, border, new Point(0, 0), new Point(0, 1));
                case TRIANGLE:
                    return new Triangle(color, border, new Point(0, 0), new Point(0, 1));
                case RECTANGLE:
                    return new Rectangle(color, border, new Point(0, 0), new Point(0, 1));
                default:
                    return null;
            }
        }
    }


}
