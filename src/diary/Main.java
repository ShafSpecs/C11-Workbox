package diary;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static Scanner input = new Scanner(System.in);
    private static ArrayList<User> users = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to a diary that reveals your secrets");
        System.out.println();

        User newUser = new User("Chibuzor");
        newUser.createNewDiary("Chibuzor's Private Diary");
        newUser.createNewDiary("Chibuzor's Snack Points");

        Entry shibuzorEntry = new Entry("A day in semicolon", "A band of bloody wimps filled my class and...");
        Entry shibuzorEntry2 = new Entry("They almost killed me..", "We did OOP in class today and the excitement was so surprising, it...");

        Entry snackEntry = new Entry("Create a zuber app..", "Create a small zuber app that allows me to call danfo transport, integrated with online payment...");

        newUser.getDiaries().get(0).addEntry(shibuzorEntry);
        newUser.getDiaries().get(0).addEntry(shibuzorEntry2);

        Runnable runnable = () -> {
            try {
                TimeUnit.SECONDS.sleep(1);
                newUser.getDiaries().get(1).addEntry(snackEntry);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        runnable.run();

        users.add(newUser);

        triggerLandingPage();
    }

    private static void triggerLandingPage() throws InterruptedException {
        System.out.print("""
                Select one of the following:
                
                1. Create account
                2. List accounts
                3. Quit App and lose 100% data.
                
                > """);

        int landingPageFirstChoice = input.nextInt();

        switch (landingPageFirstChoice) {
            case 1 -> {
                triggerCreateNewUser();
                break;
            }

            case 2 -> {
                triggerSelectUser();
                break;
            }

            case 3 -> {
                System.out.println();
                System.out.println("Logging off...");

                TimeUnit.MILLISECONDS.sleep(1250);

                System.exit(0);
            }

            default -> {
                System.out.println("Processing...");
                System.out.println("Invalid Choice! Try Again ❌");

                triggerLandingPage();
            }
        }
    }

    private static void triggerCreateNewUser() throws InterruptedException {
        System.out.println();

        System.out.print("Enter the name of this account: ");
        String userName = input.next().length() > 0 ? input.next() : "Chibuzor";

        createNewUser(userName);
    }

    private static void createNewUser(String username) throws InterruptedException {
        User newUser = new User(username);

        users.add(newUser);

        selectDiary(users.size() - 1);
    }

    private static void triggerSelectUser() throws InterruptedException {
        System.out.println();

        System.out.println("Which account do you want to use:");
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, users.get(i).getUserName());
        }

        System.out.print("""
                Press '0' to go back to the main page.
                
                > """);

        int entryList = input.nextInt() > 0 ? input.nextInt() - 1 : 0;
        if(entryList > -1) {
            selectDiary(entryList);
        } else {
            triggerLandingPage();
        }
    }

    private static void selectDiary(int index) throws InterruptedException {
        System.out.printf("%nWelcome to %s's account. Which diary are we utilizing today?%n", users.get(index).getUserName());

        for (int i = 0; i < users.get(index).getDiaries().size(); i++) {
            System.out.printf("%d. %s%n", i + 1, users.get(index).getDiaries().get(i).getName());
        }

        System.out.println("Press '0' to create a new diary");
        System.out.print("> ");

        int userChoice = input.nextInt() != 0 ? input.nextInt() - 1 : -1;

        if(userChoice == -1) {
            createDiary(users.get(index));
        } else if (userChoice >= 0) {
            getDiary(users.get(index), userChoice);
        } else {
            System.out.println("No idea what you mean.... Start again!");
            triggerLandingPage();
        }
    }

    private static void getDiary(User user, int index) {
        System.out.println("Your entries: ");
        for (int i = 0; i < user.getDiaries().get(index).getEntrySize(); i++) {
            Entry entry = user.getDiaries().get(index).getEntries().get(i);
            System.out.printf("%n%d. %s%nEntry body: %s%nTime created: %s%n", i + 1, entry.getEntryTitle(), entry.getEntryBody(), entry.getDate());
        }

        System.out.println();
        System.out.print("Choose a number to edit: ");

        int firstChoice = input.nextInt();
        int userChoice = firstChoice - 1;

        System.out.println(userChoice);
    }

    private static void createDiaryEntry(User user, int index) {
        System.out.println("""
                What do you want to do?
                1. Create a new Entry
                
                0. Return to main menu              
                > """);
    }

    private static void createDiary(User user) {
        System.out.print("Enter the name of your diary: ");
        String diaryName = input.next().length() > 0 ? input.next() : "New Diary";

        user.createNewDiary(diaryName);
        System.out.println("\n...Diary successfully created!");

        getDiary(user, user.getDiaries().size() - 1);
    }
}
