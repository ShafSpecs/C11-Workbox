package uber;

import java.util.Scanner;

public class BarChart {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 5-core numbers used for this \"chart\": ");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = input.nextInt();
            for(int j = 0; j < numbers[i]; j++) {
                if (j == numbers[i] - 1) {
                    System.out.printf("*%n");
                } else {
                    System.out.print("*");
                }
            }
        }
    }
}
