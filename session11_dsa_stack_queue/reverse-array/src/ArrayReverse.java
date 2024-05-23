public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nMảng sau khi đảo ngược:");
        MyArray.reverseArray(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
