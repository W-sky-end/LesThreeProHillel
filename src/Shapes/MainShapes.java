package Shapes;

public class MainShapes {
    public static double area (Shape [] shapes){
        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public static void main(String[] args) {
        Shape [] shapes = {
                new Shape.Circle(1),
                new Shape.Triangle(2, 2),
                new Shape.Square(2)
        };

        System.out.println("Area is :" + area(shapes));
        }
    }

