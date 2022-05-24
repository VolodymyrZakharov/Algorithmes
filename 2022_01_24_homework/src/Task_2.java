import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Task_2 {

    public String encode(String str) {
        String[] stringArray = str.split("");
        Map<String, Integer> map = new HashMap<>();

        for (String keyValue : stringArray) {
            if (map.containsKey(keyValue)) {
                int number = map.get(keyValue);
                map.put(keyValue, number + 1);
            } else map.put(keyValue, 1);
        }

        StringBuilder mapAsString = new StringBuilder();
        for (String key : map.keySet()) {
            mapAsString.append(map.get(key) > 1 ? map.get(key) + key : "" + key);
        }
        return mapAsString.toString();
    }

    public String encode2(String str) {

        StringBuilder builder = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (count > 1) {
                    builder.append(count).append(str.charAt(i - 1));
                    count = 1;
                } else {
                    builder.append(str.charAt(i - 1));
                }

            } else {
                count++;
            }
        }
        if (count == 1) {
            builder.append(str.charAt(str.length() - 1));
        } else {
            builder.append(count).append(str.charAt(str.length() - 1));
        }
        return builder.toString();
    }
}
