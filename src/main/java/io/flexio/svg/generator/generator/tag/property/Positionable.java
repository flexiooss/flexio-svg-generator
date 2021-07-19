package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.tag.type.Point;

import java.util.Locale;

public interface Positionable<P extends Positionable> extends Attribute {
    @SuppressWarnings("unchecked")
    default P position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return (P) this;
    }

    @SuppressWarnings("unchecked")
    default P position(String x, String y) {
        attributes("x", x);
        attributes("y", y);
        return (P) this;
    }

    default P position(double x, double y) {
        return this.position(
                String.format(Locale.US, "%.5f", x),
                String.format(Locale.US, "%.5f", y)
        );
    }
}
