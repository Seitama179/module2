import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoSumTest {

    @Test
    void sumTest0() {
        int a = Integer.valueOf("a");
        int b = 2;
        int c = DemoSum.sum(a, b);
        assertEquals(3 , c);
    }
    @Test
    void sumTest1() {
        int a = Integer.MAX_VALUE;
        int b = 2;
        int c = DemoSum.sum(a, b);
        assertEquals(4294967294L , c);
    }
}