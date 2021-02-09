/** Chapter 2.13 Reading Keyboard Input
 * The System.in object is used to read keystrokes that have been typed to the keyboard
 * The System.in object reads input only as byte values.
 * To work around this, you can use the System.in object in conjunction with an object of the
 * Scanner class
 *  Scanner class is designed to read input from a source, and provides methods
 *  that you can use to retrieve the input formatted as primitive values or strings.
 *
 * First, create a Scanner object and connect it to the System.in object
 * Scanner keyboard = new Scanner(System.in);
 *  Scanner keyboard
 *      variable name keyboard. The data type is Scanner
 *      keyboard is now a class type variable that holds the memory address of an object.
 *  = new Scanner(System.in)
 *      The purpose of the new keyword is to create an object in memory.
 *      The type of object that will be created is listed next
 * The Scanner class has methods for reading strings, bytes, integers, so on.
 *
 * .nextInt()
 *  formats an input value as an int then returns that value
 *  Scanner class is not automatically available to your Java programs.
 *  It needs to be imported
 *
 *  Reading a Character
 *      You can use the Scanner class's nextLine method to read a String from a keyboard,
 *      and then use the String class's charAt method to extract the first character
 *      of the string.
 * Mixing Calls to nextLine with Calls to Other Scanner Methods
 *  When the user types keystrokes at the keyboard, those keystrokes are stored in an area of memory
 *  called the keyboard buffer.
 *  Pressing the enter key causes a newline character to be stored in the keyboard buffer
 *  When going from a number to a string, use the .nextLine method to clear the keyboard buffer
 *  and then continue.
 *  .next() stops when it sees a space, .nextLine() reads everything up until the enter key is pressed
 */
import java.util.Scanner;
public class Chapter2_13ReadingKeyboardInput {
    public static void main(String[] args)
    {
        String name;
        int hours;
        double payRate;
        double grossPay;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your name? ");
        name = keyboard.nextLine();
        System.out.println("How many hours did you work this week?");
        hours = keyboard.nextInt();
        System.out.println("What is your hourly pay rate?");
        payRate = keyboard.nextDouble();

        grossPay = hours * payRate;

        System.out.println("Hello, " + name + ". \n"
                            + "Your gross pay is: $" + grossPay );
        System.out.println("Are you having fun? (Y=yes N=no)");
        System.out.println("Buffer: " + keyboard.nextLine());
        String input = keyboard.next();
        char answer = input.charAt(0);
        System.out.println(answer);
    }
}
