 /**
Primitive Data Types
Computer programs collect pieces of data from the real world and manipulate them in various ways.
When you write a program you must determine what types of data it is likely to encounter
Each variable has a data type.
    -Type of data that the variable can hold
    -Selecting the proper data type is important because a variable's data type
        determines the amount of memory the variable uses, and the way the variable formats and stores data.
Primitive Data Types for Numeric Data
byte
    1 byte
    integers in the range of -128 to +127
short
    2 bytes
    integers in the range of -32,768 to +32,767
int
    4 bytes
    integers in the range of -2,147,483,648 to +2,147,483,647
long
    8 bytes
    integers in the range of -9,223,372,036,84,775,808 to +9,223,372,036,854,775,807
float
    4 bytes
    floating-point numbers in the range -+3.4 x 10^-38 to 3.4 x 10^38
    with 7 digits of accuracy
double
    8 bytes
    Floating-point numbers in the range of -+ 1.7 x 10^-308 to 1.7 x 10^308
    with 15 digits of accuracy
Variable Declarations take this general format:
DataType VariableName;
    DataType is the name of the data type
    Variable name is the name of the variable
    You can declare several variables of the same type by separating their names with commas
    You can force an integer literal to be treated as a long by suffixing it with the letter L.
Floating-Point Data Types
    - Allows fractional values
    -float
        considered a single precision data type
        can store with 7 digits of accuracy
    -double
        considered double precision
        can store with 15 digits of accuracy
Floating-Point Literals
    doubles are not compatible with float variables because a double can be much larger or smaller.
Scientific and E Notation
    Java uses the E notation to represent values in scientific notation
    4.72819E4 = 47281.9
The boolean Data Type
    -holds two possible values: true or false.
    -useful for evaluation conditions that are either true or false.
The char Data Type
    Used to store characters.
    A variable of the char data type can hold one character at a time.
    enclosed in single quotation marks ''
Unicode
    Characters are internally represented by numbers


 */


public class Chapter2_4PrimitiveDataTypes {
    // This program has variable of several of the integer type
    public static void main(String[] args){
        char letter;
        boolean bool;
        int checking;
        byte miles;
        short minutes;
        long days;
        double price, tax, total;

        letter = 'A';
        checking = -20;
        miles = 105;
        minutes = 120;
        days = 189000;
        price = 29.75;
        tax= 1.76;
        total = 31.51;

        System.out.println("We have made a journey of "+ miles +" miles\n"
                            +"It took us " + minutes + " minutes \n"
                            +"Our account balance is $" + checking
                            +"\nAbout " + days + " days ago Columbus stood on this spot.");
        System.out.println("The price of the item: " + price
                            + "\nThe tax is: " + tax
                            + "\nThe total is: " + total );
        bool = true;
        System.out.println(bool);
        bool = false;
        System.out.println(bool);
        System.out.println(letter);
        letter = 66;
        System.out.println(letter);
    }
}
