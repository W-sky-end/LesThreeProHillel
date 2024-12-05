package Shapes;

public interface Shape {
    double getArea();

    class Circle implements Shape {
        private double radius;

        public Circle(double radius){
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;

        }
    }
    class Triangle implements Shape {
        private double base;
        private double height;

        public Triangle (double base,double height){
            this.base = base;
            this.height = height;
        }

        @Override
        public double getArea() {
            return (base * height)/2;
        }
    }
    class Square implements Shape{
        private double side ;

        public  Square (double side) {
            this.side = side;
        }

        @Override
        public double getArea() {
            return side * side;
        }
    }


}
