package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttribute;
import io.flexio.svg.generator.generator.tag.property.Positionable;
import io.flexio.svg.generator.generator.tag.property.Rotatable;
import io.flexio.svg.generator.generator.tag.type.Point;
import io.flexio.svg.generator.generator.writer.ElementWriter;


public class Tspan extends SVGElementAttribute<Tspan> implements Element, Positionable<Tspan>, Rotatable<Tspan> {
    private static final String tspan = "tspan";
    @Override
    public String name() {
        return tspan;
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

    public void open(ElementWriter writer) {
        writer.open(this);
    }

    public static void close(ElementWriter writer) {
        writer.close(tspan);
    }
}
