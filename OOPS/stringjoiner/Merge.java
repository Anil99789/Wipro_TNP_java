import java.util.Scanner;
import java.util.StringJoiner;

public class Merge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        sc.nextLine();

        StringJoiner s1 = new StringJoiner("-");

        for (int i = 0; i < n1; i++) {
            s1.add(sc.nextLine());
        }

        int n2 = sc.nextInt();
        sc.nextLine();

        StringJoiner s2 = new StringJoiner("-");

        for (int i = 0; i < n2; i++) {
            s2.add(sc.nextLine());
        }

        StringJoiner first = new StringJoiner("-");
        first.merge(s1);
        first.merge(s2);

        StringJoiner second = new StringJoiner("-");
        second.merge(s2);
        second.merge(s1);

        System.out.println("s1 merged to s2:");
        System.out.println(first);

        System.out.println("s2 merged to s1:");
        System.out.println(second);

        sc.close();
    }
}