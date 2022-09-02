import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {

        Rectangle rect = new Rectangle(10,5);

        System.out.println("Rectangle Length: " + rect.getLength());
        System.out.println("Rectangle Width: " + rect.getWidth());
        System.out.println("Rectangle Area: " + rect.rectangleArea());

        System.out.println();

        Square sqr = new Square(10);
        System.out.println("Square Length: " + sqr.getLength());
        System.out.println("Square Area: " + sqr.squareAea());

        System.out.println();

        Round round = new Round(10);
        System.out.println("Round Radius :" + round.getRadius());
        System.out.println("Round Area :" + round.roundArea());

        System.out.println();

        Triangle tria = new Triangle(10,5);
        System.out.println("Triangle Base: " + tria.getBase());
        System.out.println("Triangle Height: " + tria.getHeight());
        System.out.println("Triangle Area: " + tria.triangleArea());





    }
}