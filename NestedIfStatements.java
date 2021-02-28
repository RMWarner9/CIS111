/*
You can put if statements within if statements
System.exit() can be used to indicate a successful termination of a program
 */
import java.util.Scanner;
public class NestedIfStatements {
    public static void main(String[] args){
        double salary, yearsOnJob;
        Scanner stdin = new Scanner(System.in);

        System.out.println("Please enter your annual salary: ");
        salary = stdin.nextDouble();

        System.out.println("Please enter the number of years at this job: ");
        yearsOnJob = stdin.nextDouble();

        if (salary >= 50000)
        {
            if (yearsOnJob >= 2)
                System.out.println("You qualify for the loan");
            else
                System.out.println("You must have been on your current job for at least two years to qualify");

        }
        else
            System.out.println("You must make 50000 or more to qualify for the loan");


    }
}
