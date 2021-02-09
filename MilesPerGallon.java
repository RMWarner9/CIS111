/* Chapter 2 Problem 9
Miles per Gallon : Miles driven/Gallons used
Write a program that computes miles per gallon from input
Variables:
    milesPerGallon
    milesDriven
    gallons

 */
// import scanner
import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        //Set variables
        double milesPerGallon;
        double milesDriven;
        double gallons;
        Scanner keyboard = new Scanner(System.in);
        //Ask user for input
        System.out.println("How many miles have you driven?");
        milesDriven = keyboard.nextDouble();

        System.out.println("How many gallons have you used?");
        gallons = keyboard.nextDouble();
        // calculate
        milesPerGallon = milesDriven/gallons;
        //output results
        System.out.println("The cars miles per gallon is: " + milesPerGallon);

    }
}
