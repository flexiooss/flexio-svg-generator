package io.flexio.svg.generator.generator.tag.property;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.tag.type.Point;

public interface Positionable<P extends Positionable> extends Attribute {
    default P position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return (P) this;
    }
}
