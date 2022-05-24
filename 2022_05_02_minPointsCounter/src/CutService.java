import java.util.*;

public class CutService {

    public int countMinNumberOfPoints(List<Cut> cuts) {

       cuts.sort((o1,o2)->Integer.compare(o1.left, o2.left));

        int mark = cuts.get(0).right;
        int count = 1;

        for (Cut cut : cuts) {
            if (cut.left > mark) {
                count++;
                mark = cut.right;
            } else {
                if (cut.right < mark) {
                    mark = cut.right;
                }
            }
        }
        return count;
    }
}

