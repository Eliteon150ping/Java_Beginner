// Exercise 6-2

//   In the ShoppingCart class:

//     1. Declare and instantiate 2 objects of type Item. Initialize only
//        the desc field in each, using different values for each.

//     2. Print the description for each item and run the code.

//     3. (Optional) Above the code that prints the descriptions,
//        assign item2 to item1.  Run it again.

package Chapter_6.Exercise_6_2;

public class ShoppingCart {

     public static void main(String args[]) {

           // Declare and initialize 2 Item objects
           Item pants = new Item();
           Item shoes = new Item();


          // Print both item descriptions and run code.
          pants.desc = "long pants";
          shoes.desc = "Nike shoes";


          System.out.println(pants.desc);
          System.out.println(shoes.desc);


	     // Assign one item to another and run it again.
          pants = shoes;
          System.out.println("pants:" + pants.desc);
          System.out.println("shoes:" + shoes.desc);



     }
 
} 
