import java.util.*;

public class Main {
    // ДЗ Необходимо задизайнить (придумать) такую структуру данных Long чисел, которая содержит каждое число
    // в единственном экземпляре и обладает следующими операциями:
    // bool add(elt) - добаляет элемент, возвразает true, если элемент таки добавился (его не было в структуре данных ранее)
    // bool remove(elt) - удаляет элемент и возвращает true, если элемент таки удалился (он был в структуре данных ранее)
    // Integer getRandom() - равновероятно возвращает один из имеющихся в структуре данных элементов.
    // при этом, необходимо, чтобы все методы были эффективые. То есть их сложность O(1). Подсказка.
    // Необходимо использовать под капотом две структуры данных:
    //  List<Long>
    // HashMap<Long, Integer> - элемент на его индекс в листе


    public static void main(String[] args) {
        Node node = new Node();
        node.add(1L);
        System.out.println(node.add(2L));
        node.add(3L);
        node.add(4L);
        node.add(5L);
        node.add(26);
        System.out.println(node.add(1L));

        System.out.println(node.getSize());

        Iterator<Long> valueIterator = node.valueIterator();
        while (valueIterator.hasNext()) {
            System.out.print(valueIterator.next() + " ");
        }
        System.out.println();

        System.out.println(node.remove(1L));
        System.out.println(node.remove(10L));

        System.out.println(node.getSize());

        Iterator<Long> valueIterator2 = node.valueIterator();
        while (valueIterator2.hasNext()) {
            System.out.print(valueIterator2.next() + " ");
        }
        System.out.println();

        System.out.println(node.getRandom());

    }
}
