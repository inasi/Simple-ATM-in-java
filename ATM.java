package simpleATMMachine;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		while (true) {
		int correctPin = 1234;    // example pin
		int currentBalance = 2000;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your card and pin.");
		
		int enteredPin = input.nextInt();
		
		//if enteredPin matches expected pin
		if (enteredPin == correctPin) {
			
			//ask user for which option they want to use
			System.out.println("Please press 1 to Deposit, 2 to withdraw, 3 for current balance, 4 to exit");
			
			int selectedOption = input.nextInt();
			
			// user chooses to deposit
			if (selectedOption == 1) {
				System.out.println("Choose amount to deposit");
				
				while (true) {
				int amountDeposited = input.nextInt();
				    
					if (amountDeposited >0) {
						currentBalance = currentBalance + amountDeposited;
							System.out.println("Deposit accepted. Current balance is " + currentBalance +". Thank you for using the ATM.");
							
					}
					
					else {
						System.out.println("Error. Deposit amount must be above 0.");
					}
				}			
			}
			
			//user chooses withdrawal option
			else if (selectedOption == 2) {
				
				System.out.println("Please enter amount to withdraw");
				
				int amounttoWithdraw = input.nextInt();
				
					if (amounttoWithdraw > currentBalance && amounttoWithdraw >0) {
						System.out.println ("Withdrawal amount is higher than account balance. Please enter an amount below "+ currentBalance);
					}
					
					else if (amounttoWithdraw <= currentBalance && amounttoWithdraw >0) {
						currentBalance = currentBalance - amounttoWithdraw;
							System.out.println ("Withdrawal of " + amounttoWithdraw+" completed. Remaining balance is " + currentBalance);
					}
					else {
						System.out.println("Error. Please enter the value again.");
					}
					
			}
			
			//user wants to see current balance only
			else if (selectedOption == 3) {
				System.out.println("Current Balance is "+ currentBalance);
			}
			
			//user wants to exit without performing any transactions
			else if (selectedOption == 4) {
				System.out.println ("Please remove card.");
			}
			
			else {
				System.out.println("Error. Please choose a valid option");
				
			}
			
			
		}
		else {
			System.out.println("Incorrect pin entered.");
			}
	}
}
}
