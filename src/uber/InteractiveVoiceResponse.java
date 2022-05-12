package uber;

import java.util.Scanner;

public class InteractiveVoiceResponse {
    final static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        promptAppStart();

        System.out.println("Select any of the following options:");
        System.out.println("Press 1 to select English");
        System.out.println("Press 2 to select Igbo");
        System.out.println("Press 3 to select French");
        System.out.println("Press 4 to select Yoruba");

        System.out.print("> ");

        int userChoice = userInput.nextInt();

        switch (userChoice) {
            case 1 -> {
                System.out.println();
                System.out.println("Press 1 for data");
                System.out.println("Press 2 for airtime");
                System.out.print("> ");

                int nextInteger = userInput.nextInt();

                switch (nextInteger) {
                    case 1 -> {
                        System.out.println("Data!");
                        System.exit(0);
                    }

                    case 2 -> {
                        System.out.println("Airtime!");
                        System.exit(0);
                    }

                    default -> {
                        System.out.println();
                        System.out.println("Invalid number entered!");
                        System.exit(1);
                    }
                }
            }
            case 2 -> {
                System.out.println();
                System.out.println("Press 1 for Sharing");
                System.out.println("Press 2 for caring");
                System.out.print("> ");

                int nextInteger = userInput.nextInt();

                switch (nextInteger) {
                    case 1 -> {
                        System.out.println("Sharing!");
                        System.exit(0);
                    }

                    case 2 -> {
                        System.out.println("Caring!");
                        System.exit(0);
                    }

                    default -> {
                        System.out.println();
                        System.out.println("Invalid number entered!");
                        System.exit(1);
                    }
                }
            }
            case 3 -> {
                System.out.println();
                System.out.println("Press 1 for egg");
                System.out.println("Press 2 for watermelons");
                System.out.print("> ");

                int nextInteger = userInput.nextInt();

                switch (nextInteger) {
                    case 1 -> {
                        System.out.println("Egg!");
                        System.exit(0);
                    }

                    case 2 -> {
                        System.out.println("Watermelons!");
                        System.exit(0);
                    }

                    default -> {
                        System.out.println();
                        System.out.println("Invalid number entered!");
                        System.exit(1);
                    }
                }
            }
            case 4 -> {
                System.out.println();
                System.out.println("Press 1 for Ayo");
                System.out.println("Press 2 for Tunde");
                System.out.print("> ");

                int nextInteger = userInput.nextInt();

                switch (nextInteger) {
                    case 1 -> {
                        System.out.println("Ayo!");
                        System.exit(0);
                    }

                    case 2 -> {
                        System.out.println("Tunde, my lad!!");
                        System.exit(0);
                    }

                    default -> {
                        System.out.println();
                        System.out.println("Invalid number entered!");
                        System.exit(1);
                    }
                }
            }
            default -> {
                System.out.println("Invalid number entered, try again");
                System.exit(1);
            }
        }
    }

    public static void promptAppStart() {
        System.out.print("Press 1 to start the app or 0 to exit the app: ");

        int firstOption = userInput.nextInt();

        switch (firstOption) {
            case 1 -> {
                break;
            }

            case 0 -> {
                System.out.println("App successfully exited!");
                System.exit(0);
            }

            default -> {
                System.out.println("Invalid number entered! Try again");
                promptAppStart();
            }
        }
    }
}