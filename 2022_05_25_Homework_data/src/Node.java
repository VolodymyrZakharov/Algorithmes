import java.util.*;

public class Node implements INode {

    private static final double LOAD_FACTOR = 0.75;
    private static final int INITIAL_CAPACITY = 16;
    private static int size;
    private Pair[] source = new Pair[INITIAL_CAPACITY];
    private List randomList = new ArrayList<>();

    private static class Pair {
        long value;
        int index;
        Pair next;

        public Pair(long value, int index, Pair next) {
            this.value = value;
            this.index = index;
            this.next = next;
        }
    }

    @Override
    public boolean add(long value) {
        if (size > LOAD_FACTOR * source.length)
            resize();

        Pair pair = findPair(value);

        if (pair == null) {
            randomList.add(value);
            int index = findIndex(value);
            pair = new Pair(value, randomList.size() - 1, source[index]);
            source[index] = pair;
            size++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(long value) {
        int index = findIndex(value);

        if (source[index] == null)
            return false;

        Pair currentPair = source[index];

        if (currentPair.value == value) {
            randomList.set(currentPair.index, null);
            source[index] = currentPair.next;
            size--;
            return true;
        }

        while (currentPair.next != null) {
            if (currentPair.next.value == value) {
                randomList.set(currentPair.next.index, null);
                Pair next = currentPair.next;
                currentPair.next = next.next;
                size--;
                return true;
            }
            currentPair = currentPair.next;
        }
        return false;
    }

    @Override
    public long getRandom() {
        if (size == 0) throw new NoSuchElementException();
        while (true) {
            try {
                return (long) randomList.get(new Random().nextInt(randomList.size()));
            } catch (NullPointerException e) {
                continue;
            }
        }
    }

    private void resize() {
        Pair[] newSource = new Pair[source.length * 2];

        for (Pair pair : source) {

            Pair currentPairInChain = pair;
            while (currentPairInChain != null) {
                Pair nextPairInChain = currentPairInChain.next;
                int newIndex = Math.abs(Long.hashCode(currentPairInChain.value)) % newSource.length;

                currentPairInChain.next = newSource[newIndex];
                newSource[newIndex] = currentPairInChain;

                currentPairInChain = nextPairInChain;
            }
        }
        source = newSource;
    }

    private int findIndex(long value) {
        return Math.abs(Long.hashCode(value)) % source.length;
    }

    private Pair findPair(Long value) {
        int index = findIndex(value);

        Pair currentPair = source[index];

        while (currentPair != null) {
            if (currentPair.value == value)
                return currentPair;
            currentPair = currentPair.next;
        }
        return null;
    }

    public int getSize() {
        return size;
    }

    public Iterator<Long> valueIterator() {
        return new ValueIterator();
    }

    private class ValueIterator implements Iterator<Long> {

        int index;
        int pairNumber = 0;
        Pair currentPair;

        public ValueIterator() {
            if (size == 0)
                return;

            while ((currentPair = source[index]) == null) {
                index++;
            }
        }

        @Override
        public boolean hasNext() {
            return pairNumber < size;
        }

        @Override
        public Long next() {
            if (pairNumber >= size)
                throw new NoSuchElementException();

            Long res = currentPair.value;

            if (currentPair.next != null) {
                currentPair = currentPair.next;
            } else {
                do {
                    index++;
                } while (index < source.length && (currentPair = source[index]) == null);
            }
            pairNumber++;
            return res;
        }
    }
}

