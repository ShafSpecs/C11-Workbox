package poll;

import java.util.Scanner;

public class Poll {
    private String name;
    private String[] topics = { "Global Warming", "War", "Nuclear Race", "Mars colonization race", "Existence of social media" };
    private int[] votes = new int[5];

    public Poll(String name) {
        this.name = name;
    }

    private int readInt() {
        Scanner input = new Scanner(System.in);
        int rating = input.nextInt();
        return rating;
    }

    public static void init() {
        System.out.print("\uD83D\uDE80 Welcome to this short Java survey, press \"Ctrl + Shift + Spoil\" to skip.\n\n");
    }

    public void triggerQuestionnaire() {
        System.out.println("▶ " + this.name + ", can you please rate the following topics on a scale of 1-10:");

        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + " (rate on a scale of 1-10): ");
            int input = 0;
            while (input < 1 || input > 10) {
                input = readInt();
            }
            votes[i] = input;
        }

        System.out.println();
    }

    public void tabulateData() {
        System.out.print(name + "'s rating:     ");
        for (int i = 0; i < topics.length; i++) {
            System.out.print(topics[i] + " - " + votes[i] + "   ");
        }
        System.out.println();
    }
}
