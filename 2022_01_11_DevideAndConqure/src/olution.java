public class olution {
    /**
     * The method sort the array via merge sort approach.
     *
     * @param numbers
     */
    public void mergeSort(int[] numbers) {
        mergeSortRecursively(numbers, 0, numbers.length);
    }

    /**
     * The function recursively sort the array from the left index inclusively to the right index exclusively.
     *
     * @param numbers
     * @param leftIndex
     * @param rightIndex
     */
    private void mergeSortRecursively(int[] numbers, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex == 1)
            return;

        int middleIndex = (rightIndex - leftIndex) / 2;

        mergeSortRecursively(numbers, leftIndex, middleIndex);
        mergeSortRecursively(numbers, middleIndex, rightIndex);

        merge(numbers, leftIndex, rightIndex);
    }

    private void merge(int[] numbers, int leftIndex, int rightIndex) {
        int middleIndex = (rightIndex - leftIndex) / 2;

        int[] tempArray = new int[rightIndex - leftIndex];
    }
}
