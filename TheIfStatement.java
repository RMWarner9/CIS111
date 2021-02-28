/*
The if statement
The if statement is used to create a decision structure, which allows a program to have more than
one path of execution.

The if statement causes one or more statements to execute only when a boolean expression is true.

When statements are executed in sequence without branching off in another direction,
they are called a sequence structure.

When algorithms require a program to execute some statements only under certain circumstances,
this is called a decision structure.
    -In decision structures, a specific action is taken only when a condition exists.
    -If the condition does not exist, the action is not performed.
General format of the if statement:
if (BooleanExpression)
    statement;

Relational Operators to Form Conditions
    A relational operator determines whether a specific relation ship exisists between
    two values.
    > , < , >= , <=, == , !=

 */
import java.util.Scanner;
public class TheIfStatement {
    public static void main(String[] args){
        double score1, score2, score3, average;
        Scanner stdin = new Scanner(System.in);

        System.out.println("This program averages 3 test scores. \n Enter score #1: ");
        score1 = stdin.nextDouble();

        System.out.println("Enter score #2: ");
        score2 = stdin.nextDouble();

        System.out.println("Enter score #3: ");
        score3 = stdin.nextDouble();

        average = (score1 + score2 + score3) / 3.0;
 // Be careful of semicolons. Semicolons do not go after the if (expression)
 // An if statement can hae multiple statements as long as they are enclosed in a set of
 //braces called a block of statements.
        if (average > 95)
            System.out.println("That's a great score! Congrats!");
        //Exercise 3.1: Write an if statement that assigns 0 to x when y is equal to 20
        int y;
        System.out.println("What would you like to set y to?");
        y = stdin.nextInt();
        int x = 20;
        if (y == 20)
            x = 0;
        System.out.println("x is " + x );


    }
}
