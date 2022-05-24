import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    Task3 task3 = new Task3();

    @Test
    void test_1() {
        assertEquals(2, task3.getLongestSharedSubsequence("hehllo", "ahovard"));
    }

    @Test
    void test_2() {
        assertEquals(5, task3.getLongestSharedSubsequence("hello", "hello"));
    }

    @Test
    void test_3() {
        assertEquals(1, task3.getLongestSharedSubsequence("hello", "67lv"));
    }

    @Test
    void test_4() {
        assertEquals(8, task3.getLongestSharedSubsequence("hello vasya", "hello vova"));
    }

    @Test
    void test_5() {
        assertEquals(0, task3.getLongestSharedSubsequence("hello", "bpjk"));
    }

    @Test
    void test_6() {
        assertEquals(3, task3.getLongestSharedSubsequence("aabvb", "opbmnvzb"));
    }

    @Test
    void test_7() {
        assertEquals(1, task3.getLongestSharedSubsequence("ajghjkgjgf", "a"));
    }

    @Test
    void test_8() {
        assertEquals(1, task3.getLongestSharedSubsequence("abc", "aga"));
    }

    @Test
    void test_9() {
        assertEquals(4, task3.getLongestSharedSubsequence("Subsequence Finder", "uebfircmm"));
    }

}