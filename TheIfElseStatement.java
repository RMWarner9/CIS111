/*
The if-else statement will execute one group of statements if the boolean expression is true
or another group if its boolean expression is false.

Format:
if (BooleanExpression)
    statement or block
else
 statement or block

If a statement in the if statement is true, then it will execute the statement or block
If it is false, a separate group is executed

 */
import java.util.Scanner;
public class TheIfElseStatement {
    public static void main (String[] args){
        double number1, number2;
        double quotient;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a a number: ");
        number1 = stdin.nextDouble();

        System.out.println("Enter a second number: ");
        number2 = stdin.nextDouble();

        if (number2 == 0)
            System.out.println("Division by zero is not possible. \n Please enter a number greater than 0");

        else
        {
            quotient = number1/number2;
            System.out.println("The quotient of the two numbers is: " + quotient);
        }
    }
}
