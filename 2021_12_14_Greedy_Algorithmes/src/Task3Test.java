import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 res = new Task3();

    @Test
    public void task3_test_1() {
        assertEquals(2, res.getSegmentNumber(new int[]{1, 3, 6, 9}, 4));
    }

    @Test
    public void task3_test_2() {
        assertEquals(1, res.getSegmentNumber(new int[]{6}, 4));
    }

    @Test
    public void task3_test_3() {
        assertThrows(EmptyArrayException.class, () -> {
            res.getSegmentNumber(new int[0], 2);
        });
    }
}