import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {
    Task1 res = new Task1();

    @Test
    public void testLastFibonacciDigit_1() {
        assertEquals(8, res.lastFibonacciDigit(Integer.MAX_VALUE));
    }

    @Test
    public void testLastFibonacciDigit_2() {
        assertEquals(3, res.lastFibonacciDigit(8));
    }

    @Test
    public void testLastFibonacciDigit_3() {
        assertEquals(0, res.lastFibonacciDigit(1));
    }

    @Test
    public void testLastFibonacciDigit_4() {
        assertEquals(1, res.lastFibonacciDigit(2));
    }

    @Test
    public void testLastFibonacciDigit_5() {
        assertEquals(1, res.lastFibonacciDigit(3));
    }

    @Test
    public void testLastFibonacciDigit_6() {
        assertEquals(2, res.lastFibonacciDigit(4));
    }

    @Test
    public void testLastFibonacciDigit_throwsCustomOutOfBoundsException() {
        assertThrows(OutOfBoundsException.class, () -> {
            res.lastFibonacciDigit(0);
        });
    }

    @Test
    public void testLastFibonacciDigit_throwsCustomOutOfBoundsException_2() {
        assertThrows(OutOfBoundsException.class, () -> {
            res.lastFibonacciDigit(-3);
        });
    }
}