package uber;

import java.util.Scanner;

public class SimpleHotelSystem {
    public static void main(String[] args) {
        System.out.println("""
                Welcome to the messed up scam hotel!
                It's a sunny day here in Nigeria, a fine day for a vacation. Which of our fraudulent services do you want today?
                
                1. 🚀 Explore options
                2. 🔫 Get lost! I'm out of here.
                > """);

        Scanner input = new Scanner(System.in);
        int firstChoice = input.nextInt();

        switch (firstChoice) {
            case 1 -> {
                break;
            }

            case 2-> {
                System.out.println();
                System.out.println("Goodbye! See you another day \uD83D\uDC4B");
                System.exit(0);
            }

            default -> {
                System.out.println();
                System.out.println("Not a valid input. Try to re-run the app.");
                System.exit(1);
            }
        }

        // To Be Continued...
    }
}
