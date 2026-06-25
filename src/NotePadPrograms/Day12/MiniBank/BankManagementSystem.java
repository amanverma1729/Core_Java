package NotePadPrograms.Day12.MiniBank;

import java.util.Scanner;

public class BankManagementSystem {

    static Scanner sc = new Scanner(System.in);

    // Withdraw Method
    public static void withdraw(Bank obj) {

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (pin == obj.pin) {

            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();

            if (amount <= obj.balance) {
                obj.balance = obj.balance - amount;
                System.out.println("Amount Withdrawn Successfully");
                System.out.println("Remaining Balance: " + obj.balance);
            } else {
                System.out.println("Insufficient Balance");
            }

        } else {
            System.out.println("Invalid PIN");
        }
    }

    // Deposit Method
    public static void deposit(Bank obj) {

        System.out.print("Enter Amount to Deposit: ");
        double amount = sc.nextDouble();

        obj.balance = obj.balance + amount;

        System.out.println("Amount Deposited Successfully");
        System.out.println("Current Balance: " + obj.balance);
    }

    // Balance Method
    public static double getBalance(Bank obj) {
        return obj.balance;
    }
}