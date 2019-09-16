import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price, amount;
		int changeDue = 0;
		int fifties, twenties, tens, fives, ones, quarters, dimes, nickels, pennies;

		System.out.println("Please enter the purchase price: ");
		price = kb.nextDouble();
		System.out.println("Now enter the amount tendered: ");
		amount = kb.nextDouble();

		if (amount == price) {
			System.out.println("You've paid the exact amount! \n Thank you for your business!");

		} else if (amount < price) {
			System.out.println("Sorry, that isn't enough money for this purchase.");
			kb.close();
		} else {
			changeDue = (int)((amount - price));
			System.out.println("Change Due is: " + changeDue);
			do {
				if (changeDue >= 50) {
					fifties = changeDue / 50;
					changeDue = changeDue % 50;
					System.out.println(fifties + " fifty dollar bills, ");
				} else if (changeDue >= 20) {
					twenties = changeDue / 20;
					changeDue = changeDue % 20;
					System.out.println(twenties + " twenty dollar bill(s)");
				} else if (changeDue >= 10) {
					tens = changeDue / 10;
					changeDue = changeDue % 10;
					System.out.println(tens + " ten dollar bill(s)");
				} else if (changeDue >= 5) {
					fives = changeDue / 5;
					changeDue = changeDue % 5;
					System.out.println(fives + " five dollar bill(s)");
				} else if (changeDue >= 1) {
					ones = changeDue / 1;
					changeDue = changeDue % 1;
					System.out.println(ones + " one dollar bill(s)");
				} else if (changeDue >= .25) {
					changeDue *= 100;
					quarters = changeDue / 25;
					changeDue = changeDue % 25;
					System.out.println(quarters + " quarter(s)");
				} else if (changeDue >= .10) {
					changeDue *= 100;
					dimes = changeDue / 10;
					changeDue = changeDue % 10;
					System.out.println(dimes + " dime(s)");
				} else if (changeDue >= .05) {
					changeDue *= 100;
					nickels = changeDue / 5;
					changeDue = changeDue % 5;
					System.out.println(nickels + " nickel(s)");
				} else if (changeDue >= .01) {
					changeDue *= 100;
					pennies = changeDue / 1;
					changeDue = changeDue % 1;
					System.out.println(pennies + " penny/pennies");
				}
			} while (changeDue != 0);
			}
		}

}



