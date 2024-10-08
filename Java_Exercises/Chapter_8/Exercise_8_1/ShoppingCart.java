//Exercise 8-1

//   In the Item class:

//        1. Declare a setColor method that takes a char as an argument (a color code)
//           and returns a boolean.
//           Return false if the colorCode is ' '.
//           Otherwise, assign the colorCode to the color field and return true.

//   In the ShoppingCart class:

//       2. Call the setColor method on item1.  If it returns true,
//          print out item1.color.  If it returns false, print an
//          invalid color message.

//       3. Test the method with both a valid color and an invalid one.

package Chapter_8.Exercise_8_1;

public class ShoppingCart {
    public static void main(String[] args){
        Item item1 = new Item();
        
        //   Call the setColor method on item1. Print the new color value from
        //   item1 if the method returns true.  Otherwise print an "invalid color"
	    //   message.

        if (item1.setColor(' ')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
       
        
    }
}
