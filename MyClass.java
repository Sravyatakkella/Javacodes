class MyClass {
    // Static variable to hold count of objects created
    static int count = 0; 
    
    // Constant variable for pi, initialized to 3.14
    final double pi = 3.14;

    // Constructor
    public MyClass() {
        // Increment count every time an object is created
        count++;
    }

    // Main method to create objects and print values
    public static void main(String[] args) {
        // Creating three objects of MyClass
        MyClass object1 = new MyClass();
        MyClass object2 = new MyClass();
        MyClass object3 = new MyClass();

        // Printing the final values of count and pi
        System.out.println("Final count of objects created: " + count);
        System.out.println("Value of pi: " + object1.pi);  // Pi is constant, and we can access it via any object
    }
}
