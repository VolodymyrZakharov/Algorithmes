import java.util.List;

public class Main {

    public static void main(String[] args) {


    }

    public int moneyChanger(int sum, int[] coins) {
        int[] array = new int[sum + 1];
        array[0] = 0;

        for (int i = 1; i < sum; i++) {
            array[i] = Integer.MAX_VALUE;

            for (int coin : coins) {
                int prevSum = i - coin;
                if (prevSum >= 0) {
                    int min = array[prevSum] + 1;
                    if (min < array[i]) {
                        array[i] = min;
                    }
                }
            }
        }
        return array[sum];
    }

    public int knapsack(int capacity, int[] volumes, int[] prices) {
        int[] res = new int[capacity + 1];

        for (int i = 1; i <= capacity; i++) {
            for (int j = 0; j < volumes.length; j++) {
                int lightenKnapsackVolume = i - volumes[j];
                if (lightenKnapsackVolume >= 0) {
                    int maxPrice = res[lightenKnapsackVolume] + prices[j];
                    if (res[i] < maxPrice) {
                        res[i] = maxPrice;
                    }
                }
            }
        }
        return res[capacity + 1];
    }
}

