// Keypad.java
// Represents the keypad of the ATM

import java.util.Scanner; // program uses Scanner to obtain the user input

public class Keypad 
{
    private Scanner input; // reads data from the command line

    //no-argument constructor initializes the Scanner
    public Keypad()
    {
        input = new Scanner(System.in);
    }// end no-argument Keypad constructor

    // return an integer value entered by the user
    public int getInput()
    {
        return input.nextInt(); // we assume that the user enters an integer
    }// end method getInput
}// end class Keypad
