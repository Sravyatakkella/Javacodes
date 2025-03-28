import java.util.Scanner;

class bankingaccount {
    public float existing; // Class-level variable to store balance
    public Scanner input;  // Single Scanner instance for input

    // Constructor
    public bankingaccount() {
        input = new Scanner(System.in);
        System.out.print("Enter existing amount in bank account: ");
        this.existing = input.nextFloat();
    }

    // Deposit method
    public void deposit() {
        System.out.print("Enter amount to be deposited: ");
        float deposit = input.nextFloat();
        existing += deposit;
        System.out.println("Existing amount now is: " + existing);
    }

    // Withdrawal method
    public void withdrawal() {
        System.out.print("withdraw amount: ");
        
    }
}
class Savingaccount extends bankingaccount{
    public void withdrawal(){
    System.out.print("Enter amount to be withdrawn: ");
        float withdrawal = input.nextFloat();
        if (existing < withdrawal) {
            System.out.println("Not sufficient balance.");
        } else {
            existing -= withdrawal;
            System.out.println("Remaining balance: " + existing);
        }
    }
}
class Checkingaccount extends bankingaccount{
    public void withdrawal(){
        System.out.print("Enter amount to be withdrawn: ");
            float withdrawal = input.nextFloat();
            if (existing < withdrawal) {
                System.out.println("Not sufficient balance.");
            } else {
                existing -= withdrawal;
                System.out.println("Remaining balance: " + existing);
            }
        }

}
public class Main {
    public static void main(String args[]){
    Savingaccount S1 = new Savingaccount();
    Checkingaccount C1= new Checkingaccount();
       S1.withdrawal();
       C1.withdrawal();
    }
}