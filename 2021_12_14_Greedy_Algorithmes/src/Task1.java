public class Task1 {

    public int getGroupsNumber(int dif, int[] children) {
        if (children.length == 0) {
            throw new EmptyArrayException();
        }
        int min = 0;
        int count = 1;
        for (int i = 1; i < children.length; i++) {
            if (children[i] > children[min] + dif) {
                count++;
                min = i;
            }
        }
        return count;
    }
}
