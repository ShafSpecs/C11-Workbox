package uber;

public class ArrayOne {
    public static void main(String[] args) {
//        int[] array = { 10, 20, 33, 6, 7 };
//
//        int total = 0;
//        int maxNum = array[0];
//        int minNum = array[0];
//
//        for (int i = 0; i < array.length; i++) {
//            total += array[i];
//            for (int j = 0; j <= i; j++) {
//                if(array[i] > array[j]) {
//                    maxNum = array[i];
//                }
//            }
//
//            for (int j = 0; j <= i; j++) {
//                if(minNum < array[j]) {
//
//                } else {
//                    minNum = array[j];
//                }
//            }
//        }
//
//        System.out.println("The sum of the array's elements is " + total);
//        System.out.println("The minimum number in the array is " + minNum);
//        System.out.println("The maximum number in the array is " + maxNum);

        int[] array = { 10, 20, 33, 6, 7 };

//        assert true;

        double help = Math.random() * 100;

        try {
            System.out.println(array[(int) help]);
        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Error don happen!");
            throw new Error("E don happen!", new Throwable("You dey mad!"));
        }
    }
}