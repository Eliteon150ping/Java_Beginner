// Exercise 4-2

//   1. Declare and initialize numeric fields. Include price and tax (double),
//      quantity (int). Also declare a double called total, but do not initialize it.

//   2. Change the message variable to include quantity
//      (example: "Mary Smith wants to purchase 1 Shirt.")

//   3. Calculate total by multiplying price * quantity * tax.

//   4. Print a message showing the total cost.
//      (example:  "Total cost with tax is: 25.78.")

package Chapter_4.Exercise_4_2;

public class ShoppingCart {
    
    public static void main(String[] args) {
        String custName = "Rishen";
        String itemDesc = " Toyota Supra A80";
        String message = custName+" wants to purchase a "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity, and total.
        double          price = 60,
                        tax = 25.78,
                        total;
        int quantity = 1;

        
        
        // Modify message to include quantity
        message = custName+" wants to purchase " + quantity + itemDesc;

        
        
        System.out.println(message);
        
        // Calculate total and then print the total cost
        total = price * quantity * tax;
        System.out.println("Total is " + total );
        

        
    }    
}
