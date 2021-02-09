/**
Chapter 2.3 Variables and Literals
Variables allow you to store and work with data in the computer's meo=mort
    Part of the job of programming is to determine how many variables a program will need and what types
    of data they will hold
Variable Declaration
    Variables must be declared before they can be used.
    Tells the compiler the variables name and the type of data it will hold.
    The word int says that the variable can only hold integer numbers
Assignment Statement
    example: value = 5
    The equal sign is an operator that stores the value on the right to the variable named on its left
    If you want the value of a variable to be displayed in output, leave outside of ""
Displaying Multiple Lines with the + Operator
    The + operator is used with strings
    Known as the string concatenation operator
        To concatenate means to append
** Using quotation marks turns whatever you are surrounding into a string literal
** Strings are for humans, Numbers are primarily for mathematical operations
** You cannot perform math on strings

More about Literals
     A literal is a value that is written in the code of a program
     Literals are commonly assigned to variables or displayed
Identifiers
    An identifier is a programmer-defined name that represents some element of a program
    Examples: variable names and class names
    Can be any name as long as it is not a Java key word
    **Always choose names for your variables that identify what they are used for
    This method of coding helps produce self-documenting programs
        -you understand what the program is doing just by reading its code
        Specific rules for identifiers:
            The first character must be a-z, A-Z, an underscore, or $
                Only use $ for special purposes
            Upper and lowercase characters are distinct
            Identifiers cannot include spaces
Class Names
    It is standard practice to capitalize the first letter of a class name as well as the first letter of each
    subsequent word it contains
 */
public class Chapter2_3 {
    public static void main(String[] args) {
        /*variable declaration
        This declaration indicated the variable name is value and is an integer
         */
        int value;
        // assignment statement
        value = 5;
        System.out.print("The value is: \n" + value + "\n");
    }
}
