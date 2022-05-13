package uber;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Nokia {
    public static Scanner userInput = new Scanner(System.in);
    public static String[] menu = new String[13];

//    public static int[] subSubMenu = new int[1];

//    public static int[] subSubSubMenu = new int[1];

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to your 'Nokia 3310: God Punish You' Edition!");

        System.out.println();

        System.out.println("Press 'm' to access the Menu.");
        System.out.println("Press 'c' to access the Call Register section.");
        System.out.println("Press 'q' to log off.");

        System.out.println();

        System.out.print("> ");

        char launchKey = userInput.next().charAt(0);

        System.out.println();

        menu[0] = "Phone book";
        menu[1] = "Messages";
        menu[2] = "Chat";
        menu[3] = "Call Register";
        menu[4] = "Tones";
        menu[5] = "Settings";
        menu[6] = "Call divert";
        menu[7] = "Games";
        menu[8] = "Calculator";
        menu[9] = "Reminders";
        menu[10] = "Clock";
        menu[11] = "Profiles";
        menu[12] = "SIM Services";

        promptChecker(launchKey);

        triggerMainMenu(menu);
    }

    public static void promptChecker(char input) throws InterruptedException {
        switch (input) {
            case 'm' -> {
                triggerMainMenu(menu);
                break;
            }

            case 'c' -> {
                triggerSubMenu(4);
                break;
            }

            case 'q' -> {
                System.out.println("Logging off...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Goodbye!");
                System.exit(0);
            }

            default -> {
                char retry = userInput.next().charAt(0);
                System.out.println("Invalid input. Please enter a valid key");
                promptChecker(retry);
            }
        }
    }

    public static void triggerMainMenu (String[] menu) throws InterruptedException {
        System.out.println("Pick any of the following options from the menu: ");

        for (int i = 1; i <= menu.length; i++) {
            System.out.printf("%d. %s%n", i, menu[i - 1]);
        }

        System.out.print("> ");
        int menuOption = userInput.nextInt();

        triggerSubMenu(menuOption - 1);
    }

    public static void triggerSubMenu(int menuOption) throws InterruptedException {
        switch (menuOption) {
            case 0 -> {
                    System.out.println();
                    System.out.println("Phone Book");
                    System.out.println();
                    System.out.print("""
                            Select an option:
                            1. Search
                            2. Service Nos.
                            3. Add name
                            4. Erase
                            5. Edit
                            6. Assign tone
                            7. Send b’card
                            8. Options
                            9. Speed dials
                            10. Voice tags
                            0. Back
                                             
                            > """);

//                Integer integer = subSubMenu[0] == -1 ? (subSubMenu[0] = userInput.nextInt()) : (subSubMenu[0]);

                int userChoice = userInput.nextInt();
                System.out.println();

                switch (userChoice) {
                    case 0 -> {
                        triggerMainMenu(menu);
                        break;
                    }

                    case 1 -> {
                        System.out.println("Search");
                        break;
                    }

                    case 2 -> {
                        System.out.println("Service Numbers");
                        break;
                    }

                    case 3 -> {
                        System.out.println("Add Name");
                        break;
                    }

                    case 4 -> {
                        System.out.println("Erase");
                        break;
                    }

                    case 5 -> {
                        System.out.println("Edit");
                        break;
                    }

                    case 6 -> {
                        System.out.println("Assign Tone");
                        break;
                    }

                    case 7 -> {
                        System.out.println("Send b'card. Shit!");
                        break;
                    }

                    case 8 -> {
                        System.out.println("Options");
                        System.out.println("""
                                1. Type Of View
                                2. Memory Status
                                
                                > """);

                        int userChoice2 = userInput.nextInt();

                        switch (userChoice2
                        ) {
                            case 1 -> {
                                System.out.println("Type Of View");
                                break;
                            }

                            case 2 -> {
                                System.out.println("Memory Status");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(0);
                            }
                        }

                        break;
                    }

                    case 9 -> {
                        System.out.println("Speed Dials");
                        break;
                    }

                    case 10 -> {
                        System.out.println("Voice tags");
                        break;
                    }

                    default -> {
                        System.out.println("Invalid Choice! Try again");
                        triggerSubMenu(0);
                    }
                }

                break;
            }

            case 1 -> {
                System.out.println();
                System.out.println("Messages");
                System.out.println();
                System.out.print("""
                        Select an option:
                        1. Write messages
                        2. Inbox
                        3. Outbox
                        4. Picture messages
                        5. Templates
                        6. Smileys
                        7. Message settings
                        8. Info service
                        9. Voice mailbox number
                        10.Service command editor   
                        0. Back
                                         
                        > """);

                int messageChoice = userInput.nextInt();

                switch (messageChoice) {
                    case 0 -> {
                        triggerMainMenu(menu);
                        break;
                    }

                    case 1 -> {
                        System.out.println("Write messages");
                        break;
                    }

                    case 2 -> {
                        System.out.println("Inbox");
                        break;
                    }

                    case 3 -> {
                        System.out.println("Outbox");
                        break;
                    }

                    case 4 -> {
                        System.out.println("Picture Messages");
                        break;
                    }

                    case 5 -> {
                        System.out.println("Templates");
                        break;
                    }

                    case 6 -> {
                        System.out.println("Smileys");
                        break;
                    }

                    case 7 -> {
                        System.out.println("Message Settings");
                        System.out.println("1. Set 1");
                        System.out.println("2. Common");
                        System.out.print("> ");

                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("Set 1");
                                System.out.print("""
                                        1. Message centre number
                                        2. Messages sent as
                                        3. Message validity
                                                                                
                                        > """);

                                int bottomMessage = userInput.nextInt();

                                switch (bottomMessage) {
                                    case 1 -> {
                                        System.out.println("Message centre number");
                                        break;
                                    }

                                    case 2 -> {
                                        System.out.println("Messages sent as");
                                        break;
                                    }

                                    case 3 -> {
                                        System.out.println("Message validity");
                                        break;
                                    }

                                    default -> {
                                        System.out.println("Invalid menu option.");
                                        triggerSubMenu(1);
                                    }
                                }

                                break;
                            }

                            case 2 -> {
                                System.out.println("Common");
                                System.out.print("""
                                        1. Delivery reports
                                        2. Reply via same centre
                                        3. Character support                                     
                                                                                
                                        > """);

                                int bottomMessage = userInput.nextInt();

                                switch (bottomMessage) {
                                    case 1 -> {
                                        System.out.println("Delivery reports");
                                        break;
                                    }

                                    case 2 -> {
                                        System.out.println("Reply via same centre");
                                        break;
                                    }

                                    case 3 -> {
                                        System.out.println("Character support");
                                        break;
                                    }

                                    default -> {
                                        System.out.println("Invalid menu option.");
                                        triggerSubMenu(1);
                                    }
                                }

                                break;
                            }

                            default -> {
                                System.out.print("Invalid menu option.");
                                triggerSubMenu(1);
                            }
                        }

                        break;
                    }

                    case 8 -> {
                        System.out.println("Info Service");
                        break;
                    }

                    case 9 -> {
                        System.out.println("Voice Mailbox number");
                        break;
                    }

                    case 10 -> {
                        System.out.println("Service Commander Editor");
                        break;
                    }
                }

                break;
            }

            case 2 -> {
                System.out.println("Chat");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            case 3 -> {
                System.out.println();
                System.out.println("Call Register");
                System.out.println();
                System.out.print("""
                        Select an option:
                        1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call costs
                        7. Call cost settings
                        8. Prepaid settings
                        0. Back
                                         
                        > """);

                int callChoice = userInput.nextInt();

                switch (callChoice) {
                    case 0 -> {
                        triggerMainMenu(menu);
                        break;
                    }

                    case 1 -> {
                        System.out.println("Missed calls");
                        break;
                    }

                    case 2 -> {
                        System.out.println("Received calls");
                        break;
                    }

                    case 3 -> {
                        System.out.println("Dialled numbers");
                        break;
                    }

                    case 4 -> {
                        System.out.println("Erase recent calls list");
                        break;
                    }

                    case 5 -> {
                        System.out.println("Show call duration");
                        System.out.print("""
                                1. Last call duration
                                2. All calls’ duration
                                3. Received calls’ duration
                                4. Dialled calls’ duration
                                5. Clear timers
                                                                
                                > """);

                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("Last call duration");
                                break;
                            }

                            case 2 -> {
                                System.out.println("All calls’ duration");
                                break;
                            }

                            case 3 -> {
                                System.out.println("Received calls’ duration");
                                break;
                            }

                            case 4 -> {
                                System.out.println("Dialled calls’ duration");
                                break;
                            }

                            case 5 -> {
                                System.out.println("Clear timers");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(3);
                            }
                        }

                        break;
                    }

                    case 6 -> {
                        System.out.println("Show call costs");
                        System.out.print("""
                                1. Last call cost
                                2. All calls’ cost
                                3. Clear counters
                                                             
                                > """);
                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("Last call cost");
                                break;
                            }

                            case 2 -> {
                                System.out.println("All calls’ cost");
                                break;
                            }

                            case 3 -> {
                                System.out.println("Clear counters");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(3);
                            }
                        }

                        break;
                    }

                    case 7 -> {
                        System.out.println("Call cost settings");
                        System.out.print("""
                                1. Call cost limit
                                2. Show costs in
                                                               
                                > """);
                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("Call cost limit");
                                break;
                            }

                            case 2 -> {
                                System.out.println("Show costs in");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(3);
                            }
                        }

                        break;
                    }

                    case 8 -> {
                        System.out.println("Prepaid credit");
                        break;
                    }

                    default -> {
                        System.out.println("Invalid Choice! Try again");
                        triggerSubMenu(3);
                    }
                }

                break;
            }

            case 4 -> {
                System.out.println();
                System.out.println("Tones");
                System.out.println();
                System.out.print("""
                        Select an option:
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        4. Composer
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen saver 
                        0. Back     
                                         
                        > """);

                int phoneChoice = userInput.nextInt();

                System.out.println();

                switch (phoneChoice) {
                    case 0 -> {
                        triggerMainMenu(menu);
                        break;
                    }

                    case 1 -> {
                        System.out.println("Ringing Tone");
                        break;
                    }

                    case 2 -> {
                        System.out.println("Ringing volume");
                        break;
                    }

                    case 3 -> {
                        System.out.println("Incoming call alert");
                        break;
                    }

                    case 4 -> {
                        System.out.println("Composer");
                        break;
                    }

                    case 5 -> {
                        System.out.println("Message alert tone");
                        break;
                    }

                    case 6 -> {
                        System.out.println("Keypad tones");
                        break;
                    }

                    case 7 -> {
                        System.out.println("Warning and game tones");
                        break;
                    }

                    case 8 -> {
                        System.out.println("Vibrating alert");
                        break;
                    }

                    case 9 -> {
                        System.out.println("Screen saver");
                        break;
                    }

                    default -> {
                        System.out.println("Invalid Choice! Try again");
                        triggerSubMenu(4);
                    }
                }

                break;
            }

            case 5 -> {
                System.out.println();
                System.out.println("Settings");
                System.out.println();
                System.out.print("""
                        Select an option:
                        1. Call Settings
                        2. Phone Settings
                        3. Security Settings  
                        0. Back
                                         
                        > """);

                int settingsChoice = userInput.nextInt();

                switch (settingsChoice) {
                    case 0 -> {
                        triggerMainMenu(menu);
                        break;
                    }

                    case 1 -> {
                        System.out.println("Call Settings");
                        System.out.print("""
                                1. Automatic redial
                                2. Speed dialling
                                3. Call waiting options
                                4. Own number sending
                                5. Phone line in use
                                6. Automatic answer
                                
                                > """);
                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("Automatic redial");
                                break;
                            }

                            case 2 -> {
                                System.out.println("Speed dialling");
                                break;
                            }

                            case 3 -> {
                                System.out.println("Call waiting options");
                                break;
                            }

                            case 4 -> {
                                System.out.println("Own number sending");
                                break;
                            }

                            case 5 -> {
                                System.out.println("Phone line in use");
                                break;
                            }

                            case 6 -> {
                                System.out.println("Automatic answer");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(5);
                            }
                        }

                        break;
                    }

                    case 2 -> {
                        System.out.println("Phone Settings");
                        System.out.print("""
                                1. Language
                                2. Cell info display
                                3. Welcome note
                                4. Network selection
                                5. Lights2
                                6. Confirm SIM service actions
                                                                
                                > """);
                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("Language");
                                break;
                            }

                            case 2 -> {
                                System.out.println("Cell info display");
                                break;
                            }

                            case 3 -> {
                                System.out.println("Welcome note");
                                break;
                            }

                            case 4 -> {
                                System.out.println("Network selection");
                                break;
                            }

                            case 5 -> {
                                System.out.println("Lights2");
                                break;
                            }

                            case 6 -> {
                                System.out.println("Confirm SIM service actions");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(5);
                            }
                        }

                        break;
                    }

                    case 3 -> {
                        System.out.println("Phone Settings");
                        System.out.print("""
                                1. PIN code request
                                2. Call barring service
                                3. Fixed dialling
                                4. Closed user group
                                5. Phone security
                                6. Change access codes
                                                                
                                > """);
                        int bottomMessageOutput = userInput.nextInt();

                        switch (bottomMessageOutput) {
                            case 1 -> {
                                System.out.println("PIN code request");
                                break;
                            }

                            case 2 -> {
                                System.out.println("Call barring service");
                                break;
                            }

                            case 3 -> {
                                System.out.println("Fixed dialling");
                                break;
                            }

                            case 4 -> {
                                System.out.println("Closed user group");
                                break;
                            }

                            case 5 -> {
                                System.out.println("Phone security");
                                break;
                            }

                            case 6 -> {
                                System.out.println("Change access codes");
                                break;
                            }

                            default -> {
                                System.out.println("Invalid Choice! Try again");
                                triggerSubMenu(5);
                            }
                        }

                        break;
                    }

                    case 4 -> {
                        System.out.println("Restore factory settings");
                        break;
                    }

                    default -> {
                        System.out.println("Invalid Choice! Try again");
                        triggerSubMenu(5);
                    }
                }

                break;
            }

            case 6 -> {
                System.out.println("Call divert");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            case 7 -> {
                System.out.println("Games");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            case 8 -> {
                System.out.println("Calculator");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            case 9 -> {
                System.out.println("Reminders");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            case 10 -> {
                System.out.println();
                System.out.println("Clock");
                System.out.println();
                System.out.print("""
                        Select an option:
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        0. Back
                        
                        > """);

                int phoneChoice = userInput.nextInt();

                System.out.println();

                switch (phoneChoice) {
                    case 0 -> {
                        triggerMainMenu(menu);
                        break;
                    }

                    case 1 -> {
                        System.out.println("Alarm clock");
                        break;
                    }

                    case 2 -> {
                        System.out.println("Clock settings");
                        break;
                    }

                    case 3 -> {
                        System.out.println("Date setting");
                        break;
                    }

                    case 4 -> {
                        System.out.println("Stopwatch");
                        break;
                    }

                    case 5 -> {
                        System.out.println("Countdown timer");
                        break;
                    }

                    case 6 -> {
                        System.out.println("Auto update of date and time");
                        break;
                    }

                    default -> {
                        System.out.println("Invalid Choice! Try again");
                        triggerSubMenu(10);
                    }
                }

                break;
            }

            case 11 -> {
                System.out.println("Profiles");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            case 12 -> {
                System.out.println("SIM Services");

                System.out.println();

                System.out.println("Press 'm' to access the main menu.");
                System.out.print("> ");
                char back = userInput.next().charAt(0);

                promptChecker(back);
                break;
            }

            default -> {
                System.out.println("Invalid menu option.");
                promptChecker('m');
            }
        }
    }
}
