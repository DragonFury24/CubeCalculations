import java.util.InputMismatchException;
import java.util.Scanner;

public class CubeMain {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the length of");
        System.out.println("1 side of the cube you're trying");
        System.out.println("to find the surface of.");
        int length = intInput(keyboard);
        System.out.println("The surface area of this cube is " + Math.pow(length, 2) * 6);
    }

    public static int intInput(Scanner keyboard){ //checks if input is a int. If not, then will give error and force user to retry
        int iOutput = -1;
        while (iOutput == -1) {
            try {
                iOutput = keyboard.nextInt();

                if (iOutput < 0) {
                    iOutput = -1;
                    System.out.println("You put in a number less than 0. Please try again.");
                }
            } catch (InputMismatchException I) {
                System.out.println("You did not input a number. Please try again.");
                keyboard.next();
            }
        }
        return iOutput;
    }
}
