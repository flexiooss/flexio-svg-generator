package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attributes;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.type.Point;


public class Tspan extends Attributes<Tspan> implements Positionable<Tspan> {
    public Tspan relativePosition(Point position) {
        attributes("dx", position.x());
        attributes("dy", position.y());
        return this;
    }
}
