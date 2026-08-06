class Palindrome {
    public static void main(String args[]) {

        int num = Integer.parseInt(args[0]);
        int original = num;
        int reverse = 0;

        while (num > 0) {
            int rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

        if (original == reverse)
            System.out.println(original + " is a palindrome");
        else
            System.out.println(original + " is not a palindrome");
    }
}