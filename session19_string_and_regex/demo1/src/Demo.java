import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String text;
        String replace;
        String string;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        string = sc.nextLine();
        System.out.println("Enter the string to replace: ");
        text = sc.nextLine();
        System.out.println("Enter a replacement string: ");
        replace = sc.nextLine();
        String replacedText = string.replaceAll(text, replace);
        System.out.println(replacedText);
    }
}
