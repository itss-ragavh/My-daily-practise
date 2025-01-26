import java.util.*;

public class GuessRandomNumberGame {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        System.out.println("The Computer making its Guess...\n\n");
        int c_g = (int) (Math.random() * 10);

        do {
            System.out.print("\tEnter the number you guessed:");
            int u_g = sc.nextInt();
            count++;  // Increment the guess count

            if (u_g == c_g) {
                System.out.println("\n\t\t\tWow-you guessed the number correctly!");
                flag = false;
            } else if (u_g > c_g) {
                System.out.println("\tTry guessing lower than this!\n");
            } else if (u_g < c_g) {
                System.out.println("\tTry guessing higher than this!\n");
            }

            if (count == 3) {
                System.out.println("\t\t\t\tYou tried three times.\n\t\tDo you want to continue?");
                System.out.println("\t\t1. Yes\t\t2. No");
				System.out.print("\n\t\tEnter your choice :");
                int choice = sc.nextInt();
                if (choice == 2) {
					System.out.println("\t\tThe Computer guessed number is :"+c_g+" \n\t\tBetter luck next time");
                    flag = false; // End the game
                } else {
                    count = 0; // Reset the guess count for another round
                    System.out.println("The Computer making its Guess...");
                    c_g = (int) (Math.random() * 10); // Get a new random number for the next round
                }
            }
        } while (flag);
    }
}
