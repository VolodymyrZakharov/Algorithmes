import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    Task2 res = new Task2();

    @Test
    public void testFibonacciModulo_1() {
        assertEquals(2, res.fibonacciModulo(7, 3));
    }

    @Test
    public void testFibonacciModulo_2() {
        assertEquals(3, res.fibonacciModulo(8, 10) );
    }

    @Test
    public void testFibonacciModulo_3() {
        assertThrows(OutOfBoundsException.class, () -> {
            res.fibonacciModulo(0, 10);
        });
    }

    @Test
    public void testFibonacciModulo_4() {
        assertThrows(OutOfBoundsException.class, () -> {
            res.fibonacciModulo(10, 0);
        });
    }

    @Test
    public void testFibonacciModulo_5() {
        assertThrows(OutOfBoundsException.class, () -> {
            res.fibonacciModulo(-5, 10);
        });
    }
}