class Middleway {
    public static void main(String args[]) {

        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};

        int c[] = {a[1], b[1]};

        System.out.print("{");
        System.out.print(c[0] + ", " + c[1]);
        System.out.println("}");
    }
}