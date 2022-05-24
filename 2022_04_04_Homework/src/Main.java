import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Order order_1 = new Order("one", 100, "id_one");
        Order order_2 = new Order("two", 200, "id_two");
        Order order_3 = new Order("three", 300, "id_three");
        Order order_4 = new Order("four", 450, "id_four");
        Order order_5 = new Order("five", 500, "id_five");
        Order order_6 = new Order("six", 650, "id_six");
        Order order_7 = new Order("seven", 700, "id_seven");
        Order order_8 = new Order("eight", 850, "id_eight");
        Order order_9 = new Order("nine", 900, "id_nine");

        List<Order> list = Arrays.asList(order_1, order_2, order_3, order_4, order_5, order_6, order_7, order_8, order_9);
        OrderService orderService = new OrderService();
        System.out.println(orderService.countPreviousOrders(list, 300L));


Task3 d=new Task3();
        System.out.println(d.getLongestSharedSubsequence("Subsequence Finder", "uebfircmm"));
    }
}
