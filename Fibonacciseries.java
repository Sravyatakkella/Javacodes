import java.util.Scanner;
    public class Fibonacciseries {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: ");
        if (n >= 1) {
            System.out.print(first + " ");
        }
        if (n >= 2) {
            System.out.print(second + " ");
        }
        for (int i = 3; i <= n; i++) {
            int nextTerm = first + second;
            System.out.print(nextTerm + " ");
            first = second;
            second = nextTerm;
        }
        scanner.close();
    }
}
