public class ArrayReverseTest {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Mảng ban đầu:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\nMảng sau khi đảo ngược:");
        ArrayReverse.reverseArray(arr);

        String str = "A B C D E F G";
        System.out.println("\nChuỗi ban đầu:" + str);
        System.out.println("\nChuỗi sau khi đảo ngược:");
        ArrayReverse.reverseString(str);
    }

}
