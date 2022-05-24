import java.util.*;
import java.util.Map;

import static java.util.stream.Collectors.*;


public class OrderService {
    /**
     * @param orders a list of orders
     * @param delta  time interval in millis
     * @return the number of orders for every order for the previous delta millis before the orders
     */
    public Map<String, Integer> countPreviousOrders(List<Order> orders, long delta) {
        Map<String, Integer> res = new HashMap<>();
        for (Order order : orders) {
            long time = order.getTimeStamp();
            String key = order.getUuid();
            String restaurantID = order.getRestaurantId();

            Integer value = Math.toIntExact(orders.stream()
                    .filter(a -> a.getRestaurantId().equals(restaurantID))
                    .map(Order::getTimeStamp)
                    .filter(t -> t < time && t > time - delta)
                    .count());
            res.put(key, value);
        }
        return res;
    }

}
