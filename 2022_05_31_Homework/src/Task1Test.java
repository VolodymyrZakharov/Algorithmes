import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;
import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    Task1 task1 = new Task1();
    @Test
    public void test_1() {
        List<Integer> list = Arrays.asList(5, 8, 2, 4, 3, 128);
        task1.sort(list);
        List<Integer> res = Arrays.asList(2, 4, 8, 128, 3, 5);
        assertEquals(res, list);
    }

    @Test
    public void test_2() {
        List<Integer> list = Arrays.asList(6, 13, 22, 128, 1); // 110, 1101, 10110, 10000000, 1
        task1.sort(list);
        List<Integer> res = Arrays.asList(1, 128, 6, 13, 22);
        assertEquals(res, list);
    }

}