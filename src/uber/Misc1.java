package uber;

public class Misc1 {
    public static void main(String[] args) {
        String s = "abcdabcdabcdabca";

        char[] sTemp = s.toCharArray();

        int totalACount = 0;

        for (int i = 0; i < sTemp.length; i++) {
            if(sTemp[i] == 'a') totalACount++;
        }

        System.out.println(totalACount);

        // The first arg(ignoreCase) is optional
        System.out.println("Semicolon".regionMatches(true,1, "Semicolon-Africa", 1, 6));
    }
}
