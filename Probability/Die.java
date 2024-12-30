// Eric Trinh

public class Die { // Initializes the class Die.
    int numberOfSides = 6; // Sets the int numberOfSides to 6.
    private int face; // Initializes the int face.

    public int GetFace() { // Initializes the method GetFace().
        return face; // Returns the value stored in face.
    }

    public void Roll() { // Initializes the method Roll().
        face = (int) (Math.random() * numberOfSides) + 1; // changes the value of face to a random number in {1, 2, ...,
                                                          // numberOfSides}
    }

    public static void main(String[] args) { // Initializes the main.
        Die myDie = new Die(); // Creates a new Die object named myDie.

        myDie.Roll(); // Calls the roll method, generates a new value for face.
        int rollOne = myDie.GetFace(); // Creates a new int rollOne and stores the value of face in it.

        myDie.Roll(); // Calls the roll method, generates a new value for face.
        int rollTwo = myDie.GetFace(); // Creates a new int rollTwo and stores the value of face in it.

        int total = rollOne + rollTwo; // Calculates the total by adding up the rolls.

        System.out.println("The first die comes up " + rollOne); // Prints the result of rollOne.
        System.out.println("The second die comes up " + rollTwo); // Prints the result of rollTwo.
        System.out.println("The total roll is " + total); // Prints the total.
    }

}
