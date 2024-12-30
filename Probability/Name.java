// Eric Trinh

import java.util.Scanner; // Imports the Scanner class.

public class Name { // Initializes the class Name.
    public static void main(String[] args) { // Initializes the main.
        Scanner nameScanner = new Scanner(System.in); // Creates the scanner object for user input.
        System.out.print("Enter user's name: "); // Prompts the user for their name.

        String userName = nameScanner.nextLine(); // Read's the user's input.
        String responseText = "Hello, " + userName.toUpperCase() + ", nice to meet you!"; // Creates the response string
                                                                                          // as the expected output.
        System.out.println(responseText); // Prints the user's name in uppercase.
        nameScanner.close(); // Closes the scanner since we are finished.
    }

}