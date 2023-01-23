
import java.math.*;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        boolean exit = false;
        // User input
        int user_int;
        // Initialize input scanner
        Scanner scan = new Scanner(System.in);

        // While program runs
        while (!exit) {
            
            // Prompt the user for a value and save the text
            System.out.print("Enter a number: ");
            String user_input = scan.nextLine();
            
            // If the user enters q,Q,quit the program will exit and notify the user
            if (user_input.equals("q") || user_input.equals("Q") || user_input.equals("quit")) {
                exit = true;
                System.out.println("Program exited cleanly.");
            }
            else {
                // Cast the string from the text buffer to an int
                user_int = Integer.parseInt(user_input);
                // Call factorial on the user's value
                System.out.print("" + user_int + "! is equal to " + factorial(user_int) + "\n\n");
            }
            
        }
        // Close scanner
        scan.close();
    }

    // Factorial function 
    public static BigInteger factorial(long n) {
        // Create a BigInteger value for 1
        BigInteger one = BigInteger.ONE;
        // Cast n to a BigInteger
        BigInteger result = BigInteger.valueOf(n);

        // If n is 0 return one
        if (n == 0) {
            return one;
        }
        // Otherwise multiply n by factorial of n - 1 and return the result
        else {
            return result.multiply(factorial(n - 1)) ;
        }
    }
}