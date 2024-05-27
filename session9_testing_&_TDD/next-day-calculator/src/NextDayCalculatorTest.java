import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    void getNextDay1() {
        LocalDate date1 = LocalDate.of(2020, 1, 1);
        LocalDate nextDay = NextDayCalculator.getNextDay(date1);
        assertEquals(LocalDate.of(2020, 1, 2), nextDay);
    }

    @Test
    void getNextDay2() {
        LocalDate date2 = LocalDate.of(2020, 1, 31);
        LocalDate nextDay = NextDayCalculator.getNextDay(date2);
        assertEquals(LocalDate.of(2020, 2, 1), nextDay);
    }
    @Test
    void getNextDay3() {
        LocalDate date3 = LocalDate.of(2020, 2, 28);
        LocalDate nextDay = NextDayCalculator.getNextDay(date3);
        assertEquals(LocalDate.of(2020, 2, 29), nextDay);
    }
}
