package uber;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TicTacToe {
    public static final Scanner userInput = new Scanner(System.in);
    public static boolean firstPlayerCurrent = true;
    public static boolean winnerDeclared = false;
    public static char firstPlayer;
    public static char secondPlayer;
    public static String board = """
             1 | 2 | 3   
            -----------
             4 | 5 | 6
            -----------
             7 | 8 | 9 
            """;

    public static void main(String[] args) throws InterruptedException {
        triggerNewGame();

        keepGameRunning();
    }

    private static void triggerNewGame() throws InterruptedException {
        System.out.println("Welcome to a game of Tic-Tac-Toe 🎮!");

        whoForWho();

        TimeUnit.MILLISECONDS.sleep(500);

        System.out.println();

        firstPlayerCurrent = true;
        winnerDeclared = false;

        board = """
                 1 | 2 | 3   
                -----------
                 4 | 5 | 6
                -----------
                 7 | 8 | 9 
                """;

        System.out.println(board);
    }

    private static void whoForWho() {
        System.out.println();
        System.out.println("Which letter should go first?");
        System.out.println("'X' or 'O'");
        System.out.print("> ");

        char firstPlayerChoice = userInput.nextLine().toUpperCase().charAt(0);

        switch (firstPlayerChoice) {
            case 'X' -> {
                firstPlayer = 'X';
                secondPlayer = 'O';

                System.out.println("'X' would go first!");
                break;
            }

            case 'O' -> {
                firstPlayer = 'O';
                secondPlayer = 'X';

                System.out.println("'O' would go first!");
                break;
            }

            default -> {
                System.out.println("Wrong input! You can only play with either 'X' or 'O'.");
                whoForWho();
            }
        }
    }

    private static void gamePlayEngine(char player) {
        System.out.println();
        System.out.println("Select where you want to play (1-9)");
        System.out.print("> ");

        int playedChoice = userInput.nextInt();

        board = board.replace(Integer.toString(playedChoice).toUpperCase().toCharArray()[0], player);

        System.out.println();

        System.out.println(board);
    }

    private static void checkGame() throws InterruptedException {
        int[][] possibleWinWays = {{1, 5, 9}, {24, 28, 32}, {47, 51, 55}, {1, 28, 55}, {9, 28, 47}, {1, 24, 47}, {9, 32, 55}, {5, 28, 51}};

        int winner = 0;

        for (int i = 0; i < possibleWinWays.length; i++) {
            if (board.charAt(possibleWinWays[i][0]) == board.charAt(possibleWinWays[i][1]) && board.charAt(possibleWinWays[i][0]) == board.charAt(possibleWinWays[i][2])) {
                winnerDeclared = true;
                winner = i;
                break;
            }
        }

        if (!winnerDeclared) {
            keepGameRunning();
        } else {
            declareWinner(board.charAt(possibleWinWays[winner][0]));
        }
    }

    private static void declareWinner(char player) throws InterruptedException {
        System.out.printf("'%s' is the winner! %n", player);
//        Press 'n' to start a new game, or 'q' to quit.%n


//        System.out.print("> ");
//
//        String userChoice = userInput.nextLine();

//        if (userChoice.length() > 0) {
//            switch (userChoice) {
//                case "n" -> {
//                    System.out.println("Starting a new game...");
//                    TimeUnit.MILLISECONDS.sleep(250);
//                    System.out.println();
//                    triggerNewGame();
//                    break;
//                }
//
//                case "q" -> {
//                    System.out.println("Quitting the Tic-Tac-Toe game..");
//                    TimeUnit.MILLISECONDS.sleep(100);
//                    System.out.println("Bye 👋!");
//                    System.exit(0);
//                    break;
//                }
//
//                default -> {
//                    System.out.println("Invalid option! Exiting application");
//                    System.exit(1);
//                }
//            }
//        }
    }

    private static void triggerFirstPlayer() {
        gamePlayEngine(firstPlayer);
    }

    private static void triggerSecondPlayer() {
        gamePlayEngine(secondPlayer);
    }

    private static void keepGameRunning() throws InterruptedException {
        if (firstPlayerCurrent) {
            firstPlayerCurrent = false;
            triggerFirstPlayer();
            checkGame();
        } else {
            firstPlayerCurrent = true;
            triggerSecondPlayer();
            checkGame();
        }
    }
}