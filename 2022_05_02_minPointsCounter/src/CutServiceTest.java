import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CutServiceTest {

    CutService cutService = new CutService();

    @Test
    public void test1() {
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 2),
                new Cut(1, 4),
                new Cut(4, 6),
                new Cut(5, 7),
                new Cut(7, 9)
        );
        assertEquals(3, cutService.countMinNumberOfPoints(cuts));
    }

    @Test
    public void test2() {
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 4),
                new Cut(0, 2),
                new Cut(1, 7),
                new Cut(5, 6),
                new Cut(9, 10)
        );
        assertEquals(3, cutService.countMinNumberOfPoints(cuts));
    }

    @Test
    public void test3() {
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 4),
                new Cut(0, 2),
                new Cut(0, 9),
                new Cut(5, 6),
                new Cut(7, 8)
        );
        assertEquals(3, cutService.countMinNumberOfPoints(cuts));
    }

    @Test
    public void test4() {
        List<Cut> cuts = Arrays.asList(
                new Cut(0, 2),
                new Cut(0, 4),
                new Cut(0, 6),
                new Cut(5, 8),
                new Cut(7, 9)
        );
        assertEquals(2, cutService.countMinNumberOfPoints(cuts));
    }

}