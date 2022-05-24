
public class Task_3 {

    public String decode(String str) {

        char[] array = str.toCharArray();
        StringBuilder string = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            if (!Character.isDigit(array[i])) {
                string.append(array[i]);
            } else {
                for (int j = 0; j < Character.getNumericValue(array[i]); j++) {
                    string.append(array[i + 1]);
                }
                i++;
            }
        }
        return string.toString();
    }
}
