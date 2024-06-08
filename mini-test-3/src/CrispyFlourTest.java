import java.time.LocalDate;

public class CrispyFlourTest {
    public static void main(String[] args) {
        Material cf1 = new CrispyFlour("1", "a", LocalDate.of(2024,1,25), 1, 5);
        System.out.println(cf1.getExpireDate());
        System.out.println(cf1.getRealMoney());
    }
}
