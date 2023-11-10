package scr.MorningSession.Class911SOLID;
// Exercise 2:
//You have a Shape class with Circle and Square subclasses.
// Write a PerimeterCalculator class that can calculate
// the perimeter of different shapes without modifying existing classes.
public class ShapeO {
    interface Shape {
        double calculatePerimeter();
    }

    static class Circle implements Shape {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        @Override
        public double calculatePerimeter() {
            // Perimeter of a circle is 2 * π * radius
            return 2 * Math.PI * radius;
        }
    }

    static class Square implements Shape {
        private double side;

        public Square(double side) {
            this.side = side;
        }

        @Override
        public double calculatePerimeter() {
            // Perimeter of a square is 4 * side
            return 4 * side;
        }
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        double circlePerimeter = circle.calculatePerimeter();
        double squarePerimeter = square.calculatePerimeter();

        System.out.println("Circle Perimeter: " + circlePerimeter);
        System.out.println("Square Perimeter: " + squarePerimeter);
    }
}
