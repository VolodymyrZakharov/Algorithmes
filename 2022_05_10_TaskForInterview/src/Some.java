import java.util.Arrays;

public class Some {
    // 1.Дана строка состоящая из разного количества повторяющихся символов типа
    // "abbbcc"->bbb . Используя только методы класса String
    // найти длину максимальной подстроки повторяющихся символов
    public static int task_1(String str) {
        char[] array = str.toCharArray();
        int max = 0;
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else if (max < count) {
                max = count;
                count = 1;
            } else count = 1;
        }
        return max;
    }

    //2. Написать метод, разворачивающий строку с использованием
    // рекурсии  I always do my homework -> krowemah ym od syawla I
    public static String task_2(String str) {
        int length = str.length();
        if (length == 1)
            return str;

        String leftString = str.substring(0, length / 2);
        String rightString = str.substring(length / 2, length);

        return task_2(rightString) + task_2(leftString);
    }

    //3.Написать метод, перемножающий два целых числа без использования умножения,
    // деления, побитовых операций и циклов
    public static int task_3(int a, int b) {
        return Math.multiplyExact(a, b);
    }

    // 4. Написать метод, проверяющий равно ли число  сумме кубов его цифр. 123 = 1+2^3+ 3^3
    public static boolean task_4(int a) {
        String[] array = String.valueOf(a).split("");
        int res = Arrays.stream(array)
                .map(Integer::parseInt)
                .map(b -> b ^ 3)
                .reduce((x, y) -> x + y).get();

        return res == a;
    }

    //5. Написать метод, проверяющий является ли число "аутоморфным". В математике аутоморфные это числа
    // квадрат  которых заканчивается теми же числами что и само число. Пример: 5^2=25, 6^2=36, 76^2=5776
    public static boolean task_5(int a) {
        int sqr = a ^ 2;
        int length = (int) (Math.log10(a) + 1);
        return a == sqr % (10 ^ length);
    }

    //6. пусть есть строка являющаяся двоичным числом например "0101". Написать метод,
    // превращающий ее в десятичное число. Можно использовать только методы класса String (length, charAt) и
    // методы Math 1010010 = 1·26+0·25+1·24+0·23+0·22+1·21+0·20
    public static int task_6(String str) {
        int b = 0;
        for (int i = 0; i < str.length(); i++) {
            b += Math.pow(2, str.length() - 1 - i);
        }
        return b;
    }
}

