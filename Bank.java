//  Working with the Main 

import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Account Name: ");

		String custName= sc.nextLine();
		System.out.println("Enter Customer ID: ");
		String custID=sc.nextLine();

		Account account= new Account(custName, custID);

		// Creating the menu of Our Mini Bank application.

		System.out.println("-----------------------------------------");

		System.out.println("Welcome,"+ account.customerName +"!");
		System.out.println("Your ID is:"+account.customerID);

		System.out.println("-----------------------------------------");

		System.out.println("Select Any Option To Procced.");

		System.out.println();
		System.out.println("A.Check Balance");
		System.out.println("B.Deposit");
		System.out.println("C.Withdraw");
		System.out.println("D.PreviousTransaction");
		System.out.println("E.Interest");
		System.out.println("F.Exit");

		// we would be using a Switch statement and while loop

		char option;
		boolean flag = true;

		while(flag) {
			System.out.println("Enter Your Choice:");
			option = sc.next().charAt(0); // syntax to accept a single character as input



			switch(option) {
			case 'A':
				System.out.println("Account Balance = $"+ account.balance);
				break;
			case 'B':
				System.out.println("Enter an amount to deposit:");
				int depositAmount = sc.nextInt();		// accept an amount input
				account.deposit(depositAmount);
				break;
			case 'C':
				System.out.println("Enter an amount to withdraw:");
				int withdrawAmount = sc.nextInt();
				account.withdraw(withdrawAmount);
				break;
			case 'D':
				account.getPreviousTransaction();
				break;
			case 'E':
				System.out.println("Enter the years for which you wish to calculate the interest:");
				int years = sc.nextInt();
				account.calculateInterest(years);
				break;
			case 'F':
				System.out.println("Thank you for Banking with us!");
				sc.close();
				flag = false;		// nullif flag to terminate the while loop
				break;
				default: System.out.println("Error: invalid option. Please enter A, B, C,D,E, or F to access serices.");
			}
		}



	}

}
