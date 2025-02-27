import java.util.Scanner;
  public class areaoftriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter base: ");
        double base = scanner.nextDouble();
        System.out.print("enter height ");
        double height = scanner.nextDouble(); 
        double area = 0.5 * base * height;
        System.out.println(" area of  triangle is: " + area);
         scanner.close();
    }
}
