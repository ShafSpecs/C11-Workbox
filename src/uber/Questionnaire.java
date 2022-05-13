package uber;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Objects;
import java.util.Scanner;

public class Questionnaire {
    public static Scanner userInput = new Scanner(System.in);
    public static int currentDifficulty;
    static String[][] Difficulty = new String[3][3];

    public final static String ANSI_RESET = "\\u001B[0m";
    public final static String ANSI_RED = "\\u001B[31m";
    public final static String ANSI_GREEN = "\\u001B[32m";

    public static void main(String[] args) throws ScriptException {
        System.out.println("Welcome to negative marking test! Press 'p' to play or just get lost.");
        System.out.print("> ");

        char nextChar = userInput.nextLine().charAt(0);

        if (nextChar != 'p') {
            System.out.println("Shutting down!");
            System.exit(0);
        }

        System.out.println();

        System.out.print("""
                Choose your test difficulty:
                Press '1' for beginner
                Press '2' for intermediate
                Press '3' for advanced
                >\040""");

        int difficulty = userInput.nextInt();

        switch (difficulty) {
            case 1:
            case 2:
            case 3:
                break;
            default:
                System.out.println("Get lost, my friend! You can't even pick a simple valid number!");
        }

        setDifficultyValues();

        setTestDifficulty(difficulty);

        startTest();
    }

    private static void setDifficultyValues() {
        Difficulty[0][0] = "Beginner";
        Difficulty[0][1] = "10";
        Difficulty[0][2] = "N";

        Difficulty[1][0] = "Intermediate";
        Difficulty[1][1] = "20";
        Difficulty[1][2] = "N";

        Difficulty[2][0] = "Advanced";
        Difficulty[2][1] = "30";
        Difficulty[2][2] = "N";
    }

    private static void setTestDifficulty(int difficulty) {
        switch (difficulty) {
            case 1 -> {
                Difficulty[0][2] = "Y";
                Difficulty[1][2] = "N";
                Difficulty[2][2] = "N";
                break;
            }

            case 2 -> {
                Difficulty[0][2] = "N";
                Difficulty[1][2] = "Y";
                Difficulty[2][2] = "N";
                break;
            }

            case 3 -> {
                Difficulty[0][2] = "N";
                Difficulty[1][2] = "N";
                Difficulty[2][2] = "Y";
                break;
            }

            default -> System.out.println("Something is wrong :(");
        }
    }

    static boolean isOperand(char c) {
        return (c >= '0' && c <= '9');

    }

    // utility function to find value of and operand
    static int value(char c) {
        return c - '0';

    }

    private static int evaluate(String exp) {
        // Base Case: Given expression is empty
        if (exp.length() == 0) return -1;

        int res = value(exp.charAt(0));

        for (int i = 1; i < exp.length(); i += 2) {
            char opr = exp.charAt(i), opd = exp.charAt(i + 1);

            if (isOperand(opd) == false) return -1;

            if (opr == '+') res += value(opd);
            else if (opr == '-') res -= value(opd);
            else if (opr == '*') res *= value(opd);
            else if (opr == '/') res /= value(opd);

            else return -1;
        }
        return res;
    }

    private static void startTest() throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");

        for (String[] strings : Difficulty) {
            if (Objects.equals(strings[2], "Y")) {
                currentDifficulty = Integer.parseInt(String.valueOf(strings[1]));
            }
        }

        System.out.println("How many questions would you like to attempt?");
        System.out.print("> ");
        int chosenNunber = userInput.nextInt();

        int questionsAsked = 1;
        int questionsCorrect = 0;
        int questionsWrong = 0;

        while (questionsAsked <= chosenNunber) {
            char[] operators = {'+', '-', '*', '/'};

            String firstNumber = Long.toString(Math.round(Math.random() * currentDifficulty));
            String secondNumber = Long.toString(Math.round(Math.random() * currentDifficulty));

            String question = firstNumber + operators[(int) Math.round(Math.random() * 3)] + secondNumber;

//            Object result = engine.eval("7/7+9-9*5/5");

            System.out.printf("What is: %s?%n> ", question);

            int userAnswer = userInput.nextInt();

            if (evaluate(question) == userAnswer) {
                ++questionsCorrect;
            } else {
                ++questionsWrong;
            }

            questionsAsked++;
        }

        int negativeMark = questionsCorrect - questionsWrong;

        System.out.printf("You got %d%n", negativeMark);
//        System.out.println(ANSI_GREEN + "You got question(s) right" + ANSI_RESET);
//        System.out.printf(ANSI_RED + "You got " + questionsWrong + " question(s) wrong" + ANSI_RESET);
        System.out.println("You got " + questionsCorrect + " question(s) right");
        System.out.printf("You got " + questionsWrong + " question(s) wrong");
    }
}
