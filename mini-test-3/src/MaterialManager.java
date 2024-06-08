
import java.time.LocalDate;
import java.util.Scanner;

public class MaterialManager {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while(choice != 0) {
            System.out.println("---Menu---");
            System.out.println("Please choose one of the following options: ");
            System.out.println("1. Add Models.Material");
            System.out.println("2. Delete Models.Material");
            System.out.println("3. Display Models.Material");
            System.out.println("4. Edit Models.Material");
            System.out.println("0. Exit Program");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Add Models.Material:");
                    System.out.println("Enter material id: ");
                    String id = input.next();
                    System.out.println("Enter material name: ");
                    String name = input.next();
                    System.out.println("Enter material manufacture date: ");
                    System.out.println("Year: ");
                    int year = input.nextInt();
                    System.out.println("Month: ");
                    int month = input.nextInt();
                    System.out.println("Day: ");
                    int day = input.nextInt();
                    LocalDate manufactureDate = LocalDate.of(year, month, day);
                    System.out.println("Enter material cost: ");
                    double cost = input.nextDouble();
                    System.out.println("Choose material type: ");
                    System.out.println("1. Crispy flour");
                    System.out.println("2. Models.Meat");
                    choice = input.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("Enter material quantity: ");
                            double quantity = input.nextDouble();
                            Material materials = new Meat(id, name, manufactureDate, cost, quantity);
                    }
                    break;
                case 2:
                    break;
                case 3:
                    //view sumCost, sortByCost,...
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

