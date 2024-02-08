package kegj002.src.Tasks09;

public class MovablePoint implements Movable
{
    //# Fields
    private double x;
    private double y;

    //# Constructors
    public MovablePoint(double x, double y) {
        this.setX(x);
        this.setY(y);
    }

    //# Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getPosition() {
        return "X: " + x + ", Y: " + y;
    }

    //# Setters
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    //# Methods
    public void moveUp(double distance) {
        y = y + distance;
    }
    public void moveDown(double distance) {
        y = y - distance;
    }
    public void moveLeft(double distance) {
        x = x - distance;
    }
    public void moveRight(double distance) {
        x = x + distance;
    }
}
