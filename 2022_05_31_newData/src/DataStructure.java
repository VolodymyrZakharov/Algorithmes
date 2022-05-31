import java.util.*;

public class DataStructure implements ICollection {
    private Map<Long, Integer> map = new HashMap<>();
    private List<Long> randomList = new ArrayList<>();

    @Override
    public boolean add(long value) {
        if (map.containsKey(value)) {
            return false;
        } else
            map.put(value, randomList.size());
        randomList.add(value);
        return true;
    }

    @Override
    public boolean remove(long value) {
        if (!map.containsKey(value)) {
            return false;
        } else {
            long listLastValue = randomList.get(randomList.size() - 1);
            int listLastValueIndex = map.get(value);

            map.put(listLastValue, listLastValueIndex);
            randomList.set(listLastValueIndex, listLastValue);
            randomList.remove(randomList.size() - 1);
            map.remove(value);
        }
        return true;
    }

    @Override
    public long getRandom() {
        if (randomList.size() == 0) throw new NoSuchElementException();
        return randomList.get(new Random().nextInt(randomList.size()));
    }

    public List<Long> getRandomList() {
        return randomList;
    }

    public Map<Long, Integer> getMap() {
        return map;
    }
}

