/**
Chapter 2.2 The print and println Methods and the Java API
The print and println methods are used to display text output.
They are part of the Java API which is a collection of prewritten classes and methods for performing
specific operations
Console output is plain text
    -When you display console output in a system that uses a GUI, such as windows or mac, the output usually appears
    in a window (cmd prompt)

Java API
    -API = Application Programmer Interface,
        -Classes and their methods are available to all Java programs
        -print and println methods are part of the API
    -System.out.println("Chicken Dinner")
        -System is a class that is part of the Java API
            -contains objects and methods that perform system-level operations.
            - One of the objects contains in the System class is named out
        -out
            -object
            -has methods for performing output on the system console
        Hierarchy:
            -println is a member of out, which is a member of system
    - The value to be displayed on the screen is placed inside the parentheses
        -Called an argument
        The println method advances the cursor to the beginning of the next line
            ** \n = new line character placed inside of quotation lines to also proceed to next line for
         organized, easy to read output when it is very long
    The print Method
        - Also part of System.out object.
        -Does not advance the cursor to the next line after the message is displayed
        - Two ways to fix this:
            -Use println method
            =Escape Sequences:
                Starts with a backslash character and is followed by one or more control characters
                    - \n
Escape Sequences
    \n Advances the cursor to the next line for printing
    \t Causes the cursor to skip over the the next tab stop
    \b Causes the cursor to back up or move left one position
    \r Causes the cursor to go to the beginning of the current line, not the next line
    \\ Causes a backslash to be printed
    \' Causes a single quotation to be printed
    \" Causes a double quotation mark to be printed
 */
//class header / class begins
public class Chapter2_2 {
    //method header / method begins
    public static void main (String[] args)
    // Console output with newline character
    {
        System.out.println("Programming is great fun! \n"
                            + "I can't get enough of it!");
        // or
        // System out with println for each new line
        System.out.println("Programming is great fun!");
        System.out.println("I can't get enough!");
        // .print() example
        System.out.print("Programming is ");
        System.out.print("great fun!\n");
        //print with \n
        System.out.print("These are our top sellers: \n"
                        +"Computer games\n"
                        +"Coffee \n"
                        +"Aspirin\n");
        // or
        System.out.print("These are our top sellers: \n Computer games \n Coffee \n Aspirin \n");
        /*
        Output program to print:
        Success
        Success Success

        Success
         */
        System.out.print("Success\n");
        System.out.print("Success ");
        System.out.print("Success\n");
        System.out.print("\nSuccess");
        //Exercise 2.9
        System.out.print("\nName: Rachel\n"
                        + "Address: 123 Street Road\n"
                        +"City, State, 12345\n"
                        +"123-456-7890");


    }
}
