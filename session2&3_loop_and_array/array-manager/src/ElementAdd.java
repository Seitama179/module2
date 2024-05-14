import java.util.Arrays;
import java.util.Scanner;

public class ElementAdd {
    public static void main(String[] args) {
        int n;
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input array length (<=10):");
            n = sc.nextInt();
        } while (n <= 0 || n > 10);
        System.out.println("Input array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Input new element:");
        int newElement = sc.nextInt();
        int position;
        do {
            System.out.println("Input new element's position");
            position = sc.nextInt();
        } while (position < 0 || position > n);
        for (int i = n; i > position; i--) {
            arr[i] = arr[i - 1];
        }
        arr[position] = newElement;
        System.out.println("Array after addition:");
        System.out.println(Arrays.toString(arr));
    }
}
