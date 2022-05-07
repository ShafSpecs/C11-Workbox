package uber;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double totalMpg = 0.0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of miles for this trip or -1 to quit: ");
        int miles = input.nextInt();

        System.out.print("Enter amount of gallons used or -1 to quit to quit: ");
        int gallons = input.nextInt();

        while(miles != -1 && gallons != -1) {
            double mpg = (double) miles / gallons;
            System.out.printf("Miles per gallon used for this trip is: %.3f%n", mpg);

            totalMpg += mpg;

            System.out.printf("Total gallons used for all miles driven up to this point is: %.3f%n", totalMpg);

            System.out.print("Enter number of miles for this trip or -1 to quit: ");
            miles = input.nextInt();

            System.out.print("Enter amount of gallons used or -1 to quit to quit: ");
            gallons = input.nextInt();
        }
    }
}