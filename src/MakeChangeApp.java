import java.util.Scanner;
import java.text.DecimalFormat;

public class MakeChangeApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price, amount, change;
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
			change = (amount - price);
			change = Math.round(change * 100.0) / 100.0;
			changeDue = (int)((change) * 100.0);
			System.out.println("Change due: " + change);
			do {
				if (changeDue >= 5000) {
					fifties = changeDue / 5000;
					changeDue = changeDue % 5000;
					if (fifties > 1) {
						System.out.println(fifties + " fifty dollar bills");
					} else {
						System.out.println(fifties + " fifty dollar bill");
					}
				} else if (changeDue >= 2000) {
					twenties = changeDue / 2000;
					changeDue = changeDue % 2000;
					if (twenties > 1) {
						System.out.println(twenties + " twenty dollar bills");
					} else {
						System.out.println(twenties + " twenty dollar bill");
					}
				} else if (changeDue >= 1000) {
					tens = changeDue / 1000;
					changeDue = changeDue % 1000;
					if (tens > 1) {
						System.out.println(tens + " ten dollar bills");
					} else {
						System.out.println(tens + " ten dollar bill");
					}
				} else if (changeDue >= 500) {
					fives = changeDue / 500;
					changeDue = changeDue % 500;
					if (fives > 1) {
						System.out.println(fives + " five dollar bills");
					} else {
						System.out.println(fives + " five dollar bill");
					}
				} else if (changeDue >= 100) {
					ones = changeDue / 100;
					changeDue = changeDue % 100;
					if (ones > 1) {
						System.out.println(ones + " one dollar bills");
					} else {
						System.out.println(ones + " one dollar bill");
					}
				} else if (changeDue >= 25) {
					quarters = changeDue / 25;
					changeDue = changeDue % 25;
					if (quarters > 1) {
						System.out.println(quarters + " quarters");
					} else {
						System.out.println(quarters + " quarter");
					}
				} else if (changeDue >= 10) {
					dimes = changeDue / 10;
					changeDue = changeDue % 10;
					if (dimes > 1) {
						System.out.println(dimes + " dimes");
					} else {
						System.out.println(dimes + " dime");
					}
				} else if (changeDue >= 5) {
					nickels = changeDue / 5;
					changeDue = changeDue % 5;
					if (nickels > 1) {
						System.out.println(nickels + " nickels");
					} else {
						System.out.println(nickels + " nickel");
					}
				} else if (changeDue >= 1) {
					pennies = changeDue / 1;
					changeDue = changeDue % 1;
					if (pennies > 1) {
						System.out.println(pennies + " pennies");
					} else {
						System.out.println(pennies + " penny");
					}
				}
			} while (changeDue != 0);
		}
	}

}
