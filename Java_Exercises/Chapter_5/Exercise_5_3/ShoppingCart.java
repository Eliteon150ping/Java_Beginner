// Exercise 5-3

//        1. Create a for loop that iterates through the items array,
//           displaying each element. Precede the list of elements with
//           the message, "Items purchased: ".

package Chapter_5.Exercise_5_3;

public class ShoppingCart {

    public static void main(String[] args) {
        // local variables
        String custName = "Rishen";
        String message;
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;

        String items[];
        items = new String[4];
        items[0] = "Shirt";
        items[1] = "Belt";
        items[2] = "pants";
        items[3] = "Shoes";
        
        message = custName + " wants to purchase "+items.length+" items.";
        System.out.println(message);
        
       // Iterate through and print out the items from the items array
        System.out.println("Item purchased: ");

        for (int i = 0; i < items.length; i++) {

            System.out.println(items[i]);

        }

        
    }    
}
