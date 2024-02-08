package kegj002.src.Tasks09;

public class Square extends Rectangle
{
    //# Felter

    //# Konstruktører
    public Square() {
        this(1.0);
    }

    public Square(double side) {
        this(side, 0.0, 0.0);
    }
    public Square(double side, double positionX, double positionY) {
        super(side, side, positionX, positionY);
    }

    //# Getter-metoder
    public double getSide() {
        return this.getWidth();
    }

    @Override
    public String getNameOfShape() {
        return "square";
    }
    //# Setter-metoder
    private void setSide(double value) {
        this.setWidth(value);
        this.setHeight(value);
    }

    //# Metoder
    // Regn ut areal
    public double getArea() {
        return this.getWidth() * this.getSide();
    }

    // Regn ut omkrets
    public double getPerimeter() {
        return (this.getHeight() * 2) + (this.getWidth() * 2);
    }
    public void scrolling() {
        System.out.println("The square don't have thumbs to scroll anything. It is sad...");
    }

    @Override
    public String toString() {
        return "A square [id= " + this.getId() +
                "; position = X: " + String.format("%.2f", this.position.getX()) + ", Y: " + String.format("%.2f", this.position.getY()) +
                "; area= " + String.format("%.2f", this.getArea()) +
                "; perimeter= " + String.format("%.2f", this.getPerimeter()) +
                "; color= " + this.getColor() + "; filled= " + this.isFilled() + "]";
    }
}
