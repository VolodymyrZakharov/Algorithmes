import java.util.*;

public class DataStructure<T> implements ICollection<T> {
    private Map<T, Integer> map = new HashMap<>();
    private List<T> randomList = new ArrayList<>();

    @Override
    public boolean add(T value) {
        if (map.containsKey(value)) {
            return false;
        } else
            map.put(value, randomList.size());
        randomList.add(value);
        return true;
    }

    @Override
    public boolean remove(T value) {
        if (!map.containsKey(value)) {
            return false;
        } else {
            T listLastValue = randomList.get(randomList.size() - 1);
            int listValueIndex = map.get(value);

            map.put(listLastValue, listValueIndex);
            randomList.set(listValueIndex, listLastValue);
            randomList.remove(randomList.size() - 1);
            map.remove(value);
        }
        return true;
    }

    @Override
    public T getRandom() {
        if (randomList.size() == 0) throw new NoSuchElementException();
        return randomList.get(new Random().nextInt(randomList.size()));
    }

    public List<T> getRandomList() {
        return randomList;
    }

    public Map<T, Integer> getMap() {
        return map;
    }
}

