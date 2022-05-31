import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GetMedianCollectionTest {

    @Test
    public void test_1() {
        GetMedianConnection collection = new GetMedianConnection();
        collection.add(5);
        collection.add(8);
        collection.add(2);
        collection.add(4);
        collection.add(3);
        collection.add(128);
        collection.add(129);
        assertEquals(5, collection.getMedian());
    }

    @Test
    public void test_2() {
        GetMedianConnection collection = new GetMedianConnection();
        collection.add(5);
        collection.add(8);
        collection.add(2);
        collection.add(4);
        collection.add(3);
        collection.add(128);
        assertEquals(4.5, collection.getMedian());
    }

    @Test
    public void test_3() {
        GetMedianConnection collection = new GetMedianConnection();
        collection.add(-4);
        collection.add(3);
        collection.add(8);
        collection.add(12);
        collection.add(12);
        collection.add(128);
        assertEquals(10, collection.getMedian());
    }

    @Test
    public void test_4() {
        GetMedianConnection collection = new GetMedianConnection();
        collection.add(0);
        collection.add(3);
        collection.add(8);
        collection.add(12);
        collection.add(12);
        collection.add(128);
        collection.add(14);
        assertEquals(12, collection.getMedian());
    }
}