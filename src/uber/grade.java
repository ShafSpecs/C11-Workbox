package uber;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        // get input from the user (int)
        Scanner input = new Scanner(System.in);

        int userChoice = input.nextInt();

        // if the input is less than 55, print "Fail"
        if (userChoice < 55) {
            System.out.println("Fail");
        }

        // if greater than 55, print "Pass"
        if (userChoice >= 55) {
            System.out.println("Pass");
        }
    }
}