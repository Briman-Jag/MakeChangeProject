## Make Change Project

### First week homework for Skill Distillery

### Overview

This program is the first project in the Skill Distillery Full Stack Developer course. It is a java program used to calculate the amount of change to be returned to a customer. It will print the change in fifty dollar bills, twenty dollar bills, ten dollar bills, five dollar bills, one dollar bills, quarters, dimes, nickels, and pennies. Program also specifies if change type is singular or plural(ex. one dollar bill & one dollar bills).  

#### The program was tested based on these test conditions:
- Amount: .67, Tendered: .50, Result: Error message.
- Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
- Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
- Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.

### How to run

The program prompts user/customer to enter the purchase amount and then enter the amount of money tendered. Once user enters this information the program will then use this information to give them the exact amount of change in bills and coins. The user/customer must enter an amount tendered above the price or else they will receive error message. Program is set up to run once.

### Technologies/topics used

Java; imported Scanner; if, else if, and else; do/while loop; Modus; Casting; Assignment Operators; Expressions; Math.round();

### Lessons learned

Learned how to use Math.round() to round the double change amount to get more accurate change results. Used casting and multiplication by 100 on a double to create an int to work with in calculating change.
