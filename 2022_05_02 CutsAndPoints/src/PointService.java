import java.util.*;

public class PointService {

    public  Map<Integer, Integer> getCoveringCutsNumberByPoint(List<Integer> numbers, List<Cut> cuts) {
        Map<Integer, Integer> map = new HashMap<>();

        List<Point> points = convertToPoints(cuts, numbers);
        Collections.sort(points);

        int res = 0;
        int cutsCounter = 0;

        for (Point point : points) {
            if (point.type.equals(PointType.LEFT)) {
                if (res < ++cutsCounter)
                    res = cutsCounter;
            }else
            if (point.type.equals(PointType.NUMBER)) {
                map.put(point.value, res);
            } else {
                cutsCounter--;
                res--;
            }
        }

        return map;
    }

    private List<Point> convertToPoints(List<Cut> cuts, List<Integer> numbers) {
        List<Point> points = new ArrayList<>();

        for (Cut cut : cuts) {
            points.add(new Point(cut.left, PointType.LEFT));
            points.add(new Point(cut.right, PointType.RIGHT));
        }

        for (Integer a : numbers) {
            points.add(new Point(a, PointType.NUMBER));
        }

        return points;
    }
}
