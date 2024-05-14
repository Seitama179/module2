
import java.util.Arrays;
import java.util.Scanner;

public class ArrayCombine {
    public static void main(String[] args) {
        int arLength1;
        int arLength2;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter length of array1: ");
            arLength1 = sc.nextInt();
        } while (arLength1 <= 0 || arLength1 > 50);
        do {
            System.out.println("Enter length of array2: ");
            arLength2 = sc.nextInt();
        } while (arLength2 <= 0 || arLength2 > 50);
        int[] arr1 = new int[arLength1];
        int[] arr2 = new int[arLength2];
        System.out.println("Enter elements of array1: ");
        for (int i = 0; i < arLength1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements of array2: ");
        for (int i = 0; i < arLength2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[arLength1 + arLength2];
        for (int i = 0; i < arLength1; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arLength2; i++) {
            arr3[arLength1 + i] = arr2[i];
        }
        System.out.println("The combination of arrays is: ");
        System.out.println(Arrays.toString(arr3));
    }
}
