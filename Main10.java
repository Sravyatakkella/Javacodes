class Shape {
    // Method to calculate area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Overloaded method to calculate area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }
}

class Circle extends Shape {
    // Overriding method to calculate area of a circle
    @Override
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
}

public class Main10 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();

        System.out.println("Area of Square with side 5: " + shape.calculateArea(5));
        System.out.println("Area of Rectangle with length 4 and width 6: " + shape.calculateArea(4, 6));
        System.out.println("Area of Circle with radius 3: " + circle.calculateArea(3));
    }
}
