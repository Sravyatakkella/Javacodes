import java.util.Scanner;
  public class FahrenheittoCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Fahrenheit temp: ");
        float f = scanner.nextFloat();
        float celsius = (f - 32) * 5 / 9;
        System.out.println(f + "°F is equal to " + celsius + "°C");
        scanner.close();
    }
}
