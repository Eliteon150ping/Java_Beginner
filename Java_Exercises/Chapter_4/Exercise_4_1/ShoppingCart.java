//Exercise 4-1:
//  1.  Declare and initialize 2 String variables: custName and itemDesc

//  2.  Declare a String variable called message.  Do not initialize it.

//  3.  Assign the message variable with a concatenation of the custName and itemDesc.
//        Include a String literal that results in a complete sentence.
//        (example: "Mary Smith wants to purchase a Shirt")

//  4.  Print the message to the System output.

//  5.  Run the code.

package Chapter_4.Exercise_4_1;

public class ShoppingCart {
    
    public static void main(String[] args) {
         // Declare and initialize String variables.  Do not initialize message yet.

        String customerName = "Rishen",
                itemDesc = "Toyota Supra A80",
                message;

        // Assign the message variable

        message = customerName + " wants to buy a " + itemDesc + ".";


        
        // Print and run the code
        System.out.println(message);
        

    }
    
}
