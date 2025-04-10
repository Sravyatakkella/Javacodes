public class VisibilityExample {
    public int publicVariable = 10;
    private int privateVariable = 20;

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        VisibilityExample example = new VisibilityExample();

        System.out.println("Public Variable: " + example.publicVariable);
        example.publicMethod();

        
         System.out.println("Private Variable: " + example.privateVariable); 
         example.privateMethod(); 
        System.out.println("name:sravya.T");
        System.out.println("roll no:24331");
        System.out.println("sec:CSE-C");
    }
}
