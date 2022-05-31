import java.util.Comparator;
import java.util.PriorityQueue;

// 2. Необходимо спроектировать структуру данных, которая имеет следующие операции.
//add(int number)
//getMedian()
//Обе операции должны быть по возможности эффективные, причем вторая более важна.
//Структура данных может содержать повторяющиеся числа.
//Медианный элемент списка элементов, это элемент, лежащий посередине, если список отсортировать. Или это арифметичское среднее двух срединных элементов, если их четное количество.
//{5, 8, 2, 4, 3, 128} -> {2, 3, 4, 5, 8, 128} -> 4.5
//(Использвать кучи: PriorityQueue)
public class GetMedianCollection implements IGetMedianCollection {
    private PriorityQueue<Integer> leftQueue = new PriorityQueue<>(new leftQueueComparator());
    private PriorityQueue<Integer> rightQueue = new PriorityQueue<>();

    @Override
    public void add(int value) {
        if (leftQueue.size() == 0 && rightQueue.size() == 0) {
            leftQueue.add(value);
        } else if (leftQueue.size() > rightQueue.size()) {
            if (value < leftQueue.peek()) {
                rightQueue.add(leftQueue.peek());
                leftQueue.poll();
                leftQueue.add(value);
            } else if (value >= leftQueue.peek()) {
                rightQueue.add(value);
            }
        } else if (leftQueue.size() < rightQueue.size()) {
            if (value > rightQueue.peek()) {
                leftQueue.add(rightQueue.peek());
                rightQueue.poll();
                rightQueue.add(value);
            } else if (value <= rightQueue.peek()) {
                leftQueue.add(value);
            }
        } else if (leftQueue.size() == rightQueue.size()) {
            if (value > rightQueue.peek()) {
                rightQueue.add(value);
            } else leftQueue.add(value);
        }
    }

    @Override
    public double getMedian() {
        if (rightQueue.size() == leftQueue.size())
            return (double) (leftQueue.peek() + rightQueue.peek()) / 2;
        if (rightQueue.size() > leftQueue.size())
            return rightQueue.peek();
        else return leftQueue.peek();
    }

    class leftQueueComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    }

    public PriorityQueue<Integer> getLeftQueue() {
        return leftQueue;
    }

    public PriorityQueue<Integer> getRightQueue() {
        return rightQueue;
    }
}
