/*
Chapter 2.5 Arithmetic Operators
There are Three types of operators: unary, binary, and ternary.
Unary
    require only a single operand
    ex: -5, -number
    When used to turn a value negative, it is called the negation operator.
Binary
    Work with two operands
    The assignment operator is in this category
Ternary
Require three operands

 */
public class Chapter2_5ArithmeticOperators {
    public static void main (String[] args)
    {
        double regularWages;
        double basePay = 25;
        double regularHours = 40;
        double overtimeWages;
        double overtimePay = 37.5;
        double overtimeHours = 10;
        double totalWages;

        regularWages = basePay * regularHours;
        overtimeWages = overtimePay * overtimeHours;
        totalWages = regularWages + overtimeWages;

        System.out.println("Wages for this week are: $" + totalWages);
    }

}
