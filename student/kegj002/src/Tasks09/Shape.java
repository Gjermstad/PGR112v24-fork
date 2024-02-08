package kegj002.src.Tasks09;

import java.util.Random;

public abstract class Shape implements Movable
{
    //# Static Fields
    private static int idCounter = 1;

    //# Felter
    private String color;
    private boolean filled;
    private final int id;

    //# Konstruktører
    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.setColor(color);
        this.setFilled(filled);
        this.id = idCounter++;
    }

    //# Getter-metoder
    public String getColor() {
        return this.color;
    }

    public boolean isFilled() {
        return this.filled;
    }
    public int getId() {
        return this.id;
    }
    public String getNameOfShape() {
        return "shape";
    }

    //# Setter-metoder
    private void setColor(String value) {
        this.color = value;
    }

    private void setFilled(boolean value) {
        this.filled = value;
    }

    //# Metoder
    @Override
    public String toString() {
        return "Shape[color=" + this.getColor() + ";filled=" + this.isFilled() + ";]";
    }

    public double randomDoubleNumber10() {
        Random random = new Random();
        double rand = random.nextDouble();
        return rand * 10;
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}
