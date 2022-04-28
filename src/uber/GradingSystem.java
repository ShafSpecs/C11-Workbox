// Prompt the user for an input
// Store the score in a variable
// If the score is greater than or equals to 90, print A
// If the score is between 70 and 80, print C
// If the score is between 60 and 70, print D
// If the score is lesser than 60, print F
package uber;

import kata.Kata;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a grade: ");


        int score = input.nextInt();

        if (score < 60) {
            System.out.println("F");
        }
    }
}
