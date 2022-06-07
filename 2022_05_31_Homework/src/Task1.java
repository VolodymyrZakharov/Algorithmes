import java.util.Comparator;
import java.util.List;

public class Task1 {
    // Имеется список положительных Integer (>0). Необходимо отсортировать их таким образом,
    // что сначала идут числа с наименьшем количеством единиц в двоичной записи числа.
    // Если по этому параметру числа совпадают, то сначала идут меньшие числа. Пример {5, 8, 2, 4, 3, 128} ->
    // {101, 1000, 10, 100, 11, 10000000} -> {10, 100, 1000, 10000000, 11, 101} ->{2, 4, 8, 128, 3, 5}
    //128. Каунтер = 0. Если 128 не делится на 2, то мы добавляем к каунтеру 1.
    // После чего делим 128 на 2 и повторяем таким образом, пока число > 0.

    public void sort(List<Integer> list) {
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (getCounter((Integer) o1) > getCounter((Integer) o2))
                    return 1;
                if (getCounter((Integer) o1) < getCounter((Integer) o2))
                    return -1;
                return (Integer) o1 - (Integer) o2;
            }
        };
        list.sort(comparator);
    }

    public void sort2(List<Integer> list) {
        list.sort(Comparator.comparing(this::getCounter).thenComparing(Integer::compare));
    }

    public Integer getCounter(Integer value) {
        int counter = 0;
        while (value > 0) {
            if (value % 2 != 0) {
                counter++;
            }
            value = value >> 2;
        }
        return counter;
    }

    public Integer getCounter2(Integer value) {
        return Integer.toBinaryString(value).replace("0", "").length();
    }
}
