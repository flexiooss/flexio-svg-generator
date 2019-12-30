package generator.type;

public class Point {
    String x;
    String y;

    public Point(long x, long y) {
        this(Long.toString(x), Long.toString(y));
    }

    public Point(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String x() {
        return x;
    }

    public String y() {
        return y;
    }
}
