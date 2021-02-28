/*
Calculate shipping charges
Use the ceil function to round the result of miles/500 to the next highest increment.
weight <= 2 = 1.10 per 500 miles
weight > 2 && <= 6 = 2.20 per 500 miles
weight > 6 && <= 10 = 3.70 per 500 miles
weight > 10 = 3.80
 */
// The ceil method allows us to round a number to the lowest integer that is greater than or equal to the
// argument
import static java.lang.Math.ceil;
// Asking user for input
import java.util.Scanner;
// Declare class
public class ShippingCharges {
    // Declare method
    public static void main(String[] args){
        // Declare variables
        double weight = 0;
        double miles = 0;
        double mileRate = 0;
        double cost;
        Scanner stdin = new Scanner(System.in);
        // Ask user for weight and then assigns input to weight variable
        System.out.println("Please enter the weight of your package: ");
        weight = stdin.nextDouble();
        // Ask user for mileage amount and then assign input to miles variable
        System.out.println("Please enter the amount of miles ");
        miles = stdin.nextDouble();
        // Calculate mile rate by dividing miles by 500 and then using the ceil method
        // So, if mileRate = 520/500 = 1.04, with ceil the value is actually 2, and so on.
        mileRate = ceil(miles/500);

        // calculate cost determined by weight and mileRate
        if (weight <= 2){
            cost = 1.10 * mileRate;
            System.out.printf("The cost to ship this package is: $%.2f " , cost);
        }
        if (weight > 2 && weight <= 6){
            cost = 2.20 * mileRate;
            System.out.printf("The cost to ship this package is: $%.2f", cost);
        }
        if (weight > 6 && weight <= 10){
            cost = 3.70 * mileRate;
            System.out.printf("The cost to ship this package is: $%.2f", cost);
        }
        if (weight > 10){
            cost = 3.80 * mileRate;
            System.out.printf("The cost to ship this package is: $%.2f", cost);
        }

    }

}
