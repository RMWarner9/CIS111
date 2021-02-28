/*
This program will display the first middle and last name and the initials for each one.
 */
public class NameAndInitials {
    public static void main(String[] args){
        // Declare variables
        String firstName = "Rachel";
        String middleName = "Marie";
        String lastName = "Warner";

        char firstInitial = firstName.charAt(0);
        char middleInitial = middleName.charAt(0);
        char lastInitial = lastName.charAt(0);

        System.out.printf("The full name is: %s %s %s " , firstName, middleName, lastName + "\n");
        System.out.printf("The initials of the name are: %c %c %c", firstInitial, middleInitial, lastInitial);
    }


}
