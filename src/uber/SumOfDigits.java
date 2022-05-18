package uber;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your digits to sum individual numbers!");
        System.out.print("> ");
        int next = input.nextInt();

        int sum = getDigitsSum(next);

        System.out.println("The sum of " + next + " digits is: " + sum);
    }

    public static int getDigitsSum (int digit) {
        String num = String.valueOf(digit);
        if (num.length() > 1) {
            char[] dg = num.toCharArray();
            int total = 0;

            for (int i = 0; i < dg.length; i++) {
                total += Character.getNumericValue(dg[i]);
            }

            return total;
        }

        return digit;
    }
}
