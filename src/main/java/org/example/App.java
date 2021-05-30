/* Gabriel Fernandez
 * COP3330 - Summer CV01
 * "Motivated" Practice Exercises
 * Exercise 10 - Self-Checkout
 */

package org.example;

// Import the required libraries
import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App 
{

    // Main function
    public static void main( String[] args )
    {
        // Store conversion factor into a constant
        final double TAX = 0.055;

        // Scan in the values for the prices and quantities of each
        // item and store into a double datatype
        System.out.println("Enter the price of item 1:");
        Scanner item1PIn = new Scanner(System.in);
        double item1P = item1PIn.nextInt();

        System.out.println("Enter the quantity of item 1:");
        Scanner item1QIn = new Scanner(System.in);
        double item1Q = item1QIn.nextInt();

        System.out.println("Enter the price of item 2:");
        Scanner item2PIn = new Scanner(System.in);
        double item2P = item2PIn.nextInt();

        System.out.println("Enter the quantity of item 2:");
        Scanner item2QIn = new Scanner(System.in);
        double item2Q = item2QIn.nextInt();

        System.out.println("Enter the price of item 3:");
        Scanner item3PIn = new Scanner(System.in);
        double item3P = item3PIn.nextInt();

        System.out.println("Enter the quantity of item 3:");
        Scanner item3QIn = new Scanner(System.in);
        double item3Q = item3QIn.nextInt();

        // Calculate the subtotal, tax, and total
        double subtotal = (item1P * item1Q) + (item2P * item2Q)
                        + (item3P * item3Q);
        double tax = subtotal * TAX;
        double total = subtotal + tax;

        // Round to 2 decimal places
        DecimalFormat df = new DecimalFormat("0.00");
        df.setRoundingMode(RoundingMode.CEILING);

        // Print out the calculations
        System.out.println("Subtotal: $" + df.format(subtotal) + "\n" +
                            "Tax: $" + df.format(tax) + "\n" +
                            "Total: $" + df.format(total));
    }
}
