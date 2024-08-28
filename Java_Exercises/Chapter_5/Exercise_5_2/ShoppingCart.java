// Exercise 5-2
//
//    1. Declare a String array and initialize it with 4 elements.
//       Each element represents a different item description ("Shirt", for instance).

//    2. Change message to show how many items the customer wants to purchase
//       (Use the length property of the items array).

//    3. Print just one element of the items array.
//       What happens if you use index number 4?

package Chapter_5.Exercise_5_2;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Rishen";
        String message = custName + " wants to purchase a several items.";

        //Declare and initialize the items String array
        
        String [] items = {"Shoe","Shirt","pants","belt"};


        // Change message to show the number of items purchased.

        message = custName + " wants to purchase " + items.length + " items.";
        

        System.out.println(message);
        // Print an element from the items array.  
        
        message = custName + " wants to purchase " + items[2]; // 4 will give an error since the index starts counting from 0 hence only up to 3 will work
        System.out.println(message);
    }

}
