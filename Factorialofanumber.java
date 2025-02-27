import java.util.Scanner;
  public class Factorialofanumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        long factorial = 1;
        if (number < 0) {
            System.out.println("No Factorial For Negative Numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *=i;
            }
            System.out.println("The factorial of " + number + " is " + factorial);
        }
       scanner.close();     
    }
}
