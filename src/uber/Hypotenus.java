package uber;

import java.util.Scanner;

public class Hypotenus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Hypotenuse calculator!");
        System.out.println("Enter the value of the two sides to get started");

        System.out.print("First Side: ");
        double firstSide = input.nextInt();

        System.out.print("Second side: ");
        double secondSide = input.nextInt();

        double hypotenus = Hypotenus.getHypotenus(firstSide, secondSide);

        System.out.println();
        System.out.println("The hypotenuse is " + hypotenus);
    }

    public static double getHypotenus(double firstSide, double secondSide) {
        double hypotenuseSquared = (firstSide * firstSide) + (secondSide * secondSide);
        double hypotenuse = Math.sqrt(hypotenuseSquared);

        return hypotenuse;
    }
}