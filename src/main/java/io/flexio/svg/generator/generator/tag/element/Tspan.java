package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.tag.type.Point;


public class Tspan extends Attributes {
    public Tspan position(Point position) {
        attributes("x", position.x());
        attributes("y", position.y());
        return this;
    }

    public Tspan relativePosition(Point position) {
        attributes("dx", position.x());
        attributes("dy", position.y());
        return this;
    }
}
