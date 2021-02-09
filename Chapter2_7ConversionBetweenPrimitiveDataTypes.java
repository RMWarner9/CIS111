/*
Chapter 2.7 Conversion Between Primitive Data Types
Java is a strongly typed language. This means that before a value can be assigned to a variable,
Java checks the data types of the variable and the value being assigned to it.
Primitive data type ranking:
    1 double
    2 float
    3 long
    4 int
    5 short
    6 byte
Widening conversion
    In assignment statements where values of lower-ranked data types are stored
    in variables of higher-ranked data types, Java automatically converts the lower-ranked
    value to the higher-ranked type
Narrowing Conversion does the opposite
    Because it can potentially cause a loss of data, Java does not automatically perform them
Cast Operators
    Lets you manually convert a value, even if it means that a narrowing conversion will take place.
    Unary operators that appear as a data type name enclose in a set of parenthesis
    ex:
    x = (int) number
        Will return the value number converted to an int.

 */
public class Chapter2_7ConversionBetweenPrimitiveDataTypes {
}
