import java.util.ArrayDeque;
import java.util.Deque;

public class Task_1 {

    public boolean containsProduct1(int[] numbers, int product) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] == product)
                    return true;
            }
        }
        return false;
    }

    public boolean containsProduct2(int[] numbers, int product) {

        Deque<Integer> arrayDeque = new ArrayDeque<>();
        for (int number : numbers) {
            arrayDeque.addLast(number);
        }
        while (arrayDeque.size() > 1) {

            if (arrayDeque.getFirst() * arrayDeque.getLast() > product)
                arrayDeque.removeLast();

            if (arrayDeque.getFirst() * arrayDeque.getLast() < product)
                arrayDeque.removeFirst();

            if (arrayDeque.getFirst() * arrayDeque.getLast() == product)
                return true;
        }
        return false;
    }
}

