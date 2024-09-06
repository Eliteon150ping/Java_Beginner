package Book_2.Chapter_2;

// Listing 2.3

import java.util.Scanner;
public class ScannerApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Enter an integer: ");
        int x = sc.nextInt();
        System.out.println("You entered " + x + ".");
    }
}
