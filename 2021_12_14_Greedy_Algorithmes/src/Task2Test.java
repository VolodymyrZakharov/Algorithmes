import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 res = new Task2();

    @Test
    public void task2_test_1() {
        assertEquals(4, res.getNumberOfCoins(22));
    }

    @Test
    public void task2_test_2() {
        assertEquals(1, res.getNumberOfCoins(10));
    }

    @Test
    public void task2_test_3() {
        assertEquals(3, res.getNumberOfCoins(3));
    }

    @Test
    public void task2_test_4() {
        assertEquals(1, res.getNumberOfCoins(5));
    }

    @Test
    public void task2_test_5() {
        assertEquals(3, res.getNumberOfCoins(7));
    }

    @Test
    public void task2_test_6() {
        assertEquals(3, res.getNumberOfCoins(12));
    }
}