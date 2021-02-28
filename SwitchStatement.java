/*
The switch Statement

The switch statement lets the value of a variable or expression determine where the program will
    branch to.
It is a multiple alternative decision structure that allows you to test the value of a variable or
expression and then use the value to determine which statement or set of statements to execute.
General Format:

switch (testExpression){            The testExpression is a variable or expression
    case value_1:
        statement;
        statement;                  These statements are executed if the testExpression is equal to value_1
        break;

    case value_2:
        statement;
        statement;                  Same thing but with value_2
        break;

    case value_n:
        statement;
        statement;                  You know the deal by now
        break;

   default:
    statement;
    statement;                      These statements are executed if the testExpression is not equal to any of the
                                       case values
    break;
 */
import java.util.Scanner;
public class SwitchStatement {
    public static void main(String[] args){
        int number;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter 1, 2, or 3");
        number = stdin.nextInt();


        switch (number){
            case 1:
                System.out.print("You entered 1.");
                break;
            case 2:
                System.out.print("You entered 2.");
                break;
            case 3:
                System.out.print("You entered 3.");
                break;
            default:
                System.out.print("You did not enter 1, 2, or 3.");
        }
    }
}
