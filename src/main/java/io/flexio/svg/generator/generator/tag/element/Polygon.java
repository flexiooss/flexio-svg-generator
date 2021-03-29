package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

public class Polygon extends SVGElementAttributes<Polygon> implements Element, Fillable<Polygon>, Strokable<Polygon>, StrokeWidthable<Polygon> {
    @Override
    public String name() {
        return "polygon";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Polygon points(String points) {
        attributes("points", points);
        return this;
    }

    public Polygon points(String format, Object... args) {
        return this.points(String.format(format, args));
    }
}
