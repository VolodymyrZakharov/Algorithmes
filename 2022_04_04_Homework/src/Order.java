public class Order {
    private final String uuid;
    private final long timeStamp;// system.currentTimeStamp
    private final String restaurantId;

    public Order(String uuid, long timeStamp, String restaurantId) {
        this.uuid = uuid;
        this.timeStamp = timeStamp;
        this.restaurantId = restaurantId;
    }

    public String getUuid() {
        return uuid;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public String getRestaurantId() {
        return restaurantId;
    }
}
