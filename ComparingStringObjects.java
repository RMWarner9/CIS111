/*
Comparing String Objects
You cannot use relational operators to compare String objects.
Remember that a String objects is referenced by a variable that contains the objects memory address
When you use a relational operator to compare String objects, the operator works on the memory address that the
    variable contains not the contents of the String object.

To compare the contents of two String objects correctly, you should use the String class's equals method
StringReference1.equals(StringReference2)

Using the ! operator changes it to not equal to

There is also a compareTo method which is used to determine whether one string is greater than
    equal to or less than another string.
    StringReference.compareTo(OtherString)

 .compareToIgnoreCase the case of the strings is ignored
 */
public class ComparingStringObjects {
    public static void main(String[] args){
        String name1 = "Mark",
                name2 = "Mark",
                name3 = "Mary";
        if (name1.equals(name2))
            System.out.printf("%s and %s are the same\n" , name1 , name2);
        else
            System.out.printf("%s and %s are not the same\n", name1 , name2);
        if (name1.equals(name3))
            System.out.printf("%s and %s are the same\n", name1 , name3);
        else
            System.out.printf("%s and %s are not the same\n", name1 , name3);
        //compareTo method
        if (name1.compareTo(name3) < 0)
            System.out.printf("%s is less than %s", name1, name3);
        else if (name1.compareTo(name3) == 0)
            System.out.printf("%s is equal to %s" ,name1, name3);
        else if (name1.compareTo(name3) > 0)
            System.out.printf("%s is less than %s", name1, name3);


    }
}
