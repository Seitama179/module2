
import java.time.LocalDate;

public class MaterialManager1 {
    public static void main(String[] args) {
        Material[] materials = new Material[10];
        materials[0] = new CrispyFlour("1", "A", LocalDate.of(2024, 1, 1), 15000.0, 50);
        materials[1] = new CrispyFlour("2", "B", LocalDate.of(2023, 6, 1), 10000.0, 10);
        materials[2] = new CrispyFlour("3", "C", LocalDate.of(2023, 7, 1), 15000.0, 20);
        materials[3] = new CrispyFlour("4", "C", LocalDate.of(2023, 7, 1), 15000.0, 20);
        materials[4] = new CrispyFlour("5", "D", LocalDate.of(2023, 8, 1), 10000.0, 30);
        materials[5] = new Meat("6", "Pork", LocalDate.of(2024, 5, 28), 90000.0, 80);
        materials[6] = new Meat("7", "Beef", LocalDate.of(2024, 5, 25), 100000.0, 100);
        materials[7] = new Meat("8", "Chicken", LocalDate.of(2024, 5, 25), 80000.0, 50);
        materials[8] = new Meat("9", "Beef", LocalDate.of(2024, 5, 23), 100000.0, 20);
        materials[9] = new Meat("10", "Chicken", LocalDate.of(2024, 5, 23), 80000.0, 30);

        System.out.println("Total Materials cost: " + getSumRealCost(materials));
        System.out.println("Models.Material list sorted by real cost: ");
        for(int i = 0; i < materials.length; i++) {
            return ;
        }

    }

    private static long getSumRealCost(Material[] materials) {
        long sumRealCost = 0;
        for (Material material : materials) {
            sumRealCost += material.getRealMoney();
        }
        return sumRealCost;
    }
}
