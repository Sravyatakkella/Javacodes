class Calculator {
    // Base class for the calculator
}

class Simple extends Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
}

class Super extends Simple {
    public int square(int a) {
        return a * a;
    }

    public int cube(int a) {
        return a * a * a;
    }

    public double squareRoot(int a) {
        return Math.sqrt(a);
    }
}
class Advanced extends Super {
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }

    public int modulus(int a, int b) {
        return a % b;
    }
}
public class inherit {
    public static void main(String[] args) {
        Simple simpleCalc = new Simple();
        System.out.println("Addition: " + simpleCalc.add(5, 3));
        System.out.println("Subtraction: " + simpleCalc.subtract(5, 3));
        System.out.println("Multiplication: " + simpleCalc.multiply(5, 3));

        Advanced advancedCalc = new Advanced();
        System.out.println("Division: " + advancedCalc.divide(5, 2));
        System.out.println("Modulus: " + advancedCalc.modulus(5, 3));

        Super superCalc = new Super();
        System.out.println("Square: " + superCalc.square(5));
        System.out.println("Cube: " + superCalc.cube(3));
        System.out.println("Square Root: " + superCalc.squareRoot(16));
    }
}