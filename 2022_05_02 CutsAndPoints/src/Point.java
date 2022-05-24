public class Point implements Comparable<Point> {
    int value;
    PointType type;

    public Point(int value, PointType type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public int compareTo(Point anotherPoint) {
        int res = this.value - anotherPoint.value;
        if (res != 0)
            return res;

        if (this.type.equals(PointType.LEFT) && anotherPoint.type.equals(PointType.RIGHT))
            return -1;

        if (this.type.equals(PointType.RIGHT) && anotherPoint.type.equals(PointType.LEFT))
            return 1;

        if (this.type.equals(PointType.NUMBER) && anotherPoint.type.equals(PointType.LEFT))
            return 1;

        if (this.type.equals(PointType.NUMBER) && anotherPoint.type.equals(PointType.RIGHT))
            return -1;

        return 0;
    }
}
