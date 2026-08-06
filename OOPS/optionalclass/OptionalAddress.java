import java.util.Optional;
import java.util.Scanner;

public class OptionalAddress {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String address = sc.nextLine();

        if (address.trim().isEmpty()) {
            address = null;
        }

        System.out.println(Optional.ofNullable(address).orElse("India"));

        sc.close();
    }
}