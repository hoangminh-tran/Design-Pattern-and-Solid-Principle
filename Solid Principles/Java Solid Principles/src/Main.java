import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Circle circle = new Circle(10);
        Square square = new Square(10);
        Shape cube = new Cube();
        Shape rectangle = new Rectangle();
        //Shape noShape = new NoShape();

        List<Shape> shapes = List.of(
                circle,
                square,
                cube,
                rectangle);

        double sum = areaCalculator.sum(shapes);

        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);

        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}