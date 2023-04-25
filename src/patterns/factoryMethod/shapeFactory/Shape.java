package patterns.factoryMethod.shapeFactory;

public abstract class Shape {
    protected Color color;
    protected Border border;
    protected Point leftPoint, rightPoint;

    public Shape(Color color, Border border, Point leftPoint, Point rightPoint) {
        this.color = color;
        this.border = border;
        this.leftPoint = leftPoint;
        this.rightPoint = rightPoint;
        draw();
    }

    public abstract void draw();

    public void move(Point point) {
        leftPoint = new Point(leftPoint.getX() + point.getX(), leftPoint.getY() + point.getY());
        rightPoint = new Point(rightPoint.getX() + point.getX(), rightPoint.getY() + point.getY());
        draw();
    }

    public void setColor(Color color) {
        this.color = color;
        draw();
    }

    public void setBorder(Border border) {
        this.border = border;
        draw();
    }
}
