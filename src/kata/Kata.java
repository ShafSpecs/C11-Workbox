package kata;

import java.util.ArrayList;

public class Kata {
    private int orderNumber;
    private int price;

    public static int bitFlipper(int flip) {
        if(flip == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public static String oddOrEven(int number) {
        if(number % 2 == 1) {
            return "Odd";
        } else {
            return "Even";
        }
    }

    public static String grade(int grade) {
        if (grade >= 55) {
            return "Pass";
        }

        return "Fail";
    }

    public static String gradingSystem(int score) {
        if (score >= 90) {
            System.out.println("A");
            return "A";
        }

        if (score >= 80 && score < 90) {
            System.out.println("B");
            return "B";
        }

        if (score >= 70 && score < 80) {
            System.out.println("C");
            return "C";
        }

        if (score >= 60 && score < 70) {
            System.out.println("D");
            return "D";
        }

        System.out.println("F");
        return "F";
    }

    public static int checkFactors (int toBeCalculated) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 1; i <= toBeCalculated; i++) {
            for (int j = 1; j <= i; j++) {
                if(toBeCalculated % j == 0 && !factors.contains(j)) {
                    factors.add(j);
                }
            }
        }

        return factors.size();
    }

    public static boolean isPrime(int number) {
        boolean isPrimeNumber = false;

        for (int i = 2; i <= number; i++) {
            isPrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }

        return isPrimeNumber;
    }

    public int add(int firstNum, int secondNum) {
        return firstNum + secondNum;
    }

    public int subtract(int firstNum, int secondNum) {
        return Math.abs(firstNum - secondNum);
    }

    public int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public int divide(int firstNum, int secondNum) {
        if (secondNum == 0) {
            return 0;
        } else {
            return firstNum / secondNum;
        }
    }

    public void order(int orderNumber) {
        this.orderNumber = orderNumber;
        setPrice(orderNumber);
    }

    public int getPrice() {
        return price;
    }

    private void setPrice(int orderNum) {
        if (orderNum < 5) {
            price = orderNum * 2_000;
        } else if (orderNum >= 5 && orderNum < 10) {
            price = orderNum * 1_800;
        } else if (orderNum >= 10 && orderNum < 30) {
            price = orderNum * 1_600;
        } else if (orderNum >= 30 && orderNum < 50) {
            price = orderNum * 1_500;
        } else if (orderNum >= 50 && orderNum < 100) {
            price = orderNum * 1_300;
        } else if (orderNum >= 101 && orderNum < 200) {
            price = orderNum * 1_200;
        } else if (orderNum >= 200 && orderNum < 500) {
            price = orderNum * 1_100;
        } else {
            price = orderNum * 1_000;
        }
    }
}
