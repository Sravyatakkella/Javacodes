class Calculator {
    // Method to add two integers
    public void add(int a, int b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    // Method to add two doubles
    public void add(double a, double b) {
        System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
    }

    // Method to add three integers
    public void add(int a, int b, int c) {
        System.out.println("Sum of " + a + ", " + b + ", and " + c + " is: " + (a + b + c));
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5, 10);             // Sum of 5 and 10 is: 15
        calc.add(3.5, 2.5);          // Sum of 3.5 and 2.5 is: 6.0
        calc.add(1, 2, 3);           // Sum of 1, 2, and 3 is: 6
    }
}