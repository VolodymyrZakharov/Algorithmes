import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class PointServiceTest {

    PointService pointService = new PointService();

    @Test
    public void test1() {
        List<Integer> numbers = Arrays.asList(2, 5, 10);
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 2),
                new Cut(1, 4),
                new Cut(1, 5),
                new Cut(5, 8),
                new Cut(8, 11)
        );

        Map<Integer, Integer> map = new HashMap<>();
        map.put(numbers.get(0), 3);
        map.put(numbers.get(1), 2);
        map.put(numbers.get(2), 1);

        assertEquals(map, pointService.getCoveringCutsNumberByPoint(numbers, cuts));
    }

    @Test
    public void test2() {
        List<Integer> numbers = Arrays.asList(0, 1, 5);
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 1),
                new Cut(0, 2),
                new Cut(1, 5),
                new Cut(5, 6),
                new Cut(7, 10)
        );

        Map<Integer, Integer> map = new HashMap<>();
        map.put(numbers.get(0), 2);
        map.put(numbers.get(1), 3);
        map.put(numbers.get(2), 2);

        assertEquals(map, pointService.getCoveringCutsNumberByPoint(numbers, cuts));
    }

    @Test
    public void test3() {
        List<Integer> numbers = Arrays.asList(1, 1, 6);
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 1),
                new Cut(1, 2),
                new Cut(0, 3),
                new Cut(4, 6),
                new Cut(5, 7)
        );

        Map<Integer, Integer> map = new HashMap<>();
        map.put(numbers.get(0), 3);
        map.put(numbers.get(1), 3);
        map.put(numbers.get(2), 2);

        assertEquals(map, pointService.getCoveringCutsNumberByPoint(numbers, cuts));
    }
}