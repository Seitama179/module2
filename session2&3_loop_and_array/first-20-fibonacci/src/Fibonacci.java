import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n so dau tien cua day F:");
        n = scanner.nextInt();
        System.out.println(Arrays.toString(fibonacci(n)));
    }
    public static long[] fibonacci(int n) {
        long[] arrF = new long[n];
        if(n >= 1){
            arrF[0] = 1;
        } if (n >= 2){
            arrF[1] = 1;
        } if (n >2){
            for (int i = 2; i < n; i++) {
                arrF[i]= arrF[i-1] + arrF[i-2];
            }
        }
        return arrF;
    }
}
