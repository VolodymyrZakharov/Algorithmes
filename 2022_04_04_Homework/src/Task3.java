
public class Task3 {
    //найти длину наибольшей общей подпоследовательности двух строк. (hello, hovard) -> 2

    public Integer getLongestSharedSubsequence(String s1, String s2) {
        char[] sequenceChar = s1.toCharArray();
        char[] patternChar = s2.toCharArray();
        StringBuilder res = new StringBuilder();

        int counter =0;
        int j = 0;
        for (int i = 0; i < patternChar.length; i++) {
            if (j >= sequenceChar.length)
                j = counter;
            while (j < sequenceChar.length) {
                if (patternChar[i] == sequenceChar[j]) {
                    res.append(sequenceChar[j]);
                    j++;
                    counter = j;
                    break;
                } else j++;
            }
        }
        return res.length();
    }
}
