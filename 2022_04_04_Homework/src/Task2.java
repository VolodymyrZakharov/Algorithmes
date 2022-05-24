import java.util.Arrays;

public class Task2 {
    // является ли одна последовательность подпоследовательностью другой. Например, "hlo" будет подпоследовательностью "hello".
    public boolean isSubsequence(String sequence, String subSequence) {
        char[] sequenceChar = sequence.toCharArray();
        char[] subSequenceChar = subSequence.toCharArray();
        StringBuilder res = new StringBuilder();

        int j = 0;
        for (int i = 0; i < subSequenceChar.length; i++) {
            while (j < sequenceChar.length) {
                if (subSequenceChar[i] == sequenceChar[j]) {
                    res.append(sequenceChar[j]);
                    j++;
                    break;
                } else j++;
            }
        }
        return res.toString().equals(subSequence);
    }
}
