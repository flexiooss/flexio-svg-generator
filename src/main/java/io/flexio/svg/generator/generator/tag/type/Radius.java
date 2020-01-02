package io.flexio.svg.generator.generator.tag.type;

import java.util.Objects;

public class Radius {
    String x;
    String y;

    public Radius(long x, long y) {
        this(Long.toString(x), Long.toString(y));
    }

    public Radius(String x, String y) {
        this.x = x;
        this.y = y;
    }

    public String x() {
        return x;
    }

    public String y() {
        return y;
    }

    @Override
    public String toString() {
        return "Radius{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Radius radius = (Radius) o;
        return Objects.equals(x, radius.x) &&
                Objects.equals(y, radius.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
