package uber;

public class TabularGodKnows {
    public static void main(String[] args) {
        System.out.println("N   N   N   N");
        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.printf("%.0f   ", Math.pow(i + 1, j));
                if (j == 4) {
                    System.out.println();
                }
            }
        }
    }
}
