/*
Calculate the speed of sound
Air = 1100 feet per second
Water = 4900 feet per second
Steel = 16400 feet per second

Time = distance/ medium

 */

// Asking user for input, import Scanner
import java.util.Scanner;
//Declare class
public class SpeedOfSound {
    //Declare method
    public static void main(String[] args){
        //Declare variables
        String medium;
        double distance = 0;
        double time = 0;
        Scanner stdin = new Scanner(System.in);
        // Ask the user which medium they will be using for calculations
        System.out.println("What is the medium that you want to use? ");
        // Set all input to lowercase so even if they type AIR, it will still work (case sensitivity).
        medium = stdin.nextLine().toLowerCase();
        // Ask user for distance travelled
        System.out.println("What is the distance travelled in feet?");
        // Set input to distance variable
        distance = stdin.nextDouble();

        // Use a switch statement to determine where the program will branch to

        switch(medium){

            case "air":
                time = distance/1100;
                System.out.printf("It will take %.2f seconds", time);
                break;

            case "water":
                time = distance/4900;                                   // calculate time based on medium entered
                System.out.printf("It will take %.2f seconds", time);
                break;

            case "steel":
                time = distance/16400;
                System.out.printf("It will take %.2f seconds", time);

        }

    }
}
