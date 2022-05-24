public class Task3 {
    public int getSegmentNumber(int[] numbers, int l) {
        if (numbers.length == 0) {
            throw new EmptyArrayException();
        }
        int leftSegment = numbers[0];
        int count = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > leftSegment + l) {
                leftSegment = numbers[i];
                count++;
            }
        }
        return count;
    }
}
