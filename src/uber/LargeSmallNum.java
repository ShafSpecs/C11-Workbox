package uber;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LargeSmallNum {
    public static void main (String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter your set of numbers: ");

        int originalArr[] = {};

        int n = 0;

        for (int i = 0; i < 10;) {
            int newNum = userInput.nextInt();
            if (newNum >= 0) {
                originalArr = addArrayElements(n, originalArr, newNum);
                n += 1;
            } else {
                Arrays.sort(originalArr);
                System.out.println("The minimum number is: " + originalArr[0]);
                System.out.println("The maximum number is: " + originalArr[n - 1]);
                break;
            }
        }
    }

    @Contract(pure = true)
    public static int @NotNull [] addArrayElements(int n, int[] array, int newNum) {
        int[] newArr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            newArr[i] = array[i];
        }
        newArr[n] = newNum;
        return newArr;
    }
}
