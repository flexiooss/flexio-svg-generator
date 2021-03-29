package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Rotatable;
import io.flexio.svg.generator.generator.tag.type.Point;


public class Tspan extends SVGElementAttributes<Tspan> implements Element, Positionable<Tspan>, Rotatable<Tspan> {
    @Override
    public String name() {
        return "tspan";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Tspan relativePosition(Point position) {
        attributes("dx", position.x());
        attributes("dy", position.y());
        return this;
    }
}
