import java.time.LocalDate;

public class MeatTest {
    public static void main(String[] args) {
        Meat m1 = new Meat("2", "pork", LocalDate.of(2024, 5,25), 2, 10);
        System.out.println(m1.getExpireDate());
        System.out.println(m1.getRealMoney());
    }
}
