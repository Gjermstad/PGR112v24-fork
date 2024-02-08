package kegj002.src.Tasks09;

public class Rectangle extends Shape
{
    //# Fields
    private double width;
    private double height;
    public MovablePoint position;

    //# Constructors
    Rectangle() {
        this(2, 1);
    }

    Rectangle(double width, double height) {
        this(width, height, 0.0, 0.0);
    }

    Rectangle(double width, double height, double positionX, double positionY) {
        super();
        this.width = width;
        this.height = height;
        this.position = new MovablePoint(positionX, positionY);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    @Override
    public String getNameOfShape() {
        return "rectangle";
    }

    //# Setters
    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //# Methods
    public double getArea() {
        return width * height;
    }
    public double getPerimeter() {
        return (width * 2) + (height * 2);
    }

    public void sliding() {
        System.out.println("The rectangle is sliding down the water slide with joy!");
    }

    @Override
    public void moveLeft(double distance) {
        this.position.moveLeft(distance);
    }

    @Override
    public void moveRight(double distance) {
        this.position.moveRight(distance);
    }

    @Override
    public void moveDown(double distance) {
        this.position.moveDown(distance);
    }

    @Override
    public void moveUp(double distance) {
        this.position.moveUp(distance);
    }
    @Override
    public String toString() {
        return "A rectangle [id= " + this.getId() + "" +
                "; position = X: " + String.format("%.2f", this.position.getX()) + ", Y: " + String.format("%.2f", this.position.getY()) +
                "; area= " + String.format("%.2f", this.getArea()) + "" +
                "; perimeter= " + String.format("%.2f", this.getPerimeter()) + "" +
                "; color= " + this.getColor() + "; filled= " + this.isFilled() + "]";
    }
}

