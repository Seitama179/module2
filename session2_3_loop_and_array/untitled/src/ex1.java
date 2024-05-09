import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        int n;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap vao n: ");
            n = scanner.nextInt();
        } while (n <= 0);
        double sum = 0d;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1.0 / i;
        }
        System.out.println(sum);
    }
}
