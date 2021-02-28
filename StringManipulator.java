/*
This program will take the input from the user of their favorite city.
The output will be:
The number of characters
The name of the city in all uppercase
The name of the city in all lowercase
The first character
Variables:
    city name

 */
import java.util.Scanner;
public class StringManipulator {
    public static void main(String[] args)
    {
        // Initialize variables and Scanner
        String cityName;
        Scanner keyboard = new Scanner(System.in);

        // Get the city name from the user:
        System.out.println("What is the name of your favorite city?");
        cityName = keyboard.nextLine();

        System.out.println("The city's character length is: " + cityName.length() + ". The city in all lowercase is: " +
                            cityName.toLowerCase() + ". The city in all uppercase is: " + cityName.toUpperCase() +
                            ". \n The first character in the city is: " + cityName.charAt(0));
    }
}
