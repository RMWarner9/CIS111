/* Chapter 2 Problem 13
Write a program that calculates the tax and ti[ of a restaurant bill
Ask user the charge of the bill
Tax should be 6.75
Tip should be 20 percent
Display meal charge, tax amount, tip, and total

Variables
    meal charge
    tax (final?)
    tip percentage
    total

 */
//import scanner
import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args){
        //Set variables
        double mealCharge;
        final double TAX = .0675;
        double tipPercentage = .2;
        Scanner keyboard = new Scanner(System.in);
        // Ask user for meal total
        System.out.println("What is the total of the meal?");
        mealCharge = keyboard.nextDouble();
        // Calculate TAX and tip total
        double taxTotal = mealCharge * TAX;

        double tipTotal = mealCharge * tipPercentage;

        // Calculate meal total

        double mealTotal = mealCharge + taxTotal + tipTotal;

        // Output mealTotal, taxTotal, and tipTotal

        System.out.printf("The total of the meal is: $%.2f. The tax is:  $%.2f and the tip is: $%.2f.",
                mealTotal, taxTotal, tipTotal);




    }
}
