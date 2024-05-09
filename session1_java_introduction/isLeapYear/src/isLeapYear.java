import java.util.Scanner;

public class isLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        boolean isLeapYear = false;
        System.out.println("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            isLeapYear = true;
        }
        if (isLeapYear) {System.out.printf("%d a leap year", year);}
        else System.out.printf("%d is NOT a leap year", year);
    }
}
