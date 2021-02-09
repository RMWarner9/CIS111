/* Chapter 2 Problem 10
User enters 3 test scores, the program will output the three test scores and the average
 */
import java.util.Scanner;
public class TestAverage {
    public static void main(String[] args){
        //Set Variables
        double testOne;
        double testTwo;
        double testThree;
        double average;
        Scanner keyboard = new Scanner(System.in);
        // Get inputs from user
        System.out.println("What is the score for test 1?");
        testOne = keyboard.nextDouble();

        System.out.println(("What is the score for test 2?"));
        testTwo = keyboard.nextDouble();

        System.out.println("What is the score for test 3?");
        testThree = keyboard.nextDouble();

        // Calculate average

        average = (testOne + testTwo + testThree)/3;
        // Output message to user

        System.out.printf("The test scores are: %.2f, %.2f, %.2f", testOne, testTwo, testThree);

        System.out.printf("\nThe average is: %.2f", average);

    }
}
