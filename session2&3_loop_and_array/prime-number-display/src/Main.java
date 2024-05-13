import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int start;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter first n prime number: ");
            n = sc.nextInt();
        } while (n < 0 || n > 100);
        System.out.println("Enter start number: ");
        start = sc.nextInt();
        while (count < n) {
            if (checkPrime(start)) {
                System.out.println(start);
                count++;
            }
            start++;
        }
    }
    public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        if(n < 4){
            return true;
        } else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}