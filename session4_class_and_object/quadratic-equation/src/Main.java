import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double root1 = equation.getRoot1();
        double root2 = equation.getRoot2();
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);

    }
}