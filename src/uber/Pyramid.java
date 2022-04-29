package uber;

import java.util.Scanner;

public class Pyramid {
    public static void main (String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid: ");
        int height = keyboardInput.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("#");
            }
            System.out.println();
        }
        keyboardInput.close();
    }
}
