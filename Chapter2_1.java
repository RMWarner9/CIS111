/*
Chapter 2: Java Fundamentals
2.1 The parts of Java Program
Programs can be compiled with the command: javac <filename>
The compiler will also create another file names <filename>.class, which contains the
translated Java byte code java <filename>

To make SINGLE LINE comments, use //
--------------------------------------------------
Program breakdown:
public class <classname> {
This is known as a class header, it marks the beggining of a class definition.
    -Serves as a container for an application.
    -A java program must have at least one class definition
    -public
        -public is a Java key word and it must be written in all lowercase letters
        -It is known as an access specifier, and it controls where the class may be accessed from.
        -The public specifier means access to the class is unrestricted ("Open to the public")
    -class
        -indicates the beginning of a class definition
    -<class name>:
        -In this program, the class name is Chapter2.
        -Made up by the programmer
    ** All together, this code tells the compiler that a publicly accessible class named Chapter2 is beging
    defined.
    ** You may create more than once class in a file, but you may only have *one public class* per Java file.
    ** When a Java file has a public class, the name must be the same as the name of the file
    **Java is case sensitive**
    - {
        -The left/opening brace.
        -Associated with the beginning of the class definition
        - All of the programming statements that are part of the class are enclosed in a set of braces.
        -On the last line of the program, you'll see the closing brace, }
            - Everything between these two braces is the body of the class

    public static void main (String[] args)
        -This is known as the method header. It marks the beginning of the method.
            -A method can be thought of as a group of one or more programming statements that collectively has a nice
            - When creating a method, you must tell the compiler several things about it.
            - The name of this method is main. The rest of the words are required for the method to be properly defined.
Every stand-alone Java program that runs on your computer is known as an application.
Every application must have a method named main
The main method is the starting point of an application

There is another set of braces. The second pair of braces belong to the main method.

System.out.println.("Programming is great fun!");
    To put it simply, this line displays a message on the screen. It prints out without the
    quotation marks. In programming terms, the group of characters inside the quotations is called a
    string literal
If something is to be displayed on the screen, you must use a statement for that purpose.
;
    - At the end of the line is a semicolon. Just as periods mark the end of a sentence, a semicolon marks
    the end of a statement in Java.
    **Where we don't place semicolons:
        - Comments (ignored by the compiler)
        -Class and method headers (Terminated with a body of code)
        - Brace characters are not statements.
Special Characters:
// Marks the beginning of a comment
( ) Used in a method header
{ } Encloses a group of statements, such as the contents of a class or method
" " Encloses a string of characters
; Marks the end of a complete statement

 */


// class header with open bracket
public class Chapter2_1 {
    //method header with open bracket
    public static void main(String[] args) {
        // print out a string literal "Programming is great fun!"
        System.out.println("Programming is great fun! \n"
                            + "Hello World! \n"
                            + "Rachel Warner");
    }
}
