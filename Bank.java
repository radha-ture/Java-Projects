package Bank;

import java.util.Scanner;

public class Bank {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000;

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance = " + balance);
        }
        else if (choice == 2) {
            System.out.print("Enter deposit amount: ");
            double amount = sc.nextDouble();

            balance = balance + amount;

            System.out.println("New Balance = " + balance);
        }
        else if (choice == 3) {
            System.out.print("Enter withdraw amount: ");
            double amount = sc.nextDouble();

            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Remaining Balance = " + balance);
            } else {
                System.out.println("Insufficient Balance");
            }
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
