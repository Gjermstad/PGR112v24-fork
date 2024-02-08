package kegj002.src.Tasks09;

public class Circle extends Shape
{
    //# Felter
    private double radius;
    private MovablePoint centerPoint;

    //# Konstruktører
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this(radius, "red", true);
    }
    public Circle(double radius, String color, boolean filled) {
        this(radius, color, filled, 0.0, 0.0);
    }
    public Circle(double radius, String color, boolean filled, double positionX, double positionY) {
        super(color, filled);
        this.setRadius(radius);
        centerPoint = new MovablePoint(positionX, positionY);
    }

    //# Getter-metoder
    public double getRadius() {
        return this.radius;
    }
    @Override
    public String getNameOfShape() {
        return "circle";
    }

    //# Setter-metoder
    private void setRadius(double value) {
        this.radius = value;
    }

    //# Metoder
    // Regn ut areal
    public double getArea() {
        return Math.PI * (radius * 2);
    }

    // Regn ut omkrets
    public double getPerimeter() {
        return Math.PI * radius;
    }

    public void rolling() {
        System.out.println("This circle is rolling...");
    }

    @Override
    public void moveLeft(double distance) {
        this.centerPoint.moveLeft(distance);
    }

    @Override
    public void moveRight(double distance) {
        this.centerPoint.moveRight(distance);
    }

    @Override
    public void moveDown(double distance) {
        this.centerPoint.moveDown(distance);
    }

    @Override
    public void moveUp(double distance) {
        this.centerPoint.moveUp(distance);
    }

    @Override
    public String toString() {
        return
                "A circle [id = " + this.getId() +
                "; position = X: " + String.format("%.2f", this.centerPoint.getX()) + ", Y: " + String.format("%.2f", this.centerPoint.getY()) +
                "; area = " + String.format("%.2f", this.getArea()) +
                "; perimeter = " + String.format("%.2f", this.getPerimeter()) +
                "; color = " + this.getColor() +
                "; filled = " + this.isFilled() + "]";
    }
}
