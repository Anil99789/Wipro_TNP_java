class EvenOdd {
    public static void main(String args[]) {

        int arr[] = {0, 1, 0, 1, 1, 1};

        int result[] = new int[arr.length];
        int index = 0;

        // Even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                result[index++] = arr[i];
        }

        // Odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                result[index++] = arr[i];
        }

        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
    }
}