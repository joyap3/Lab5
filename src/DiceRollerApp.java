import java.util.Scanner;

/**
 * Created by joyapuryear on 6/29/17.
 */

/*Ask user for number of sides on a pair of dice
Prompt the user to roll the dice
"Roll" two n-sided dice
Display the results of each die
Ask user if they'd like to roll again
Use static methods to implement the methods that generate the random numbers
Experiment w/ different random number generators
- start with random () method of the Math class
-also explore Java's Random Class
 */

public class DiceRollerApp {
    public static void main(String[] args) {
        Scanner diceSides = new Scanner(System.in);
        String choice = "y";

        do {

            System.out.println("Please enter the number of sides on the pair of dice:");
            while (!diceSides.hasNextInt()) {
                System.out.println("Your input needs to be a number ");
                diceSides.nextLine();
            }

            int diceRoll = diceSides.nextInt();
            diceSides.nextLine();
            System.out.println("Roll the dice! \n");
            System.out.println((int) (Math.random() * diceRoll) + 1);
            System.out.println((int) (Math.random() * diceRoll) + 1);
            System.out.println("Continue? (y/n)");
            choice = diceSides.nextLine();

        }
        while (choice.equalsIgnoreCase("y"));
        System.out.println("Goodbye");

    }
}
//    public static int randomNum(int roll) {
//        roll = (int) (Math.random());
//        return roll;

