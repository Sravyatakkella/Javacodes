import java.util.Scanner;
public class Decimal{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Input first floating-point number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input second floating-point number: ");
        double num2 = scanner.nextDouble();
        int a = (int)(num1 * 1000);
        int b = (int)(num2 * 1000);
        if (a == b)
            System.out.println("They are the same up to three decimal places");
        else
            System.out.println("They are different");
 System.out.println("name:sravya.T");
  System.out.println("roll no:24331");
  System.out.println("sec:CSE-C");
    }
}
