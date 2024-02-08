package kegj002.src.Tasks09;

public class JavaProgram
{
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Square square1 = new Square();
        Rectangle rectangle1 = new Rectangle(5, 5, 3, 9);

        System.out.println(circle1);
        System.out.println(rectangle1.position.getPosition());
        System.out.println(square1.position.getPosition());

        square1.moveDown(2);

        System.out.println(square1.position.getPosition());


//        Square square2 = new Square(3);
//        Circle circle2 = new Circle(5);
//        Rectangle rectangle2 = new Rectangle(5,3);
//        Rectangle rectangle3 = new Rectangle(1, 1.5);
//        Square square3 = new Square(5);
//        Square square4 = new Square(3.7);
//        Circle circle3 = new Circle(3.2);
//        Square square5 = new Square();

//        HashMap<Integer, Shape> map = new HashMap<>();
//
//        map.put(1, circle1);
//        map.put(2, square1);
//        map.put(3, rectangle1);
//        map.put(4, square2);
//        map.put(5, circle2);
//        map.put(6, rectangle2);
//        map.put(7, rectangle3);
//        map.put(8, square3);
//        map.put(9, square4);
//        map.put(10, circle3);
//
//        for (int i = 0; i < map.size(); i++) {
//            System.out.println(map.get(i + 1));
//        }

    }
}

