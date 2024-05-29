import java.util.Scanner;

public class MaterialManager {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("---Menu---");
            System.out.println("Please choose one of the following options: ");
            System.out.println("1. Add Material");
            System.out.println("2. Delete Material");
            System.out.println("3. Display Material");
            System.out.println("4. Edit Material");
            System.out.println("0. Exit Program");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:System.exit(0);
                default:
                    System.out.println("Please choose one of the following options: ");
            }
            }



        }
    }

