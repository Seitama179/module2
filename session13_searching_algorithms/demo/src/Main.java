import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap gia tri phan tu thu " + i);
            arr[i] = sc.nextInt();
        }
        System.out.println("Nhap gia tri can tim: ");
        int value = sc.nextInt();
        System.out.println("Phan tu can tim o vi tri: " + findIndex(arr, value));
    }

    private static int findIndex(int[] arr, int value) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (value == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
}