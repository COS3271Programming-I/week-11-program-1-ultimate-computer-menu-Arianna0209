package week11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UltimateComputer {
	
	// This program has many different methods, or APPs, that the user can choose. Such APPs include calculators,
	// encouragement, displays, and more. They can choose as many APPs as they would like, and can quit when finished.
	
	static Scanner userinput = new Scanner(System.in);
	
	// This method will display my favorite saying.
	static void displayAPP() {
		System.out.println("\nWelcome to the Display APP!");
	}
	
	// This method displays a text art flower.
	static void textArtAPP() {
		System.out.println("\nWelcome to the Text Art APP!");
	}

	// This method allows the user to input two decimal numbers and then it uses those 
	// numbers to make computations.
	static void calculatorAPP() {
		System.out.println("\nWelcome to the Calculator APP!");
	}

	// This method performs basic calculations with user-inputted binary numbers.
	static void binaryCalculatorAPP() {
		System.out.println("\nWelcome to the Binary Calculator APP!");
	}
	
	// This method will encourage the user based on their age and how their day went.
	static void encouragementAPP() {
		System.out.println("\nWelcome to the Encouragement APP!");
	}

	// This method allows the user to roll two dice and it will add up their values.
	static void diceAPP() {
		System.out.println("\nWelcome to the Dice APP!");
	}
	
	// This program asks the user to input a sentence and then converts it to Oppish.
	static void oppishAPP() {
		System.out.println("\nWelcome to the Oppish APP!");
	}
	
	// This method prints a user-specified number of Fibonacci numbers.
	static void fibonacciAPP() {
		System.out.println("\nWelcome to the Fibonacci APP!");
	}

	// This method calculates the double factorials of numbers the user enters.
	static void doubleFactorialAPP() {
		System.out.println("\nWelcome to the Double Factorial APP!");
	}

	// Method for trapping InputMismatchException error on integers:
	static int intTry(String message) {
		int response;
		while (true) {
			try {
				System.out.print(message);
				response = userinput.nextInt();
				userinput.nextLine();
				return response;
			} 
			catch (InputMismatchException e) {
				System.out.println("Please enter a valid integer number (no decimal point).\n");
				userinput.nextLine();
				continue;
			}
		}
	}
	
	// Method for ensuring that an entered integer is between a certain range:
	static int intTryRange(String message, int start, int end) {
		int validNumber;
		while (true) {
			validNumber = intTry(message);
			if (validNumber >= start && validNumber <= end) {
				return validNumber;
			}
			else {
				System.out.format("Please enter a number between %d and %d.\n\n", start, end);
				continue;
			}
		}
	}
	
	// Method for ensuring that a user can only answer "yes" or "no" to a yes or no question:
	static String yesOrNo(String message) {
		String response;
		while (true) {
			System.out.print(message);
			response = userinput.nextLine();
			response = response.toLowerCase();
			if (response.equals("yes") || response.equals("no")) {
				return response;
			}
			else {
				System.out.println("Please enter \"yes\" or \"no\".");
				continue;
			}
			
		}
	}
	
	public static void main (String[] args) {
		// Introduce the user to the program:
		System.out.println("Welcome to the ULTIMATE COMPUTER!");
		
		// Create a while loop that allows the user to continue choosing apps until they are done:
		String anotherAPP = "yes";
		while (anotherAPP.equals("yes")) {
			
			// Tell the user what they can do:
			System.out.println("\nYou can select any of the following apps:"
					+ "\n1. Display APP"
					+ "\n2. Text Art APP"
					+ "\n3. Calculator APP"
					+ "\n4. Binary Calculator APP"
					+ "\n5. Encouragement APP"
					+ "\n6. Dice APP"
					+ "\n7. Oppish APP"
					+ "\n8. Fibonacci APP"
					+ "\n9. Double Factorial APP");
			int choice = intTryRange("Select an app by entering the number of the app you'd like to open: ",
									1, 9);
			
			// Call the correct function:
			if (choice == 1) {displayAPP();}
			if (choice == 2) {textArtAPP();}
			if (choice == 3) {calculatorAPP();}
			if (choice == 4) {binaryCalculatorAPP();}
			if (choice == 5) {encouragementAPP();}
			if (choice == 6) {diceAPP();}
			if (choice == 7) {oppishAPP();}
			if (choice == 8) {fibonacciAPP();}
			if (choice == 9) {doubleFactorialAPP();}
			
			// Ask the user if they'd like to select another APP:
			anotherAPP = yesOrNo("\nWould you like to select another app? Enter \"yes\" or \"no\": ");
		}
		
		// When the loop breaks the program will end:
		System.out.println("\nThank you for using the ULTIMATE COMPUTER."
				+ "\nProgram ended.");
		
	}
}
