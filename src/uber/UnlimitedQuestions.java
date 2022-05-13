package uber;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class UnlimitedQuestions {
    public static void main(String[] args) {
        System.out.println("Welcome to the questionnaire that is unlimited except you aren' an olodo!");

        System.out.println("How many questions do you want to answer?");
        System.out.print("> ");

        Scanner userInput = new Scanner(System.in);

        int numberOfQuestions = userInput.nextInt();

        int questionsCorrect = 0;

        do {
            char[] operators = {'+', '-', '*', '/'};

            String firstNumber = Integer.toString((int)(Math.random() * 26));
            String secondNumber = Integer.toString((int)(Math.random() * 26));

            String question = firstNumber + operators[(int)(Math.random() * 3.99)] + secondNumber;

            System.out.printf("What is: %s?%n> ", question);

            int userAnswer = userInput.nextInt();

            if (evaluate(question) == userAnswer) {
                questionsCorrect++;
            }
        } while (questionsCorrect < numberOfQuestions);
    }

    static boolean isOperand(char c) {
        return (c >= '0' && c <= '9');
    }

    // utility function to find value of and operand
    static int value(char c) {
        return c - '0';
    }

    private static int evaluate(@NotNull String exp) {
        int res = exp.length() > 0 ? value(exp.charAt(0)) : 0;

        for (int i = 1; i < exp.length(); i += 2) {
            char opr = exp.charAt(i), opd = exp.charAt(i + 1);

            if (!isOperand(opd)) return -1;

            if (opr == '+') res += value(opd);
            else if (opr == '-') res -= value(opd);
            else if (opr == '*') res *= value(opd);
            else if (opr == '/') res /= value(opd);
            else return -1;
        }
        return res;
    }
}
