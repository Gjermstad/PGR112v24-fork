package kegj002.src.Tasks09;

import java.util.ArrayList;

public class TestShapes
{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        ArrayList<Shape> list = new ArrayList<>();

        list.add(circle);
        list.add(square);
        list.add(rectangle);

        System.out.println(" ");

        for (Shape shape : list) {
            double random = shape.randomDoubleNumber10();
            shape.moveRight(random);
            System.out.println("We move " + shape.getNameOfShape() + " to the right by " + String.format("%.2f", random) + ".");
        }

        System.out.println(" ");
        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);

        Shape shape1 = new Circle(5,"green",true);
        Shape shape2 = new Square(3);
        Shape shape3 = new Rectangle(3,5);

        ArrayList<Shape> list2 = new ArrayList<>();
        list2.add(shape1);
        list2.add(shape2);
        list2.add(shape3);

        for (Shape shape : list2 ) {
            System.out.println(" ");
            System.out.println(shape.getNameOfShape());
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());

            if (shape instanceof Circle) {
                ((Circle) shape).rolling();
            }
            if (shape instanceof Rectangle) {
                ((Rectangle) shape).sliding();
            }
            if (shape instanceof Square) {
                ((Square) shape).scrolling();
            }
        }

    }
}
