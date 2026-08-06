class RemoveDuplicates {
    public static void main(String args[]) {

        int arr[] = {12, 34, 12, 45, 67, 89};
        boolean visited[] = new boolean[arr.length];

        System.out.print("{");

        boolean first = true;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i])
                continue;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    visited[j] = true;
            }

            if (!first)
                System.out.print(",");

            System.out.print(arr[i]);
            first = false;
        }

        System.out.println("}");
    }
}