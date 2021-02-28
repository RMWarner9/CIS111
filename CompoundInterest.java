/*
This program will calculate the amount total A in an account after a compound interest over t years, with an initial
amount of P

The equation is:
   A = P(1+r/n)^nt

Variables:

A = Amount of money in account - amount
P = Principle amount originally deposited- principle
r = annual interest rate - rate
n = number of times of year interest in compounded- number
t = specified number of years- years

Classes to import:
Scanner
Math (only power)

 */
import java.util.Scanner;
import static java.lang.Math.pow;

public class CompoundInterest {
    public static void main(String[] args){
        //Declare variables
        double amount;
        double principle;
        double rate;
        double number;
        int years;
        Scanner keyboard = new Scanner(System.in);

        //Ask user for input for numbers
        System.out.println("What is the principle amount originally deposited into the account?");
        principle = keyboard.nextDouble();

        System.out.println("What is the interest rate paid by the account?");
        rate = keyboard.nextDouble();
        double ratePercentage = rate/ 100;

        System.out.println("The number of times per year that the interest is compounded \n " +
                "(For example, if interest is compounded monthly, enter 12. If interest is compounded quarterly," +
                " enter 4.)");
        number = keyboard.nextDouble();

        System.out.println("Number of years to collect interest: ");
        years = keyboard.nextInt();

        amount = principle * pow(1 + (ratePercentage/number), number*years);

        System.out.printf("After %d years, you will have this much money in your account: $%.2f", years, amount);

    }
}
