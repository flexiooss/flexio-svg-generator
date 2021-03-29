package io.flexio.svg.generator.generator.tag.element;

import io.flexio.svg.generator.generator.Attribute;
import io.flexio.svg.generator.generator.Element;
import io.flexio.svg.generator.generator.SVGElementAttributes;
import io.flexio.svg.generator.generator.tag.property.Fillable;
import io.flexio.svg.generator.generator.tag.property.Strokable;
import io.flexio.svg.generator.generator.tag.property.StrokeWidthable;

import java.util.Locale;

public class Polyline extends SVGElementAttributes<Polyline> implements Element, Fillable<Polyline>, Strokable<Polyline>, StrokeWidthable<Polyline> {
    @Override
    public String name() {
        return "polyline";
    }

    @Override
    public Attribute attribute() {
        return this;
    }

    public Polyline points(String points) {
        attributes("points", points);
        return this;
    }

    public Polyline points(String format, Object... args) {
        return this.points(String.format(Locale.US, format, args));
    }
}
