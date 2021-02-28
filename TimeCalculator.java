/*
Time Calculator
This program takes the users input of seconds and converts it to minutes, hours, and days.
1 minute = 60 seconds
1 hour = 3600 seconds
1 day = 86400
 */
//import scanner
import java.util.Scanner;
//declare class
public class TimeCalculator {
    //declare method
    public static void main(String[] args) {
        //declare variables
        int seconds = 0;
        int minutes= 0; // Set all variables equal to 0 so if they do not rule to be true, I still
        int hours = 0;  // Get a value of 0 for them to make sure the program works
        int days = 0;
        // Scanner class
        Scanner stdin = new Scanner(System.in);
        // Ask user for amount of seconds to calculate
        System.out.println("Please enter an amount of seconds");
        // Assign user's input to the variable seconds
        seconds = stdin.nextInt();
        System.out.println("That equals to: ");

        // Determine if the amount given amounts to any days
        // If it does, calculate the days with division
        if (seconds >= 86400){
            days = seconds/86400;
            // Reassign the value of seconds to be the remainder to be used to compare to other if statements
            seconds %= 86400;
        }
        if (seconds >= 3600){
            hours = seconds/3600; // Repeat but for hours
            seconds %= 3600;
        }
        if (seconds >= 60){
            minutes = seconds /60; // Repeat but for minutes
            seconds %= 60; // The remaining seconds do not need an if statement as they have been reduced down to
            }               // The value of < 60 seconds
        // output to user
        System.out.printf("%d days, %d hours, %d minutes, and %d seconds", days, hours, minutes,seconds);
        }
    }


