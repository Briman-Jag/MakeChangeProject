import java.util.Scanner;
public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price , amount, changeDue;
		
		
		getChangeDue();
		
		
		
	//	calcChange(changeDue);
		
	}
	
	// Use getAmount to prompt customer for price and amount tendered
	public static void getChangeDue() {
		Scanner kb = new Scanner(System.in);
		double price , amount, changeDue;
		
		System.out.println("Please enter the purchase price: ");
		price = kb.nextDouble();
		System.out.println("Now enter the amount tendered: ");
		amount = kb.nextDouble();
		
		if ( amount == price) {
			System.out.println("You've paid the exact amount! /n Thank you for your business!");
	
		}
		else if (amount < price) {
			System.out.println("Sorry, that isn't enough money for this purchase.");
			kb.close();
		}
		else {
		
		changeDue = amount - price;
		System.out.println("Change Due is: " + changeDue);
		// Not sure how to make this work yet.
	//	Double changePrint = calcChange(changeDue);
		
		}
	}
	// Use getChange to take changeDue and break into fifty/twenty/ten/five/one dollar bills
	// & quarters/dimes/nickels/pennies
	public static int calcChange(double n) {
		int currentAmount, remainAmount;
		int fifties, twenties, tens, fives, ones, quarters, dimes, nickels, pennies;
		currentAmount = (int)n * 100;
		while ( n != 0) {
			
			if ( n >= 5000) {
				fifties = currentAmount / 5000;
				remainAmount = currentAmount % 5000;
			}
			else if ( n >= 2000) {
				twenties = currentAmount / 2000;
				remainAmount = currentAmount % 2000;
			}
			else if ( n >= 1000) {
				tens = currentAmount / 1000;
				remainAmount = currentAmount % 1000;
			}
			else if ( n >= 500) {
				fives = currentAmount / 500;
				remainAmount = currentAmount % 500;
			}
			else if ( n >= 100) {
				ones = currentAmount / 100;
				remainAmount = currentAmount % 100;
			}
			else if ( n >= 25) {
				quarters = currentAmount / 25;
				remainAmount = currentAmount % 25;
			}
			else if ( n >= 10) {
				dimes = currentAmount / 10;
				remainAmount = currentAmount % 10;
			}
			else if ( n >= 5) {
				nickels = currentAmount / 5;
				remainAmount = currentAmount % 5;
			}
			else if ( n >= 1) {
				pennies = currentAmount / 1;
				remainAmount = currentAmount / 1;
			}
		
		} 
		
		
	}
	
	

}
