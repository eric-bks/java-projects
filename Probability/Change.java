// Eric Trinh

import java.util.Scanner; // Imports the Scanner for use in the code.

public class Change { // Initializes the Change class.
    public static void main(String[] args) { // Initializes the main.
        Scanner changeScanner = new Scanner(System.in); // Initializes the scanner.
        System.out.println("How many quarters do you have?"); // Prompts the user for quarters.
        int quarters = changeScanner.nextInt(); // Reads the user's response and records it in the int quarters.

        System.out.println("How many dimes do you have?"); // Prompts the user for dimes.
        int dimes = changeScanner.nextInt(); // Reads the user's response and records it in the int dimes.

        System.out.println("How many nickels do you have?"); // Prompts the user for nickels.
        int nickels = changeScanner.nextInt(); // Reads the user's response and records it in the int nickels.

        System.out.println("How many pennies do you have?"); // Prompts the user for pennies.
        int pennies = changeScanner.nextInt(); // Reads the user's response and records it in the int pennies.

        double total = ((25 * quarters + 10 * dimes + 5 * nickels + pennies) / 100.0); // Calculates the total.

        System.out.println("You have: $" + total + "."); // Prints the response.

        changeScanner.close(); // Closes the scanner.
    }
}
