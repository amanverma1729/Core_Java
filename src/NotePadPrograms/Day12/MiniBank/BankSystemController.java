package NotePadPrograms.Day12.MiniBank;

import java.util.Scanner;

public class BankSystemController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// step 1 : Create Bank class object and initialize states

		// Step 2 : ask user to select Operation

		// Press 1 for deposit
		// call withdraw() ->
		// BankManagementSystem.withdraw(bankobject , amount)
		// Press 2 for withdraw
		// press 3 to check Bank balance

		System.out.println("----Welcome to QSP Bank------");
		System.out.println("To start process Create an Account ");
		System.out.println("Press y/n");

		char isContinue = sc.next().charAt(0);

		if (isContinue == 'y' || isContinue == 'Y') {
			// process
			sc.nextLine();
			System.out.println("Enter your name : ");
			String name = sc.nextLine();
			System.out.println("Enter your phone : ");
			long phone = sc.nextLong();
			System.out.println("Create your pin for future Process");
			int pin = sc.nextInt();
			System.out.println("Add some initial balance : ");
			double initialBalance = sc.nextDouble();

			Bank account = new Bank(name, phone, pin, initialBalance);
			
			System.out.println("Hey " + account.customerName + ", your account is craeted successfully!!");

			System.out.println("You can perform Operation with Bank ");
			System.out.println("Press  1 for Withdraw ");
			System.out.println("press 2 for Deposit");
			System.out.println("press 3  to check Balance");
			System.out.println("Press 4 to close the application");
			int choice = sc.nextInt();
         while (true) {
			
		 
			if (choice == 1) {

				BankManagementSystem.withdraw(account);

			} else if (choice == 2) {

				BankManagementSystem.deposit(account);

			} else if (choice == 3) {

				double balance = BankManagementSystem.getBalance(account);
				System.out.println(balance);

			}
			else if(choice == 4){
				System.out.println("You have exit the application:");
			} 
			else {
				System.out.println("Invalid choice...");
			}

		} 
		else {
			System.out.println("Exiting....Good Bye..");
		}
	

	}

