import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double rate = 23000;
        double USD;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USD amount: ");
        USD = input.nextDouble();
        double VND = USD * rate;
        System.out.println("The VDN value is " + VND);
    }
}
