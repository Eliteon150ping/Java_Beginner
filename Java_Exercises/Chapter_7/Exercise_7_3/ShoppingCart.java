//  Exercise 7-3

//    1. Declare a long, using the L to indicate a long value.  Make it a
//       very large number (in the billions).

//    2. Declare and initialize a float and a char.

//    3. Print the long variable with a suitable label.

//    4. Assign the long to the int variable.  Correct the syntax error
//       by casting the long as an int.

//    5. Print the int variable.  Note the change in value when you run it.

package Chapter_7.Exercise_7_3;

public class ShoppingCart {
    public static void main(String[] args){
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        long number1 = 3000000000000L;
        float number2 = 6.9F;
        char number3 = 'R';


        
        
        // Print the long variable.
        System.out.println("I have R" + number1);

	// Assign the long to the int and print the int variable.
       int1 = (int) number1;
       System.out.println("number1 is now shorter " + int1);
        
        
    }
}
