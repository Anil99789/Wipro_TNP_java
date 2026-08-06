import java.util.Scanner;

public class RepeatLastN {

    public static String repeatLastN(String str, int n) {

        String last = str.substring(str.length() - n);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(last);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int n = sc.nextInt();

        System.out.println(repeatLastN(str, n));

        sc.close();
    }
}