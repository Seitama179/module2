import java.util.Scanner;
public class DisplayGeometry {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the triangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Input height:");
                    int height = input.nextInt();
                    System.out.println("Input width:");
                    int width = input.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("The corner is square at 4 different angles:");
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Bottom-left");
                    System.out.println("4. Bottom-right");
                    System.out.println("Enter your choice: ");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Input height:");
                            int height1 = input.nextInt();
                            for (int i = height1; i >= 1; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*  ");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            System.out.println("Input height:");
                            int height2 = input.nextInt();
                            for (int i = 0; i < height2; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("  ");
                                }
                                for (int k = height2; k > i; k--) {
                                    System.out.print("* ");
                                }
                                System.out.println();
                            }
                            break;
                        case 3:
                            System.out.println("Input height:");
                            int height3 = input.nextInt();
                            for (int i = 0; i <= height3; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("*  ");
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            System.out.println("Input height:");
                            int height4 = input.nextInt();
                            for (int i = 0; i < height4; i++) {
                                for (int j = height4 - 1; j > i; j--) {
                                    System.out.print(" ");
                                }
                                for (int k = 0; k <= i; k++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    } break;
                case 3:
                    System.out.println("Input height:");
                    int height5 = input.nextInt();
                    for (int i = 0; i < height5; i++) {
                        for (int j = 0; j < height5 - i - 1; j++) {
                            System.out.print(" ");
                        }
                        for (int k = 0; k < (2 * i + 1); k++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
