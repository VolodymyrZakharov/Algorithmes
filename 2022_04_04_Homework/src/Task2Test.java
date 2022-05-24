import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class Task2Test {

    Task2 task2 = new Task2();

    @Test
    public void test_1() {
        assertEquals(true, task2.isSubsequence("hello", "hlo"));
    }

    @Test
    public void test_2() {
        assertEquals(true, task2.isSubsequence("dfkffgghh", "fgh"));
    }

    @Test
    public void test_3() {
        assertEquals(false, task2.isSubsequence("dfkffhhg", "fgh"));
    }

    @Test
    public void test_4() {
        assertEquals(true, task2.isSubsequence("hello world", "hol"));
    }

    @Test
    public void test_5() {
        assertEquals(true, task2.isSubsequence("ggaaaccbjjc", "abc"));
    }

    @Test
    public void test_6() {
        assertEquals(true, task2.isSubsequence("hello", "hello"));
    }

    @Test
    public void test_7() {
        assertEquals(false, task2.isSubsequence("", "hello"));
    }

    @Test
    public void test_8() {
        assertEquals(false, task2.isSubsequence("hello", "abc"));
    }

    @Test
    public void test_9() {
        assertEquals(true, task2.isSubsequence("hello", ""));
    }
}

