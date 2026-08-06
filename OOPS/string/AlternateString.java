import java.util.Scanner;

public class AlternateString {

    public static String combine(String a, String b) {
        StringBuilder result = new StringBuilder();

        int max = Math.max(a.length(), b.length());

        for (int i = 0; i < max; i++) {
            if (i < a.length()) {
                result.append(a.charAt(i));
            }
            if (i < b.length()) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println(combine(a, b));

        sc.close();
    }
}