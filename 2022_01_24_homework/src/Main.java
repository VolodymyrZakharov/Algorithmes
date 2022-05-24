import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] array = {0, 3, 6, 8, 9};

        Task_1 res1 = new Task_1();
        System.out.println(res1.containsProduct1(array, 6));

        Task_1 res2 = new Task_1();
        System.out.println(res2.containsProduct2(array, 6));

        String str1 = "aaabbcrt";
        Task_2 res3 = new Task_2();
        System.out.println(res3.encode2(str1));

        String str2 = "22qe";
        Task_3 res4 = new Task_3();
        System.out.println(res4.decode(str2));
        }
    }
