package uber;

import java.util.Timer;
import java.util.TimerTask;

public class Tortoise {
    protected static int[] raceTrack = new int[70];

    protected static String track1 = "S                                                                     ";
    protected static String track2 = "R                                                                     ";
    protected static String track3 = "---------------------------------------------------------------------0";

    public static void changeTrack(int pos, Player player) {
        char plr = player == Player.RABBIT ? 'R' : 'S';
        if(pos > 70) {
            pos = 70;
        }

        if(pos < 1) {
            pos = 1;
        }

        if(plr == 'S') {
            char[] temp = track1.toCharArray();
            for (int i = 0; i < temp.length; i++) {
                temp[i] = ' ';
            }
            temp[pos - 1] = 'S';
            track1 = String.valueOf(temp);
        } else {
            char[] temp = track2.toCharArray();
            for (int i = 0; i < temp.length; i++) {
                temp[i] = ' ';
            }
            temp[pos - 1] = 'R';
            track2 = String.valueOf(temp);
        }
    }

    public static void main(String[] args) {
        Timer timer = new Timer("StopWatch");

        for (int i = 0; i < raceTrack.length; i++) {
            raceTrack[i] = i + 1;
        }

        TimerTask task = new TimerTask() {
            int snailPosition = 1;
            int rabbitPosition = 1;

            public void run() {
//                System.out.println("Task performed on: " + new Date() + "\n" +
//                        "Thread's name: " + Thread.currentThread().getName());

                double snailChance = Math.random();
                double rabbitChance = Math.random();

                SnailMoves snailMove = (snailChance <= 0.3 ? SnailMoves.SLOW_PLOD : (snailChance > 0.3 && snailChance <= 0.5) ? SnailMoves.SLIP : SnailMoves.FAST_PLOD);
                RabbitMoves rabbitMove = (rabbitChance <= 0.2 ? RabbitMoves.SLEEP : (rabbitChance > 0.2 && rabbitChance <= 0.4) ? RabbitMoves.BIG_HOP : (rabbitChance > 0.4 && rabbitChance <= 0.5) ? RabbitMoves.BIG_SLIP : (rabbitChance > 0.5 && rabbitChance <= 0.8) ? RabbitMoves.SMALL_HOP : RabbitMoves.SMALL_SLIP);

                if(snailMove == SnailMoves.SLOW_PLOD) {
                    snailPosition += 1;
                    changeTrack(snailPosition, Player.SNAIL);
                } else if(snailMove == SnailMoves.SLIP) {
                    snailPosition -= 6;
                    changeTrack(snailPosition, Player.SNAIL);
                } else if(snailMove == SnailMoves.FAST_PLOD) {
                    snailPosition += 3;
                    changeTrack(snailPosition, Player.SNAIL);
                }

                if(rabbitMove == RabbitMoves.SLEEP) {
                    rabbitPosition = rabbitPosition;
                    changeTrack(rabbitPosition, Player.RABBIT);
                } else if(rabbitMove == RabbitMoves.BIG_HOP) {
                    rabbitPosition += 9;
                    changeTrack(rabbitPosition, Player.RABBIT);
                } else if(rabbitMove == RabbitMoves.BIG_SLIP) {
                    rabbitPosition -= 12;
                    changeTrack(rabbitPosition, Player.RABBIT);
                } else if(rabbitMove == RabbitMoves.SMALL_HOP) {
                    rabbitPosition += 1;
                    changeTrack(rabbitPosition, Player.RABBIT);
                } else if(rabbitMove == RabbitMoves.SMALL_SLIP) {
                    rabbitPosition -= 2;
                    changeTrack(rabbitPosition, Player.RABBIT);
                }

                if(rabbitPosition < 1) {
                    rabbitPosition = 1;
                    changeTrack(rabbitPosition, Player.RABBIT);
                }

                if(snailPosition < 1) {
                    snailPosition = 1;
                    changeTrack(snailPosition, Player.SNAIL);
                }

                System.out.print(track1);
                System.out.println("   Position of Snail: " + snailPosition);

                System.out.print(track2);
                System.out.println("   Position of Rabbit: " + rabbitPosition);

                System.out.println(track3);
                System.out.println();

                if(rabbitPosition > 70) {
                    System.out.println("Rabbit is the WINNER!");
                    Thread.currentThread().stop();
                }

                if(snailPosition > 70) {
                    System.out.println("Snail is the WINNER!");
                    Thread.currentThread().stop();
                }
            }
        };

        long delay = 1000L;
        timer.scheduleAtFixedRate(task, delay, 1000);
    }
}
