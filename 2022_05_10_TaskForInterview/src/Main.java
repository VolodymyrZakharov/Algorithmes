import com.sun.source.tree.ContinueTree;

import java.sql.Time;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String str = "aabbbbbaacccc";
        System.out.println(task_1(str));

        System.out.println(task_3(5, 4));
        System.out.println(task_4(153));

        System.out.println(task_2("abcd"));
        System.out.println(task_5(7));
        System.out.println("hello");
        System.out.println(task_6("1010010"));
        task_7(10, 40);

        String a = "aaabbcccch";
        System.out.println(Some.task_1(a));

        String b = "hello world";
        System.out.println(Some.task_2(b));

        String ff = "qwerty";
        System.out.println(ff.substring(3));

        System.out.println(Some.task_6("1010010"));

        System.out.println(task_8("qwertyu"));
        System.out.println(task_9("qwertyy"));
        System.out.println(task_10("qwerty"));


        LocalTime one = LocalTime.of(11, 00);
        LocalTime two = LocalTime.of(12, 00);
        LocalTime three = LocalTime.of(13, 00);
        LocalTime four = LocalTime.of(14, 00);

        LocalTime five = LocalTime.of(17, 30);
        LocalTime six = LocalTime.of(16, 00);
        LocalTime seven = LocalTime.of(11, 30);
        LocalTime eight = LocalTime.of(18, 00);

        LocalTime[] arrival = {one, two, three, four};
        LocalTime[] departure = {five, six, seven, eight};

        System.out.println(task_11(arrival, departure));

        String aa= "qwertyq";
        System.out.println(aa.indexOf('q'));
        System.out.println(aa.lastIndexOf('q'));

        System.out.println(task_13("qqwerty"));
        System.out.println(task_12(Arrays.asList(10, 6, 1, 2, 1, 0, 4)));
    }

    // 1.Дана строка состоящая из разного количества повторяющихся символов типа
    // "abbbcc"->bbb . Используя только методы класса String
    // найти длину максимальной подстроки повторяющихся символов
    public static int task_1(String str) {
        char[] chars = str.toCharArray();
        int count = 1;
        int res = 0;
        OuterFore:
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i + 1] == chars[i]) {
                count++;
                if (count > res) {
                    res = count;
                }
                continue OuterFore;
            } else count = 1;
        }
        return res;
    }

    //2. Написать метод, разворачивающий строку с использованием
    // рекурсии  I always do my homework -> krowemah ym od syawla I
    public static String task_2(String str) {
        int length = str.length();

        if (length <= 1) {
            return str;
        }

        String leftStr = str.substring(0, length / 2);
        String rightStr = str.substring(length / 2, length);

        return task_2(rightStr) + task_2(leftStr);
    }

    //3.Написать метод, перемножающий два целых числа без использования умножения,
    // деления, побитовых операций и циклов
    public static int task_3(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    // 4. Написать метод, проверяющий равно ли число  сумме кубов его цифр. 123 = 1+2^3+ 3^3
    public static boolean task_4(int a) {
        String[] strings = String.valueOf(a).split("");

        int res = 0;
        for (int i = 0; i < strings.length; i++) {
            res += Math.pow(Integer.parseInt(strings[i]), 3);
        }
        return a == res;
    }

    //5. Написать метод, проверяющий является ли число "аутоморфным". В математике аутоморфные это числа
    // квадрат  которых заканчивается теми же числами что и само число. Пример: 5^2=25, 6^2=36, 76^2=5776
    public static boolean task_5(int number) {
        int b = (int) Math.pow(number, 2);
        int length = (int) (Math.log10(number) + 1);
        return number == b % (Math.pow(10, length));
    }

    //6. пусть есть строка являющаяся двоичным числом например "0101". Написать метод,
    // превращающий ее в десятичное число. Можно использовать только методы класса String (length, charAt) и
    // методы Math 1010010 = 1·26+0·25+1·24+0·23+0·22+1·21+0·20
    public static int task_6(String str) {
        String[] array = str.split("");
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            res += Integer.parseInt(array[i]) * Math.pow(2, array.length - i - 1);
        }
        return res;
    }

    // 7.написать метод, меняющий местами значения  двух целых переменных без использования буфера
    public static void task_7(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }

    public static boolean task_8(String str) {
        char[] chars = str.toCharArray();

        HashSet hashSet = new HashSet();
        for (char a : chars) {
            hashSet.add(a);
        }
        if (hashSet.size() == chars.length)
            return true;
        else return false;
    }

    public static boolean task_9(String str) {
        char[] array = str.toCharArray();

        HashMap hashMap = new HashMap();

        for (int i = 0; i < array.length; i++) {
            hashMap.put(array[i], i);
        }
        return hashMap.size() == array.length;
    }

    public static boolean task_10(String str) {

        int a = (int) Arrays.stream(str.split(""))
                .distinct()
                .count();

        return a == str.length();
    }

    //  2. Посчитать минимальное количество платформ, необходимых
//  для железнодорожной станции  для приема всех приходящих по расписанию поездов.
//    Дано: время прибытия и отправления поезда
    // arrival[]={1:00,1:30,1:50;2:00;4:00} упорядочено.
    // departure[]={1:10,3:00,2:20;2:30;6:00}
    // решить со сложностью ниже чем O(n^2)
    public static int task_11(LocalTime[] arrival, LocalTime[] departure) {
        Arrays.sort(departure);
        Deque<LocalTime> deque = new ArrayDeque<>();
        int j = 0;
        for (int i = 0; i < arrival.length; i++) {
            if (departure[j].isBefore(arrival[i])) {
                deque.removeLast();
                j++;
                i--;
            } else {
                deque.add(arrival[i]);
            }
        }
        return deque.size();
    }

    // 3.Есть лист положительных целых чисел нечетной длины >=3 . Известно, что существует
// индекс элемента, такой что сумма всех  элементов  слева от него равняется сумме
// всех элементов справа от него. Найти этот индекс. решить задачу эффективно
// со сложностью О(n)
//1,6, 3 ,4,3
    public static int task_12(List<Integer> list) {
        int mid = list.size() / 2;
        for (int i = 0; i < mid; i++) {
            int left = list.stream().limit(mid).reduce((x, y) -> x + y).get();
            int right = list.stream().skip(mid + 1).reduce((x, y) -> x + y).get();
            if (left < right) mid += 1;
            if (left > right) mid -= 1;
            if (left == right) break;
        }
        return mid;
    }

    public static boolean task_13(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (str.indexOf(array[i])!=str.lastIndexOf(array[i]))
                return false;
        }
        return true;
    }



}
