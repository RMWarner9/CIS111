/*
The if-else-if Statement
It is often simpler to test a series of conditions with the if-else-if statement
with a set of nested if-else statements
if (expression_1)
    {
    statement
    statement               If expression_1 is true these statements are executed
    }                       and the rest of the structure is ignored
else if (expression_2)
    {
    statement
    statement           If expression_2 is true these statements are executed and
    }                   the rest of the structure is ignored
else
    {
    statement              These statements will execute ig none of the expressions above are true
    statement
    }

 */
import java.util.Scanner;
public class TheIfElseIfStatement {
    public static void main(String[] args)
    {
        int testScore;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter your numeric test score and I will tell you your grade");
        testScore = stdin.nextInt();

        if (testScore < 60)
            System.out.println("Your grade is F");
        else if (testScore < 70 )
            System.out.println("Your grade is D");
        else if (testScore < 80)
            System.out.println("Your grade is C");
        else if (testScore < 90)
            System.out.println("Your grade is B");
        else if (testScore <= 100)
            System.out.println("Your grade is A");
        else //You can use the trailing else statement to catch errors
            System.out.println("Invalid Score");
    }

}
