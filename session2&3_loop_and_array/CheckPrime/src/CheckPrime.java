import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        boolean isPrime = true;
        if (number < 2){
            isPrime = false;
        } else if (number < 4){
            isPrime = true;
        } else {
            int i = 2;
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        if (isPrime)
            System.out.println(number + " is a prime");
        else
            System.out.println(number + " is not a prime");
    }
}
