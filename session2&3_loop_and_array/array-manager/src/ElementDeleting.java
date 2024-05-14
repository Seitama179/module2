import java.util.Arrays;
import java.util.Scanner;

public class ElementDeleting {
    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9, 10, 2, 5, 0};
        int delElement;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to be deleted");
        delElement = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delElement) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
            }
        }
        System.out.println("Array after deletion:");
        System.out.println(Arrays.toString(arr));
    }
}
