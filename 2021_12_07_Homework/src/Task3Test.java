import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {
    Task3 res = new Task3();

    @Test
    public void testFindNod_1() {
        assertEquals(0, res.findNod(0, 0));
    }

    @Test
    public void testFindNod_2() {
        assertEquals(5, res.findNod(0, 5));
    }

    @Test
    public void testFindNod_3() {
        assertEquals(6, res.findNod(6, 0));
    }

    @Test
    public void testFindNod_4() {
        assertEquals(6, res.findNod(54, 24));
    }

    @Test
    public void testFindNod_5() {
        assertEquals(6, res.findNod(24, 54));
    }

    @Test
    public void testFindNod_6() {
        assertEquals(54, res.findNod(0, -54));
    }

    @Test
    public void testFindNod_7() {
        assertEquals(6, res.findNod(-24, 54));
    }

    @Test
    public void testFindNod_8() {
        assertEquals(6, res.findNod(24, -54));
    }

    @Test
    public void testFindNod_9() {
        assertEquals(6, res.findNod(54, -24));
    }

    @Test
    public void testFindNod_10() {
        assertEquals(6, res.findNod(-54, 24));
    }



    @Test
    public void testFindNok_1() {
        assertEquals(80, res.findNok(16, 20));
    }

    @Test
    public void testFindNok_2() {
        assertEquals(24, res.findNok(8, 3));
    }

    @Test
    public void testFindNok_3() {
        assertEquals(80, res.findNok(-20, 16));
    }

    @Test
    public void testFindNok_4() {
        assertEquals(80, res.findNok(20, -16));
    }

    @Test
    public void testFindNok_5() {
        assertEquals(80, res.findNok(16, -20));
    }

    @Test
    public void testFindNok_6() {
        assertEquals(80, res.findNok(-16, 20));
    }

    @Test
    public void testFindNokThrowException() {
        assertThrows(OutOfBoundsException.class, () -> {
            res.findNok(0, 24);
        });
    }
}