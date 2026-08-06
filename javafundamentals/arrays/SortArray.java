import java.util.Arrays;

class SortArray {
    public static void main(String args[]) {

        int arr[] = {34, 12, 56, 7, 45};

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}