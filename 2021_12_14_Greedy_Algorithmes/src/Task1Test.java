import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 res = new Task1();

    @Test
    public void task1_test_1() {
        assertEquals(1, res.getGroupsNumber(2, new int[]{1}));
    }

    @Test
    public void task1_test_2() {
        assertEquals(1, res.getGroupsNumber(2, new int[]{1, 1, 1, 1, 2}));
    }

    @Test
    public void task1_test_3() {
        assertEquals(2, res.getGroupsNumber(2, new int[]{1, 5}));
    }

    @Test
    public void task1_test_4() {
        assertEquals(3, res.getGroupsNumber(2, new int[]{1, 2, 2, 5, 9}));
    }

    @Test
    public void task1_test_5() {
        assertThrows(EmptyArrayException.class, () -> {
            res.getGroupsNumber(2, new int[0]);
        });
    }

}